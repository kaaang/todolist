package com.joopda.todolist.service;

import com.joopda.todolist.model.Board;
import com.joopda.todolist.model.User;
import com.joopda.todolist.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void write(Board board, User user){
        board.setUser(user);
        boardRepository.save(board);
    }

    @Transactional(readOnly = true)
    public Page<Board> list(Pageable pageable, int id, int status){
        return boardRepository.findByUserIdAndStatus(pageable, id, status);
    }

    @Transactional(readOnly = true)
    public Board detail(int id){
        return boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("게시글을 찾을 수 없음");
                });
    }

    @Transactional
    public void delete(int id){
        boardRepository.deleteById(id);
    }

    @Transactional
    public void update(int id, Board requestBoard){
        Board board = boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 수정중 글 찾기 실패");
                });
        board.setTitle(requestBoard.getTitle());
        board.setContent(requestBoard.getContent());
    }

    @Transactional
    public void status(int id,int status){
        Board board = boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 완료중 글 찾기 실패");
                });
        board.setStatus(status);
    }

}

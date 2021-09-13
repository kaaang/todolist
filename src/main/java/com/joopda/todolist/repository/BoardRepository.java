package com.joopda.todolist.repository;

import com.joopda.todolist.model.Board;
import com.joopda.todolist.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Integer> {

    Page<Board> findByUserIdAndStatus(Pageable pageable, int userId, int status);
}

package com.joopda.todolist.service;

import com.joopda.todolist.model.User;
import com.joopda.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Transactional
    public void join(User user){
        String rawPass = user.getPassword();
        String encPass = encoder.encode(rawPass);
        user.setPassword(encPass);
        userRepository.save(user);
    }
}

package com.joopda.todolist.controller.user;

import com.joopda.todolist.dto.ResponseDto;
import com.joopda.todolist.model.User;
import com.joopda.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth/joinProc")
    public ResponseDto<Integer> save(@RequestBody User user){
        userService.join(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}

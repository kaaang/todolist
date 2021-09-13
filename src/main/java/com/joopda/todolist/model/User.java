package com.joopda.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {


    //사용자 번호(pk)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //사용자 아이디
    @Column(nullable = false, length = 100, unique = true)
    private String username;

    //패스워드
    @Column(nullable = false, length = 100)
    private String password;



}

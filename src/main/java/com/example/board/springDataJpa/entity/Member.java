package com.example.board.springDataJpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    private Integer age;


}

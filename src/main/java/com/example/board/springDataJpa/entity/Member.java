package com.example.board.springDataJpa.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
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

    public Member() {
    }

    public Member(String userName, String password, Integer age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }
}

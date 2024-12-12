package com.example.board.springDataJpa.service;

import com.example.board.springDataJpa.dto.SignUpResponseDto;
import com.example.board.springDataJpa.entity.Member;
import com.example.board.springDataJpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public SignUpResponseDto signUp(String userName, String password, Integer age) {

        Member member = new Member(userName, password, age);

        Member savedMember = memberRepository.save(member);

        return new SignUpResponseDto(savedMember.getId(), savedMember.getUserName(), savedMember.getAge());
    }
}

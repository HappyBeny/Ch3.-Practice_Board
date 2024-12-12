package com.example.board.springDataJpa.service;

import com.example.board.springDataJpa.dto.MemberResponseDto;
import com.example.board.springDataJpa.dto.SignUpResponseDto;
import com.example.board.springDataJpa.entity.Member;
import com.example.board.springDataJpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public SignUpResponseDto signUp(String userName, String password, Integer age) {

        Member member = new Member(userName, password, age);

        Member savedMember = memberRepository.save(member);

        return new SignUpResponseDto(savedMember.getId(), savedMember.getUserName(), savedMember.getAge());
    }

    public MemberResponseDto findById(Long id) {

        Optional<Member> optionalMember = memberRepository.findById(id);

        if (optionalMember.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exists id : " + id);
        }

        Member findMember = optionalMember.get();

        return new MemberResponseDto(findMember.getUserName(), findMember.getAge());
    }
}

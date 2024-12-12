package com.example.board.springDataJpa.entity;

import com.example.board.springDataJpa.dto.SignUpRequestDto;
import com.example.board.springDataJpa.dto.SignUpResponseDto;
import com.example.board.springDataJpa.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PatchMapping
    public ResponseEntity<SignUpResponseDto> signUp(@RequestBody SignUpRequestDto requestDto) {

        SignUpResponseDto signUpResponseDto =
                memberService.signUp(
                        requestDto.getUsername(),
                        requestDto.getPassword(),
                        requestDto.getAge()
                );

        return new ResponseEntity<>(signUpResponseDto, HttpStatus.CREATED);
    }
}

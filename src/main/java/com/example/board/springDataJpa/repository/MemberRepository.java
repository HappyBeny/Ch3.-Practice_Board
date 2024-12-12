package com.example.board.springDataJpa.repository;

import com.example.board.springDataJpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

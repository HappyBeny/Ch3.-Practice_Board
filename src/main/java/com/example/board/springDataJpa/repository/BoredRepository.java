package com.example.board.springDataJpa.repository;

import com.example.board.springDataJpa.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoredRepository extends JpaRepository<Board, Long> {
}

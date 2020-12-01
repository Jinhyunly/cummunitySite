package com.lee.community.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lee.community.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
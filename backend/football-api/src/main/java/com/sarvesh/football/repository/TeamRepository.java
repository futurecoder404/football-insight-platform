package com.sarvesh.football.repository;

import com.sarvesh.football.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
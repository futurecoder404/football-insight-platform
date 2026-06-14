package com.sarvesh.football.service;

import com.sarvesh.football.dto.TeamRequestDto;
import com.sarvesh.football.dto.TeamResponseDto;
import com.sarvesh.football.entity.Team;
import com.sarvesh.football.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public TeamResponseDto saveTeam(TeamRequestDto dto) {

        Team team = Team.builder()
                .name(dto.getName())
                .manager(dto.getManager())
                .fifaRanking(dto.getFifaRanking())
                .flagUrl(dto.getFlagUrl())
                .build();

        Team savedTeam = teamRepository.save(team);

        return TeamResponseDto.builder()
                .id(savedTeam.getId())
                .name(savedTeam.getName())
                .manager(savedTeam.getManager())
                .fifaRanking(savedTeam.getFifaRanking())
                .flagUrl(savedTeam.getFlagUrl())
                .build();
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
}
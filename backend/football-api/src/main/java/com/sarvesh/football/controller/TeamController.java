package com.sarvesh.football.controller;

import com.sarvesh.football.dto.TeamRequestDto;
import com.sarvesh.football.dto.TeamResponseDto;
import com.sarvesh.football.entity.Team;
import com.sarvesh.football.service.TeamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public TeamResponseDto createTeam(@Valid @RequestBody TeamRequestDto dto) {
        return teamService.saveTeam(dto);
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
}
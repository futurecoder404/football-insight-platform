package com.sarvesh.football.controller;

import com.sarvesh.football.entity.Team;
import com.sarvesh.football.service.TeamService;
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
    public Team createTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
}
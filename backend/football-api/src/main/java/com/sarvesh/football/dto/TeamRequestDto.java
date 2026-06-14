package com.sarvesh.football.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TeamRequestDto {

    @NotBlank(message = "Team name is required")
    private String name;

    @NotBlank(message = "Manager name is required")
    private String manager;

    @Min(value = 1, message = "Ranking must be at least 1")
    @Max(value = 250, message = "Ranking cannot exceed 250")
    private Integer fifaRanking;

    private String flagUrl;
}
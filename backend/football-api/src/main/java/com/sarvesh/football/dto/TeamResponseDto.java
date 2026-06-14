package com.sarvesh.football.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamResponseDto {

    private Long id;
    private String name;
    private String manager;
    private Integer fifaRanking;
    private String flagUrl;
}
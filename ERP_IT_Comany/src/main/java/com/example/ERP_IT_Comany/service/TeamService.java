package com.example.ERP_IT_Comany.service;

import com.example.ERP_IT_Comany.entity.Team;

import java.util.List;

public interface TeamService {
    Team save(Team team);
    List<Team> findAll();
}

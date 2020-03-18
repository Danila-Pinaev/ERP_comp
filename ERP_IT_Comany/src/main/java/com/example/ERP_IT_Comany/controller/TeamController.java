package com.example.ERP_IT_Comany.controller;

import com.example.ERP_IT_Comany.entity.Team;
import com.example.ERP_IT_Comany.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/getAll")
    public List<Team> findAll(){
        return teamService.findAll();
    }

    @PostMapping("/save")
    public Team save(@RequestBody Team team){
        return teamService.save(team);
    }
}

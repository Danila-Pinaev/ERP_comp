package com.example.ERP_IT_Comany.service.serviceIMPL;

import com.example.ERP_IT_Comany.entity.Team;
import com.example.ERP_IT_Comany.repository.TeamRepository;
import com.example.ERP_IT_Comany.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }
}

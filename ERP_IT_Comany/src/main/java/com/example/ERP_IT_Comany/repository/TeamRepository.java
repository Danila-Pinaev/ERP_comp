package com.example.ERP_IT_Comany.repository;

import com.example.ERP_IT_Comany.entity.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {
    List<Team> findAll();
}

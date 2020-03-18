package com.example.ERP_IT_Comany.service;

import com.example.ERP_IT_Comany.entity.Project;

import java.util.List;

public interface ProjectService {
    Project save(Project project);
    List<Project> findAll();
}

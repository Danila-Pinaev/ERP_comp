package com.example.ERP_IT_Comany.controller;

import com.example.ERP_IT_Comany.entity.Project;
import com.example.ERP_IT_Comany.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/getAll")
    public List<Project> findAll(){
        return projectService.findAll();
    }


    @PostMapping("/save")
    public Project save(@RequestBody Project project){
        return projectService.save(project);
    }
}

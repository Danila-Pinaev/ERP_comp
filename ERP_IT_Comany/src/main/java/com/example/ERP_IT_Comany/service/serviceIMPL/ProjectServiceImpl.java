package com.example.ERP_IT_Comany.service.serviceIMPL;

import com.example.ERP_IT_Comany.entity.Project;
import com.example.ERP_IT_Comany.repository.ProjectRepository;
import com.example.ERP_IT_Comany.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }
}

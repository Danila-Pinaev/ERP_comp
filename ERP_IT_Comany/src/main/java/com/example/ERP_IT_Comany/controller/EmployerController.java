package com.example.ERP_IT_Comany.controller;

import com.example.ERP_IT_Comany.entity.Employer;
import com.example.ERP_IT_Comany.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employers")
public class EmployerController {
    @Autowired
    private EmployerService employerService;


    @GetMapping("/getAll")
    public List<Employer> findAll(){
        return employerService.findAll();
    }
    @PostMapping("/save")
    public Employer saveEmployer (@RequestBody Employer employer) {
        return employerService.save(employer);
    }
}

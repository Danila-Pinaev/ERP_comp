package com.example.ERP_IT_Comany.service;

import com.example.ERP_IT_Comany.entity.Employer;

import java.util.List;

public interface EmployerService {
    Employer save (Employer employer);
    List<Employer> findAll();
}

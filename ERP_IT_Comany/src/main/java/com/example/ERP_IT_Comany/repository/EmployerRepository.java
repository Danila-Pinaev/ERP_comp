package com.example.ERP_IT_Comany.repository;

import com.example.ERP_IT_Comany.entity.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Long> {
    List<Employer> findAll();

}

package com.company.proj.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.company.proj.model.EmployeeModel;

@Component
public interface EmployeeDao extends CrudRepository<EmployeeModel, Integer>{

}

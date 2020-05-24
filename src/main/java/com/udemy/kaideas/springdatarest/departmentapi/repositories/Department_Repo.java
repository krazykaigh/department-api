package com.udemy.kaideas.springdatarest.departmentapi.repositories;

import com.udemy.kaideas.springdatarest.departmentapi.entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface Department_Repo extends CrudRepository<Department, Long> {
}

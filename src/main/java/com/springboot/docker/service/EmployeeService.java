package com.springboot.docker.service;

import com.springboot.docker.model.Employee;
import com.springboot.docker.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() { return repo.findAll(); }
    public Employee getById(Long id) { return repo.findById(id).orElse(null); }
    public Employee save(Employee emp) { return repo.save(emp); }
    public void delete(Long id) { repo.deleteById(id); }
}
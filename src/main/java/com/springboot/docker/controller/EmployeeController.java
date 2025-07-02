package com.springboot.docker.controller;

import com.springboot.docker.model.Employee;
import com.springboot.docker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping public Employee create(@RequestBody Employee emp) { return service.save(emp); }

    @GetMapping("/{id}") public Employee get(@PathVariable Long id) { return service.getById(id); }
}

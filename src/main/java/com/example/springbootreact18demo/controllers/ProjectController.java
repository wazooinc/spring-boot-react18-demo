package com.example.springbootreact18demo.controllers;

import com.example.springbootreact18demo.models.Project;
import com.example.springbootreact18demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository repository;

    @GetMapping("")
    public Iterable<Project> getAll() {
        return repository.findAll();
    }
}

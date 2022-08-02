package com.example.springbootreact18demo.config;

import com.example.springbootreact18demo.models.Project;
import com.example.springbootreact18demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    @Autowired
    private ProjectRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Project a = new Project();
        a.setName("Voyager");
        a.setDescription("Exploring the Gamma Quadrant");
        repository.save(a);

        Project b = new Project();
        b.setName("Deep Space Nine");
        b.setDescription("Establish planet security around Bajor");
        repository.save(b);
    }
}

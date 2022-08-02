package com.example.springbootreact18demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Project implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ",name='" + name + "'" +
                ",description='" + description + "'" +
                "}";
    }
}

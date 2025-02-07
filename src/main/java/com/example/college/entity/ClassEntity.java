package com.example.college.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class", schema = "college")
public class ClassEntity {

    @Id
    @Column(name="class_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;
    private String semester;

    @OneToMany(mappedBy = "clazz")
    Set<RegistrationEntity> registrations;
}

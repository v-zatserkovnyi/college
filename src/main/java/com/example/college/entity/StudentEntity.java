package com.example.college.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student", schema = "college")
public class StudentEntity {

    @Id
    @Column(name="student_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "student")
    Set<RegistrationEntity> registrations;
}

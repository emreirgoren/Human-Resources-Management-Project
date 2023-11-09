package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="school")
public class School {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="school_name")
    private String schoolName;

    @Column(name="department_name")
    private String departmentName;

    @Column(name="school_start_year")
    private int schoolStartYear;

    @Column(name="school_end_year")
    private int schoolEndYear;

    @Column(name="is_graduate")
    private boolean isGraduate;
}

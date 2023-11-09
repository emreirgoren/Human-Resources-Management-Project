package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisement")
public class JobAdvertisement {

        @Id
        @GeneratedValue
        @Column(name="id")
        private int id;

        @Column(name="job_description")
        private String jobDescription;

        @Column(name="open_position")
        private int openPosition;

        @Column(name="application_deadline")
        private Date applicationDeadline;

        @Column(name="is_active")
        private boolean isActive;

        @Column(name="min_salary")
        private int minSalary;

        @Column(name="max_salary")
        private int maxSalary;

        @ManyToOne(cascade = {CascadeType.ALL})
        private Employer employer;

}

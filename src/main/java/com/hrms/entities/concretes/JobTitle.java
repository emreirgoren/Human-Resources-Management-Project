package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_titles")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="title")
    private int title;

}

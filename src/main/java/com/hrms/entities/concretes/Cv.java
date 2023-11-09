package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv")
public class Cv {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Experience experience;


    @ManyToOne(cascade = {CascadeType.ALL})
    private CandidateWebAdress candidateWebAdress;


    @ManyToOne(cascade = {CascadeType.ALL})
    private CoverLetter coverLetter;


    @ManyToOne(cascade = {CascadeType.ALL})
    private ForeignLanguage foreignLanguage;


    @ManyToOne(cascade = {CascadeType.ALL})
    private ProgrammingLanguage programmingLanguage;


    @ManyToOne(cascade = {CascadeType.ALL})
    private School school;
}

package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_web_adress")
public class CandidateWebAdress {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="github_adress")
    private String githubAdress;

    @Column(name="linkedin_adress")
    private String linkedinAdress;
}

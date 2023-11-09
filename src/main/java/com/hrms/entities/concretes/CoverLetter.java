package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cover_letter")
public class CoverLetter {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="cover_letter")
    private String coverLetter;

}

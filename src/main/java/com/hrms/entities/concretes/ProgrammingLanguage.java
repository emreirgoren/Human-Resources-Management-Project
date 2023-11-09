package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "programming_language")

public class ProgrammingLanguage {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="programing_languange")
    private String programinLanguange;

}

package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="foreign_language")
public class ForeignLanguage {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="language")
    private String language;

    @Column(name="language_level")
    private int languageLevel;

}

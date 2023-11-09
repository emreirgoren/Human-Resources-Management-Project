package com.hrms.dataAccess.abstracts;

import com.hrms.entities.concretes.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolDao extends JpaRepository<School,Integer> {
    List<School> findAllByIsGraduateTrueOrderBySchoolEndYearDesc();
}

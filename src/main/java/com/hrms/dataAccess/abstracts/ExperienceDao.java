package com.hrms.dataAccess.abstracts;

import com.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceDao extends JpaRepository<Experience,Integer> {
    List<Experience> findAllByIsWorkTrueOrderByExperienceEndYear();
}

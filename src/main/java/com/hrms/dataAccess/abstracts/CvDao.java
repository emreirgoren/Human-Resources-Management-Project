package com.hrms.dataAccess.abstracts;

import com.hrms.entities.concretes.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvDao extends JpaRepository<Cv,Integer> {
}

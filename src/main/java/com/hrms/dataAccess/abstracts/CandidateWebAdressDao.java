package com.hrms.dataAccess.abstracts;

import com.hrms.entities.concretes.CandidateWebAdress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateWebAdressDao extends JpaRepository<CandidateWebAdress,Integer> {
}

package com.hrms.dataAccess.abstracts;

import com.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> findAllByIsActiveTrue();

    List<JobAdvertisement> findAllByEmployer_CompanyNameAndIsActiveTrue(@Param("companyName") String companyName);

    List<JobAdvertisement> findAllByIsActiveTrueOrderByApplicationDeadlineAsc();
}

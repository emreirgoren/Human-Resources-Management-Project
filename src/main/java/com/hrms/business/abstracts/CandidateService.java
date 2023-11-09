package com.hrms.business.abstracts;

import com.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> getAll();

}

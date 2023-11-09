package com.hrms.business.concretes;

import com.hrms.business.abstracts.CandidateService;
import com.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        super();
        this.candidateDao = candidateDao;
    }
    @Override
    public List<Candidate> getAll(){
        return candidateDao.findAll();
    }
}

package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobTitleService;
import com.hrms.dataAccess.abstracts.JobTitleDao;
import com.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }


    @Override
    public List<JobTitle> getAll() {

        return jobTitleDao.findAll();
    }
}

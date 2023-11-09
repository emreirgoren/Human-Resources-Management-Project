package com.hrms.business.abstracts;

import com.hrms.entities.concretes.JobTitle;

import java.util.List;

    public interface JobTitleService {
        List<JobTitle> getAll();

}

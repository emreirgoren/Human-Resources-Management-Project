package com.hrms.api;

import com.hrms.business.abstracts.JobTitleService;
import com.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleControllers {

    private JobTitleService jobTitleService;
    @Autowired
    public JobTitleControllers(JobTitleService jobTitleService) {
        super();
        this.jobTitleService = jobTitleService;
    }
    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }

}
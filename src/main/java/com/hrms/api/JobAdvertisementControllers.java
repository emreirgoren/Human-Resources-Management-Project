package com.hrms.api;

import com.hrms.business.abstracts.JobAdvertisementService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementControllers {

    private JobAdvertisementService jobAdvertisementService;
    @Autowired
    public JobAdvertisementControllers(JobAdvertisementService jobAdvertisementService) {
        super();
        this.jobAdvertisementService = jobAdvertisementService;

    }

    @GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }
    @PostMapping("/add")
    public Result add(JobAdvertisement jobAdvertisement) {
        return jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getdAllByIsActiveTrue")
    public DataResult<List<JobAdvertisement>> findAllByIsActiveTrue() {

        return this.jobAdvertisementService.findAllByIsActiveTrue();
    }

    @GetMapping("/findAllByIsActiveTrueOrderByApplicationDeadlineAsc")
    public DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByApplicationDeadlineAsc(){
        return this.jobAdvertisementService.findAllByIsActiveTrueOrderByApplicationDeadlineAsc();
    }




}

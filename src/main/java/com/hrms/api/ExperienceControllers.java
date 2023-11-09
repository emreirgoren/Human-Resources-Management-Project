package com.hrms.api;

import com.hrms.business.abstracts.ExperienceService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/experience")
public class ExperienceControllers {

    private ExperienceService experienceService;
    @Autowired
    public ExperienceControllers(ExperienceService experienceService) {
        super();
        this.experienceService = experienceService;
    }
    @PostMapping("/getall")
    public DataResult<List<Experience>> getAll(){

        return this.experienceService.getAll();
    }

    @PostMapping("orderbyexperienceendyeardesc")
    public DataResult<List<Experience>> findAllByIsWorkTrueOrderByExperienceEndYear(){
        return this.experienceService.findAllByIsWorkTrueOrderByExperienceEndYear();
    }

    @GetMapping("/add")
    public Result add(Experience experience) {
        return this.experienceService.add(experience);
    }


}

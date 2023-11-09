package com.hrms.api;

import com.hrms.business.abstracts.CvService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Cv;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CvControllers {
    private CvService cvService;

    public CvControllers(CvService cvService) {
        super();
        this.cvService = cvService;
    }

    @GetMapping("/getall")
    public DataResult<List<Cv>> getAll(){
        return this.cvService.getAll();
    }

    @PostMapping("/add")
    public Result add(Cv cv) {
        return this.cvService.add(cv);
    }

}

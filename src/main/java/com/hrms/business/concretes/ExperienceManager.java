package com.hrms.business.concretes;

import com.hrms.business.abstracts.ExperienceService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.dataAccess.abstracts.ExperienceDao;
import com.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {

    private ExperienceDao experienceDao;

    @Autowired
    public ExperienceManager(ExperienceDao experienceDao) {
        super();
        this.experienceDao = experienceDao;
    }

    @Override
    public DataResult<List<Experience>> getAll() {

        return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(),"veriler listelendi");
    }

    @Override
    public DataResult<List<Experience>> findAllByIsWorkTrueOrderByExperienceEndYear() {

        return new SuccessDataResult<List<Experience>>(this.experienceDao.findAllByIsWorkTrueOrderByExperienceEndYear(),"veriler listelendi");
    }

    @Override
    public Result add(Experience experience) {
        this.experienceDao.save(experience);
        return new SuccessResult("veriler eklendi");
    }
}

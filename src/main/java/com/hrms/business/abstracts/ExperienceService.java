package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Experience;

import java.util.List;

public interface ExperienceService {

    DataResult<List<Experience>> getAll();
    DataResult<List<Experience>> findAllByIsWorkTrueOrderByExperienceEndYear();
    Result add(Experience experience);

}

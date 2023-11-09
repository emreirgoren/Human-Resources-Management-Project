package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Cv;

import java.util.List;

public interface CvService {

    DataResult<List<Cv>> getAll();
    Result add(Cv cv);

}

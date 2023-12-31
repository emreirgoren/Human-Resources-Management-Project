package com.hrms.business.concretes;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.dataAccess.abstracts.EmployerDao;
import com.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }
    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listelendi");



    }
    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Veri Başarıyla Eklendi");
    }
}

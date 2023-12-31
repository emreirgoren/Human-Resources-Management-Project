package com.hrms.business.concretes;

import com.hrms.business.abstracts.CvService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.dataAccess.abstracts.CvDao;
import com.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvManager implements CvService {

    private CvDao cvDao;
    @Autowired
    public CvManager(CvDao cvDao) {
        super();
        this.cvDao = cvDao;
    }

    @Override
    public DataResult<List<Cv>> getAll() {

        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(),"veriler başarıyla listelendi");
    }

    @Override
    public Result add(Cv cv) {

        this.cvDao.save(cv);
        return new SuccessResult("verile Başarıyla kaydedil");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.service;

import com.WinnieAlison.Kuis1092.entity.cv_1092;
import com.WinnieAlison.Kuis1092.repo.cv_1092_repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC320-04
 */
@Service("cv_1092_service")
@Transactional
public class cv_1092_service {
    @Autowired
    private cv_1092_repo repo;

    public cv_1092 insert(cv_1092 cv_1092) {
        return repo.save(cv_1092);
    }
    
    public cv_1092 update(cv_1092 cv_1092) {
        return repo.save(cv_1092);
    }
    
    public boolean delete(Long id_cv){
        repo.delete(id_cv);
        return true;
    }
    
    public cv_1092 getByIdCv(Long id_cv){
        return repo.findOne(id_cv);
    }
    
    public List<cv_1092> getAll(){
        return repo.findAllCv();
    }
}

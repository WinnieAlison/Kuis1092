/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.service;

import com.WinnieAlison.Kuis1092.entity.nilai_1092;
import com.WinnieAlison.Kuis1092.repo.nilai_1092_repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC320-04
 */
@Service("nilai_1092_service")
@Transactional
public class nilai_1092_service {
    @Autowired
    private nilai_1092_repo repo;

    public nilai_1092 insert(nilai_1092 nilai_1092) {
        return repo.save(nilai_1092);
    }
    
    public nilai_1092 update(nilai_1092 nilai_1092) {
        return repo.save(nilai_1092);
    }
    
    public boolean delete(Long id_nilai){
        repo.delete(id_nilai);
        return true;
    }
    
    public nilai_1092 getByIdCv(Long id_nilai){
        return repo.findOne(id_nilai);
    }
    
    public List<nilai_1092> getAll(){
        return repo.findAllNilai();
    }
}

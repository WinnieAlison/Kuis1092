/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.controller;

import com.WinnieAlison.Kuis1092.entity.nilai_1092;
import com.WinnieAlison.Kuis1092.service.nilai_1092_service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC320-04
 */
@RestController
@RequestMapping("/nilai_1092")
public class nilai_1092_controller {
    @Autowired
    private nilai_1092_service nilai_1092_service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1092 insert(@RequestBody nilai_1092 nilai_1092) {
        return nilai_1092_service.insert(nilai_1092);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1092 update(@RequestBody nilai_1092 nilai_1092) {
        return nilai_1092_service.update(nilai_1092);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_nilai}")
    public boolean delete(@PathVariable("id_nilai") Long id_nilai) {
        return nilai_1092_service.delete(id_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_nilai}")
    public nilai_1092 getByIdCv(@PathVariable("id_nilai") Long id_nilai){
        return nilai_1092_service.getByIdCv(id_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1092> getAll(){
        return nilai_1092_service.getAll();
    }
}

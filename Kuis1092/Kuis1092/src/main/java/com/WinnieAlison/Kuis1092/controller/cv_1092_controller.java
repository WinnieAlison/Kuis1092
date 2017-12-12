/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.controller;

import com.WinnieAlison.Kuis1092.entity.cv_1092;
import com.WinnieAlison.Kuis1092.service.cv_1092_service;
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
@RequestMapping("/cv_1092")
public class cv_1092_controller {
    @Autowired
    private cv_1092_service cv_1092_service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1092 insert(@RequestBody cv_1092 cv_1092) {
        return cv_1092_service.insert(cv_1092);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1092 update(@RequestBody cv_1092 cv_1092) {
        return cv_1092_service.update(cv_1092);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_cv}")
    public boolean delete(@PathVariable("id_cv") Long id_cv) {
        return cv_1092_service.delete(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_cv}")
    public cv_1092 getByIdCv(@PathVariable("id_cv") Long id_cv){
        return cv_1092_service.getByIdCv(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1092> getAll(){
        return cv_1092_service.getAll();
    }
}

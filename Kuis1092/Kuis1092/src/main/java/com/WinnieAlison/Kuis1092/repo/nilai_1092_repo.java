/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.repo;

import com.WinnieAlison.Kuis1092.entity.nilai_1092;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC320-04
 */
public interface nilai_1092_repo extends CrudRepository<nilai_1092, Long> {
    @Query("select c from kuis1092 c")
    public List<nilai_1092> findAllNilai();
}

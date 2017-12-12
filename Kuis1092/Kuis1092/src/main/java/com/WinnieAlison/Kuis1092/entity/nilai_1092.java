/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC320-04
 */
@Entity
@Table(name = "nilai_1092")
public class nilai_1092 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    @Column(length = 30, nullable = false)
    private Long id_cv;
    @Column(length = 10, nullable = false)
    private String nilai;
    private String matkul;

    /**
     * @return the id_nilai
     */
    public Long getId_nilai() {
        return id_nilai;
    }

    /**
     * @param id_nilai the id_nilai to set
     */
    public void setId_nilai(Long id_nilai) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the id_cv
     */
    public Long getId_cv() {
        return id_cv;
    }

    /**
     * @param id_cv the id_cv to set
     */
    public void setId_cv(Long id_cv) {
        this.id_cv = id_cv;
    }

    /**
     * @return the nilai
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the matkul
     */
    public String getMatkul() {
        return matkul;
    }

    /**
     * @param matkul the matkul to set
     */
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WinnieAlison.Kuis1092.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC320-04
 */
@Entity
@Table(name = "cv_1092")
public class cv_1092 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;
    @Column(length = 30, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String alamat;
    private String tempatlahir;
    
    @OneToMany
    @JoinColumn(name="id_cv")
    private Set<nilai_1092> nilai_1092;

    public Long getIdCv() {
        return id_cv;
    }

    public void setIdCv(Long id_cv) {
        this.id_cv = id_cv;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

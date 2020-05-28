/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mons", uniqueConstraints = {})
public class Coin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "mon", nullable = false, length = 30)
    private String code = "";
    
    @Column(name = "val", nullable = true, columnDefinition = "float default 0")
    private float value = 0;
    
    @Column(name = "mondescrip", nullable = false, length = 255)
    private String description;
    
    @Column(name = "simb", nullable = false, length = 5)
    private String simbol;
    
    @Column(name = "c_moneda", nullable = false, length = 5)
    private String c_moneda;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station = "";
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucursal = "";
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String cashNumber = "";
    
    @Column(name = "mn", nullable = true, columnDefinition = "boolean default false")
    private boolean national = false;

       @Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getC_moneda() {
        return c_moneda;
    }

    public void setC_moneda(String c_moneda) {
        this.c_moneda = c_moneda;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(String cashNumber) {
        this.cashNumber = cashNumber;
    }

    public boolean isNational() {
        return national;
    }

    public void setNational(boolean national) {
        this.national = national;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }


}

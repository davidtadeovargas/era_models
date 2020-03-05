/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "confgral", uniqueConstraints = {})
public class GeneralConfig {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "clasif", nullable = false, length = 45)
    private String casification;
    
    @Column(name = "conf", nullable = false, length = 45)
    private String configuration;
    
    @Column(name = "val", nullable = false, length = 11)
    private int value;
    
    @Column(name = "nume", nullable = true)
    private float  number = 0;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station;
    
    @Column(name = "dia", nullable = true)
    private int day = 0;
    
    @Column(name = "envia", nullable = false)
    private Date numext = new Date();
    
    @Column(name = "asun", nullable = true, length = 255)
    private String razon = "";
    
    @Column(name = "anio", nullable = true)
    private int  year = 0;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucursal;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String cashNumber;
    
    @Column(name = "extr", nullable = false, length = 1000)
    private String extra = "";

    @Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCasification() {
        return casification;
    }

    public void setCasification(String casification) {
        this.casification = casification;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getNumext() {
        return numext;
    }

    public void setNumext(Date numext) {
        this.numext = numext;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
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

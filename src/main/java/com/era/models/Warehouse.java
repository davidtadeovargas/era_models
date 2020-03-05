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
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "almas", uniqueConstraints = {})
public class Warehouse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "alma", nullable = false, length = 30)
    private String code;
    
    @Column(name = "respon", nullable = false, length = 30)
    private String responsible;
    
    @Column(name = "almadescrip", nullable = false, length = 255)
    private String description;
    
    @Column(name = "dir1", nullable = true, length = 255)
    private String address1 = "";
    
    @Column(name = "dir2", nullable = true, length = 255)
    private String address2 = "";
    
    @Column(name = "dir3", nullable = true, length = 255)
    private String address3 = "";
    
    @Column(name = "actfij", nullable = true)
    private boolean activoFijo = false;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucursal = "";
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String cashNumber;
    
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

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public boolean isActivoFijo() {
        return activoFijo;
    }

    public void setActivoFijo(boolean activoFijo) {
        this.activoFijo = activoFijo;
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
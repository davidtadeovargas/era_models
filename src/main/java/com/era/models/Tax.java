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
@Table(name = "impues", uniqueConstraints = {})
public class Tax {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "codimpue", nullable = false, length = 30)
    private String code = "";
    
    @Column(name = "reten", nullable = true)
    private boolean retention = false;
    
    @Column(name = "impueval", nullable = false)
    private double value;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucursal;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String cashNumber;
    
    @Column(name = "impuestoXML", nullable = true, length = 45)
    private String xmlTax = "Traslado IVA";
    
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

    public boolean isRetention() {
        return retention;
    }

    public void setRetention(boolean retention) {
        this.retention = retention;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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

    public String getXmlTax() {
        return xmlTax;
    }

    public void setXmlTax(String xmlTax) {
        this.xmlTax = xmlTax;
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

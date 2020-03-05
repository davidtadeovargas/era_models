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
@Table(name = "domentcli", uniqueConstraints = {})
public class DeliverAddressCustomer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "codemp", nullable = false, length = 30)
    private String customerCode = "";
    
    @Column(name = "lada", nullable = true, length = 10)
    private String lada = "";
    
    @Column(name = "exten", nullable = true, length = 10)
    private String extension = "";
    
    @Column(name = "cel", nullable = true, length = 255)
    private String celphone = "";
    
    @Column(name = "tel", nullable = true, length = 255)
    private String phone = "";
    
    @Column(name = "telper1", nullable = true, length = 255)
    private String personalPhone1 = "";
    
    @Column(name = "telper2", nullable = true, length = 255)
    private String personalPhone2 = "";
    
    @Column(name = "calle", nullable = true, length = 255)
    private String street = "";
    
    @Column(name = "col", nullable = true, length = 255)
    private String colony = "";
    
    @Column(name = "noint", nullable = true, length = 255)
    private String interiorNumber = "";
    
    @Column(name = "noext", nullable = true, length = 21)
    private String externalNummber;
    
    @Column(name = "CP", nullable = true, length = 20)
    private String CP = "";
    
    @Column(name = "ciu", nullable = true, length = 255)
    private String city = "";
    
    @Column(name = "estad", nullable = true, length = 255)
    private String estate = "";
    
    @Column(name = "pai", nullable = true, length = 255)
    private String country = "";
    
    @Column(name = "co1", nullable = true, length = 100)
    private String email1 = "";
    
    @Column(name = "co2", nullable = true, length = 100)
    private String email2 = "";
    
    @Column(name = "co3", nullable = true, length = 100)
    private String email3 = "";
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station = "";
    
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getLada() {
        return lada;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonalPhone1() {
        return personalPhone1;
    }

    public void setPersonalPhone1(String personalPhone1) {
        this.personalPhone1 = personalPhone1;
    }

    public String getPersonalPhone2() {
        return personalPhone2;
    }

    public void setPersonalPhone2(String personalPhone2) {
        this.personalPhone2 = personalPhone2;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getInteriorNumber() {
        return interiorNumber;
    }

    public void setInteriorNumber(String interiorNumber) {
        this.interiorNumber = interiorNumber;
    }

    public String getExternalNummber() {
        return externalNummber;
    }

    public void setExternalNummber(String externalNummber) {
        this.externalNummber = externalNummber;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
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

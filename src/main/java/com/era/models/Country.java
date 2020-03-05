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
@Table(name = "c_pais", uniqueConstraints = {})
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_pais_id", nullable = false)
    private int id;
    
    @Column(name = "c_Pais", nullable = true, length = 5)
    private String countryCode;
    
    @Column(name = "Descripcion", nullable = true, length = 255)
    private String description;
    
    @Column(name = "Formato_de_código_postal", nullable = true, length = 45)
    private String postalCodeFormat;
    
    @Column(name = "Formato_de_Registro_de_Identidad_Tributaria", nullable = true, length = 255)
    private String tributaryFormat;
    
    @Column(name = "Validación_del_Registro_de_Identidad_Tributaria", nullable = false, length = 255)
    private String validationTributaryRegistry;
    
    @Column(name = "Agrupaciones", nullable = true, length = 25)
    private String agrupations;
    
    @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostalCodeFormat() {
        return postalCodeFormat;
    }

    public void setPostalCodeFormat(String postalCodeFormat) {
        this.postalCodeFormat = postalCodeFormat;
    }

    public String getTributaryFormat() {
        return tributaryFormat;
    }

    public void setTributaryFormat(String tributaryFormat) {
        this.tributaryFormat = tributaryFormat;
    }

    public String getValidationTributaryRegistry() {
        return validationTributaryRegistry;
    }

    public void setValidationTributaryRegistry(String validationTributaryRegistry) {
        this.validationTributaryRegistry = validationTributaryRegistry;
    }

    public String getAgrupations() {
        return agrupations;
    }

    public void setAgrupations(String agrupations) {
        this.agrupations = agrupations;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public String getSucu() {
        return sucu;
    }

    public void setSucu(String sucu) {
        this.sucu = sucu;
    }

    public String getNocaj() {
        return nocaj;
    }

    public void setNocaj(String nocaj) {
        this.nocaj = nocaj;
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

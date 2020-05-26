/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "c_formapago", uniqueConstraints = {})
public class CPaymentForm implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
    
    @Id
    @Column(name = "c_FormaPago", nullable = false, length = 5)
    private String c_FormaPago;
    
    @Column(name = "Descripcion", nullable = false, length = 45)
    private String description = "";

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

    public String getC_FormaPago() {
        return c_FormaPago;
    }

    public void setC_FormaPago(String c_FormaPago) {
        this.c_FormaPago = c_FormaPago;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

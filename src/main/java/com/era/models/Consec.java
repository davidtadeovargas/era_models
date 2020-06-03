/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "consecs", uniqueConstraints = {})
public class Consec {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "ser", nullable = false, length = 30)
    private String serie = "";
    
    @Column(name = "descrip", nullable = false, length = 255)
    private String description;
    
    @Column(name = "tip", nullable = false, length = 10)
    private String type;
    
    @Column(name = "consec", nullable = false, length = 11, columnDefinition = "int default 0")
    private int consec;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj = "";

    @Temporal(TemporalType.TIMESTAMP)@Column(name = "falt", nullable = true) private Date falt;
    @Temporal(TemporalType.TIMESTAMP)@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConsec() {
        return consec;
    }

    public void setConsec(int consec) {
        this.consec = consec;
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

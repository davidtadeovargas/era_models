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
import org.hibernate.annotations.Index;


@Entity
@Table(name = "lotped", uniqueConstraints = {})
public class Lotped {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Index(name="prod")
    @Column(name = "prod", nullable = false, length = 30)
    private String prod;
    
    @Index(name="alma")
    @Column(name = "alma", nullable = false, length = 30)
    private String alma;
    
    @Column(name = "lot", nullable = false, length = 255)
    private String lot;
    
    @Column(name = "pedimen", nullable = false, length = 255)
    private String pedimen;
    
    @Column(name = "aduana", nullable = true, length = 50)
    private String aduana = "";
    
    @Column(name = "fcadu", nullable = false)
    private Date fcadu = new Date();
    
    @Column(name = "exist", nullable = false, columnDefinition = "float default 0")
    private float exist;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "falt", nullable = true)
    private Date falt;
    
    @Column(name = "fmod", nullable = false)
    private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPedimen() {
        return pedimen;
    }

    public void setPedimen(String pedimen) {
        this.pedimen = pedimen;
    }

    public String getAduana() {
        return aduana;
    }

    public void setAduana(String aduana) {
        this.aduana = aduana;
    }

    public Date getFcadu() {
        return fcadu;
    }

    public void setFcadu(Date fcadu) {
        this.fcadu = fcadu;
    }

    public float getExist() {
        return exist;
    }

    public void setExist(float exist) {
        this.exist = exist;
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

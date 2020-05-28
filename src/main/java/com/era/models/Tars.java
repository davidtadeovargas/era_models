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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Index;
//@Index(name="")

@Entity @Table(name = "tars",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Tars {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="tars_cli") @Column(name = "cli", nullable = false,length = 30) private String cli;
  @Column(name = "tar", nullable = false, columnDefinition = "int default 0") private int tar;
  @Column(name = "vta", nullable = true, columnDefinition = "int default 0") private int vta = 0;
  @Column(name = "pag", nullable = false, columnDefinition = "boolean default false") private boolean pag;
  @Column(name = "loc", nullable = false, columnDefinition = "boolean default false") private boolean loc;
  @Column(name = "exter", nullable = false, columnDefinition = "boolean default false") private boolean exter;
  @Column(name = "prepag", nullable = false, columnDefinition = "boolean default false") private boolean prepag;
  @Column(name = "factuya", nullable = false, columnDefinition = "boolean default false") private boolean factuya;
  @Column(name = "ffactu", nullable = false) private Date ffactu = new Date();
  @Column(name = "factur", nullable = false, columnDefinition = "boolean default false") private boolean factur;
  @Column(name = "tarif", nullable = true, columnDefinition = "float default 0") private float tarif;  
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCli() {
        return cli;
    }

    public void setCli(String cli) {
        this.cli = cli;
    }

    public int getTar() {
        return tar;
    }

    public void setTar(int tar) {
        this.tar = tar;
    }

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public boolean isPag() {
        return pag;
    }

    public void setPag(boolean pag) {
        this.pag = pag;
    }

    public boolean isLoc() {
        return loc;
    }

    public void setLoc(boolean loc) {
        this.loc = loc;
    }

    public boolean isExter() {
        return exter;
    }

    public void setExter(boolean exter) {
        this.exter = exter;
    }

    public boolean isPrepag() {
        return prepag;
    }

    public void setPrepag(boolean prepag) {
        this.prepag = prepag;
    }

    public boolean isFactuya() {
        return factuya;
    }

    public void setFactuya(boolean factuya) {
        this.factuya = factuya;
    }

    public Date getFfactu() {
        return ffactu;
    }

    public void setFfactu(Date ffactu) {
        this.ffactu = ffactu;
    }

    public boolean isFactur() {
        return factur;
    }

    public void setFactur(boolean factur) {
        this.factur = factur;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public String getSucu() {
        return sucu;
    }

    public void setSucu(String sucu) {
        this.sucu = sucu;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
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

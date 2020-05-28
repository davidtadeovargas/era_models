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
import java.math.BigDecimal;

@Entity @Table(name = "cots",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Cots {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="cots_codcot") @Column(name = "codcot", nullable = false,length = 30) private String codcot;
  @Column(name = "proy", nullable = false,length = 30) private String proy;
  @Column(name = "motiv", nullable = true, length = 255) private String motiv = "";
  @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "totdescu", nullable = true, columnDefinition = "float default 0") private float totdescu;
  @Column(name = "totcost", nullable = true, columnDefinition = "float default 0") private float totcost;
  @Column(name = "vta", nullable = true, columnDefinition = "int default 0") private int vta = 0;
  @Column(name = "norefer", nullable = true, length = 30) private String norefer = "";
  @Column(name = "tipcam", nullable = true, columnDefinition = "float default 0") private float tipcam;
  @Column(name = "mon", nullable = false) private String mon = "";
  @Column(name = "noservta", nullable = true, length = 30) private String noservta = "";
  @Column(name = "codemp", nullable = false,length = 30) private String codemp;
  @Column(name = "observ", nullable = false,length = 255) private String observ;
  @Column(name = "estac", nullable = false,length = 255) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "subtotgral", nullable = true, columnDefinition = "float default 0") private float subtotgral;
  @Column(name = "subtotgral2", nullable = false, columnDefinition = "float default 0") private float subtotgral2;
  @Column(name = "subtot", nullable = true, columnDefinition = "float default 0") private float subtot;
  @Column(name = "manobr", nullable = true, columnDefinition = "float default 0") private float manobr;
  @Column(name = "impue", nullable = true, columnDefinition = "float default 0") private float impue;
  @Column(name = "subtotmat", nullable = true, columnDefinition = "float default 0") private float subtotmat;
  @Column(name = "subtotmat2", nullable = false, columnDefinition = "float default 0") private float subtotmat2;
  @Column(name = "tot", nullable = true, columnDefinition = "float default 0") private float tot;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "estad", nullable = false,length = 10) private String estad;
  @Column(name = "MonedaID", nullable = true, columnDefinition = "int default 0") private int MonedaID = 0;
  @Column(name = "total_traslado", nullable = true) private BigDecimal total_traslado = BigDecimal.ZERO;
  @Column(name = "total_retencion", nullable = true) private BigDecimal total_retencion = BigDecimal.ZERO; 
  @Column(name = "fdoc", nullable = false) private Date fdoc = new Date();
  @Column(name = "fentre", nullable = false) private Date fentre = new Date();
  @Column(name = "fvenc", nullable = false) private Date fvenc = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodcot() {
        return codcot;
    }

    public void setCodcot(String codcot) {
        this.codcot = codcot;
    }

    public String getProy() {
        return proy;
    }

    public void setProy(String proy) {
        this.proy = proy;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public float getTotdescu() {
        return totdescu;
    }

    public void setTotdescu(float totdescu) {
        this.totdescu = totdescu;
    }

    public float getTotcost() {
        return totcost;
    }

    public void setTotcost(float totcost) {
        this.totcost = totcost;
    }

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public String getNorefer() {
        return norefer;
    }

    public void setNorefer(String norefer) {
        this.norefer = norefer;
    }

    public float getTipcam() {
        return tipcam;
    }

    public void setTipcam(float tipcam) {
        this.tipcam = tipcam;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getNoservta() {
        return noservta;
    }

    public void setNoservta(String noservta) {
        this.noservta = noservta;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
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

    public float getSubtotgral() {
        return subtotgral;
    }

    public void setSubtotgral(float subtotgral) {
        this.subtotgral = subtotgral;
    }

    public float getSubtotgral2() {
        return subtotgral2;
    }

    public void setSubtotgral2(float subtotgral2) {
        this.subtotgral2 = subtotgral2;
    }

    public float getSubtot() {
        return subtot;
    }

    public void setSubtot(float subtot) {
        this.subtot = subtot;
    }

    public float getManobr() {
        return manobr;
    }

    public void setManobr(float manobr) {
        this.manobr = manobr;
    }

    public float getImpue() {
        return impue;
    }

    public void setImpue(float impue) {
        this.impue = impue;
    }

    public float getSubtotmat() {
        return subtotmat;
    }

    public void setSubtotmat(float subtotmat) {
        this.subtotmat = subtotmat;
    }

    public float getSubtotmat2() {
        return subtotmat2;
    }

    public void setSubtotmat2(float subtotmat2) {
        this.subtotmat2 = subtotmat2;
    }

    public float getTot() {
        return tot;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    public int getMonedaID() {
        return MonedaID;
    }

    public void setMonedaID(int MonedaID) {
        this.MonedaID = MonedaID;
    }

    public BigDecimal getTotal_traslado() {
        return total_traslado;
    }

    public void setTotal_traslado(BigDecimal total_traslado) {
        this.total_traslado = total_traslado;
    }

    public BigDecimal getTotal_retencion() {
        return total_retencion;
    }

    public void setTotal_retencion(BigDecimal total_retencion) {
        this.total_retencion = total_retencion;
    }

    public Date getFdoc() {
        return fdoc;
    }

    public void setFdoc(Date fdoc) {
        this.fdoc = fdoc;
    }

    public Date getFentre() {
        return fentre;
    }

    public void setFentre(Date fentre) {
        this.fentre = fentre;
    }

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
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

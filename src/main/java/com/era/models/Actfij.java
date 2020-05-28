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

@Entity @Table(name = "actfij", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_id"})}) public class Actfij {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="actfij_prod")@Column(name = "prod", nullable = false,length = 30) private String prod;
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "lug", nullable = true, length = 30) private String lug = "";
  @Column(name = "ctadepre", nullable = false,length = 45) private String ctadepre;
  @Column(name = "ctadedu", nullable = false,length = 45) private String ctadedu;
  @Column(name = "ctagast", nullable = false,length = 45) private String ctagast;
  @Column(name = "serprod", nullable = true, length = 255) private String serprod = "";
  @Column(name = "descrip", nullable = false,length = 1000) private String descrip;
  @Column(name = "porcendep", nullable = true, columnDefinition = "float default 0") private float porcendep;
  @Column(name = "porcendedu", nullable = true, columnDefinition = "float default 0") private float porcendedu;
  @Column(name = "cost", nullable = true, columnDefinition = "float default 0") private float cost;
  @Column(name = "sal", nullable = true, columnDefinition = "boolean default false") private boolean sal = false;
  @Column(name = "exportconta", nullable = true, columnDefinition = "boolean default false") private boolean exportconta = false;
  @Column(name = "totmesbaj", nullable = true, columnDefinition = "int default 0") private int totmesbaj = 0;
  @Column(name = "totacumes", nullable = true, columnDefinition = "float default 0") private float totacumes = 0;
  @Column(name = "totvalactbaj", nullable = true, columnDefinition = "float default 0") private float totvalactbaj = 0;
  @Column(name = "totestadbaj", nullable = true, length = 30) private String totestadbaj = "";
  @Column(name = "costsal", nullable = true, columnDefinition = "float default 0") private float costsal = 0;
  @Column(name = "fadquisreal", nullable = false) private Date fadquisreal = new Date();
  @Column(name = "fadquisusr", nullable = false) private Date fadquisusr = new Date();
  @Column(name = "finidep", nullable = false) private Date finidep = new Date();
  @Column(name = "ffindep", nullable = false) private Date ffindep = new Date();
  @Column(name = "fbajdep", nullable = false) private Date fbajdep = new Date();
  @Column(name = "estadusr", nullable = false,length = 30) private String estadusr;
  @Column(name = "tipact", nullable = false,length = 30) private String tipact;
  @Column(name = "comen", nullable = true, length = 1000) private String comen = "";
  @Column(name = "baj", nullable = true, columnDefinition = "boolean default false") private boolean baj = false;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "fbaj", nullable = false) private Date fbaj = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;  

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

    public String getLug() {
        return lug;
    }

    public void setLug(String lug) {
        this.lug = lug;
    }

    public String getCtadepre() {
        return ctadepre;
    }

    public void setCtadepre(String ctadepre) {
        this.ctadepre = ctadepre;
    }

    public String getCtadedu() {
        return ctadedu;
    }

    public void setCtadedu(String ctadedu) {
        this.ctadedu = ctadedu;
    }

    public String getCtagast() {
        return ctagast;
    }

    public void setCtagast(String ctagast) {
        this.ctagast = ctagast;
    }

    public String getSerprod() {
        return serprod;
    }

    public void setSerprod(String serprod) {
        this.serprod = serprod;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getPorcendep() {
        return porcendep;
    }

    public void setPorcendep(float porcendep) {
        this.porcendep = porcendep;
    }

    public float getPorcendedu() {
        return porcendedu;
    }

    public void setPorcendedu(float porcendedu) {
        this.porcendedu = porcendedu;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isSal() {
        return sal;
    }

    public void setSal(boolean sal) {
        this.sal = sal;
    }

    public boolean isExportconta() {
        return exportconta;
    }

    public void setExportconta(boolean exportconta) {
        this.exportconta = exportconta;
    }

    public int getTotmesbaj() {
        return totmesbaj;
    }

    public void setTotmesbaj(int totmesbaj) {
        this.totmesbaj = totmesbaj;
    }

    public float getTotacumes() {
        return totacumes;
    }

    public void setTotacumes(float totacumes) {
        this.totacumes = totacumes;
    }

    public float getTotvalactbaj() {
        return totvalactbaj;
    }

    public void setTotvalactbaj(float totvalactbaj) {
        this.totvalactbaj = totvalactbaj;
    }

    public String getTotestadbaj() {
        return totestadbaj;
    }

    public void setTotestadbaj(String totestadbaj) {
        this.totestadbaj = totestadbaj;
    }

    public float getCostsal() {
        return costsal;
    }

    public void setCostsal(float costsal) {
        this.costsal = costsal;
    }

    public Date getFadquisreal() {
        return fadquisreal;
    }

    public void setFadquisreal(Date fadquisreal) {
        this.fadquisreal = fadquisreal;
    }

    public Date getFadquisusr() {
        return fadquisusr;
    }

    public void setFadquisusr(Date fadquisusr) {
        this.fadquisusr = fadquisusr;
    }

    public Date getFinidep() {
        return finidep;
    }

    public void setFinidep(Date finidep) {
        this.finidep = finidep;
    }

    public Date getFfindep() {
        return ffindep;
    }

    public void setFfindep(Date ffindep) {
        this.ffindep = ffindep;
    }

    public Date getFbajdep() {
        return fbajdep;
    }

    public void setFbajdep(Date fbajdep) {
        this.fbajdep = fbajdep;
    }

    public String getEstadusr() {
        return estadusr;
    }

    public void setEstadusr(String estadusr) {
        this.estadusr = estadusr;
    }

    public String getTipact() {
        return tipact;
    }

    public void setTipact(String tipact) {
        this.tipact = tipact;
    }

    public String getComen() {
        return comen;
    }

    public void setComen(String comen) {
        this.comen = comen;
    }

    public boolean isBaj() {
        return baj;
    }

    public void setBaj(boolean baj) {
        this.baj = baj;
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

    public Date getFbaj() {
        return fbaj;
    }

    public void setFbaj(Date fbaj) {
        this.fbaj = fbaj;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "basdats", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
public class BasDats {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "codemp", nullable = false, length = 30)
    private String codemp;
    
    @Column(name = "bd", nullable = true, length = 255)
    private String bd;
    
    @Column(name = "rutap", nullable = true, length = 2045) private String rutap;
    
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;
    
    @Column(name = "ladaen", nullable = true, length = 10)
    private String ladaen;
    
    @Column(name = "metcost", nullable = true, length = 10)
    private String metcost = "ultcost";
    
    @Column(name = "tel", nullable = true, length = 255)
    private String tel;
    
    @Column(name = "calle", nullable = true, length = 255)
    private String calle;
    
    @Column(name = "col", nullable = true, length = 255)
    private String col;
    
    @JsonProperty("CP")
    @Column(name = "CP", nullable = true)
    private String CP;
    
    @Column(name = "ciu", nullable = true, length = 255)
    private String ciu;
    
    @Column(name = "estad", nullable = true, length = 255)
    private String estad;
    
    @Column(name = "pai", nullable = true, length = 255)
    private String pai;
    
    @JsonProperty("RFC")
    @Column(name = "RFC", nullable = true, length = 21)
    private String RFC;
    
    @Column(name = "corr", nullable = true, length = 100)
    private String corr;
    
    @Column(name = "pagweb", nullable = true, length = 255)
    private String pagweb;
    
    @Column(name = "noext", nullable = true, length = 21)
    private String noext;
    
    @Column(name = "noint", nullable = true, length = 21)
    private String noint;
    
    @Column(name = "lugexp", nullable = true, length = 255)
    private String lugexp;
    
    @Column(name = "noexten", nullable = true, length = 21)
    private String noexten = "";    
    
    @Column(name = "regfisc", nullable = true, length = 255)
    private String regfisc;
    
    @Column(name = "rutcer", nullable = true, length = 2045)
    private String rutcer;
    
    @JsonProperty("contribuyentType")
    @Column(name = "tipo_contribuyente", nullable = true, length = 1) private String contribuyentType = "M";
    
    @Column(name = "rutkey", nullable = true, length = 2045)
    private String rutkey;
    
    @Column(name = "passcer", nullable = true, length = 1000)
    private String passcer;
    
    @Column(name = "rutcerf", nullable = true, length = 2045)
    private String rutcerf;
    
    @Column(name = "rutkeyf", nullable = true, length = 2045)
    private String rutkeyf;
    
    @Column(name = "passcerf", nullable = true, length = 1000)
    private String passcerf;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;

    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "test", nullable = true, columnDefinition = "boolean default false")
    private boolean test = false;
    
    @Column(name = "falt", nullable = true) private Date falt;
    @Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getContribuyentType() {
        return contribuyentType;
    }

    public void setContribuyentType(String contribuyentType) {
        this.contribuyentType = contribuyentType;
    }
    
    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getRutap() {
        return rutap;
    }

    public void setRutap(String rutap) {
        this.rutap = rutap;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLadaen() {
        return ladaen;
    }

    public void setLadaen(String ladaen) {
        this.ladaen = ladaen;
    }

    public String getMetcost() {
        return metcost;
    }

    public void setMetcost(String metcost) {
        this.metcost = metcost;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiu() {
        return ciu;
    }

    public void setCiu(String ciu) {
        this.ciu = ciu;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public String getPagweb() {
        return pagweb;
    }

    public void setPagweb(String pagweb) {
        this.pagweb = pagweb;
    }

    public String getNoext() {
        return noext;
    }

    public void setNoext(String noext) {
        this.noext = noext;
    }

    public String getNoint() {
        return noint;
    }

    public void setNoint(String noint) {
        this.noint = noint;
    }

    public String getLugexp() {
        return lugexp;
    }

    public void setLugexp(String lugexp) {
        this.lugexp = lugexp;
    }

    public String getRegfisc() {
        return regfisc;
    }

    public void setRegfisc(String regfisc) {
        this.regfisc = regfisc;
    }

    public String getRutcer() {
        return rutcer;
    }

    public void setRutcer(String rutcer) {
        this.rutcer = rutcer;
    }

    public String getRutkey() {
        return rutkey;
    }

    public void setRutkey(String rutkey) {
        this.rutkey = rutkey;
    }

    public String getPasscer() {
        return passcer;
    }

    public void setPasscer(String passcer) {
        this.passcer = passcer;
    }

    public String getRutcerf() {
        return rutcerf;
    }

    public void setRutcerf(String rutcerf) {
        this.rutcerf = rutcerf;
    }

    public String getRutkeyf() {
        return rutkeyf;
    }

    public void setRutkeyf(String rutkeyf) {
        this.rutkeyf = rutkeyf;
    }

    public String getPasscerf() {
        return passcerf;
    }

    public void setPasscerf(String passcerf) {
        this.passcerf = passcerf;
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

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
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

    public String getNoexten() {
        return noexten;
    }

    public void setNoexten(String noexten) {
        this.noexten = noexten;
    }

    
}

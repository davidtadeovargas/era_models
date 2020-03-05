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

@Entity @Table(name = "domentcli",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Domentcli {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="domentcli_codemp") @Column(name = "codemp", nullable = false,length = 30) private String codemp;
  @Column(name = "lada", nullable = true, length = 10) private String lada = "";
  @Column(name = "exten", nullable = true, length = 10) private String exten = "";
  @Column(name = "cel", nullable = true, length = 255) private String cel = "";
  @Column(name = "tel", nullable = true, length = 255) private String tel = "";
  @Column(name = "telper1", nullable = true) private String telper1 = "";
  @Column(name = "telper2", nullable = true) private String telper2 = "";
  @Column(name = "calle", nullable = true, length = 255) private String calle = "";
  @Column(name = "col", nullable = true, length = 255) private String col = "";
  @Column(name = "noint", nullable = true, length = 255) private String noint = "";
  @Column(name = "noext", nullable = true, length = 21) private String noext = "";
  @Column(name = "CP", nullable = true, length = 20) private String CP = "";
  @Column(name = "ciu", nullable = true, length = 255) private String ciu = "";
  @Column(name = "estad", nullable = true, length = 255) private String estad = "";
  @Column(name = "pai", nullable = true, length = 255) private String pai = "";
  @Column(name = "co1", nullable = true) private String co1 = "";
  @Column(name = "co2", nullable = true) private String co2 = "";
  @Column(name = "co3", nullable = true) private String co3 = "";  
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

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getLada() {
        return lada;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelper1() {
        return telper1;
    }

    public void setTelper1(String telper1) {
        this.telper1 = telper1;
    }

    public String getTelper2() {
        return telper2;
    }

    public void setTelper2(String telper2) {
        this.telper2 = telper2;
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

    public String getNoint() {
        return noint;
    }

    public void setNoint(String noint) {
        this.noint = noint;
    }

    public String getNoext() {
        return noext;
    }

    public void setNoext(String noext) {
        this.noext = noext;
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

    public String getCo1() {
        return co1;
    }

    public void setCo1(String co1) {
        this.co1 = co1;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getCo3() {
        return co3;
    }

    public void setCo3(String co3) {
        this.co3 = co3;
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


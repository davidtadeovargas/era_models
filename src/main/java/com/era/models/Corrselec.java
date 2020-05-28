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

@Entity @Table(name = "corrselec",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Corrselec {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "srvsmtpsal", nullable = false,length = 50) private String srvsmtpsal;
  @Column(name = "asunfac", nullable = false,length = 255) private String asunfac;
  @Column(name = "asuncot", nullable = false,length = 255) private String asuncot;
  @Column(name = "asuncontra", nullable = false,length = 255) private String asuncontra;
  @Column(name = "asunord", nullable = false,length = 255) private String asunord;
  @Column(name = "asunrec1", nullable = false) private String asunrec1;
  @Column(name = "asunrec2", nullable = false) private String asunrec2;
  @Column(name = "asunrec3", nullable = false) private String asunrec3;
  @Column(name = "cuerpfac", nullable = false,length = 255) private String cuerpfac;
  @Column(name = "cuerpcot", nullable = false,length = 255) private String cuerpcot;
  @Column(name = "cuerpcontra", nullable = false,length = 255) private String cuerpcontra;
  @Column(name = "cuerpord", nullable = false,length = 255) private String cuerpord;
  @Column(name = "cuerprec1", nullable = false) private String cuerprec1;
  @Column(name = "cuerprec2", nullable = false) private String cuerprec2;
  @Column(name = "cuerprec3", nullable = false) private String cuerprec3;
  @Column(name = "portsmtp", nullable = false, columnDefinition = "int default 0") private int portsmtp;
  @Column(name = "actslenlog", nullable = false, columnDefinition = "boolean default false") private boolean actslenlog;
  @Column(name = "usr", nullable = false,length = 61) private String usr;
  @Column(name = "pass", nullable = false,length = 255) private String pass;
  @Column(name = "corralter", nullable = false,length = 50) private String corralter;  
  @Index(name="corrselec_estac")  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "estacglo", nullable = false,length = 30) private String estacglo;  
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

    public String getSrvsmtpsal() {
        return srvsmtpsal;
    }

    public void setSrvsmtpsal(String srvsmtpsal) {
        this.srvsmtpsal = srvsmtpsal;
    }

    public String getAsunfac() {
        return asunfac;
    }

    public void setAsunfac(String asunfac) {
        this.asunfac = asunfac;
    }

    public String getAsuncot() {
        return asuncot;
    }

    public void setAsuncot(String asuncot) {
        this.asuncot = asuncot;
    }

    public String getAsuncontra() {
        return asuncontra;
    }

    public void setAsuncontra(String asuncontra) {
        this.asuncontra = asuncontra;
    }

    public String getAsunord() {
        return asunord;
    }

    public void setAsunord(String asunord) {
        this.asunord = asunord;
    }

    public String getAsunrec1() {
        return asunrec1;
    }

    public void setAsunrec1(String asunrec1) {
        this.asunrec1 = asunrec1;
    }

    public String getAsunrec2() {
        return asunrec2;
    }

    public void setAsunrec2(String asunrec2) {
        this.asunrec2 = asunrec2;
    }

    public String getAsunrec3() {
        return asunrec3;
    }

    public void setAsunrec3(String asunrec3) {
        this.asunrec3 = asunrec3;
    }

    public String getCuerpfac() {
        return cuerpfac;
    }

    public void setCuerpfac(String cuerpfac) {
        this.cuerpfac = cuerpfac;
    }

    public String getCuerpcot() {
        return cuerpcot;
    }

    public void setCuerpcot(String cuerpcot) {
        this.cuerpcot = cuerpcot;
    }

    public String getCuerpcontra() {
        return cuerpcontra;
    }

    public void setCuerpcontra(String cuerpcontra) {
        this.cuerpcontra = cuerpcontra;
    }

    public String getCuerpord() {
        return cuerpord;
    }

    public void setCuerpord(String cuerpord) {
        this.cuerpord = cuerpord;
    }

    public String getCuerprec1() {
        return cuerprec1;
    }

    public void setCuerprec1(String cuerprec1) {
        this.cuerprec1 = cuerprec1;
    }

    public String getCuerprec2() {
        return cuerprec2;
    }

    public void setCuerprec2(String cuerprec2) {
        this.cuerprec2 = cuerprec2;
    }

    public String getCuerprec3() {
        return cuerprec3;
    }

    public void setCuerprec3(String cuerprec3) {
        this.cuerprec3 = cuerprec3;
    }

    public int getPortsmtp() {
        return portsmtp;
    }

    public void setPortsmtp(int portsmtp) {
        this.portsmtp = portsmtp;
    }

    public boolean isActslenlog() {
        return actslenlog;
    }

    public void setActslenlog(boolean actslenlog) {
        this.actslenlog = actslenlog;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorralter() {
        return corralter;
    }

    public void setCorralter(String corralter) {
        this.corralter = corralter;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public String getEstacglo() {
        return estacglo;
    }

    public void setEstacglo(String estacglo) {
        this.estacglo = estacglo;
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
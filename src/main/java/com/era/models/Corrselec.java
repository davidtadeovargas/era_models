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
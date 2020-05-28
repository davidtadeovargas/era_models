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

//@Index(name="")

@Entity @Table(name = "datoscp") public class Datoscp {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "vta", nullable = false, columnDefinition = "int default 0") private int vta;
  @Column(name = "remitente", nullable = true) private String remitente;
  @Column(name = "callerem", nullable = true) private String callerem;
  @Column(name = "noextrem", nullable = true) private String noextrem;
  @Column(name = "nointrem", nullable = true) private String nointrem;
  @Column(name = "colrem", nullable = true) private String colrem;
  @Column(name = "cprem", nullable = true) private String cprem;
  @Column(name = "ciurem", nullable = true) private String ciurem;
  @Column(name = "estadrem", nullable = true) private String estadrem;
  @Column(name = "paisrem", nullable = true) private String paisrem;
  @Column(name = "rfc", nullable = true) private String rfc;
  @Column(name = "calleremrec", nullable = true) private String calleremrec;
  @Column(name = "noextremrec", nullable = true) private String noextremrec;
  @Column(name = "nointremrec", nullable = true) private String nointremrec;
  @Column(name = "colremrec", nullable = true) private String colremrec;
  @Column(name = "cpremrec", nullable = true) private String cpremrec;
  @Column(name = "ciuremrec", nullable = true) private String ciuremrec;
  @Column(name = "estadremrec", nullable = true) private String estadremrec;
  @Column(name = "paisremrec", nullable = true) private String paisremrec;
  @Column(name = "fent", nullable = true) private Date fent = new Date();
  @Column(name = "desti", nullable = true) private String desti;
  @Column(name = "calledesti", nullable = true) private String calledesti;
  @Column(name = "noextdesti", nullable = true) private String noextdesti;
  @Column(name = "nointdesti", nullable = true) private String nointdesti;
  @Column(name = "coldesti", nullable = true) private String coldesti;
  @Column(name = "cpdesti", nullable = true) private String cpdesti;
  @Column(name = "ciudesti", nullable = true) private String ciudesti;
  @Column(name = "estaddesti", nullable = true) private String estaddesti;
  @Column(name = "paisdesti", nullable = true) private String paisdesti;
  @Column(name = "calledestient", nullable = true) private String calledestient;
  @Column(name = "noextdestient", nullable = true) private String noextdestient;
  @Column(name = "nointdestient", nullable = true) private String nointdestient;
  @Column(name = "coldestient", nullable = true) private String coldestient;
  @Column(name = "cpdestient", nullable = true) private String cpdestient;
  @Column(name = "estaddestient", nullable = true) private String estaddestient;
  @Column(name = "ciudestient", nullable = true) private String ciudestient;
  @Column(name = "paisdestient", nullable = true) private String paisdestient;
  @Column(name = "nombretrans", nullable = true) private String nombretrans;
  @Column(name = "vehiculo", nullable = true) private String vehiculo;
  @Column(name = "placas", nullable = true) private String placas; 
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

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getCallerem() {
        return callerem;
    }

    public void setCallerem(String callerem) {
        this.callerem = callerem;
    }

    public String getNoextrem() {
        return noextrem;
    }

    public void setNoextrem(String noextrem) {
        this.noextrem = noextrem;
    }

    public String getNointrem() {
        return nointrem;
    }

    public void setNointrem(String nointrem) {
        this.nointrem = nointrem;
    }

    public String getColrem() {
        return colrem;
    }

    public void setColrem(String colrem) {
        this.colrem = colrem;
    }

    public String getCprem() {
        return cprem;
    }

    public void setCprem(String cprem) {
        this.cprem = cprem;
    }

    public String getCiurem() {
        return ciurem;
    }

    public void setCiurem(String ciurem) {
        this.ciurem = ciurem;
    }

    public String getEstadrem() {
        return estadrem;
    }

    public void setEstadrem(String estadrem) {
        this.estadrem = estadrem;
    }

    public String getPaisrem() {
        return paisrem;
    }

    public void setPaisrem(String paisrem) {
        this.paisrem = paisrem;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCalleremrec() {
        return calleremrec;
    }

    public void setCalleremrec(String calleremrec) {
        this.calleremrec = calleremrec;
    }

    public String getNoextremrec() {
        return noextremrec;
    }

    public void setNoextremrec(String noextremrec) {
        this.noextremrec = noextremrec;
    }

    public String getNointremrec() {
        return nointremrec;
    }

    public void setNointremrec(String nointremrec) {
        this.nointremrec = nointremrec;
    }

    public String getColremrec() {
        return colremrec;
    }

    public void setColremrec(String colremrec) {
        this.colremrec = colremrec;
    }

    public String getCpremrec() {
        return cpremrec;
    }

    public void setCpremrec(String cpremrec) {
        this.cpremrec = cpremrec;
    }

    public String getCiuremrec() {
        return ciuremrec;
    }

    public void setCiuremrec(String ciuremrec) {
        this.ciuremrec = ciuremrec;
    }

    public String getEstadremrec() {
        return estadremrec;
    }

    public void setEstadremrec(String estadremrec) {
        this.estadremrec = estadremrec;
    }

    public String getPaisremrec() {
        return paisremrec;
    }

    public void setPaisremrec(String paisremrec) {
        this.paisremrec = paisremrec;
    }

    public Date getFent() {
        return fent;
    }

    public void setFent(Date fent) {
        this.fent = fent;
    }

    public String getDesti() {
        return desti;
    }

    public void setDesti(String desti) {
        this.desti = desti;
    }

    public String getCalledesti() {
        return calledesti;
    }

    public void setCalledesti(String calledesti) {
        this.calledesti = calledesti;
    }

    public String getNoextdesti() {
        return noextdesti;
    }

    public void setNoextdesti(String noextdesti) {
        this.noextdesti = noextdesti;
    }

    public String getNointdesti() {
        return nointdesti;
    }

    public void setNointdesti(String nointdesti) {
        this.nointdesti = nointdesti;
    }

    public String getColdesti() {
        return coldesti;
    }

    public void setColdesti(String coldesti) {
        this.coldesti = coldesti;
    }

    public String getCpdesti() {
        return cpdesti;
    }

    public void setCpdesti(String cpdesti) {
        this.cpdesti = cpdesti;
    }

    public String getCiudesti() {
        return ciudesti;
    }

    public void setCiudesti(String ciudesti) {
        this.ciudesti = ciudesti;
    }

    public String getEstaddesti() {
        return estaddesti;
    }

    public void setEstaddesti(String estaddesti) {
        this.estaddesti = estaddesti;
    }

    public String getPaisdesti() {
        return paisdesti;
    }

    public void setPaisdesti(String paisdesti) {
        this.paisdesti = paisdesti;
    }

    public String getCalledestient() {
        return calledestient;
    }

    public void setCalledestient(String calledestient) {
        this.calledestient = calledestient;
    }

    public String getNoextdestient() {
        return noextdestient;
    }

    public void setNoextdestient(String noextdestient) {
        this.noextdestient = noextdestient;
    }

    public String getNointdestient() {
        return nointdestient;
    }

    public void setNointdestient(String nointdestient) {
        this.nointdestient = nointdestient;
    }

    public String getColdestient() {
        return coldestient;
    }

    public void setColdestient(String coldestient) {
        this.coldestient = coldestient;
    }

    public String getCpdestient() {
        return cpdestient;
    }

    public void setCpdestient(String cpdestient) {
        this.cpdestient = cpdestient;
    }

    public String getEstaddestient() {
        return estaddestient;
    }

    public void setEstaddestient(String estaddestient) {
        this.estaddestient = estaddestient;
    }

    public String getCiudestient() {
        return ciudestient;
    }

    public void setCiudestient(String ciudestient) {
        this.ciudestient = ciudestient;
    }

    public String getPaisdestient() {
        return paisdestient;
    }

    public void setPaisdestient(String paisdestient) {
        this.paisdestient = paisdestient;
    }

    public String getNombretrans() {
        return nombretrans;
    }

    public void setNombretrans(String nombretrans) {
        this.nombretrans = nombretrans;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
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

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
import java.math.BigDecimal;
//@Index(name="")

@Entity @Table(name = "pedidos") public class Pedidos {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="codcot") @Column(name = "codcot", nullable = false,length = 30) private String codcot;
  @Column(name = "motiv", nullable = true, length = 255) private String motiv = "";
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "totdescu", nullable = false) private BigDecimal totdescu;
  @Column(name = "totcost", nullable = false) private BigDecimal totcost;
  @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Column(name = "norefer", nullable = true, length = 30) private String norefer = "";
  @Column(name = "vta", nullable = true, columnDefinition = "int default 0") private int vta = 0;
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "tipcamnac", nullable = false) private BigDecimal tipcamnac;
  @Column(name = "monedaID", nullable = false, columnDefinition = "int default 0") private int monedaID;
  @Column(name = "noservta", nullable = true, length = 30) private String noservta = "";
  @Column(name = "codemp", nullable = false,length = 30) private String codemp;
  @Column(name = "referencia", nullable = true, length = 255) private String referencia = "";
  @Column(name = "observ", nullable = false,length = 255) private String observ;
  @Column(name = "total_traslado", nullable = false) private BigDecimal total_traslado;
  @Column(name = "total_retencion", nullable = false) private BigDecimal total_retencion;
  @Column(name = "subtot", nullable = false) private BigDecimal subtot;
  @Column(name = "impue", columnDefinition = "NUMERIC(19,2)",nullable = false) private BigDecimal impue;
  @Column(name = "tot", nullable = false) private BigDecimal tot;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "estad", nullable = false,length = 10) private String estad;
  @Column(name = "fdoc", nullable = false) private Date fdoc = new Date();
  @Column(name = "fentre", nullable = false) private Date fentre = new Date();
  @Column(name = "fvenc", nullable = false) private Date fvenc = new Date(); 
  @Column(name = "estac", nullable = false,length = 255) private String estac;
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

    public String getCodcot() {
        return codcot;
    }

    public void setCodcot(String codcot) {
        this.codcot = codcot;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public BigDecimal getTotdescu() {
        return totdescu;
    }

    public void setTotdescu(BigDecimal totdescu) {
        this.totdescu = totdescu;
    }

    public BigDecimal getTotcost() {
        return totcost;
    }

    public void setTotcost(BigDecimal totcost) {
        this.totcost = totcost;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getNorefer() {
        return norefer;
    }

    public void setNorefer(String norefer) {
        this.norefer = norefer;
    }

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public BigDecimal getTipcam() {
        return tipcam;
    }

    public void setTipcam(BigDecimal tipcam) {
        this.tipcam = tipcam;
    }

    public BigDecimal getTipcamnac() {
        return tipcamnac;
    }

    public void setTipcamnac(BigDecimal tipcamnac) {
        this.tipcamnac = tipcamnac;
    }

    public int getMonedaID() {
        return monedaID;
    }

    public void setMonedaID(int monedaID) {
        this.monedaID = monedaID;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
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

    public BigDecimal getSubtot() {
        return subtot;
    }

    public void setSubtot(BigDecimal subtot) {
        this.subtot = subtot;
    }

    public BigDecimal getImpue() {
        return impue;
    }

    public void setImpue(BigDecimal impue) {
        this.impue = impue;
    }

    public BigDecimal getTot() {
        return tot;
    }

    public void setTot(BigDecimal tot) {
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

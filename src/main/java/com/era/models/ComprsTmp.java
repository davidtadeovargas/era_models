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

@Entity@Table(name = "comprs_tmp",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})})public class ComprsTmp {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="comprs_codcomp") @Column(name = "codcomp", nullable = false,length = 30) private String codcomp;
  @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Column(name = "prov", nullable = false,length = 30) private String prov;
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "notcred", nullable = true, length = 30) private String notcred = "";
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "tipcamnac", nullable = false) private BigDecimal tipcamnac;
  @Column(name = "monedaID", nullable = false, columnDefinition = "int default 0") private int monedaID;
  @Column(name = "notcredpag", nullable = true, length = 250) private String notcredpag = "";
  @Column(name = "concep", nullable = true, length = 30) private String concep = "";
  @Column(name = "ruta", nullable = true, length = 500) private String ruta = "";
  @Column(name = "referencia", nullable = true, length = 255) private String referencia = "";
  @Column(name = "observ", nullable = true, length = 255) private String observ = "";
  @Column(name = "nomprov", nullable = false,length = 255) private String nomprov;
  @Column(name = "metpag", nullable = true, length = 42) private String metpag = "";
  @Column(name = "cta", nullable = true, length = 42) private String cta = "";
  @Column(name = "nodoc", nullable = false,length = 50) private String nodoc;
  @Column(name = "fdoc", nullable = true) private Date fdoc = new Date();
  @Column(name = "fent", nullable = true) private Date fent = new Date();
  @Column(name = "subtot", nullable = false) private BigDecimal subtot;
  @Column(name = "impue", columnDefinition = "NUMERIC(19,2)",nullable = false) private BigDecimal impue;
  @Column(name = "tip", nullable = true) private String tip;
  @Column(name = "tot", nullable = false) private BigDecimal tot;
  @Column(name = "archpdf", nullable = true, columnDefinition = "boolean default false") private boolean archpdf = false;
  @Column(name = "archxml", nullable = true, columnDefinition = "boolean default false") private boolean archxml = false;
  @Column(name = "recib", nullable = true) private BigDecimal recib = BigDecimal.ZERO;
  @Column(name = "contra", nullable = true, columnDefinition = "int default 0") private int contra = 0;
  @Column(name = "estado", nullable = false,length = 10) private String estado;
  @Column(name = "motiv", nullable = false,length = 255) private String motiv;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
  @Column(name = "codord", nullable = true, length = 30) private String codord = "";
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "fvenc", nullable = false) private Date fvenc = new Date();
  @Column(name = "total_traslado", nullable = false) private BigDecimal total_traslado;
  @Column(name = "total_retencion", nullable = false) private BigDecimal total_retencion;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodcomp() {
        return codcomp;
    }

    public void setCodcomp(String codcomp) {
        this.codcomp = codcomp;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getNotcred() {
        return notcred;
    }

    public void setNotcred(String notcred) {
        this.notcred = notcred;
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

    public String getNotcredpag() {
        return notcredpag;
    }

    public void setNotcredpag(String notcredpag) {
        this.notcredpag = notcredpag;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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

    public String getNomprov() {
        return nomprov;
    }

    public void setNomprov(String nomprov) {
        this.nomprov = nomprov;
    }

    public String getMetpag() {
        return metpag;
    }

    public void setMetpag(String metpag) {
        this.metpag = metpag;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public String getNodoc() {
        return nodoc;
    }

    public void setNodoc(String nodoc) {
        this.nodoc = nodoc;
    }

    public Date getFdoc() {
        return fdoc;
    }

    public void setFdoc(Date fdoc) {
        this.fdoc = fdoc;
    }

    public Date getFent() {
        return fent;
    }

    public void setFent(Date fent) {
        this.fent = fent;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public BigDecimal getTot() {
        return tot;
    }

    public void setTot(BigDecimal tot) {
        this.tot = tot;
    }

    public boolean isArchpdf() {
        return archpdf;
    }

    public void setArchpdf(boolean archpdf) {
        this.archpdf = archpdf;
    }

    public boolean isArchxml() {
        return archxml;
    }

    public void setArchxml(boolean archxml) {
        this.archxml = archxml;
    }

    public BigDecimal getRecib() {
        return recib;
    }

    public void setRecib(BigDecimal recib) {
        this.recib = recib;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
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

    public String getCodord() {
        return codord;
    }

    public void setCodord(String codord) {
        this.codord = codord;
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

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
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

     
}
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

@Entity @Table(name = "traspas") public class Traspas {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="code")  @Column(name = "code", nullable = false,length = 255) private String code;
  @Index(name="alma") @Column(name = "alma", nullable = false,length = 255) private String alma;
  @Column(name = "concep", nullable = false,length = 50) private String concep;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "cantsal", nullable = true, columnDefinition = "float default 0") private float cantsal;
  @Column(name = "almaa", nullable = false,length = 30) private String almaa;
  @Column(name = "cantent", nullable = true, columnDefinition = "float default 0") private float cantent;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "UsuarioResponsableTras", nullable = true) private String UsuarioResponsableTras;
  @Column(name = "lotePedimento", nullable = true, columnDefinition = "int default 0") private int lotePedimento = 0;
  @Column(name = "costo", nullable = true) private BigDecimal costo = BigDecimal.ZERO;
  @Column(name = "estado", nullable = true) private String estado;
  @Column(name = "reporteSalida", nullable = true) private String reporteSalida;
  @Column(name = "reporteEntrada", nullable = true) private String reporteEntrada;
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public float getCantsal() {
        return cantsal;
    }

    public void setCantsal(float cantsal) {
        this.cantsal = cantsal;
    }

    public String getAlmaa() {
        return almaa;
    }

    public void setAlmaa(String almaa) {
        this.almaa = almaa;
    }

    public float getCantent() {
        return cantent;
    }

    public void setCantent(float cantent) {
        this.cantent = cantent;
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

    public String getUsuarioResponsableTras() {
        return UsuarioResponsableTras;
    }

    public void setUsuarioResponsableTras(String UsuarioResponsableTras) {
        this.UsuarioResponsableTras = UsuarioResponsableTras;
    }

    public int getLotePedimento() {
        return lotePedimento;
    }

    public void setLotePedimento(int lotePedimento) {
        this.lotePedimento = lotePedimento;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReporteSalida() {
        return reporteSalida;
    }

    public void setReporteSalida(String reporteSalida) {
        this.reporteSalida = reporteSalida;
    }

    public String getReporteEntrada() {
        return reporteEntrada;
    }

    public void setReporteEntrada(String reporteEntrada) {
        this.reporteEntrada = reporteEntrada;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }

                    
           
}

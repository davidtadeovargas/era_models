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

@Entity@Table(name = "movimientos_pagos")public class MovimientosPagos {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Index(name="pago_id")  @Column(name = "pago_id", nullable = true) private int pago_id;  
  @Column(name = "serie", nullable = true) private String serie;
  @Column(name = "folio", nullable = true) private String folio;
  @Column(name = "subtotal", nullable = true) private BigDecimal subtotal;
  @Column(name = "impuestos", nullable = true) private BigDecimal impuestos;
  @Column(name = "total", nullable = true) private BigDecimal total;
  @Column(name = "pendiente", nullable = true) private BigDecimal pendiente;
  @Column(name = "abono", nullable = true) private BigDecimal abono;
  @Column(name = "docto_origen", nullable = true, length = 45) private String docto_origen;
  @Column(name = "tipo", nullable = true) private String tipo;
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPago_id() {
        return pago_id;
    }

    public void setPago_id(int pago_id) {
        this.pago_id = pago_id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(BigDecimal impuestos) {
        this.impuestos = impuestos;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getPendiente() {
        return pendiente;
    }

    public void setPendiente(BigDecimal pendiente) {
        this.pendiente = pendiente;
    }

    public BigDecimal getAbono() {
        return abono;
    }

    public void setAbono(BigDecimal abono) {
        this.abono = abono;
    }

    public String getDocto_origen() {
        return docto_origen;
    }

    public void setDocto_origen(String docto_origen) {
        this.docto_origen = docto_origen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Index(name="")


@Entity@Table(name = "impuestos_x_compra")public class ImpuestosXCompra {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "compra", nullable = false) private int compra;  
  @Column(name = "impuesto", nullable = true) private String impuesto;
  @Column(name = "retencion", nullable = true, columnDefinition = "boolean default false") private boolean retencion;
  @Column(name = "total", nullable = false) private BigDecimal total;  
  @Column(name = "estac", nullable = true) private String estac;
  @Column(name = "sucu", nullable = true) private String sucu;
  @Column(name = "nocaj", nullable = true) private String nocaj;  
  @Column(name = "fvenc", nullable = false) private Date fvenc = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public boolean isRetencion() {
        return retencion;
    }

    public void setRetencion(boolean retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
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

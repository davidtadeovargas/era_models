/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Index(name="")

@Entity@Table(name = "modifica_impuestos")public class ModificaImpuestos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "venta", nullable = false) private int venta;
  @Column(name = "partida", nullable = true) private int partida;
  @Column(name = "total_anterior", nullable = true) private BigDecimal total_anterior;
  @Column(name = "total_nuevo", nullable = true) private BigDecimal total_nuevo;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    public BigDecimal getTotal_anterior() {
        return total_anterior;
    }

    public void setTotal_anterior(BigDecimal total_anterior) {
        this.total_anterior = total_anterior;
    }

    public BigDecimal getTotal_nuevo() {
        return total_nuevo;
    }

    public void setTotal_nuevo(BigDecimal total_nuevo) {
        this.total_nuevo = total_nuevo;
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

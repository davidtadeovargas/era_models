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
import java.math.BigDecimal;
//@Index(name="")

@Entity @Table(name = "impuesxpartidaped") public class Impuesxpartidaped {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "idParts", nullable = false, columnDefinition = "int default 0") private int idParts;
  @Column(name = "idPartida", nullable = false, columnDefinition = "int default 0") private int idPartida;
  @Column(name = "ret_tras", nullable = false, length = 3) private String ret_tras; 
  @Column(name = "codigoImpuesto", nullable = false,length = 30) private String codigoImpuesto;
  @Column(name = "total", nullable = false) private BigDecimal total;
  @Column(name = "retencion", nullable = false, columnDefinition = "int default 0") private int retencion;
  @Column(name = "tasa", nullable = false) private BigDecimal tasa;  
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

    public int getIdParts() {
        return idParts;
    }

    public void setIdParts(int idParts) {
        this.idParts = idParts;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public String getRet_tras() {
        return ret_tras;
    }

    public void setRet_tras(String ret_tras) {
        this.ret_tras = ret_tras;
    }

    public String getCodigoImpuesto() {
        return codigoImpuesto;
    }

    public void setCodigoImpuesto(String codigoImpuesto) {
        this.codigoImpuesto = codigoImpuesto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
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
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

@Entity @Table(name = "ingres") public class Ingres {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Column(name = "idIngresCab", nullable = true) private int idIngresCab;
  @Index(name="prod") @Column(name = "prod", nullable = false,length = 255) private String prod;
  @Index(name="alma")  @Column(name = "alma", nullable = false,length = 255) private String alma;
  @Column(name = "unid", nullable = false,length = 255) private String unid;
  @Column(name = "concep", nullable = false,length = 50) private String concep;
  @Column(name = "cant", nullable = true) private float cant;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "entsal", nullable = false) private boolean entsal;  
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "activo", nullable = true, length = 45) private String activo = "";
  @Column(name = "falt", nullable = true) private Date falt;  
  @Column(name = "costo", nullable = true) private String costo = "0";
  @Column(name = "cantsal", nullable = true) private BigDecimal cantsal;  
  @Column(name = "tipcamnac", nullable = false) private BigDecimal tipcamnac;
  @Column(name = "pedimento", nullable = false) private String pedimento = "";
  @Column(name = "lote", nullable = false) private String lote = "";
  @Column(name = "caducidad", nullable = false) private Date caducidad = new Date();
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdIngresCab() {
        return idIngresCab;
    }

    public void setIdIngresCab(int idIngresCab) {
        this.idIngresCab = idIngresCab;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
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

    public boolean isEntsal() {
        return entsal;
    }

    public void setEntsal(boolean entsal) {
        this.entsal = entsal;
    }

    public String getNocaj() {
        return nocaj;
    }

    public void setNocaj(String nocaj) {
        this.nocaj = nocaj;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public BigDecimal getCantsal() {
        return cantsal;
    }

    public void setCantsal(BigDecimal cantsal) {
        this.cantsal = cantsal;
    }

    public BigDecimal getTipcamnac() {
        return tipcamnac;
    }

    public void setTipcamnac(BigDecimal tipcamnac) {
        this.tipcamnac = tipcamnac;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }

    
        
}

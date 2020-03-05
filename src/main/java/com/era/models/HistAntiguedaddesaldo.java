/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.Table;
import org.hibernate.annotations.Index;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Index(name="")

@Entity@Table(name = "hist_antiguedaddesaldo")public class HistAntiguedaddesaldo {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Column(name = "idCorte", nullable = false) private int idCorte;
  
  @Index(name="hist_antiguedaddesaldo_nom") @Column(name = "nom", nullable = false,length = 255) private String nom = "";
  @Index(name="hist_antiguedaddesaldo_codemp") @Column(name = "codemp", nullable = false,length = 30) private String codemp = "";  
  @Column(name = "ven", nullable = true) private BigDecimal ven = BigDecimal.ZERO;
  @Column(name = "Anti15", nullable = true) private BigDecimal Anti15 = BigDecimal.ZERO;
  @Column(name = "Anti30", nullable = true) private BigDecimal Anti30 = BigDecimal.ZERO;
  @Column(name = "Anti45", nullable = true) private BigDecimal Anti45 = BigDecimal.ZERO;
  @Column(name = "Anti45Mas", nullable = true) private BigDecimal Anti45Mas = BigDecimal.ZERO;
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

    public int getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(int idCorte) {
        this.idCorte = idCorte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public BigDecimal getVen() {
        return ven;
    }

    public void setVen(BigDecimal ven) {
        this.ven = ven;
    }

    public BigDecimal getAnti15() {
        return Anti15;
    }

    public void setAnti15(BigDecimal Anti15) {
        this.Anti15 = Anti15;
    }

    public BigDecimal getAnti30() {
        return Anti30;
    }

    public void setAnti30(BigDecimal Anti30) {
        this.Anti30 = Anti30;
    }

    public BigDecimal getAnti45() {
        return Anti45;
    }

    public void setAnti45(BigDecimal Anti45) {
        this.Anti45 = Anti45;
    }

    public BigDecimal getAnti45Mas() {
        return Anti45Mas;
    }

    public void setAnti45Mas(BigDecimal Anti45Mas) {
        this.Anti45Mas = Anti45Mas;
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

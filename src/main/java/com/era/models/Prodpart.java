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
//@Index(name="")

@Entity @Table(name = "prodpart",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Prodpart {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="prodpart_prod") @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Index(name="prodpart_part") @Column(name = "part", nullable = false,length = 30) private String part;  
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

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
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
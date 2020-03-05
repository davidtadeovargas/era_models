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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Index;

@Entity @Table(name = "almas") public class Almas {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="almas_alma") @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "respon", nullable = false,length = 30) private String respon;
  @Column(name = "almadescrip", nullable = false,length = 255) private String almadescrip;
  @Column(name = "dir1", nullable = true) private String dir1 = "";
  @Column(name = "dir2", nullable = true) private String dir2 = "";
  @Column(name = "dir3", nullable = true) private String dir3 = "";
  @Column(name = "actfij", nullable = true) private boolean actfij = false;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "falt", nullable = true) private Date falt;
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "fmod", nullable = false, updatable=false) private Date fmod;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
    }

    public String getAlmadescrip() {
        return almadescrip;
    }

    public void setAlmadescrip(String almadescrip) {
        this.almadescrip = almadescrip;
    }

    public String getDir1() {
        return dir1;
    }

    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }

    public String getDir2() {
        return dir2;
    }

    public void setDir2(String dir2) {
        this.dir2 = dir2;
    }

    public String getDir3() {
        return dir3;
    }

    public void setDir3(String dir3) {
        this.dir3 = dir3;
    }

    public boolean isActfij() {
        return actfij;
    }

    public void setActfij(boolean actfij) {
        this.actfij = actfij;
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

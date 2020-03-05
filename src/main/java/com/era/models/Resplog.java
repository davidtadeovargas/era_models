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

@Entity @Table(name = "resplog",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Resplog {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="resplog_tip") @Column(name = "tip", nullable = false) private boolean tip;
  @Column(name = "return", nullable = true) private int return_ = -1;
  @Column(name = "pathdemysq", nullable = true, length = 2048) private String pathdemysq = "";
  @Column(name = "pathamysq", nullable = true, length = 2048) private String pathamysq = "";
  @Column(name = "pathde", nullable = true, length = 2048) private String pathde = "";
  @Column(name = "patha", nullable = true, length = 2048) private String patha = "";
  @Column(name = "msj", nullable = true, length = 500) private String msj = "";  
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

    public boolean isTip() {
        return tip;
    }

    public void setTip(boolean tip) {
        this.tip = tip;
    }

    public int getReturn_() {
        return return_;
    }

    public void setReturn_(int return_) {
        this.return_ = return_;
    }

    public String getPathdemysq() {
        return pathdemysq;
    }

    public void setPathdemysq(String pathdemysq) {
        this.pathdemysq = pathdemysq;
    }

    public String getPathamysq() {
        return pathamysq;
    }

    public void setPathamysq(String pathamysq) {
        this.pathamysq = pathamysq;
    }

    public String getPathde() {
        return pathde;
    }

    public void setPathde(String pathde) {
        this.pathde = pathde;
    }

    public String getPatha() {
        return patha;
    }

    public void setPatha(String patha) {
        this.patha = patha;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
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

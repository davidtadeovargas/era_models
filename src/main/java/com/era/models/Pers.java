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

@Entity @Table(name = "pers",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Pers {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="pers_nom")   @Column(name = "nom", nullable = false,length = 255) private String nom;
  @Column(name = "act", nullable = true) private boolean act = true;
  @Column(name = "rutimg", nullable = true, length = 500) private String rutimg = "";
  @Column(name = "calle", nullable = true, length = 255) private String calle = "";
  @Column(name = "col", nullable = true, length = 255) private String col = "";
  @Column(name = "noext", nullable = true, length = 21) private String noext = "";
  @Column(name = "noint", nullable = true, length = 21) private String noint = "";
  @Column(name = "CP", nullable = true, length = 6) private String CP = "";
  @Column(name = "tel1", nullable = true) private String tel1 = "";
  @Column(name = "tel2", nullable = true) private String tel2 = "";
  @Column(name = "cel1", nullable = true) private String cel1 = "";
  @Column(name = "cel2", nullable = true) private String cel2 = "";
  @Column(name = "fingemp", nullable = false) private Date fingemp = new Date();
  @Column(name = "fsalemp", nullable = false) private Date fsalemp = new Date();
  @Column(name = "teleme1", nullable = true) private String teleme1 = "";
  @Column(name = "teleme2", nullable = true) private String teleme2 = "";
  @Column(name = "contac1", nullable = true) private String contac1;
  @Column(name = "contac2", nullable = true) private String contac2 = "";
  @Column(name = "sueldactua", nullable = true) private float sueldactua = 0;
  @Column(name = "textra", nullable = true) private float textra = 0;
  @Column(name = "sueldfora", nullable = true) private float sueldfora = 0;  
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    public String getRutimg() {
        return rutimg;
    }

    public void setRutimg(String rutimg) {
        this.rutimg = rutimg;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getNoext() {
        return noext;
    }

    public void setNoext(String noext) {
        this.noext = noext;
    }

    public String getNoint() {
        return noint;
    }

    public void setNoint(String noint) {
        this.noint = noint;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getCel1() {
        return cel1;
    }

    public void setCel1(String cel1) {
        this.cel1 = cel1;
    }

    public String getCel2() {
        return cel2;
    }

    public void setCel2(String cel2) {
        this.cel2 = cel2;
    }

    public Date getFingemp() {
        return fingemp;
    }

    public void setFingemp(Date fingemp) {
        this.fingemp = fingemp;
    }

    public Date getFsalemp() {
        return fsalemp;
    }

    public void setFsalemp(Date fsalemp) {
        this.fsalemp = fsalemp;
    }

    public String getTeleme1() {
        return teleme1;
    }

    public void setTeleme1(String teleme1) {
        this.teleme1 = teleme1;
    }

    public String getTeleme2() {
        return teleme2;
    }

    public void setTeleme2(String teleme2) {
        this.teleme2 = teleme2;
    }

    public String getContac1() {
        return contac1;
    }

    public void setContac1(String contac1) {
        this.contac1 = contac1;
    }

    public String getContac2() {
        return contac2;
    }

    public void setContac2(String contac2) {
        this.contac2 = contac2;
    }

    public float getSueldactua() {
        return sueldactua;
    }

    public void setSueldactua(float sueldactua) {
        this.sueldactua = sueldactua;
    }

    public float getTextra() {
        return textra;
    }

    public void setTextra(float textra) {
        this.textra = textra;
    }

    public float getSueldfora() {
        return sueldfora;
    }

    public void setSueldfora(float sueldfora) {
        this.sueldfora = sueldfora;
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

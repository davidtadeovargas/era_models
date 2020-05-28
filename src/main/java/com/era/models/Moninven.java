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

@Entity @Table(name = "moninven") public class Moninven {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="prod") @Column(name = "prod", nullable = false,length = 255) private String prod;
  @Column(name = "cant", nullable = true, columnDefinition = "float default 0") private float cant;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Index(name="alma")  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "nodoc", nullable = false,length = 30) private String nodoc;
  @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Column(name = "concep", nullable = false,length = 50) private String concep;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "emp", nullable = false,length = 30) private String emp;
  @Column(name = "entsal", nullable = false, columnDefinition = "boolean default false") private boolean entsal;
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "existenciainicial", nullable = true) private BigDecimal existenciainicial;
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

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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

    public String getNodoc() {
        return nodoc;
    }

    public void setNodoc(String nodoc) {
        this.nodoc = nodoc;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
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

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public boolean isEntsal() {
        return entsal;
    }

    public void setEntsal(boolean entsal) {
        this.entsal = entsal;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public BigDecimal getExistenciainicial() {
        return existenciainicial;
    }

    public void setExistenciainicial(BigDecimal existenciainicial) {
        this.existenciainicial = existenciainicial;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }
    

  
}

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
//@Index(name="")

@Entity @Table(name = "partcot") public class Partcot {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Index(name="codcot")  @Column(name = "codcot", nullable = false,length = 30) private String codcot;
  @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Column(name = "tipcam", nullable = true) private float tipcam;
  @Column(name = "cost", nullable = true) private float cost = 0;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "cant", nullable = false) private int cant;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "eskit", nullable = true) private boolean eskit = false;
  @Column(name = "serprod", nullable = false,length = 30) private String serprod;
  @Column(name = "comenser", nullable = false,length = 255) private String comenser;
  @Column(name = "tall", nullable = true, length = 30) private String tall = "";
  @Column(name = "fentre", nullable = true, length = 30) private String fentre = "";
  @Column(name = "codimpue", nullable = false,length = 30) private String codimpue;
  @Column(name = "colo", nullable = true, length = 30) private String colo = "";
  @Column(name = "garan", nullable = true, length = 255) private String garan = "";
  @Column(name = "list", nullable = true) private int list = 1;
  @Column(name = "lot", nullable = true, length = 255) private String lot = "";
  @Column(name = "pedimen", nullable = true, length = 255) private String pedimen = "";
  @Column(name = "fcadu", nullable = false) private Date fcadu = new Date();
  @Column(name = "pre", nullable = true) private float pre;
  @Column(name = "pre2", nullable = false) private float pre2;
  @Column(name = "desc1", nullable = false) private float desc1;
  @Column(name = "desc2", nullable = false) private float desc2;
  @Column(name = "desc3", nullable = false) private float desc3;
  @Column(name = "desc4", nullable = false) private float desc4;
  @Column(name = "desc5", nullable = false) private float desc5;
  @Column(name = "impo", nullable = true) private float impo;
  @Column(name = "impo2", nullable = false) private float impo2;
  @Column(name = "impueval", nullable = true) private float impueval;
  @Column(name = "impueimpo", nullable = true) private float impueimpo;
  @Column(name = "impueimpo2", nullable = false) private float impueimpo2;
  @Column(name = "impodesc", nullable = true) private float impodesc = 0;
  @Column(name = "alma", nullable = false,length = 30) private String alma;  
  @Column(name = "descripcionOpcional", nullable = true) private String descripcionOpcional = "";
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

    public String getCodcot() {
        return codcot;
    }

    public void setCodcot(String codcot) {
        this.codcot = codcot;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public float getTipcam() {
        return tipcam;
    }

    public void setTipcam(float tipcam) {
        this.tipcam = tipcam;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean isEskit() {
        return eskit;
    }

    public void setEskit(boolean eskit) {
        this.eskit = eskit;
    }

    public String getSerprod() {
        return serprod;
    }

    public void setSerprod(String serprod) {
        this.serprod = serprod;
    }

    public String getComenser() {
        return comenser;
    }

    public void setComenser(String comenser) {
        this.comenser = comenser;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getFentre() {
        return fentre;
    }

    public void setFentre(String fentre) {
        this.fentre = fentre;
    }

    public String getCodimpue() {
        return codimpue;
    }

    public void setCodimpue(String codimpue) {
        this.codimpue = codimpue;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    public String getGaran() {
        return garan;
    }

    public void setGaran(String garan) {
        this.garan = garan;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPedimen() {
        return pedimen;
    }

    public void setPedimen(String pedimen) {
        this.pedimen = pedimen;
    }

    public Date getFcadu() {
        return fcadu;
    }

    public void setFcadu(Date fcadu) {
        this.fcadu = fcadu;
    }

    public float getPre() {
        return pre;
    }

    public void setPre(float pre) {
        this.pre = pre;
    }

    public float getPre2() {
        return pre2;
    }

    public void setPre2(float pre2) {
        this.pre2 = pre2;
    }

    public float getDesc1() {
        return desc1;
    }

    public void setDesc1(float desc1) {
        this.desc1 = desc1;
    }

    public float getDesc2() {
        return desc2;
    }

    public void setDesc2(float desc2) {
        this.desc2 = desc2;
    }

    public float getDesc3() {
        return desc3;
    }

    public void setDesc3(float desc3) {
        this.desc3 = desc3;
    }

    public float getDesc4() {
        return desc4;
    }

    public void setDesc4(float desc4) {
        this.desc4 = desc4;
    }

    public float getDesc5() {
        return desc5;
    }

    public void setDesc5(float desc5) {
        this.desc5 = desc5;
    }

    public float getImpo() {
        return impo;
    }

    public void setImpo(float impo) {
        this.impo = impo;
    }

    public float getImpo2() {
        return impo2;
    }

    public void setImpo2(float impo2) {
        this.impo2 = impo2;
    }

    public float getImpueval() {
        return impueval;
    }

    public void setImpueval(float impueval) {
        this.impueval = impueval;
    }

    public float getImpueimpo() {
        return impueimpo;
    }

    public void setImpueimpo(float impueimpo) {
        this.impueimpo = impueimpo;
    }

    public float getImpueimpo2() {
        return impueimpo2;
    }

    public void setImpueimpo2(float impueimpo2) {
        this.impueimpo2 = impueimpo2;
    }

    public float getImpodesc() {
        return impodesc;
    }

    public void setImpodesc(float impodesc) {
        this.impodesc = impodesc;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getDescripcionOpcional() {
        return descripcionOpcional;
    }

    public void setDescripcionOpcional(String descripcionOpcional) {
        this.descripcionOpcional = descripcionOpcional;
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

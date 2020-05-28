
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

@Entity @Table(name = "partprevcomprs") public class Partprevcomprs {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="codcom") @Column(name = "codcom", nullable = false,length = 30) private String codcom;
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "prod", nullable = false,length = 255) private String prod;
  @Column(name = "cant", nullable = false, columnDefinition = "int default 0") private int cant;
  @Column(name = "cantlotpend", nullable = true, columnDefinition = "float default 0") private float cantlotpend;
  @Column(name = "impue", nullable = true, columnDefinition = "float default 0") private float impue = 0;
  @Column(name = "devs", nullable = true, columnDefinition = "int default 0") private int devs = 0;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "cost", nullable = true, columnDefinition = "float default 0") private float cost;
  @Column(name = "costpro", nullable = true, columnDefinition = "float default 0") private float costpro;
  @Column(name = "serprod", nullable = false,length = 30) private String serprod;
  @Column(name = "tall", nullable = true, length = 30) private String tall = "";
  @Column(name = "colo", nullable = true, length = 30) private String colo = "";
  @Column(name = "garan", nullable = false,length = 255) private String garan;
  @Column(name = "comenser", nullable = false,length = 255) private String comenser;
  @Column(name = "peps", nullable = true, columnDefinition = "float default 0") private float peps = 0;
  @Column(name = "ueps", nullable = true, columnDefinition = "float default 0") private float ueps = 0;
  @Column(name = "descu", nullable = true, columnDefinition = "float default 0") private float descu;
  @Column(name = "descad", nullable = true, columnDefinition = "float default 0") private float descad;
  @Column(name = "recib", nullable = true, columnDefinition = "float default 0") private float recib = 0;
  @Column(name = "codimpue", nullable = false,length = 30) private String codimpue;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "lot", nullable = true, length = 30) private String lot = "";
  @Column(name = "pedimen", nullable = true, length = 30) private String pedimen = "";
  @Column(name = "aplic", nullable = true, columnDefinition = "boolean default false") private boolean aplic = false;
  @Column(name = "idkit", nullable = true, columnDefinition = "int default 0") private int idkit = -1;
  @Column(name = "kitmae", nullable = true, columnDefinition = "boolean default false") private boolean kitmae = false;
  @Column(name = "eskit", nullable = true, columnDefinition = "boolean default false") private boolean eskit = false;
  @Column(name = "impo", nullable = true, columnDefinition = "float default 0") private float impo;
  @Column(name = "tipcam", nullable = true, columnDefinition = "float default 0") private float tipcam;
  @Column(name = "flotvenc", nullable = false) private Date flotvenc = new Date();  
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "activo", nullable = true) private String activo;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodcom() {
        return codcom;
    }

    public void setCodcom(String codcom) {
        this.codcom = codcom;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getCantlotpend() {
        return cantlotpend;
    }

    public void setCantlotpend(float cantlotpend) {
        this.cantlotpend = cantlotpend;
    }

    public float getImpue() {
        return impue;
    }

    public void setImpue(float impue) {
        this.impue = impue;
    }

    public int getDevs() {
        return devs;
    }

    public void setDevs(int devs) {
        this.devs = devs;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCostpro() {
        return costpro;
    }

    public void setCostpro(float costpro) {
        this.costpro = costpro;
    }

    public String getSerprod() {
        return serprod;
    }

    public void setSerprod(String serprod) {
        this.serprod = serprod;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
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

    public String getComenser() {
        return comenser;
    }

    public void setComenser(String comenser) {
        this.comenser = comenser;
    }

    public float getPeps() {
        return peps;
    }

    public void setPeps(float peps) {
        this.peps = peps;
    }

    public float getUeps() {
        return ueps;
    }

    public void setUeps(float ueps) {
        this.ueps = ueps;
    }

    public float getDescu() {
        return descu;
    }

    public void setDescu(float descu) {
        this.descu = descu;
    }

    public float getDescad() {
        return descad;
    }

    public void setDescad(float descad) {
        this.descad = descad;
    }

    public float getRecib() {
        return recib;
    }

    public void setRecib(float recib) {
        this.recib = recib;
    }

    public String getCodimpue() {
        return codimpue;
    }

    public void setCodimpue(String codimpue) {
        this.codimpue = codimpue;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
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

    public boolean isAplic() {
        return aplic;
    }

    public void setAplic(boolean aplic) {
        this.aplic = aplic;
    }

    public int getIdkit() {
        return idkit;
    }

    public void setIdkit(int idkit) {
        this.idkit = idkit;
    }

    public boolean isKitmae() {
        return kitmae;
    }

    public void setKitmae(boolean kitmae) {
        this.kitmae = kitmae;
    }

    public boolean isEskit() {
        return eskit;
    }

    public void setEskit(boolean eskit) {
        this.eskit = eskit;
    }

    public float getImpo() {
        return impo;
    }

    public void setImpo(float impo) {
        this.impo = impo;
    }

    public float getTipcam() {
        return tipcam;
    }

    public void setTipcam(float tipcam) {
        this.tipcam = tipcam;
    }

    public Date getFlotvenc() {
        return flotvenc;
    }

    public void setFlotvenc(Date flotvenc) {
        this.flotvenc = flotvenc;
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

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
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

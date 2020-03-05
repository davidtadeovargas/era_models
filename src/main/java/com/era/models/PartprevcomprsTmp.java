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

@Entity@Table(name = "partprevcomprs_tmp")public class PartprevcomprsTmp {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="codcom") @Column(name = "codcom", nullable = false,length = 30) private String codcom;
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "prod", nullable = false,length = 255) private String prod;
  @Column(name = "cant", nullable = false) private int cant;
  @Column(name = "cantlotpend", nullable = false) private BigDecimal cantlotpend;
  @Column(name = "impue", columnDefinition = "NUMERIC(19,2)",nullable = true) private BigDecimal impue = BigDecimal.ZERO;
  @Column(name = "devs", nullable = true) private int devs = 0;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "descrip", nullable = false,length = 2100) private String descrip;
  @Column(name = "cost", nullable = false) private BigDecimal cost;
  @Column(name = "costpro", nullable = false) private BigDecimal costpro;
  @Column(name = "serprod", nullable = false,length = 30) private String serprod;
  @Column(name = "tall", nullable = true, length = 30) private String tall = "";
  @Column(name = "colo", nullable = true, length = 30) private String colo = "";
  @Column(name = "garan", nullable = false,length = 255) private String garan;
  @Column(name = "comenser", nullable = false,length = 255) private String comenser;
  @Column(name = "peps", nullable = true) private BigDecimal peps = BigDecimal.ZERO;
  @Column(name = "ueps", nullable = true) private BigDecimal ueps = BigDecimal.ZERO;
  @Column(name = "descu", nullable = false) private BigDecimal descu;
  @Column(name = "descad", nullable = false) private BigDecimal descad;
  @Column(name = "recib", nullable = true) private BigDecimal recib = BigDecimal.ZERO;
  @Column(name = "codimpue", nullable = false,length = 30) private String codimpue;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "lot", nullable = true, length = 30) private String lot = "";
  @Column(name = "pedimen", nullable = true, length = 30) private String pedimen = "";
  @Column(name = "aplic", nullable = true) private boolean aplic = false;
  @Column(name = "idkit", nullable = true) private int idkit = -1;
  @Column(name = "kitmae", nullable = true) private boolean kitmae = false;
  @Column(name = "eskit", nullable = true) private boolean eskit = false;
  @Column(name = "impo", nullable = false) private BigDecimal impo;
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "flotvenc", nullable = false) private Date flotvenc = new Date();  
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "activo", nullable = true, length = 45) private String activo = "";
  @Column(name = "cuentacontable", nullable = true, length = 45) private String cuentacontable = "";
  @Column(name = "lotePedimento", nullable = true) private int lotePedimento = 0;
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

    public BigDecimal getCantlotpend() {
        return cantlotpend;
    }

    public void setCantlotpend(BigDecimal cantlotpend) {
        this.cantlotpend = cantlotpend;
    }

    public BigDecimal getImpue() {
        return impue;
    }

    public void setImpue(BigDecimal impue) {
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCostpro() {
        return costpro;
    }

    public void setCostpro(BigDecimal costpro) {
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

    public BigDecimal getPeps() {
        return peps;
    }

    public void setPeps(BigDecimal peps) {
        this.peps = peps;
    }

    public BigDecimal getUeps() {
        return ueps;
    }

    public void setUeps(BigDecimal ueps) {
        this.ueps = ueps;
    }

    public BigDecimal getDescu() {
        return descu;
    }

    public void setDescu(BigDecimal descu) {
        this.descu = descu;
    }

    public BigDecimal getDescad() {
        return descad;
    }

    public void setDescad(BigDecimal descad) {
        this.descad = descad;
    }

    public BigDecimal getRecib() {
        return recib;
    }

    public void setRecib(BigDecimal recib) {
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

    public BigDecimal getImpo() {
        return impo;
    }

    public void setImpo(BigDecimal impo) {
        this.impo = impo;
    }

    public BigDecimal getTipcam() {
        return tipcam;
    }

    public void setTipcam(BigDecimal tipcam) {
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

    public String getCuentacontable() {
        return cuentacontable;
    }

    public void setCuentacontable(String cuentacontable) {
        this.cuentacontable = cuentacontable;
    }

    public int getLotePedimento() {
        return lotePedimento;
    }

    public void setLotePedimento(int lotePedimento) {
        this.lotePedimento = lotePedimento;
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

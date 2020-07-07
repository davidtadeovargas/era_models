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
import javax.persistence.Transient;
//@Index(name="")

@Entity @Table(name = "partvta") public class Partvta {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "prod", nullable = false,length = 255) private String prod;
  @Index(name="vta") @Column(name = "vta", nullable = false, columnDefinition = "int default 0") private int vta;  
  @Column(name = "cant", nullable = false) private BigDecimal cant;
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "devs", nullable = true) private BigDecimal devs = BigDecimal.ZERO;
  @Transient @Column(name = "toDevs", nullable = true) private BigDecimal toDevs;
  @Column(name = "garan", nullable = true, length = 255) private String garan = "";
  @Column(name = "eskit", nullable = true, columnDefinition = "boolean default false") private boolean eskit = false;
  @Column(name = "kitmae", nullable = true, columnDefinition = "int default 0") private int kitmae = 0;
  @Column(name = "idkit", nullable = true, columnDefinition = "int default 0") private int idkit = -1;
  @Column(name = "idlotped", nullable = true, columnDefinition = "int default 0") private int idlotped = -1;
  @Column(name = "list", nullable = true, columnDefinition = "int default 0") private int list = 1;
  @Column(name = "unid", nullable = false,length = 30) private String unid;  
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "serprod", nullable = true,length = 30) private String serprod;
  @Column(name = "comenser", nullable = true,length = 255) private String comenser;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "pre", nullable = false) private BigDecimal pre;
  @Column(name = "descu", nullable = false) private BigDecimal descu;  
  @Column(name = "cost", nullable = true) private BigDecimal cost = BigDecimal.ZERO;  
  @Column(name = "mon", nullable = false) private String mon = "";
  @Column(name = "lot", nullable = true, length = 255) private String lot = "";
  @Column(name = "pedimen", nullable = true, length = 255) private String pedimen = "";
  @Column(name = "fcadu", nullable = true) private Date fcadu = new Date();
  @Column(name = "impo", nullable = false) private BigDecimal impo;
  @Column(name = "impue", nullable = false, columnDefinition = "int default 0") private int impue;
  @Column(name = "tall", nullable = true, length = 30) private String tall = "";
  @Column(name = "colo", nullable = true, length = 30) private String colo = "";
  @Column(name = "cantentre", nullable = true) private BigDecimal cantentre = BigDecimal.ZERO;
  @Column(name = "entrenow", nullable = true) private BigDecimal entrenow = BigDecimal.ZERO;
  @Column(name = "fentre", nullable = true) private Date fentre = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "activo", nullable = true) private String activo = "";
  @Column(name = "cuentacontable", nullable = true) private String cuentacontable;
  @Column(name = "lotePedimento", nullable = true, columnDefinition = "int default 0") private int lotePedimento = 0;        
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  

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

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getTipcam() {
        return tipcam;
    }

    public void setTipcam(BigDecimal tipcam) {
        this.tipcam = tipcam;
    }

    public BigDecimal getDevs() {
        return devs;
    }

    public void setDevs(BigDecimal devs) {
        this.devs = devs;
    }

    public String getGaran() {
        return garan;
    }

    public void setGaran(String garan) {
        this.garan = garan;
    }

    public boolean isEskit() {
        return eskit;
    }

    public void setEskit(boolean eskit) {
        this.eskit = eskit;
    }

    public int getKitmae() {
        return kitmae;
    }

    public void setKitmae(int kitmae) {
        this.kitmae = kitmae;
    }

    public int getIdkit() {
        return idkit;
    }

    public void setIdkit(int idkit) {
        this.idkit = idkit;
    }

    public int getIdlotped() {
        return idlotped;
    }

    public void setIdlotped(int idlotped) {
        this.idlotped = idlotped;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public BigDecimal getPre() {
        return pre;
    }

    public void setPre(BigDecimal pre) {
        this.pre = pre;
    }

    public BigDecimal getDescu() {
        return descu;
    }

    public void setDescu(BigDecimal descu) {
        this.descu = descu;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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

    public Date getFcadu() {
        return fcadu;
    }

    public void setFcadu(Date fcadu) {
        this.fcadu = fcadu;
    }

    public BigDecimal getImpo() {
        return impo;
    }

    public void setImpo(BigDecimal impo) {
        this.impo = impo;
    }

    public int getImpue() {
        return impue;
    }

    public void setImpue(int impue) {
        this.impue = impue;
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

    public BigDecimal getCantentre() {
        return cantentre;
    }

    public void setCantentre(BigDecimal cantentre) {
        this.cantentre = cantentre;
    }

    public BigDecimal getEntrenow() {
        return entrenow;
    }

    public void setEntrenow(BigDecimal entrenow) {
        this.entrenow = entrenow;
    }

    public Date getFentre() {
        return fentre;
    }

    public void setFentre(Date fentre) {
        this.fentre = fentre;
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

    public BigDecimal getToDevs() {
        return toDevs;
    }

    public void setToDevs(BigDecimal toDevs) {
        this.toDevs = toDevs;
    }
}

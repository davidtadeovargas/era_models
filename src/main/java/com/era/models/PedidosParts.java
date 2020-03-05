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

@Entity@Table(name = "pedidos_parts")public class PedidosParts {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="pedidoID") @Column(name = "pedidoID", nullable = false) private int pedidoID;
  @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "cost", nullable = true) private BigDecimal cost = BigDecimal.ZERO;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "cant", nullable = false) private int cant;
  @Column(name = "recibidas", nullable = false) private int recibidas;
  @Column(name = "descrip", nullable = false,length = 500) private String descrip;
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
  @Column(name = "pre", nullable = false) private BigDecimal pre;
  @Column(name = "pre2", nullable = false) private BigDecimal pre_2;
  @Column(name = "desc1", nullable = false) private BigDecimal desc_1;
  @Column(name = "desc2", nullable = false) private BigDecimal desc_2;
  @Column(name = "desc3", nullable = false) private BigDecimal desc_3;
  @Column(name = "desc4", nullable = false) private BigDecimal desc_4;
  @Column(name = "desc5", nullable = false) private BigDecimal desc_5;
  @Column(name = "impo", nullable = false) private BigDecimal impo;
  @Column(name = "impo2", nullable = false) private BigDecimal impo_2;
  @Column(name = "impueval", nullable = false) private BigDecimal impueval;
  @Column(name = "impueimpo", nullable = false) private BigDecimal impueimpo;
  @Column(name = "impueimpo2", nullable = false) private BigDecimal impueimpo_2;
  @Column(name = "impodesc", nullable = true) private BigDecimal impodesc = BigDecimal.ZERO;
  @Column(name = "alma", nullable = false,length = 30) private String alma; 
  @Column(name = "descripcionOpcional", nullable = true, length = 255) private String descripcionOpcional = "";
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

    public int getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public BigDecimal getTipcam() {
        return tipcam;
    }

    public void setTipcam(BigDecimal tipcam) {
        this.tipcam = tipcam;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
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

    public int getRecibidas() {
        return recibidas;
    }

    public void setRecibidas(int recibidas) {
        this.recibidas = recibidas;
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

    public BigDecimal getPre() {
        return pre;
    }

    public void setPre(BigDecimal pre) {
        this.pre = pre;
    }

    public BigDecimal getPre_2() {
        return pre_2;
    }

    public void setPre_2(BigDecimal pre_2) {
        this.pre_2 = pre_2;
    }

    public BigDecimal getDesc_1() {
        return desc_1;
    }

    public void setDesc_1(BigDecimal desc_1) {
        this.desc_1 = desc_1;
    }

    public BigDecimal getDesc_2() {
        return desc_2;
    }

    public void setDesc_2(BigDecimal desc_2) {
        this.desc_2 = desc_2;
    }

    public BigDecimal getDesc_3() {
        return desc_3;
    }

    public void setDesc_3(BigDecimal desc_3) {
        this.desc_3 = desc_3;
    }

    public BigDecimal getDesc_4() {
        return desc_4;
    }

    public void setDesc_4(BigDecimal desc_4) {
        this.desc_4 = desc_4;
    }

    public BigDecimal getDesc_5() {
        return desc_5;
    }

    public void setDesc_5(BigDecimal desc_5) {
        this.desc_5 = desc_5;
    }

    public BigDecimal getImpo() {
        return impo;
    }

    public void setImpo(BigDecimal impo) {
        this.impo = impo;
    }

    public BigDecimal getImpo_2() {
        return impo_2;
    }

    public void setImpo_2(BigDecimal impo_2) {
        this.impo_2 = impo_2;
    }

    public BigDecimal getImpueval() {
        return impueval;
    }

    public void setImpueval(BigDecimal impueval) {
        this.impueval = impueval;
    }

    public BigDecimal getImpueimpo() {
        return impueimpo;
    }

    public void setImpueimpo(BigDecimal impueimpo) {
        this.impueimpo = impueimpo;
    }

    public BigDecimal getImpueimpo_2() {
        return impueimpo_2;
    }

    public void setImpueimpo_2(BigDecimal impueimpo_2) {
        this.impueimpo_2 = impueimpo_2;
    }

    public BigDecimal getImpodesc() {
        return impodesc;
    }

    public void setImpodesc(BigDecimal impodesc) {
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

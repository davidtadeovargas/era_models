/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Index;
//@Index(name="")

@Entity @Table(name = "emps",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Company {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="companyCode") @Column(name = "cod", nullable = false,length = 30) private String companyCode;
  @Column(name = "name_db", nullable = true,length = 255) private String nameDB;
  @Index(name="emps_ser") @Column(name = "ser", nullable = true,length = 30) private String ser;
  @Column(name = "lada", nullable = true, length = 10) private String lada = "";
  @Column(name = "vend", nullable = true, length = 30) private String vend = "";
  @Column(name = "codclas", nullable = true,length = 30) private String codclas = "";
  @Column(name = "banc", nullable = true, length = 30) private String banc = "";
  @Column(name = "clavbanc", nullable = true, length = 255) private String clavbanc = "";
  @Column(name = "zon", nullable = true, length = 30) private String zon = "";
  @Column(name = "giro", nullable = true, length = 30) private String giro = "";
  @Index(name="emps_nom") @Column(name = "nom", nullable = false,length = 255) private String nom;
  @Column(name = "clasjera", nullable = true, length = 2048) private String clasjera = "";
  @Column(name = "tel", nullable = true, length = 255) private String tel = "";
  @Column(name = "ctapred", nullable = true, length = 100) private String ctapred = "";
  @Column(name = "cel", nullable = true, length = 255) private String cel = "";
  @Column(name = "exten", nullable = true, length = 20) private String exten = "";
  @Column(name = "telper1", nullable = true) private String telper1 = "";
  @Column(name = "telper2", nullable = true) private String telper2 = "";
  @Column(name = "calle", nullable = true, length = 255) private String calle = "";
  @Column(name = "col", nullable = true, length = 255) private String col = "";
  @Column(name = "curp", nullable = true, length = 50) private String curp = "";
  @JsonProperty("CP")@Column(name = "CP", nullable = true, length = 20) private String CP = "";
  @Column(name = "ciu", nullable = true, length = 255) private String ciu = "";
  @Column(name = "estad", nullable = true, length = 255) private String estad = "";
  @Column(name = "pai", nullable = true, length = 255) private String pai = "";
  @Column(name = "revis", nullable = true, length = 100) private String revis = "";
  @Column(name = "pags", nullable = true, length = 100) private String pags = "";
  @JsonProperty("RFC")@Column(name = "RFC", nullable = true, length = 21) private String RFC = "";
  @Column(name = "descu", nullable = true) private float descu = 0;
  @Column(name = "deposit", nullable = true) private float deposit = 0;
  @Column(name = "co1", nullable = true) private String co1 = "";
  @Column(name = "co2", nullable = true) private String co2 = "";
  @Column(name = "otramon", nullable = true) private boolean otramon = true;
  @Column(name = "otramonc", nullable = true) private boolean otramonc = true;
  @Column(name = "co3", nullable = true) private String co3 = "";
  @Column(name = "pagweb1", nullable = true) private String pagweb1 = "";
  @Column(name = "pagweb2", nullable = true) private String pagweb2 = "";
  @Column(name = "contac", nullable = true, length = 255) private String contac = "";
  @Column(name = "puest", nullable = true, length = 255) private String puest = "";
  @Column(name = "contact2", nullable = true) private String contact2 = "";
  @Column(name = "puest2", nullable = true) private String puest2 = "";
  @Column(name = "observ", nullable = true, length = 255) private String observ = "";
  @Column(name = "noint", nullable = true, length = 100) private String noint = "";
  @Column(name = "noext", nullable = true, length = 100) private String noext = "";
  @Column(name = "diacred", nullable = true, length = 21) private String diacred = "";
  @Column(name = "metpag", nullable = true, length = 45) private String metpag = "";
  @Column(name = "cta", nullable = true) private String cta = "0000";
  @Column(name = "encall", nullable = true, length = 255) private String encall = "";
  @Column(name = "enciu", nullable = true, length = 255) private String enciu = "";
  @Column(name = "ennoext", nullable = true, length = 21) private String ennoext = "";
  @Column(name = "ennoexten", nullable = true, length = 21) private String ennoexten = "";
  @Column(name = "enlada", nullable = true, length = 10) private String enlada = "";
  @Column(name = "ennoint", nullable = true, length = 21) private String ennoint = "";
  @Column(name = "encol", nullable = true, length = 255) private String encol = "";
  @Column(name = "encp", nullable = true, length = 20) private String encp = "";
  @Column(name = "encel", nullable = true, length = 255) private String encel = "";
  @Column(name = "entel1", nullable = true) private String entel1 = "";
  @Column(name = "entel2", nullable = true) private String entel2 = "";
  @Column(name = "entel3", nullable = true) private String entel3 = "";
  @Column(name = "enemail", nullable = true, length = 100) private String enemail = "";
  @Column(name = "enco1", nullable = true) private String enco1 = "";
  @Column(name = "enco2", nullable = true) private String enco2 = "";
  @Column(name = "enco3", nullable = true) private String enco3 = "";
  @Column(name = "enpagweb", nullable = true, length = 255) private String enpagweb = "";
  @Column(name = "enpai", nullable = true, length = 255) private String enpai = "";
  @Column(name = "enestad", nullable = true, length = 255) private String enestad = "";
  @Column(name = "diapag", nullable = true) private int diapag = 0;
  @Column(name = "pers", nullable = true, length = 2) private String pers = "";
  @Column(name = "limtcred", nullable = true) private float limtcred = 0;
  @Column(name = "bloq", nullable = true) private boolean bloq = false;
  @Column(name = "bloqlimcred", nullable = true) private boolean bloqlimcred = false;
  @Column(name = "ctaconta", nullable = true, length = 30) private String ctaconta = "";
  @Column(name = "list", nullable = true) private int list;
  @Column(name = "contac3", nullable = true) private String contac3 = "";
  @Column(name = "telcon3", nullable = true) private String telcon3 = "";
  @Column(name = "telper3", nullable = true) private String telper3 = "";
  @Column(name = "telper33", nullable = true) private String telper33 = "";
  @Column(name = "contac4", nullable = true) private String contac4 = "";
  @Column(name = "telcon4", nullable = true) private String telcon4 = "";
  @Column(name = "telper4", nullable = true) private String telper4 = "";
  @Column(name = "telper44", nullable = true) private String telper44 = "";
  @Column(name = "contac5", nullable = true) private String contac5 = "";
  @Column(name = "telcon5", nullable = true) private String telcon5 = "";
  @Column(name = "telper5", nullable = true) private String telper5 = "";
  @Column(name = "telper55", nullable = true) private String telper55 = "";
  @Column(name = "contac6", nullable = true) private String contac6 = "";
  @Column(name = "telcon6", nullable = true) private String telcon6 = "";
  @Column(name = "telper6", nullable = true) private String telper6 = "";
  @Column(name = "telper66", nullable = true) private String telper66 = "";
  @Column(name = "contac7", nullable = true) private String contac7 = "";
  @Column(name = "telcon7", nullable = true) private String telcon7 = "";
  @Column(name = "telper7", nullable = true) private String telper7 = "";
  @Column(name = "telper77", nullable = true) private String telper77 = "";
  @Column(name = "contac8", nullable = true) private String contac8 = "";
  @Column(name = "telcon8", nullable = true) private String telcon8 = "";
  @Column(name = "telper8", nullable = true) private String telper8 = "";
  @Column(name = "telper88", nullable = true) private String telper88 = "";
  @Column(name = "contac9", nullable = true) private String contac9 = "";
  @Column(name = "telcon9", nullable = true) private String telcon9 = "";
  @Column(name = "telper9", nullable = true) private String telper9 = "";
  @Column(name = "telper99", nullable = true) private String telper99 = "";
  @Column(name = "Contac10", nullable = true) private String Contac10 = "";
  @Column(name = "telcon10", nullable = true) private String telcon10 = "";
  @Column(name = "telper10", nullable = true) private String telper10 = "";
  @Column(name = "telper100", nullable = true) private String telper100 = "";  
  @Column(name = "beneficiario", nullable = true,length = 30) private String beneficiario = "";
  @Column(name = "usocfdi", nullable = true,length = 10) private String usocfdi;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "metodo_costeo", nullable = true, length = 10)private String metcost;
  @Column(name = "cumple", nullable = true, length = 30) private String cumple = "";
  @Column(name = "agradfec", nullable = true) private Date agradfec = new Date();
  @Column(name = "anio", nullable = true, length = 10) private String anio = "";
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "falt", nullable = true) private Date falt;
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "fmod", nullable = false, updatable=false) private Date fmod;
  @Column(name = "tipo_contribuyente", nullable = true, length = 1) private String contribuyentType = "M";
  @Column(name = "lugar_de_expedicion", nullable = true, length = 255) private String expeditionPlace = "";
  @Column(name = "ruta_certificado", nullable = true, length = 2045) private String certificatePath = "";
  @Column(name = "ruta_key", nullable = true, length = 2045) private String keyPath = "";
  @Column(name = "password_certificado", nullable = true, length = 1000) private String certificatePassword = "";
  @Column(name = "ruta_aplicacion", nullable = false, length = 500) private String appPath = "";
  @Column(name = "plantilla", nullable = true, length = 100) private String template = "";
  @Column(name = "regimen_fiscal", nullable = true, length = 255) private String fiscalRegimen = "";
  @Column(name = "test", nullable = true, length = 5) private boolean test = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getNameDB() {
        return nameDB;
    }

    public void setNameDB(String nameDB) {
        this.nameDB = nameDB;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getLada() {
        return lada;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public String getVend() {
        return vend;
    }

    public void setVend(String vend) {
        this.vend = vend;
    }

    public String getCodclas() {
        return codclas;
    }

    public void setCodclas(String codclas) {
        this.codclas = codclas;
    }

    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public String getClavbanc() {
        return clavbanc;
    }

    public void setClavbanc(String clavbanc) {
        this.clavbanc = clavbanc;
    }

    public String getZon() {
        return zon;
    }

    public void setZon(String zon) {
        this.zon = zon;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasjera() {
        return clasjera;
    }

    public void setClasjera(String clasjera) {
        this.clasjera = clasjera;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCtapred() {
        return ctapred;
    }

    public void setCtapred(String ctapred) {
        this.ctapred = ctapred;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getTelper1() {
        return telper1;
    }

    public void setTelper1(String telper1) {
        this.telper1 = telper1;
    }

    public String getTelper2() {
        return telper2;
    }

    public void setTelper2(String telper2) {
        this.telper2 = telper2;
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

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiu() {
        return ciu;
    }

    public void setCiu(String ciu) {
        this.ciu = ciu;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getRevis() {
        return revis;
    }

    public void setRevis(String revis) {
        this.revis = revis;
    }

    public String getPags() {
        return pags;
    }

    public void setPags(String pags) {
        this.pags = pags;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public float getDescu() {
        return descu;
    }

    public void setDescu(float descu) {
        this.descu = descu;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public String getCo1() {
        return co1;
    }

    public void setCo1(String co1) {
        this.co1 = co1;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public boolean isOtramon() {
        return otramon;
    }

    public void setOtramon(boolean otramon) {
        this.otramon = otramon;
    }

    public boolean isOtramonc() {
        return otramonc;
    }

    public void setOtramonc(boolean otramonc) {
        this.otramonc = otramonc;
    }

    public String getCo3() {
        return co3;
    }

    public void setCo3(String co3) {
        this.co3 = co3;
    }

    public String getPagweb1() {
        return pagweb1;
    }

    public void setPagweb1(String pagweb1) {
        this.pagweb1 = pagweb1;
    }

    public String getPagweb2() {
        return pagweb2;
    }

    public void setPagweb2(String pagweb2) {
        this.pagweb2 = pagweb2;
    }

    public String getContac() {
        return contac;
    }

    public void setContac(String contac) {
        this.contac = contac;
    }

    public String getPuest() {
        return puest;
    }

    public void setPuest(String puest) {
        this.puest = puest;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getPuest2() {
        return puest2;
    }

    public void setPuest2(String puest2) {
        this.puest2 = puest2;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getNoint() {
        return noint;
    }

    public void setNoint(String noint) {
        this.noint = noint;
    }

    public String getNoext() {
        return noext;
    }

    public void setNoext(String noext) {
        this.noext = noext;
    }

    public String getDiacred() {
        return diacred;
    }

    public void setDiacred(String diacred) {
        this.diacred = diacred;
    }

    public String getMetpag() {
        return metpag;
    }

    public void setMetpag(String metpag) {
        this.metpag = metpag;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public String getEncall() {
        return encall;
    }

    public void setEncall(String encall) {
        this.encall = encall;
    }

    public String getEnciu() {
        return enciu;
    }

    public void setEnciu(String enciu) {
        this.enciu = enciu;
    }

    public String getEnnoext() {
        return ennoext;
    }

    public void setEnnoext(String ennoext) {
        this.ennoext = ennoext;
    }

    public String getEnnoexten() {
        return ennoexten;
    }

    public void setEnnoexten(String ennoexten) {
        this.ennoexten = ennoexten;
    }

    public String getEnlada() {
        return enlada;
    }

    public void setEnlada(String enlada) {
        this.enlada = enlada;
    }

    public String getEnnoint() {
        return ennoint;
    }

    public void setEnnoint(String ennoint) {
        this.ennoint = ennoint;
    }

    public String getEncol() {
        return encol;
    }

    public void setEncol(String encol) {
        this.encol = encol;
    }

    public String getEncp() {
        return encp;
    }

    public void setEncp(String encp) {
        this.encp = encp;
    }

    public String getEncel() {
        return encel;
    }

    public void setEncel(String encel) {
        this.encel = encel;
    }

    public String getEntel1() {
        return entel1;
    }

    public void setEntel1(String entel1) {
        this.entel1 = entel1;
    }

    public String getEntel2() {
        return entel2;
    }

    public void setEntel2(String entel2) {
        this.entel2 = entel2;
    }

    public String getEntel3() {
        return entel3;
    }

    public void setEntel3(String entel3) {
        this.entel3 = entel3;
    }

    public String getEnemail() {
        return enemail;
    }

    public void setEnemail(String enemail) {
        this.enemail = enemail;
    }

    public String getEnco1() {
        return enco1;
    }

    public void setEnco1(String enco1) {
        this.enco1 = enco1;
    }

    public String getEnco2() {
        return enco2;
    }

    public void setEnco2(String enco2) {
        this.enco2 = enco2;
    }

    public String getEnco3() {
        return enco3;
    }

    public void setEnco3(String enco3) {
        this.enco3 = enco3;
    }

    public String getEnpagweb() {
        return enpagweb;
    }

    public void setEnpagweb(String enpagweb) {
        this.enpagweb = enpagweb;
    }

    public String getEnpai() {
        return enpai;
    }

    public void setEnpai(String enpai) {
        this.enpai = enpai;
    }

    public String getEnestad() {
        return enestad;
    }

    public void setEnestad(String enestad) {
        this.enestad = enestad;
    }

    public int getDiapag() {
        return diapag;
    }

    public void setDiapag(int diapag) {
        this.diapag = diapag;
    }

    public String getPers() {
        return pers;
    }

    public void setPers(String pers) {
        this.pers = pers;
    }

    public float getLimtcred() {
        return limtcred;
    }

    public void setLimtcred(float limtcred) {
        this.limtcred = limtcred;
    }

    public boolean isBloq() {
        return bloq;
    }

    public void setBloq(boolean bloq) {
        this.bloq = bloq;
    }

    public boolean isBloqlimcred() {
        return bloqlimcred;
    }

    public void setBloqlimcred(boolean bloqlimcred) {
        this.bloqlimcred = bloqlimcred;
    }

    public String getCtaconta() {
        return ctaconta;
    }

    public void setCtaconta(String ctaconta) {
        this.ctaconta = ctaconta;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    public String getContac3() {
        return contac3;
    }

    public void setContac3(String contac3) {
        this.contac3 = contac3;
    }

    public String getTelcon3() {
        return telcon3;
    }

    public void setTelcon3(String telcon3) {
        this.telcon3 = telcon3;
    }

    public String getTelper3() {
        return telper3;
    }

    public void setTelper3(String telper3) {
        this.telper3 = telper3;
    }

    public String getTelper33() {
        return telper33;
    }

    public void setTelper33(String telper33) {
        this.telper33 = telper33;
    }

    public String getContac4() {
        return contac4;
    }

    public void setContac4(String contac4) {
        this.contac4 = contac4;
    }

    public String getTelcon4() {
        return telcon4;
    }

    public void setTelcon4(String telcon4) {
        this.telcon4 = telcon4;
    }

    public String getTelper4() {
        return telper4;
    }

    public void setTelper4(String telper4) {
        this.telper4 = telper4;
    }

    public String getTelper44() {
        return telper44;
    }

    public void setTelper44(String telper44) {
        this.telper44 = telper44;
    }

    public String getContac5() {
        return contac5;
    }

    public void setContac5(String contac5) {
        this.contac5 = contac5;
    }

    public String getTelcon5() {
        return telcon5;
    }

    public void setTelcon5(String telcon5) {
        this.telcon5 = telcon5;
    }

    public String getTelper5() {
        return telper5;
    }

    public void setTelper5(String telper5) {
        this.telper5 = telper5;
    }

    public String getTelper55() {
        return telper55;
    }

    public void setTelper55(String telper55) {
        this.telper55 = telper55;
    }

    public String getContac6() {
        return contac6;
    }

    public void setContac6(String contac6) {
        this.contac6 = contac6;
    }

    public String getTelcon6() {
        return telcon6;
    }

    public void setTelcon6(String telcon6) {
        this.telcon6 = telcon6;
    }

    public String getTelper6() {
        return telper6;
    }

    public void setTelper6(String telper6) {
        this.telper6 = telper6;
    }

    public String getTelper66() {
        return telper66;
    }

    public void setTelper66(String telper66) {
        this.telper66 = telper66;
    }

    public String getContac7() {
        return contac7;
    }

    public void setContac7(String contac7) {
        this.contac7 = contac7;
    }

    public String getTelcon7() {
        return telcon7;
    }

    public void setTelcon7(String telcon7) {
        this.telcon7 = telcon7;
    }

    public String getTelper7() {
        return telper7;
    }

    public void setTelper7(String telper7) {
        this.telper7 = telper7;
    }

    public String getTelper77() {
        return telper77;
    }

    public void setTelper77(String telper77) {
        this.telper77 = telper77;
    }

    public String getContac8() {
        return contac8;
    }

    public void setContac8(String contac8) {
        this.contac8 = contac8;
    }

    public String getTelcon8() {
        return telcon8;
    }

    public void setTelcon8(String telcon8) {
        this.telcon8 = telcon8;
    }

    public String getTelper8() {
        return telper8;
    }

    public void setTelper8(String telper8) {
        this.telper8 = telper8;
    }

    public String getTelper88() {
        return telper88;
    }

    public void setTelper88(String telper88) {
        this.telper88 = telper88;
    }

    public String getContac9() {
        return contac9;
    }

    public void setContac9(String contac9) {
        this.contac9 = contac9;
    }

    public String getTelcon9() {
        return telcon9;
    }

    public void setTelcon9(String telcon9) {
        this.telcon9 = telcon9;
    }

    public String getTelper9() {
        return telper9;
    }

    public void setTelper9(String telper9) {
        this.telper9 = telper9;
    }

    public String getTelper99() {
        return telper99;
    }

    public void setTelper99(String telper99) {
        this.telper99 = telper99;
    }

    public String getContac10() {
        return Contac10;
    }

    public void setContac10(String Contac10) {
        this.Contac10 = Contac10;
    }

    public String getTelcon10() {
        return telcon10;
    }

    public void setTelcon10(String telcon10) {
        this.telcon10 = telcon10;
    }

    public String getTelper10() {
        return telper10;
    }

    public void setTelper10(String telper10) {
        this.telper10 = telper10;
    }

    public String getTelper100() {
        return telper100;
    }

    public void setTelper100(String telper100) {
        this.telper100 = telper100;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getUsocfdi() {
        return usocfdi;
    }

    public void setUsocfdi(String usocfdi) {
        this.usocfdi = usocfdi;
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

    public String getMetcost() {
        return metcost;
    }

    public void setMetcost(String metcost) {
        this.metcost = metcost;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public Date getAgradfec() {
        return agradfec;
    }

    public void setAgradfec(Date agradfec) {
        this.agradfec = agradfec;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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

    public String getContribuyentType() {
        return contribuyentType;
    }

    public void setContribuyentType(String contribuyentType) {
        this.contribuyentType = contribuyentType;
    }

    public String getExpeditionPlace() {
        return expeditionPlace;
    }

    public void setExpeditionPlace(String expeditionPlace) {
        this.expeditionPlace = expeditionPlace;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public String getCertificatePassword() {
        return certificatePassword;
    }

    public void setCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFiscalRegimen() {
        return fiscalRegimen;
    }

    public void setFiscalRegimen(String fiscalRegimen) {
        this.fiscalRegimen = fiscalRegimen;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

                      
   
}
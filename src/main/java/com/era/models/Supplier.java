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


@Entity
@Table(name = "provs", uniqueConstraints = {})
public class Supplier {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "code", nullable = false, length = 30)
    private String code = "";
    
    @Column(name = "ser", nullable = false, length = 30)
    private String serie;
    
    @Column(name = "zon", nullable = true, length = 30)
    private String zone = "";
    
    @Column(name = "limtcred", nullable = true, columnDefinition = "float default 0") private float limtcred = 0;
    
    @Column(name = "giro", nullable = true, length = 30)
    private String giro = "";
    
    @Column(name = "banc", nullable = true, length = 30)
    private String bank = "";
    
    @Column(name = "clavbanc", nullable = true, length = 255)
    private String claveBank = "";
        
    @Column(name = "lada", nullable = true, length = 10)
    private String lada = "";
    
    @Column(name = "metpag", nullable = true, length = 45)
    private String paymentMethod = "";
    
    @Column(name = "cta", nullable = true, length = 45)
    private String account = "0000";
    
    @Column(name = "enlada", nullable = true, length = 10)
    private String deliverLada = "";
    
    @Column(name = "nom", nullable = false, length = 255)
    private String name;
    
    @Column(name = "tel", nullable = true, length = 255)
    private String phone = "";
    
    @Column(name = "cel", nullable = true, length = 255)
    private String celphone = "";
    
    @Column(name = "encel", nullable = true, length = 255)
    private String deliverCellphone = "";
    
    @Column(name = "clasjera", nullable = true, length = 2048)
    private String jerarchyClasification = "";        
    
    @Column(name = "exten", nullable = true, length = 20)
    private String extension = "";
    
    @Column(name = "calle", nullable = true, length = 255)
    private String street = "";
    
    @Column(name = "encalle", nullable = true, length = 255)
    private String deliverStreet = "";
    
    @Column(name = "col", nullable = true, length = 255)
    private String colony = "";
    
    @Column(name = "encol", nullable = true, length = 255)
    private String deliverColony = "";
    
    @Column(name = "CP", nullable = true, length = 20)
    private String cp;
    
    @Column(name = "encp", nullable = true, length = 20)
    private String deliverCP = "";       
    
    @Column(name = "ennoint", nullable = true, length = 21)
    private String deliverInternalNumber = "";                
    
    @Column(name = "noint", nullable = true, length = 100)
    private String interiorNumber = "";
    
    @Column(name = "noext", nullable = true, length = 100)
    private String externalNumber = "";
    
    @Column(name = "ennoext", nullable = true, length = 21)
    private String deliveryExternalNumber = "";
    
    @Column(name = "ciu", nullable = true, length = 255)
    private String city = "";
    
    @Column(name = "enciu", nullable = true, length = 255)
    private String deliverCity = "";        
    
    @Column(name = "estad", nullable = true, length = 255)
    private String estate = "";
    
    @Column(name = "enestad", nullable = true, length = 255)
    private String deliverEstate = "";
    
    @Column(name = "otramon", nullable = true, columnDefinition = "boolean default false")
    private boolean anotherCoin = true;
    
    @Column(name = "otramonc", nullable = true, columnDefinition = "boolean default false")
    private boolean anotherCoinC = true;
    
    @Column(name = "bloq", nullable = true, columnDefinition = "boolean default false")
    private boolean bloq = false;
    
    @Column(name = "ctaconta", nullable = true, length = 30)
    private String contableAccount = "";
    
    @Column(name = "revis", nullable = true, length = 100)
    private String revision = "";
    
    @Column(name = "pags", nullable = true, length = 100)
    private String payments = "";
    
    @Column(name = "pais", nullable = true, length = 255)
    private String country;
    
    @Column(name = "enpais", nullable = true, length = 255)
    private String deliverCountry = "";
    
    @Column(name = "RFC", nullable = true, length = 21)
    private String rfc = "";
    
    @Column(name = "descu", nullable = true, columnDefinition = "float default 0")
    private float disccount = 0;
    
    @Column(name = "diacred", nullable = true, length = 21)
    private String creditDays = "";                    
    
    @Column(name = "bloqlimcred", nullable = true, columnDefinition = "boolean default false")
    private boolean bloqlimcred = false;        
    
    @Column(name = "co1", nullable = true, length = 100)
    private String email1 = "";
    
    @Column(name = "co2", nullable = true, length = 100)
    private String email2 = "";        
    
    @Column(name = "co3", nullable = true, length = 100)
    private String email3 = "";
    
    @Column(name = "enco1", nullable = true, length = 100)
    private String deliverEmail1 = "";
    
    @Column(name = "enco2", nullable = true, length = 100)
    private String deliverEmail2 = "";
    
    @Column(name = "enco3", nullable = true, length = 100)
    private String deliverEmail3 = "";
    
    @Column(name = "pagweb1", nullable = true, length = 255)
    private String webpage1 = "";
    
    @Column(name = "pagweb2", nullable = true, length = 255)
    private String webpage2 = "";
    
    @Column(name = "telper1", nullable = true, length = 255)
    private String personalPhone1 = "";
        
    @Column(name = "observ", nullable = true, length = 255)
    private String observations = "";
    
    @Column(name = "pers", nullable = true, length = 2)
    private String pers = "";        
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "falt", nullable = true, length = 10)
    private Date falt;
    
    @Column(name = "fmod", nullable = false, length = 10)
    private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getClaveBank() {
        return claveBank;
    }

    public void setClaveBank(String claveBank) {
        this.claveBank = claveBank;
    }

    public String getLada() {
        return lada;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDeliverLada() {
        return deliverLada;
    }

    public void setDeliverLada(String deliverLada) {
        this.deliverLada = deliverLada;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getDeliverCellphone() {
        return deliverCellphone;
    }

    public void setDeliverCellphone(String deliverCellphone) {
        this.deliverCellphone = deliverCellphone;
    }

    public String getJerarchyClasification() {
        return jerarchyClasification;
    }

    public void setJerarchyClasification(String jerarchyClasification) {
        this.jerarchyClasification = jerarchyClasification;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDeliverStreet() {
        return deliverStreet;
    }

    public void setDeliverStreet(String deliverStreet) {
        this.deliverStreet = deliverStreet;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getDeliverColony() {
        return deliverColony;
    }

    public void setDeliverColony(String deliverColony) {
        this.deliverColony = deliverColony;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getDeliverCP() {
        return deliverCP;
    }

    public void setDeliverCP(String deliverCP) {
        this.deliverCP = deliverCP;
    }

    public String getDeliverInternalNumber() {
        return deliverInternalNumber;
    }

    public void setDeliverInternalNumber(String deliverInternalNumber) {
        this.deliverInternalNumber = deliverInternalNumber;
    }

    public String getInteriorNumber() {
        return interiorNumber;
    }

    public void setInteriorNumber(String interiorNumber) {
        this.interiorNumber = interiorNumber;
    }

    public String getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(String externalNumber) {
        this.externalNumber = externalNumber;
    }

    public String getDeliveryExternalNumber() {
        return deliveryExternalNumber;
    }

    public void setDeliveryExternalNumber(String deliveryExternalNumber) {
        this.deliveryExternalNumber = deliveryExternalNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeliverCity() {
        return deliverCity;
    }

    public void setDeliverCity(String deliverCity) {
        this.deliverCity = deliverCity;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getDeliverEstate() {
        return deliverEstate;
    }

    public void setDeliverEstate(String deliverEstate) {
        this.deliverEstate = deliverEstate;
    }

    public boolean isAnotherCoin() {
        return anotherCoin;
    }

    public void setAnotherCoin(boolean anotherCoin) {
        this.anotherCoin = anotherCoin;
    }

    public boolean isAnotherCoinC() {
        return anotherCoinC;
    }

    public void setAnotherCoinC(boolean anotherCoinC) {
        this.anotherCoinC = anotherCoinC;
    }

    public boolean isBloq() {
        return bloq;
    }

    public void setBloq(boolean bloq) {
        this.bloq = bloq;
    }

    public String getContableAccount() {
        return contableAccount;
    }

    public void setContableAccount(String contableAccount) {
        this.contableAccount = contableAccount;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeliverCountry() {
        return deliverCountry;
    }

    public void setDeliverCountry(String deliverCountry) {
        this.deliverCountry = deliverCountry;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public float getDisccount() {
        return disccount;
    }

    public void setDisccount(float disccount) {
        this.disccount = disccount;
    }

    public String getCreditDays() {
        return creditDays;
    }

    public void setCreditDays(String creditDays) {
        this.creditDays = creditDays;
    }

    public boolean isBloqlimcred() {
        return bloqlimcred;
    }

    public void setBloqlimcred(boolean bloqlimcred) {
        this.bloqlimcred = bloqlimcred;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getDeliverEmail1() {
        return deliverEmail1;
    }

    public void setDeliverEmail1(String deliverEmail1) {
        this.deliverEmail1 = deliverEmail1;
    }

    public String getDeliverEmail2() {
        return deliverEmail2;
    }

    public void setDeliverEmail2(String deliverEmail2) {
        this.deliverEmail2 = deliverEmail2;
    }

    public String getDeliverEmail3() {
        return deliverEmail3;
    }

    public void setDeliverEmail3(String deliverEmail3) {
        this.deliverEmail3 = deliverEmail3;
    }

    public String getWebpage1() {
        return webpage1;
    }

    public void setWebpage1(String webpage1) {
        this.webpage1 = webpage1;
    }

    public String getWebpage2() {
        return webpage2;
    }

    public void setWebpage2(String webpage2) {
        this.webpage2 = webpage2;
    }

    public String getPersonalPhone1() {
        return personalPhone1;
    }

    public void setPersonalPhone1(String personalPhone1) {
        this.personalPhone1 = personalPhone1;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getPers() {
        return pers;
    }

    public void setPers(String pers) {
        this.pers = pers;
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

    public float getLimtcred() {
        return limtcred;
    }

    public void setLimtcred(float limtcred) {
        this.limtcred = limtcred;
    }
}

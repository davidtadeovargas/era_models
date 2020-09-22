/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "estacs", uniqueConstraints = {})
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "code", nullable = false, length = 30)
    private String code;
    
    @Column(name = "user_of_sales_of_point", nullable = false, columnDefinition = "boolean default false")
    private boolean userOfsalesOfPoint = false;
    
    @Column(name = "descu", nullable = false, columnDefinition = "float default 0")
    private float disccount = 0;
    
    @Column(name = "cort", nullable = false, columnDefinition = "boolean default false")
    private boolean cort;
    
    @Column(name = "pass", nullable = false, length = 255)
    private String password;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac = "";
    
    @Column(name = "52m", nullable = false, columnDefinition = "boolean default false")
    private boolean m52 = false;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu = "";
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "falt", nullable = false) private Date falt;
    @Column(name = "fmod", nullable = false) private Date fmod;
    
    @Column(name = "street", nullable = true, length = 50)
    private String street;
    
    @Column(name = "commission", nullable = true, columnDefinition = "float default 0")
    private float commission = 0;
    
    @Column(name = "colony", nullable = true, length = 50)
    private String colony;
    
    @Column(name = "cp", nullable = true, columnDefinition = "int default 0")
    private int cp;
    
    @Column(name = "phone", nullable = true, length = 15)
    private String phone;
    
    @Column(name = "cellphone", nullable = true, length = 15)
    private String cellphone;
    
    @Column(name = "state", nullable = true, length = 50)
    private String state;
    
    @Column(name = "country", nullable = true, length = 50)
    private String country;
    
    @Column(name = "noext", nullable = true, length = 20)
    private String noext;
    
    @Column(name = "noint", nullable = true, length = 20)
    private String noint;
    
    @Column(name = "city", nullable = true, length = 50)
    private String city;
    
    @Column(name = "ptovta", nullable = true, columnDefinition = "boolean default false")
    private boolean ptovta = false;
    
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    
    @Column(name = "supervisor", nullable = true, columnDefinition = "boolean default false")
    private boolean supervisor = false;
        
    
    @Column(name = "nom", nullable = true, length = 255)
    private String name;
        
    
    @Column(name = "vend", nullable = true, columnDefinition = "boolean default false")
    private boolean salesMan = false;
    
    @Column(name = "habdesc", nullable = true, columnDefinition = "boolean default false")
    private boolean enableDisccount = false;
    
    @Column(name = "imptic", nullable = true, length = 255)
    private String ticketPrinter = "";
    
    @Column(name = "impfac", nullable = true, length = 255)
    private String invoicePrinter = "";

    @Column(name = "admcaj", nullable = true, columnDefinition = "boolean default false")
    private boolean casherAdmin = false;
    
    @Column(name = "almacen", nullable = true,length = 255)
    private String almacen;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }   

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }        

    public boolean isM52() {
        return m52;
    }

    public void setM52(boolean m52) {
        this.m52 = m52;
    }

    public boolean isUserOfsalesOfPoint() {
        return userOfsalesOfPoint;
    }

    public void setUserOfsalesOfPoint(boolean userOfsalesOfPoint) {
        this.userOfsalesOfPoint = userOfsalesOfPoint;
    }

    public float getDisccount() {
        return disccount;
    }

    public void setDisccount(float disccount) {
        this.disccount = disccount;
    }

    public boolean isCort() {
        return cort;
    }

    public void setCort(boolean cort) {
        this.cort = cort;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public boolean isSalesMan() {
        return salesMan;
    }

    public void setSalesMan(boolean salesMan) {
        this.salesMan = salesMan;
    }

    public boolean isEnableDisccount() {
        return enableDisccount;
    }

    public void setEnableDisccount(boolean enableDisccount) {
        this.enableDisccount = enableDisccount;
    }

    public String getTicketPrinter() {
        return ticketPrinter;
    }

    public void setTicketPrinter(String ticketPrinter) {
        this.ticketPrinter = ticketPrinter;
    }

    public String getInvoicePrinter() {
        return invoicePrinter;
    }

    public void setInvoicePrinter(String invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public boolean isCasherAdmin() {
        return casherAdmin;
    }

    public void setCasherAdmin(boolean casherAdmin) {
        this.casherAdmin = casherAdmin;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPtovta() {
        return ptovta;
    }

    public void setPtovta(boolean ptovta) {
        this.ptovta = ptovta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }        
}
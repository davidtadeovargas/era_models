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
    
    @Column(name = "estac", nullable = false, length = 30)
    private String station;
    
    @Column(name = "52m", nullable = false)
    private boolean m52 = false;
    
    @Column(name = "ptovta", nullable = false)
    private boolean userOfsalesOfPoint = false;
    
    @Column(name = "descu", nullable = false)
    private float disccount = 0;
    
    @Column(name = "cort", nullable = false, length = 3)
    private String cort = "";
    
    @Column(name = "pass", nullable = false, length = 255)
    private String password;
    
    @Column(name = "estacglo", nullable = false, length = 30)
    private String estacglo = "";
    
    @Column(name = "nom", nullable = true, length = 255)
    private String name;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucursal = "";
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String cashNumber;
    
    @Column(name = "vend", nullable = true)
    private boolean salesMan = false;
    
    @Column(name = "habdesc", nullable = true)
    private int enableDisccount = 0;
    
    @Column(name = "imptic", nullable = true, length = 255)
    private String ticketPrinter = "";
    
    @Column(name = "impfac", nullable = true, length = 255)
    private String invoicePrinter = "";

    @Column(name = "admcaj", nullable = true)
    private boolean casherAdmin = false;
    
    @Column(name = "almacen", nullable = true,length = 255)
    private String almacen;
    
    @Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
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

    public String getCort() {
        return cort;
    }

    public void setCort(String cort) {
        this.cort = cort;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstacglo() {
        return estacglo;
    }

    public void setEstacglo(String estacglo) {
        this.estacglo = estacglo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(String cashNumber) {
        this.cashNumber = cashNumber;
    }

    public boolean isSalesMan() {
        return salesMan;
    }

    public void setSalesMan(boolean salesMan) {
        this.salesMan = salesMan;
    }

    public int getEnableDisccount() {
        return enableDisccount;
    }

    public void setEnableDisccount(int enableDisccount) {
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

          
    
}
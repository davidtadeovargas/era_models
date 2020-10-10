/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pags", uniqueConstraints = {})
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "serie")
    private String serie;
    @Column(name = "folio")
    private String folio;
    @Column(name = "cuentabanco")
    private String cuentabanco;
    @Column(name = "formapago")
    private String formapago;
    @Column(name = "concepto")
    private String concepto;
    
    @Column(name = "estatus", nullable = false, length = 10)
    private String estatus;
    
    @Column(name = "codigo_cliente_proveedor")
    private String codigoClienteProveedor;
    
    @Column(name = "timbr", nullable = true, columnDefinition = "boolean default false")
    private boolean timbrada;
    
    @Column(name = "cadori", nullable = true, length = 2000)
    private String cadori;
    
    @Column(name = "folfisc", nullable = true, length = 100)
    private String fiscalFolio = "";
    
    @Column(name = "transid", nullable = true, length = 100)
    private String transactionID = "";
    
    @Column(name = "sell", nullable = true, length = 1000)
    private String sell = "";
    
    @Column(name = "sellsat", nullable = true, length = 1000)
    private String sellsat = "";
    
    @Column(name = "certsat", nullable = true, length = 1000)
    private String certsat = "";
    
    @Column(name = "importe")
    private BigDecimal importe;
    
    @Column(name = "comentario")
    private String comentario;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac = "";
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu = "";
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj = "";        
    @Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCuentabanco() {
        return cuentabanco;
    }

    public void setCuentabanco(String cuentabanco) {
        this.cuentabanco = cuentabanco;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getCodigoClienteProveedor() {
        return codigoClienteProveedor;
    }

    public void setCodigoClienteProveedor(String codigoClienteProveedor) {
        this.codigoClienteProveedor = codigoClienteProveedor;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public boolean isTimbrada() {
        return timbrada;
    }

    public void setTimbrada(boolean timbrada) {
        this.timbrada = timbrada;
    }

    public String getCadori() {
        return cadori;
    }

    public void setCadori(String cadori) {
        this.cadori = cadori;
    }

    public String getFiscalFolio() {
        return fiscalFolio;
    }

    public void setFiscalFolio(String fiscalFolio) {
        this.fiscalFolio = fiscalFolio;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getSellsat() {
        return sellsat;
    }

    public void setSellsat(String sellsat) {
        this.sellsat = sellsat;
    }

    public String getCertsat() {
        return certsat;
    }

    public void setCertsat(String certsat) {
        this.certsat = certsat;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

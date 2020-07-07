/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vtas", uniqueConstraints = {})
public class Sales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vta", nullable = false)
    private int id;
    
    @Column(name = "norefer", nullable = false, length = 30)
    private String referenceNumber = "";
    
    @Column(name = "noser", nullable = false, length = 30)
    private String noser;
    
    @Column(name = "coinCode", nullable = false, length = 30)
    private String coinCode;
    
    @Column(name = "vend", nullable = false, length = 30)
    private String salesMan;
    
    @Column(name = "codcot", nullable = true, length = 30)
    private String codeCotizacion = "";
    
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
    
    @Column(name = "lugexp", nullable = true, length = 100)
    private String expeditionPlace = "";
    
    @Column(name = "regfisc", nullable = true, length = 255)
    private String fiscalRegimen = "";
    
    @Column(name = "cort", nullable = true, length = 5)
    private String cut = "N";
    
    @Column(name = "formpag", nullable = false, length = 30)
    private String paymentForm = "";
    
    @Column(name = "nocort", nullable = true, columnDefinition = "int default 0")
    private int cortNumber = 0;
    
    @Column(name = "venta_origen", nullable = true, columnDefinition = "int default 0")
    private int originSale = 0;
    
    @Column(name = "vtadevp", nullable = true, columnDefinition = "int default 0")
    private int saleParcialDevolution = 0;
    
    @Column(name = "ptovta", nullable = true, columnDefinition = "boolean default false")
    private boolean salesPoint = false;
    
    @Column(name = "catgral", nullable = true, length = 500)
    private String catgral = "";
    
    @Column(name = "factu", nullable = true, columnDefinition = "boolean default false")
    private boolean facturado = false;
    
    @Column(name = "tipcam", nullable = false)
    private BigDecimal typeExchange;
    
    @Column(name = "tipcamnac", nullable = true)
    private BigDecimal exchangeTypeNational = BigDecimal.ZERO;
    
    @Column(name = "total_traslado", nullable = false)
    private BigDecimal totalTranslade = BigDecimal.ZERO;
    
    @Column(name = "total_retencion", nullable = true)
    private BigDecimal totalRetention = BigDecimal.ZERO;
    
    @Column(name = "tipdoc", nullable = false, length = 30)
    private String documentType;
    
    @Column(name = "notcred", nullable = true, length = 30)
    private String noteCredit = "";
    
    @Column(name = "notcredpag", nullable = true, length = 250)
    private String noteCreditPayment = "";
    
    @Column(name = "impnotcred", nullable = true)
    private BigDecimal noteCreditImport = BigDecimal.ZERO;
    
    @Column(name = "totdescu", nullable = true)
    private BigDecimal totalDisccount = BigDecimal.ZERO;
    
    @Column(name = "totcost", nullable = true)
    private BigDecimal totalCost = BigDecimal.ZERO;
    
    @Column(name = "totcostprom", nullable = true)
    private BigDecimal totalCostProm = BigDecimal.ZERO;
    
    @Column(name = "totueps", nullable = true)
    private BigDecimal totalUEPS = BigDecimal.ZERO;
    
    @Column(name = "totpeps", nullable = true)
    private BigDecimal totalEPS = BigDecimal.ZERO;
    
    @Column(name = "codemp", nullable = false, length = 45)
    private String companyCode;
    
    @Column(name = "ser", nullable = false, length = 30)
    private String serie;
    
    @Column(name = "metpag", nullable = false, length = 42)
    private String paymentMethod;
    
    @Column(name = "cta", nullable = true, length = 42)
    private String account;
    
    @Column(name = "femi", nullable = false)
    private Date emisionDate = new Date();
    
    @Column(name = "fent", nullable = false)
    private Date deliverDate = new Date();
    
    @Column(name = "subtot", nullable = false)
    private BigDecimal subtotal;
    
    @Column(name = "impue", columnDefinition = "NUMERIC(19,2)",nullable = false)
    private BigDecimal tax;
    
    @Column(name = "tot", nullable = false)
    private BigDecimal total;
    
    @Column(name = "tic", nullable = true, columnDefinition = "boolean default false")
    private boolean ticket = false;
    
    @Column(name = "estad", nullable = false, length = 10)
    private String estatus;
    
    @Column(name = "motiv", nullable = true, length = 255)
    private String razon;
    
    @Column(name = "observ", nullable = true, length = 1000)
    private String observation;
    
    @Column(name = "timbr", nullable = true, columnDefinition = "boolean default false")
    private boolean invoiced;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "fvenc", nullable = true)
    private Date fvenc = new Date();
    
    @Column(name = "falt", nullable = true)
    private Date falt;
    
    @Column(name = "fmod", nullable = false)
    private Date fmod;
    
    @Column(name = "usocfdi", nullable = true, length = 5)
    private String usocfdi;
    
    @Column(name = "tiporelacion", nullable = true, length = 5)
    private String relationType = "";
    
    @Column(name = "activo", nullable = true, length = 10)
    private String active = "";
    
    @Column(name = "subramo", nullable = true, length = 10)
    private String subramo = "";
    
    @Column(name = "sector", nullable = true, length = 10)
    private String sector = "";
    
    @Column(name = "id_emp", nullable = true, columnDefinition = "int default 0")
    private int companyID = 0;
    
    @Column(name = "cadori", nullable = true, length = 2000)
    private String cadori;
    
    @Column(name = "referencia", nullable = true, length = 255)
    private String reference;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getCoinCode() {
        return coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode;
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan;
    }

    public String getCodeCotizacion() {
        return codeCotizacion;
    }

    public void setCodeCotizacion(String codeCotizacion) {
        this.codeCotizacion = codeCotizacion;
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

    public String getExpeditionPlace() {
        return expeditionPlace;
    }

    public void setExpeditionPlace(String expeditionPlace) {
        this.expeditionPlace = expeditionPlace;
    }

    public String getFiscalRegimen() {
        return fiscalRegimen;
    }

    public void setFiscalRegimen(String fiscalRegimen) {
        this.fiscalRegimen = fiscalRegimen;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    public int getCortNumber() {
        return cortNumber;
    }

    public void setCortNumber(int cortNumber) {
        this.cortNumber = cortNumber;
    }

    public int getOriginSale() {
        return originSale;
    }

    public void setOriginSale(int originSale) {
        this.originSale = originSale;
    }

    public int getSaleParcialDevolution() {
        return saleParcialDevolution;
    }

    public void setSaleParcialDevolution(int saleParcialDevolution) {
        this.saleParcialDevolution = saleParcialDevolution;
    }

    public boolean isSalesPoint() {
        return salesPoint;
    }

    public void setSalesPoint(boolean salesPoint) {
        this.salesPoint = salesPoint;
    }

    public String getCatgral() {
        return catgral;
    }

    public void setCatgral(String catgral) {
        this.catgral = catgral;
    }

    public boolean isFacturado() {
        return facturado;
    }

    public void setFacturado(boolean facturado) {
        this.facturado = facturado;
    }

    public BigDecimal getTypeExchange() {
        return typeExchange;
    }

    public void setTypeExchange(BigDecimal typeExchange) {
        this.typeExchange = typeExchange;
    }

    public BigDecimal getExchangeTypeNational() {
        return exchangeTypeNational;
    }

    public void setExchangeTypeNational(BigDecimal exchangeTypeNational) {
        this.exchangeTypeNational = exchangeTypeNational;
    }

    public BigDecimal getTotalTranslade() {
        return totalTranslade;
    }

    public void setTotalTranslade(BigDecimal totalTranslade) {
        this.totalTranslade = totalTranslade;
    }

    public BigDecimal getTotalRetention() {
        return totalRetention;
    }

    public void setTotalRetention(BigDecimal totalRetention) {
        this.totalRetention = totalRetention;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNoteCredit() {
        return noteCredit;
    }

    public void setNoteCredit(String noteCredit) {
        this.noteCredit = noteCredit;
    }

    public String getNoteCreditPayment() {
        return noteCreditPayment;
    }

    public void setNoteCreditPayment(String noteCreditPayment) {
        this.noteCreditPayment = noteCreditPayment;
    }

    public BigDecimal getNoteCreditImport() {
        return noteCreditImport;
    }

    public void setNoteCreditImport(BigDecimal noteCreditImport) {
        this.noteCreditImport = noteCreditImport;
    }

    public BigDecimal getTotalDisccount() {
        return totalDisccount;
    }

    public void setTotalDisccount(BigDecimal totalDisccount) {
        this.totalDisccount = totalDisccount;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTotalCostProm() {
        return totalCostProm;
    }

    public void setTotalCostProm(BigDecimal totalCostProm) {
        this.totalCostProm = totalCostProm;
    }

    public BigDecimal getTotalUEPS() {
        return totalUEPS;
    }

    public void setTotalUEPS(BigDecimal totalUEPS) {
        this.totalUEPS = totalUEPS;
    }

    public BigDecimal getTotalEPS() {
        return totalEPS;
    }

    public void setTotalEPS(BigDecimal totalEPS) {
        this.totalEPS = totalEPS;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public Date getEmisionDate() {
        return emisionDate;
    }

    public void setEmisionDate(Date emisionDate) {
        this.emisionDate = emisionDate;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isTicket() {
        return ticket;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }   

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public boolean isInvoiced() {
        return invoiced;
    }

    public void setInvoiced(boolean invoiced) {
        this.invoiced = invoiced;
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

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
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

    public String getUsocfdi() {
        return usocfdi;
    }

    public void setUsocfdi(String usocfdi) {
        this.usocfdi = usocfdi;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSubramo() {
        return subramo;
    }

    public void setSubramo(String subramo) {
        this.subramo = subramo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCadori() {
        return cadori;
    }

    public void setCadori(String cadori) {
        this.cadori = cadori;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isTicketDocument() {
        return this.documentType.equals("TIK");
    }
    public boolean isInvoiceDocument() {
        return this.documentType.equals("FAC");
    }
    public boolean isRemDocument() {
        return this.documentType.equals("REM");
    }
    
    public boolean isConfirmed() {
        return this.estatus.equals("CO");
    }
    
    public boolean isDev() {
        return this.estatus.equals("DEV");
    }
    
    public boolean isParcialDev() {
        return this.estatus.equals("PDEV");
    }
    
    public boolean isCanceled() {
        return this.estatus.equals("CA");
    }
}

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

@Entity@Table(name = "documentos_pago")public class DocumentosPago {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Column(name = "serie", nullable = true) private String serie;
  @Column(name = "folio", nullable = true) private String folio;
  @Column(name = "cuentabanco", nullable = true) private String cuentabanco;
  @Column(name = "formapago", nullable = true) private String formapago;
  @Column(name = "concepto", nullable = true) private String concepto;  
  @Column(name = "codigo_cliente_proveedor", nullable = true, length = 45) private String codigo_cliente_proveedor;
  @Column(name = "importe", nullable = true) private BigDecimal importe;  
  @Column(name = "comentario", nullable = true) private String comentario;
  @Column(name = "folio_banco", nullable = true, length = 45) private String folio_banco = "";  
  @Column(name = "tipo", nullable = true) private String tipo;  
  @Index(name="documentos_pago_tipo") @Column(name = "pendiente", nullable = true) private BigDecimal pendiente;    
  @Column(name = "estado", nullable = true) private String estado;
  @Index(name="documentos_pago_fecha_documento") @Column(name = "fecha_documento", nullable = true) private Date fecha_documento;  
  @Column(name = "fecha_alta", nullable = false) private Date fecha_alta = new Date();
  @Column(name = "uuid_fiscal", nullable = false, length = 40) private String uuid_fiscal = "";  
  @Column(name = "transactionid", nullable = false) private String transactionid = "";
  @Column(name = "selloDigital", nullable = false) private String selloDigital = "";
  @Column(name = "selloSat", nullable = false) private String selloSat = "";
  @Column(name = "fechaTimbrado", nullable = true) private Date fechaTimbrado = new Date();
  @Column(name = "lugarExpedicion", nullable = false) private String lugarExpedicion = "";
  @Column(name = "regimenFiscal", nullable = false) private String regimenFiscal = "";
  @Column(name = "cadenaOriginal", nullable = false) private String cadenaOriginal = "";
  @Column(name = "certificadosat", nullable = false) private String certificadosat = "";
  @Column(name = "estac", nullable = true, length = 30) private String usuario;
  @Column(name = "sucu", nullable = true, length = 30) private String sucursal;
  @Column(name = "nocaj", nullable = true, length = 30) private String caja;
  @Column(name = "color", nullable = false, length = 11) private int color = 0;  
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

    public String getCodigo_cliente_proveedor() {
        return codigo_cliente_proveedor;
    }

    public void setCodigo_cliente_proveedor(String codigo_cliente_proveedor) {
        this.codigo_cliente_proveedor = codigo_cliente_proveedor;
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

    public String getFolio_banco() {
        return folio_banco;
    }

    public void setFolio_banco(String folio_banco) {
        this.folio_banco = folio_banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPendiente() {
        return pendiente;
    }

    public void setPendiente(BigDecimal pendiente) {
        this.pendiente = pendiente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_documento() {
        return fecha_documento;
    }

    public void setFecha_documento(Date fecha_documento) {
        this.fecha_documento = fecha_documento;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getUuid_fiscal() {
        return uuid_fiscal;
    }

    public void setUuid_fiscal(String uuid_fiscal) {
        this.uuid_fiscal = uuid_fiscal;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getSelloDigital() {
        return selloDigital;
    }

    public void setSelloDigital(String selloDigital) {
        this.selloDigital = selloDigital;
    }

    public String getSelloSat() {
        return selloSat;
    }

    public void setSelloSat(String selloSat) {
        this.selloSat = selloSat;
    }

    public Date getFechaTimbrado() {
        return fechaTimbrado;
    }

    public void setFechaTimbrado(Date fechaTimbrado) {
        this.fechaTimbrado = fechaTimbrado;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public void setCadenaOriginal(String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }

    public String getCertificadosat() {
        return certificadosat;
    }

    public void setCertificadosat(String certificadosat) {
        this.certificadosat = certificadosat;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
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

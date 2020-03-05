/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Index(name="")

@Entity @Table(name = "facturas") public class Facturas {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "venta", nullable = false) private int venta;  
  @Column(name = "cliente", nullable = false,length = 30) private String cliente;
  @Column(name = "usocfdi", nullable = false,length = 5) private String usocfdi;
  @Column(name = "fentrega", nullable = false) private Date fentrega = new Date();
  @Column(name = "producto", nullable = false,length = 255) private String producto;
  @Column(name = "descripcion", nullable = false,length = 255) private String descripcion;
  @Column(name = "unidad", nullable = false,length = 30) private String unidad;
  @Column(name = "cantidad", nullable = false) private BigDecimal cantidad;
  @Column(name = "clavesat", nullable = false,length = 10) private String clavesat;
  @Column(name = "precio", nullable = false) private BigDecimal precio;
  @Column(name = "pdescuento", nullable = false) private BigDecimal pdescuento;
  @Column(name = "descuento", nullable = false) private BigDecimal descuento;
  @Column(name = "importe", nullable = false) private BigDecimal importe;
  @Column(name = "subtotal", nullable = false) private BigDecimal subtotal;
  @Column(name = "tdescuento", nullable = false) private BigDecimal tdescuento;
  @Column(name = "total_retencion", nullable = false) private BigDecimal total_retencion;
  @Column(name = "total_traslado", nullable = false) private BigDecimal total_traslado;
  @Column(name = "total", nullable = false) private BigDecimal total;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUsocfdi() {
        return usocfdi;
    }

    public void setUsocfdi(String usocfdi) {
        this.usocfdi = usocfdi;
    }

    public Date getFentrega() {
        return fentrega;
    }

    public void setFentrega(Date fentrega) {
        this.fentrega = fentrega;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getClavesat() {
        return clavesat;
    }

    public void setClavesat(String clavesat) {
        this.clavesat = clavesat;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPdescuento() {
        return pdescuento;
    }

    public void setPdescuento(BigDecimal pdescuento) {
        this.pdescuento = pdescuento;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTdescuento() {
        return tdescuento;
    }

    public void setTdescuento(BigDecimal tdescuento) {
        this.tdescuento = tdescuento;
    }

    public BigDecimal getTotal_retencion() {
        return total_retencion;
    }

    public void setTotal_retencion(BigDecimal total_retencion) {
        this.total_retencion = total_retencion;
    }

    public BigDecimal getTotal_traslado() {
        return total_traslado;
    }

    public void setTotal_traslado(BigDecimal total_traslado) {
        this.total_traslado = total_traslado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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


  
}

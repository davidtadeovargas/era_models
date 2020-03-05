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

import java.math.BigDecimal;
import org.hibernate.annotations.Index;
//@Index(name="")

@Entity@Table(name = "er_movimientos_inventario")public class ERMmovimientosInventario {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Index(name="er_movimientos_inventario_idAlmacen") @Column(name = "idAlmacen", nullable = false) private int idAlmacen;
  @Index(name="er_movimientos_inventario_idMovtoComercial") @Column(name = "idMovtoComercial", nullable = false) private int idMovtoComercial;
  @Index(name="er_movimientos_inventario_idProducto") @Column(name = "idProducto", nullable = false) private int idProducto;
  @Column(name = "tipoMovimiento", nullable = true) private int tipoMovimiento = 0;
  @Column(name = "cantidad", nullable = true) private BigDecimal cantidad = BigDecimal.ZERO;
  @Column(name = "unidad", nullable = true) private String unidad;
  @Column(name = "costoUnitario", nullable = true) private BigDecimal costoUnitario = BigDecimal.ZERO;
  @Column(name = "costoPromedio", nullable = true) private BigDecimal costoPromedio = BigDecimal.ZERO;
  @Column(name = "existActual", nullable = true) private BigDecimal existActual = BigDecimal.ZERO;  
  @Column(name = "fechaMovimiento", nullable = false) private Date fechaMovimiento;  
  @Column(name = "timestamp", nullable = false) private Date timestamp = new Date();
  @Column(name = "lotePedimento", nullable = true) private int lotePedimento = 0; 
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getIdMovtoComercial() {
        return idMovtoComercial;
    }

    public void setIdMovtoComercial(int idMovtoComercial) {
        this.idMovtoComercial = idMovtoComercial;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public BigDecimal getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(BigDecimal costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public BigDecimal getExistActual() {
        return existActual;
    }

    public void setExistActual(BigDecimal existActual) {
        this.existActual = existActual;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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

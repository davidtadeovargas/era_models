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
import java.util.Date;
import javax.persistence.Table;
import java.math.BigDecimal;
//@Index(name="")

@Entity@Table(name = "movimientos_asientos")public class MovimientosAsientos {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Column(name = "idAsiento", nullable = false) private int idAsiento;
  @Column(name = "numeroMovimiento", nullable = false) private int numeroMovimiento;
  @Column(name = "cuenta", nullable = false,length = 45) private String cuenta;
  @Column(name = "importe", nullable = false,length = 60) private String importe;
  @Column(name = "tipo", nullable = false,length = 45) private String tipo;
  @Column(name = "concepto", nullable = false,length = 255) private String concepto;
  @Column(name = "referencia", nullable = false,length = 60) private String referencia;
  @Column(name = "segmento_negocio", nullable = false,length = 100) private String segmento_negocio;
  @Column(name = "concentrado", nullable = true) private boolean concentrado = false;  
  @Column(name = "porcentaje", nullable = true) private BigDecimal porcentaje = BigDecimal.ZERO; 
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt = new Date();
@Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getNumeroMovimiento() {
        return numeroMovimiento;
    }

    public void setNumeroMovimiento(int numeroMovimiento) {
        this.numeroMovimiento = numeroMovimiento;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getSegmento_negocio() {
        return segmento_negocio;
    }

    public void setSegmento_negocio(String segmento_negocio) {
        this.segmento_negocio = segmento_negocio;
    }

    public boolean isConcentrado() {
        return concentrado;
    }

    public void setConcentrado(boolean concentrado) {
        this.concentrado = concentrado;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
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

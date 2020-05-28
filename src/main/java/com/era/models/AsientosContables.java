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

@Entity@Table(name = "asientos_contables")public class AsientosContables {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
  @Column(name = "idSerie", nullable = false, columnDefinition = "int default 0") private int idSerie;  
  @Column(name = "nombre", nullable = false,length = 100) private String nombre;
  @Column(name = "documento", nullable = false,length = 60) private String documento;
  @Column(name = "frecuencia", nullable = false,length = 45) private String frecuencia;
  @Column(name = "concepto", nullable = false,length = 100) private String concepto;
  @Column(name = "tipo", nullable = false, columnDefinition = "int default 0") private int tipo;  
  @Column(name = "fecha_alta", nullable = false) private Date fecha_alta = new Date();
  @Column(name = "fecha_modificacion", nullable = false) private Date fecha_modificacion = new Date();    
  @Column(name = "idSeriePago", nullable = true, columnDefinition = "int default 0") private int idSeriePago = 0;
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

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public int getIdSeriePago() {
        return idSeriePago;
    }

    public void setIdSeriePago(int idSeriePago) {
        this.idSeriePago = idSeriePago;
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
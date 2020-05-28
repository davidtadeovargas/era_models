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

//@Index(name="")

@Entity@Table(name = "documentos_contabilizados")public class DocumentosContabilizados {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;  
  @Column(name = "documento_id", nullable = false, length = 45) private String documento_id;
  @Column(name = "tipo_documento", nullable = false, length = 60) private String tipo_documento;
  @Column(name = "serie", nullable = false,length = 30) private String serie;
  @Column(name = "folio", nullable = false,length = 30) private String folio;  
  @Column(name = "numero_poliza", nullable = false, length = 11, columnDefinition = "int default 0") private int numero_poliza;
  @Column(name = "tipo_poliza", nullable = false, length = 45) private String tipo_poliza;
  @Column(name = "fecha_poliza", nullable = false) private Date fecha_poliza;  
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

    public String getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(String documento_id) {
        this.documento_id = documento_id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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

    public int getNumero_poliza() {
        return numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String getTipo_poliza() {
        return tipo_poliza;
    }

    public void setTipo_poliza(String tipo_poliza) {
        this.tipo_poliza = tipo_poliza;
    }

    public Date getFecha_poliza() {
        return fecha_poliza;
    }

    public void setFecha_poliza(Date fecha_poliza) {
        this.fecha_poliza = fecha_poliza;
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

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
@Table(name = "c_pais", uniqueConstraints = {})
public class CCountry {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Column(name = "Agrupaciones", nullable = false, length = 25)
    private String Agrupaciones = "";
    
    @Column(name = "Formato_de_Registro_de_Identidad_Tributaria", nullable = true, length = 255)
    private String Formato_de_Registro_de_Identidad_Tributaria;
    
    @Column(name = "Validación_del_Registro_de_Identidad_Tributaria", nullable = true, length = 255)
    private String Validación_del_Registro_de_Identidad_Tributaria = "";
    
    @Column(name = "c_Pais", nullable = false, length = 5)
    private String code = "";
    
    @Column(name = "Descripcion", nullable = true, length = 255)
    private String description;
    
    @Column(name = "estac", nullable = false,length = 30) private String estac;
    @Column(name = "falt", nullable = true) private Date falt;
    @Column(name = "fmod", nullable = false) private Date fmod; 

    @Column(name = "Formato_de_código_postal", nullable = true, length = 45)
    private String formatCP;
    
    @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
   
    @Column(name = "sucu", nullable = false,length = 30) private String sucu;
    
    @Column(name = "val", nullable = true)
    private float value = 0;        
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormatCP() {
        return formatCP;
    }

    public void setFormatCP(String formatCP) {
        this.formatCP = formatCP;
    }

    public String getFormato_de_Registro_de_Identidad_Tributaria() {
        return Formato_de_Registro_de_Identidad_Tributaria;
    }

    public void setFormato_de_Registro_de_Identidad_Tributaria(String Formato_de_Registro_de_Identidad_Tributaria) {
        this.Formato_de_Registro_de_Identidad_Tributaria = Formato_de_Registro_de_Identidad_Tributaria;
    }

    public String getValidación_del_Registro_de_Identidad_Tributaria() {
        return Validación_del_Registro_de_Identidad_Tributaria;
    }

    public void setValidación_del_Registro_de_Identidad_Tributaria(String Validación_del_Registro_de_Identidad_Tributaria) {
        this.Validación_del_Registro_de_Identidad_Tributaria = Validación_del_Registro_de_Identidad_Tributaria;
    }

    public String getAgrupaciones() {
        return Agrupaciones;
    }

    public void setAgrupaciones(String Agrupaciones) {
        this.Agrupaciones = Agrupaciones;
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

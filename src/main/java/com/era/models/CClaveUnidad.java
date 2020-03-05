/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "c_claveunidad", uniqueConstraints = {})
public class CClaveUnidad {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_pago", nullable = false) private int id;
    
    @Id
    @Column(name = "c_claveunidad_id", nullable = false)
    private int c_claveunidad_id;
    
    @Column(name = "c_ClaveUnidad", nullable = true, length = 5)
    private String c_ClaveUnidad = "";

    @Column(name = "Nombre", nullable = true, length = 255)
    private String Nombre;
    
    @Column(name = "Descripcion", nullable = true, length = 4000)
    private String description;

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

    public int getC_claveunidad_id() {
        return c_claveunidad_id;
    }

    public void setC_claveunidad_id(int c_claveunidad_id) {
        this.c_claveunidad_id = c_claveunidad_id;
    }

    public String getC_ClaveUnidad() {
        return c_ClaveUnidad;
    }

    public void setC_ClaveUnidad(String c_ClaveUnidad) {
        this.c_ClaveUnidad = c_ClaveUnidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

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


@Entity
@Table(name = "c_regimenfiscal", uniqueConstraints = {})
public class CRegimenfiscal {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id", nullable = false) private int id;
        
    @Column(name = "c_RegimenFiscal", nullable = false, length = 4)
    private String c_RegimenFiscal;
    
    @Column(name = "Descripcion", nullable = false, length = 255)
    private String description;
    
    @Column(name = "Física", nullable = true, columnDefinition = "boolean default false")
    private boolean Física;
    
    @Column(name = "Moral", nullable = true, columnDefinition = "boolean default false")
    private boolean Moral;
    
    @Column(name = "Fecha_de_inicio_de_vigencia", nullable = true)
    private Date Fecha_de_inicio_de_vigencia;
    
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

    public String getC_RegimenFiscal() {
        return c_RegimenFiscal;
    }

    public void setC_RegimenFiscal(String c_RegimenFiscal) {
        this.c_RegimenFiscal = c_RegimenFiscal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFísica() {
        return Física;
    }

    public void setFísica(boolean Física) {
        this.Física = Física;
    }

    public boolean isMoral() {
        return Moral;
    }

    public void setMoral(boolean Moral) {
        this.Moral = Moral;
    }

    public Date getFecha_de_inicio_de_vigencia() {
        return Fecha_de_inicio_de_vigencia;
    }

    public void setFecha_de_inicio_de_vigencia(Date Fecha_de_inicio_de_vigencia) {
        this.Fecha_de_inicio_de_vigencia = Fecha_de_inicio_de_vigencia;
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

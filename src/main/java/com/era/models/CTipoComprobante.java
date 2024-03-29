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
@Table(name = "c_tipodecomprobante", uniqueConstraints = {})
public class CTipoComprobante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_tipodecomprobante_id", nullable = false)
    private int id;
    
    @Column(name = "c_TipoDeComprobante", nullable = true, length = 5)
    private String code;
    
    @Column(name = "Descripcion", nullable = true, length = 12)
    private String description;
    
    @Column(name = "Valor_maximo", nullable = true, length = 25)
    private String Valor_maximo;
    
    @Column(name = "Fecha_inicio_de_vigencia", nullable = true)
    private Date Fecha_inicio_de_vigencia;       

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValor_maximo() {
        return Valor_maximo;
    }

    public void setValor_maximo(String Valor_maximo) {
        this.Valor_maximo = Valor_maximo;
    }

    public Date getFecha_inicio_de_vigencia() {
        return Fecha_inicio_de_vigencia;
    }

    public void setFecha_inicio_de_vigencia(Date Fecha_inicio_de_vigencia) {
        this.Fecha_inicio_de_vigencia = Fecha_inicio_de_vigencia;
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
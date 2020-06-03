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
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "c_usocfdi", uniqueConstraints = {})
public class UsoCFDI {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_usocfdi_id", nullable = false)
    private int id;
    
    @Column(name = "code", nullable = true, length = 5)
    private String code = "";
    
    @Column(name = "Descripcion", nullable = true, length = 255)
    private String description;
    
    @Column(name = "Persona_Fisica", nullable = true, length = 1, columnDefinition = "boolean default true")
    private boolean fisicPerson;
    
    @Column(name = "Persona_Moral", nullable = true, length = 1, columnDefinition = "boolean default true")
    private boolean moralPerson;
    
    @Column(name = "Fecha_inicio_de_vigencia", nullable = true)
    private Date initVigencyDate;
    
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

    public boolean isFisicPerson() {
        return fisicPerson;
    }

    public void setFisicPerson(boolean fisicPerson) {
        this.fisicPerson = fisicPerson;
    }

    public boolean isMoralPerson() {
        return moralPerson;
    }

    public void setMoralPerson(boolean moralPerson) {
        this.moralPerson = moralPerson;
    }

    public Date getInitVigencyDate() {
        return initVigencyDate;
    }

    public void setInitVigencyDate(Date initVigencyDate) {
        this.initVigencyDate = initVigencyDate;
    }

    public String getEstac() {
        return estac;
    }

    public String getSucu() {
        return sucu;
    }

    public String getNocaj() {
        return nocaj;
    }

    public Date getFalt() {
        return falt;
    }

    public Date getFmod() {
        return fmod;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name = "correo_terminal")public class CorreoTerminal {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "correo", nullable = false,length = 350) private String correo;
  @Column(name = "contra", nullable = false,length = 100) private String contra;
  @Column(name = "muestracomo", nullable = false,length = 350) private String muestracomo;
  @Column(name = "direccionserver", nullable = false,length = 350) private String direccionserver;
  @Column(name = "correoA", nullable = false,length = 350) private String correoA;
  @Column(name = "puerto", nullable = false, columnDefinition = "int default 0") private int puerto;
  @Column(name = "ingresocorreo", nullable = true, columnDefinition = "int default 1") private int ingresocorreo = 1;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getMuestracomo() {
        return muestracomo;
    }

    public void setMuestracomo(String muestracomo) {
        this.muestracomo = muestracomo;
    }

    public String getDireccionserver() {
        return direccionserver;
    }

    public void setDireccionserver(String direccionserver) {
        this.direccionserver = direccionserver;
    }

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public int getIngresocorreo() {
        return ingresocorreo;
    }

    public void setIngresocorreo(int ingresocorreo) {
        this.ingresocorreo = ingresocorreo;
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
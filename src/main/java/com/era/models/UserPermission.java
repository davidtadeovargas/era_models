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


@Entity
@Table(name = "er_permisos", uniqueConstraints = {})
public class UserPermission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKId", nullable = false)
    private int id;
    
    @Column(name = "FKIdUsuario", nullable = false)
    private int userID;
    
    @Column(name = "permisoConf", nullable = false)
    private boolean permisoConf = true;
    
    @Column(name = "permisoCorreos", nullable = false)
    private boolean permisoCorreos = true;
    
    @Column(name = "permisoDatosEmpresa", nullable = false)
    private boolean permisoDatosEmpresa = true;
    
    @Column(name = "permisoSeries", nullable = false)
    private boolean permisoSeries = true;
    
    @Column(name = "permisoImpresoras", nullable = false)
    private boolean permisoImpresoras = true;
    
    @Column(name = "permisoCambiarIcono", nullable = false)
    private boolean permisoCambiarIcono = true;
    
    @Column(name = "permisoConfiguracionesGenerales", nullable = false)
    private boolean permisoConfiguracionesGenerales = true;
    
    @Column(name = "otorgaPermisosConfig", nullable = false)
    private boolean otorgaPermisosConfig = true;
    
    @Column(name = "permisoUsuarios", nullable = false)
    private boolean permisoUsuarios = true;
    
    @Column(name = "permisoUsuariosDefinir", nullable = false)
    private boolean permisoUsuariosDefinir = true;
    
    @Column(name = "permisoUsuariosConectados", nullable = false)
    private boolean permisoUsuariosConectados = true;
    
    @Column(name = "permisoUsuariosPermisos", nullable = false)
    private boolean permisoUsuariosPermisos = true;
    
    @Column(name = "permisoClaves", nullable = false)
    private boolean permisoClaves = true;
    
    @Column(name = "permisoReparar", nullable = false)
    private boolean permisoReparar = true;
    
    @Column(name = "permisoRepararErrores", nullable = false)
    private boolean permisoRepararErrores = true;
    
    @Column(name = "permisoRepararRestaurar", nullable = false)
    private boolean permisoRepararRestaurar = true;
    
    @Column(name = "permisoBaseDatos", nullable = false)
    private boolean permisoBaseDatos = true;
    
    @Column(name = "permisoBaseDatosConexiones", nullable = false)
    private boolean permisoBaseDatosConexiones = true;
    
    @Column(name = "permisoBaseDatosArchivo", nullable = false)
    private boolean permisoBaseDatosArchivo = true;
    
    @Column(name = "permisoReportes", nullable = false)
    private boolean permisoReportes = true;
    
    @Column(name = "permisoReportesUsuarios", nullable = false)
    private boolean permisoReportesUsuarios = true;
    
    @Column(name = "permisoReportesRespaldos", nullable = false)
    private boolean permisoReportesRespaldos = true;
    
    @Column(name = "permisoReportesLog", nullable = false)
    private boolean permisoReportesLog = true;
    
    @Column(name = "permisoReportesEstadistica", nullable = false)
    private boolean permisoReportesEstadistica = true;
    
    @Column(name = "permisoRevocacion", nullable = false)
    private boolean permisoRevocacion = true;
    
    @Column(name = "permisoActivarSistema", nullable = false)
    private boolean permisoActivarSistema = true;
    
    @Column(name = "otorgaPermisosSistema", nullable = false)
    private boolean otorgaPermisosSistema = true;
    
    @Column(name = "permisoContabilidad", nullable = false)
    private boolean permisoContabilidad = true;
    
    @Column(name = "permisoConceptosNC", nullable = false)
    private boolean permisoConceptosNC = true;
    
    @Column(name = "permisoCatalogoGarantias", nullable = false)
    private boolean permisoCatalogoGarantias = true;
    
    @Column(name = "permisoZonas", nullable = false)
    private boolean permisoZonas = true;
    
    @Column(name = "permisoGiros", nullable = false)
    private boolean permisoGiros = true;
    
    @Column(name = "permisoMonedas", nullable = false)
    private boolean permisoMonedas = true;
    
    @Column(name = "permisoImpuestos", nullable = false)
    private boolean permisoImpuestos = true;
    
    @Column(name = "otorgaPermisosModulos", nullable = false)
    private boolean otorgaPermisosModulos = true;
    
    @Column(name = "permisoCompras", nullable = false)
    private boolean permisoCompras = true;
    
    @Column(name = "permisoComprasCancelar", nullable = false)
    private boolean permisoComprasCancelar = true;
    
    @Column(name = "permisoComprasDevolucion", nullable = false)
    private boolean permisoComprasDevolucion = true;
    
    @Column(name = "permisoComprasParcial", nullable = false)
    private boolean permisoComprasParcial = true;
    
    @Column(name = "permisoComprasNuevo", nullable = false)
    private boolean permisoComprasNuevo = true;
    
    @Column(name = "permisoComprasNotCredito", nullable = false)
    private boolean permisoComprasNotCredito = true;
    
    @Column(name = "permisoComprasVer", nullable = false)
    private boolean permisoComprasVer = true;
    
    @Column(name = "permisoComprasCargarArchivo", nullable = false)
    private boolean permisoComprasCargarArchivo = true;
    
    @Column(name = "permisoComprasBorrarArchivo", nullable = false)
    private boolean permisoComprasBorrarArchivo = true;
    
    @Column(name = "permisoComprasRecibirOrden", nullable = false)
    private boolean permisoComprasRecibirOrden = true;
    
    @Column(name = "otorgaPermisosCompras", nullable = false)
    private boolean otorgaPermisosCompras = true;
    
    @Column(name = "permisoProvee", nullable = false)
    private boolean permisoProvee = true;
    
    @Column(name = "permisoProveeNuevo", nullable = false)
    private boolean permisoProveeNuevo = true;
    
    @Column(name = "permisoProveeModificar", nullable = false)
    private boolean permisoProveeModificar = true;
    
    @Column(name = "permisoProveeVer", nullable = false)
    private boolean permisoProveeVer = true;
    
    @Column(name = "permisoProveeBorrar", nullable = false)
    private boolean permisoProveeBorrar = true;
    
    @Column(name = "otorgaPermisosProvee", nullable = false)
    private boolean otorgaPermisosProvee = true;
    
    @Column(name = "permisoPrevio", nullable = false)
    private boolean permisoPrevio = true;
    
    @Column(name = "permisoPrevioNueva", nullable = false)
    private boolean permisoPrevioNueva = true;
    
    @Column(name = "permisoPrevioAbrir", nullable = false)
    private boolean permisoPrevioAbrir = true;
    
    @Column(name = "permisoPrevioVer", nullable = false)
    private boolean permisoPrevioVer = true;
    
    @Column(name = "permisoPrevioCancelar", nullable = false)
    private boolean permisoPrevioCancelar = true;
    
    @Column(name = "permisoPrevioSeries", nullable = false)
    private boolean permisoPrevioSeries = true;
    
    @Column(name = "permisoPrevioCompra", nullable = false)
    private boolean permisoPrevioCompra = true;
    
    @Column(name = "otorgaPermisosPrevio", nullable = false)
    private boolean otorgaPermisosPrevio = true;
    
    @Column(name = "permisoInventario", nullable = false)
    private boolean permisoInventario = true;
    
    @Column(name = "permisoProductos", nullable = false)
    private boolean permisoProductos = true;
    
    @Column(name = "permisoProductosNuevo", nullable = false)
    private boolean permisoProductosNuevo = true;
    
    @Column(name = "permisoProductosModificar", nullable = false)
    private boolean permisoProductosModificar = true;
        
    @Column(name = "permisProductosBorrar", nullable = false)
    private boolean permisProductosBorrar = true;
    
    @Column(name = "otorgaPermisosInventario", nullable = false)
    private boolean otorgaPermisosInventario = true;
    
    @Column(name = "permisoClientes", nullable = false)
    private boolean permisoClientes = true;
        
    @Column(name = "permisoClientesNuevo", nullable = false)
    private boolean permisoClientesNuevo = true;
    
    @Column(name = "permisoClientesModificar", nullable = false)
    private boolean permisoClientesModificar = true;
    
    @Column(name = "permisoClientesVer", nullable = false)
    private boolean permisoClientesVer = true;
    
    @Column(name = "permisoClientesBorrar", nullable = false)
    private boolean permisoClientesBorrar = true;
    
    @Column(name = "permisoClientesEnviar", nullable = false)
    private boolean permisoClientesEnviar = true;
    
    @Column(name = "otorgaPermisosClientes", nullable = false)
    private boolean otorgaPermisosClientes = true;
    
    @Column(name = "permisoVentas", nullable = false)
    private boolean permisoVentas = true;
    
    @Column(name = "permisoVentasCancelar", nullable = false)
    private boolean permisoVentasCancelar = true;
    
    @Column(name = "permisoVentasDevolucion", nullable = false)
    private boolean permisoVentasDevolucion = true;
    
    @Column(name = "permisoVentasParcial", nullable = false)
    private boolean permisoVentasParcial = true;
    
    @Column(name = "permisoVentasNueva", nullable = false)
    private boolean permisoVentasNueva = true;
    
    @Column(name = "permisoVentasNotCredito", nullable = false)
    private boolean permisoVentasNotCredito = true;
    
    @Column(name = "permisoVentasVer", nullable = false)
    private boolean permisoVentasVer = true;
    
    @Column(name = "permisoVentasEnviar", nullable = false)
    private boolean permisoVentasEnviar = true;
    
    @Column(name = "permisoVentasTimbrar", nullable = false)
    private boolean permisoVentasTimbrar = true;
    
    @Column(name = "permisoVentasEntregar", nullable = false)
    private boolean permisoVentasEntregar = true;
    
    @Column(name = "permisoVentasComprobar", nullable = false)
    private boolean permisoVentasComprobar = true;
    
    @Column(name = "permisoVentasAcuse", nullable = false)
    private boolean permisoVentasAcuse = true;
    
    @Column(name = "permisoVentasObtenerXml", nullable = false)
    private boolean permisoVentasObtenerXml = true;
    
    @Column(name = "permisoVentasFacturar", nullable = false)
    private boolean permisoVentasFacturar = true;
    
    @Column(name = "permisoVentasCargarArchivo", nullable = false)
    private boolean permisoVentasCargarArchivo = true;
    
    @Column(name = "permisoVentasBorrarArchivo", nullable = false)
    private boolean permisoVentasBorrarArchivo = true;
    
    @Column(name = "otorgaPermisosVentas", nullable = false)
    private boolean otorgaPermisosVentas = true;
    
    @Column(name = "permisoCotiza", nullable = false)
    private boolean permisoCotiza = true;
    
    @Column(name = "permisoCotizaNueva", nullable = false)
    private boolean permisoCotizaNueva = true;
    
    @Column(name = "permisoCotizaAbrir", nullable = false)
    private boolean permisoCotizaAbrir = true;
    
    @Column(name = "permisoCotizaVer", nullable = false)
    private boolean permisoCotizaVer = true;
    
    @Column(name = "permisoCotizaCancelar", nullable = false)
    private boolean permisoCotizaCancelar = true;
    
    @Column(name = "permisoCotizaReenviar", nullable = false)
    private boolean permisoCotizaReenviar = true;
    
    @Column(name = "permisoCotizaVenta", nullable = false)
    private boolean permisoCotizaVenta = true;
    
    @Column(name = "otorgaPermisosCotiza", nullable = false)
    private boolean otorgaPermisosCotiza = true;
    
    @Column(name = "permisoCxc", nullable = false)
    private boolean permisoCxc = true;
    
    @Column(name = "permisoPagoNuevo", nullable = false)
    private boolean permisoPagoNuevo = true;
    
    @Column(name = "permisoCancelarPago", nullable = false)
    private boolean permisoCancelarPago = true;
    
    @Column(name = "otorgaPermisoCxc", nullable = false)
    private boolean otorgaPermisoCxc = true;
    
    @Column(name = "permisProductosListaPrecio", nullable = false)
    private boolean permisProductosListaPrecio = true;
    
    @Column(name = "permisProductosCargadoImagen", nullable = false)
    private boolean permisProductosCargadoImagen = true;

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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isPermisoConf() {
        return permisoConf;
    }

    public void setPermisoConf(boolean permisoConf) {
        this.permisoConf = permisoConf;
    }

    public boolean isPermisoCorreos() {
        return permisoCorreos;
    }

    public void setPermisoCorreos(boolean permisoCorreos) {
        this.permisoCorreos = permisoCorreos;
    }

    public boolean isPermisoDatosEmpresa() {
        return permisoDatosEmpresa;
    }

    public void setPermisoDatosEmpresa(boolean permisoDatosEmpresa) {
        this.permisoDatosEmpresa = permisoDatosEmpresa;
    }

    public boolean isPermisoSeries() {
        return permisoSeries;
    }

    public void setPermisoSeries(boolean permisoSeries) {
        this.permisoSeries = permisoSeries;
    }

    public boolean isPermisoImpresoras() {
        return permisoImpresoras;
    }

    public void setPermisoImpresoras(boolean permisoImpresoras) {
        this.permisoImpresoras = permisoImpresoras;
    }

    public boolean isPermisoCambiarIcono() {
        return permisoCambiarIcono;
    }

    public void setPermisoCambiarIcono(boolean permisoCambiarIcono) {
        this.permisoCambiarIcono = permisoCambiarIcono;
    }

    public boolean isPermisoConfiguracionesGenerales() {
        return permisoConfiguracionesGenerales;
    }

    public void setPermisoConfiguracionesGenerales(boolean permisoConfiguracionesGenerales) {
        this.permisoConfiguracionesGenerales = permisoConfiguracionesGenerales;
    }

    public boolean isOtorgaPermisosConfig() {
        return otorgaPermisosConfig;
    }

    public void setOtorgaPermisosConfig(boolean otorgaPermisosConfig) {
        this.otorgaPermisosConfig = otorgaPermisosConfig;
    }

    public boolean isPermisoUsuarios() {
        return permisoUsuarios;
    }

    public void setPermisoUsuarios(boolean permisoUsuarios) {
        this.permisoUsuarios = permisoUsuarios;
    }

    public boolean isPermisoUsuariosDefinir() {
        return permisoUsuariosDefinir;
    }

    public void setPermisoUsuariosDefinir(boolean permisoUsuariosDefinir) {
        this.permisoUsuariosDefinir = permisoUsuariosDefinir;
    }

    public boolean isPermisoUsuariosConectados() {
        return permisoUsuariosConectados;
    }

    public void setPermisoUsuariosConectados(boolean permisoUsuariosConectados) {
        this.permisoUsuariosConectados = permisoUsuariosConectados;
    }

    public boolean isPermisoUsuariosPermisos() {
        return permisoUsuariosPermisos;
    }

    public void setPermisoUsuariosPermisos(boolean permisoUsuariosPermisos) {
        this.permisoUsuariosPermisos = permisoUsuariosPermisos;
    }

    public boolean isPermisoClaves() {
        return permisoClaves;
    }

    public void setPermisoClaves(boolean permisoClaves) {
        this.permisoClaves = permisoClaves;
    }

    public boolean isPermisoReparar() {
        return permisoReparar;
    }

    public void setPermisoReparar(boolean permisoReparar) {
        this.permisoReparar = permisoReparar;
    }

    public boolean isPermisoRepararErrores() {
        return permisoRepararErrores;
    }

    public void setPermisoRepararErrores(boolean permisoRepararErrores) {
        this.permisoRepararErrores = permisoRepararErrores;
    }

    public boolean isPermisoRepararRestaurar() {
        return permisoRepararRestaurar;
    }

    public void setPermisoRepararRestaurar(boolean permisoRepararRestaurar) {
        this.permisoRepararRestaurar = permisoRepararRestaurar;
    }

    public boolean isPermisoBaseDatos() {
        return permisoBaseDatos;
    }

    public void setPermisoBaseDatos(boolean permisoBaseDatos) {
        this.permisoBaseDatos = permisoBaseDatos;
    }

    public boolean isPermisoBaseDatosConexiones() {
        return permisoBaseDatosConexiones;
    }

    public void setPermisoBaseDatosConexiones(boolean permisoBaseDatosConexiones) {
        this.permisoBaseDatosConexiones = permisoBaseDatosConexiones;
    }

    public boolean isPermisoBaseDatosArchivo() {
        return permisoBaseDatosArchivo;
    }

    public void setPermisoBaseDatosArchivo(boolean permisoBaseDatosArchivo) {
        this.permisoBaseDatosArchivo = permisoBaseDatosArchivo;
    }

    public boolean isPermisoReportes() {
        return permisoReportes;
    }

    public void setPermisoReportes(boolean permisoReportes) {
        this.permisoReportes = permisoReportes;
    }

    public boolean isPermisoReportesUsuarios() {
        return permisoReportesUsuarios;
    }

    public void setPermisoReportesUsuarios(boolean permisoReportesUsuarios) {
        this.permisoReportesUsuarios = permisoReportesUsuarios;
    }

    public boolean isPermisoReportesRespaldos() {
        return permisoReportesRespaldos;
    }

    public void setPermisoReportesRespaldos(boolean permisoReportesRespaldos) {
        this.permisoReportesRespaldos = permisoReportesRespaldos;
    }

    public boolean isPermisoReportesLog() {
        return permisoReportesLog;
    }

    public void setPermisoReportesLog(boolean permisoReportesLog) {
        this.permisoReportesLog = permisoReportesLog;
    }

    public boolean isPermisoReportesEstadistica() {
        return permisoReportesEstadistica;
    }

    public void setPermisoReportesEstadistica(boolean permisoReportesEstadistica) {
        this.permisoReportesEstadistica = permisoReportesEstadistica;
    }

    public boolean isPermisoRevocacion() {
        return permisoRevocacion;
    }

    public void setPermisoRevocacion(boolean permisoRevocacion) {
        this.permisoRevocacion = permisoRevocacion;
    }

    public boolean isPermisoActivarSistema() {
        return permisoActivarSistema;
    }

    public void setPermisoActivarSistema(boolean permisoActivarSistema) {
        this.permisoActivarSistema = permisoActivarSistema;
    }

    public boolean isOtorgaPermisosSistema() {
        return otorgaPermisosSistema;
    }

    public void setOtorgaPermisosSistema(boolean otorgaPermisosSistema) {
        this.otorgaPermisosSistema = otorgaPermisosSistema;
    }

    public boolean isPermisoContabilidad() {
        return permisoContabilidad;
    }

    public void setPermisoContabilidad(boolean permisoContabilidad) {
        this.permisoContabilidad = permisoContabilidad;
    }

    public boolean isPermisoConceptosNC() {
        return permisoConceptosNC;
    }

    public void setPermisoConceptosNC(boolean permisoConceptosNC) {
        this.permisoConceptosNC = permisoConceptosNC;
    }

    public boolean isPermisoCatalogoGarantias() {
        return permisoCatalogoGarantias;
    }

    public void setPermisoCatalogoGarantias(boolean permisoCatalogoGarantias) {
        this.permisoCatalogoGarantias = permisoCatalogoGarantias;
    }

    public boolean isPermisoZonas() {
        return permisoZonas;
    }

    public void setPermisoZonas(boolean permisoZonas) {
        this.permisoZonas = permisoZonas;
    }

    public boolean isPermisoGiros() {
        return permisoGiros;
    }

    public void setPermisoGiros(boolean permisoGiros) {
        this.permisoGiros = permisoGiros;
    }

    public boolean isPermisoMonedas() {
        return permisoMonedas;
    }

    public void setPermisoMonedas(boolean permisoMonedas) {
        this.permisoMonedas = permisoMonedas;
    }

    public boolean isPermisoImpuestos() {
        return permisoImpuestos;
    }

    public void setPermisoImpuestos(boolean permisoImpuestos) {
        this.permisoImpuestos = permisoImpuestos;
    }

    public boolean isOtorgaPermisosModulos() {
        return otorgaPermisosModulos;
    }

    public void setOtorgaPermisosModulos(boolean otorgaPermisosModulos) {
        this.otorgaPermisosModulos = otorgaPermisosModulos;
    }

    public boolean isPermisoCompras() {
        return permisoCompras;
    }

    public void setPermisoCompras(boolean permisoCompras) {
        this.permisoCompras = permisoCompras;
    }

    public boolean isPermisoComprasCancelar() {
        return permisoComprasCancelar;
    }

    public void setPermisoComprasCancelar(boolean permisoComprasCancelar) {
        this.permisoComprasCancelar = permisoComprasCancelar;
    }

    public boolean isPermisoComprasDevolucion() {
        return permisoComprasDevolucion;
    }

    public void setPermisoComprasDevolucion(boolean permisoComprasDevolucion) {
        this.permisoComprasDevolucion = permisoComprasDevolucion;
    }

    public boolean isPermisoComprasParcial() {
        return permisoComprasParcial;
    }

    public void setPermisoComprasParcial(boolean permisoComprasParcial) {
        this.permisoComprasParcial = permisoComprasParcial;
    }

    public boolean isPermisoComprasNuevo() {
        return permisoComprasNuevo;
    }

    public void setPermisoComprasNuevo(boolean permisoComprasNuevo) {
        this.permisoComprasNuevo = permisoComprasNuevo;
    }

    public boolean isPermisoComprasNotCredito() {
        return permisoComprasNotCredito;
    }

    public void setPermisoComprasNotCredito(boolean permisoComprasNotCredito) {
        this.permisoComprasNotCredito = permisoComprasNotCredito;
    }

    public boolean isPermisoComprasVer() {
        return permisoComprasVer;
    }

    public void setPermisoComprasVer(boolean permisoComprasVer) {
        this.permisoComprasVer = permisoComprasVer;
    }

    public boolean isPermisoComprasCargarArchivo() {
        return permisoComprasCargarArchivo;
    }

    public void setPermisoComprasCargarArchivo(boolean permisoComprasCargarArchivo) {
        this.permisoComprasCargarArchivo = permisoComprasCargarArchivo;
    }

    public boolean isPermisoComprasBorrarArchivo() {
        return permisoComprasBorrarArchivo;
    }

    public void setPermisoComprasBorrarArchivo(boolean permisoComprasBorrarArchivo) {
        this.permisoComprasBorrarArchivo = permisoComprasBorrarArchivo;
    }

    public boolean isPermisoComprasRecibirOrden() {
        return permisoComprasRecibirOrden;
    }

    public void setPermisoComprasRecibirOrden(boolean permisoComprasRecibirOrden) {
        this.permisoComprasRecibirOrden = permisoComprasRecibirOrden;
    }

    public boolean isOtorgaPermisosCompras() {
        return otorgaPermisosCompras;
    }

    public void setOtorgaPermisosCompras(boolean otorgaPermisosCompras) {
        this.otorgaPermisosCompras = otorgaPermisosCompras;
    }

    public boolean isPermisoProvee() {
        return permisoProvee;
    }

    public void setPermisoProvee(boolean permisoProvee) {
        this.permisoProvee = permisoProvee;
    }

    public boolean isPermisoProveeNuevo() {
        return permisoProveeNuevo;
    }

    public void setPermisoProveeNuevo(boolean permisoProveeNuevo) {
        this.permisoProveeNuevo = permisoProveeNuevo;
    }

    public boolean isPermisoProveeModificar() {
        return permisoProveeModificar;
    }

    public void setPermisoProveeModificar(boolean permisoProveeModificar) {
        this.permisoProveeModificar = permisoProveeModificar;
    }

    public boolean isPermisoProveeVer() {
        return permisoProveeVer;
    }

    public void setPermisoProveeVer(boolean permisoProveeVer) {
        this.permisoProveeVer = permisoProveeVer;
    }

    public boolean isPermisoProveeBorrar() {
        return permisoProveeBorrar;
    }

    public void setPermisoProveeBorrar(boolean permisoProveeBorrar) {
        this.permisoProveeBorrar = permisoProveeBorrar;
    }

    public boolean isOtorgaPermisosProvee() {
        return otorgaPermisosProvee;
    }

    public void setOtorgaPermisosProvee(boolean otorgaPermisosProvee) {
        this.otorgaPermisosProvee = otorgaPermisosProvee;
    }

    public boolean isPermisoPrevio() {
        return permisoPrevio;
    }

    public void setPermisoPrevio(boolean permisoPrevio) {
        this.permisoPrevio = permisoPrevio;
    }

    public boolean isPermisoPrevioNueva() {
        return permisoPrevioNueva;
    }

    public void setPermisoPrevioNueva(boolean permisoPrevioNueva) {
        this.permisoPrevioNueva = permisoPrevioNueva;
    }

    public boolean isPermisoPrevioAbrir() {
        return permisoPrevioAbrir;
    }

    public void setPermisoPrevioAbrir(boolean permisoPrevioAbrir) {
        this.permisoPrevioAbrir = permisoPrevioAbrir;
    }

    public boolean isPermisoPrevioVer() {
        return permisoPrevioVer;
    }

    public void setPermisoPrevioVer(boolean permisoPrevioVer) {
        this.permisoPrevioVer = permisoPrevioVer;
    }

    public boolean isPermisoPrevioCancelar() {
        return permisoPrevioCancelar;
    }

    public void setPermisoPrevioCancelar(boolean permisoPrevioCancelar) {
        this.permisoPrevioCancelar = permisoPrevioCancelar;
    }

    public boolean isPermisoPrevioSeries() {
        return permisoPrevioSeries;
    }

    public void setPermisoPrevioSeries(boolean permisoPrevioSeries) {
        this.permisoPrevioSeries = permisoPrevioSeries;
    }

    public boolean isPermisoPrevioCompra() {
        return permisoPrevioCompra;
    }

    public void setPermisoPrevioCompra(boolean permisoPrevioCompra) {
        this.permisoPrevioCompra = permisoPrevioCompra;
    }

    public boolean isOtorgaPermisosPrevio() {
        return otorgaPermisosPrevio;
    }

    public void setOtorgaPermisosPrevio(boolean otorgaPermisosPrevio) {
        this.otorgaPermisosPrevio = otorgaPermisosPrevio;
    }

    public boolean isPermisoInventario() {
        return permisoInventario;
    }

    public void setPermisoInventario(boolean permisoInventario) {
        this.permisoInventario = permisoInventario;
    }

    public boolean isPermisoProductos() {
        return permisoProductos;
    }

    public void setPermisoProductos(boolean permisoProductos) {
        this.permisoProductos = permisoProductos;
    }

    public boolean isPermisoProductosNuevo() {
        return permisoProductosNuevo;
    }

    public void setPermisoProductosNuevo(boolean permisoProductosNuevo) {
        this.permisoProductosNuevo = permisoProductosNuevo;
    }

    public boolean isPermisoProductosModificar() {
        return permisoProductosModificar;
    }

    public void setPermisoProductosModificar(boolean permisoProductosModificar) {
        this.permisoProductosModificar = permisoProductosModificar;
    }

    public boolean isPermisProductosBorrar() {
        return permisProductosBorrar;
    }

    public void setPermisProductosBorrar(boolean permisProductosBorrar) {
        this.permisProductosBorrar = permisProductosBorrar;
    }

    public boolean isOtorgaPermisosInventario() {
        return otorgaPermisosInventario;
    }

    public void setOtorgaPermisosInventario(boolean otorgaPermisosInventario) {
        this.otorgaPermisosInventario = otorgaPermisosInventario;
    }

    public boolean isPermisoClientes() {
        return permisoClientes;
    }

    public void setPermisoClientes(boolean permisoClientes) {
        this.permisoClientes = permisoClientes;
    }

    public boolean isPermisoClientesNuevo() {
        return permisoClientesNuevo;
    }

    public void setPermisoClientesNuevo(boolean permisoClientesNuevo) {
        this.permisoClientesNuevo = permisoClientesNuevo;
    }

    public boolean isPermisoClientesModificar() {
        return permisoClientesModificar;
    }

    public void setPermisoClientesModificar(boolean permisoClientesModificar) {
        this.permisoClientesModificar = permisoClientesModificar;
    }

    public boolean isPermisoClientesVer() {
        return permisoClientesVer;
    }

    public void setPermisoClientesVer(boolean permisoClientesVer) {
        this.permisoClientesVer = permisoClientesVer;
    }

    public boolean isPermisoClientesBorrar() {
        return permisoClientesBorrar;
    }

    public void setPermisoClientesBorrar(boolean permisoClientesBorrar) {
        this.permisoClientesBorrar = permisoClientesBorrar;
    }

    public boolean isPermisoClientesEnviar() {
        return permisoClientesEnviar;
    }

    public void setPermisoClientesEnviar(boolean permisoClientesEnviar) {
        this.permisoClientesEnviar = permisoClientesEnviar;
    }

    public boolean isOtorgaPermisosClientes() {
        return otorgaPermisosClientes;
    }

    public void setOtorgaPermisosClientes(boolean otorgaPermisosClientes) {
        this.otorgaPermisosClientes = otorgaPermisosClientes;
    }

    public boolean isPermisoVentas() {
        return permisoVentas;
    }

    public void setPermisoVentas(boolean permisoVentas) {
        this.permisoVentas = permisoVentas;
    }

    public boolean isPermisoVentasCancelar() {
        return permisoVentasCancelar;
    }

    public void setPermisoVentasCancelar(boolean permisoVentasCancelar) {
        this.permisoVentasCancelar = permisoVentasCancelar;
    }

    public boolean isPermisoVentasDevolucion() {
        return permisoVentasDevolucion;
    }

    public void setPermisoVentasDevolucion(boolean permisoVentasDevolucion) {
        this.permisoVentasDevolucion = permisoVentasDevolucion;
    }

    public boolean isPermisoVentasParcial() {
        return permisoVentasParcial;
    }

    public void setPermisoVentasParcial(boolean permisoVentasParcial) {
        this.permisoVentasParcial = permisoVentasParcial;
    }

    public boolean isPermisoVentasNueva() {
        return permisoVentasNueva;
    }

    public void setPermisoVentasNueva(boolean permisoVentasNueva) {
        this.permisoVentasNueva = permisoVentasNueva;
    }

    public boolean isPermisoVentasNotCredito() {
        return permisoVentasNotCredito;
    }

    public void setPermisoVentasNotCredito(boolean permisoVentasNotCredito) {
        this.permisoVentasNotCredito = permisoVentasNotCredito;
    }

    public boolean isPermisoVentasVer() {
        return permisoVentasVer;
    }

    public void setPermisoVentasVer(boolean permisoVentasVer) {
        this.permisoVentasVer = permisoVentasVer;
    }

    public boolean isPermisoVentasEnviar() {
        return permisoVentasEnviar;
    }

    public void setPermisoVentasEnviar(boolean permisoVentasEnviar) {
        this.permisoVentasEnviar = permisoVentasEnviar;
    }

    public boolean isPermisoVentasTimbrar() {
        return permisoVentasTimbrar;
    }

    public void setPermisoVentasTimbrar(boolean permisoVentasTimbrar) {
        this.permisoVentasTimbrar = permisoVentasTimbrar;
    }

    public boolean isPermisoVentasEntregar() {
        return permisoVentasEntregar;
    }

    public void setPermisoVentasEntregar(boolean permisoVentasEntregar) {
        this.permisoVentasEntregar = permisoVentasEntregar;
    }

    public boolean isPermisoVentasComprobar() {
        return permisoVentasComprobar;
    }

    public void setPermisoVentasComprobar(boolean permisoVentasComprobar) {
        this.permisoVentasComprobar = permisoVentasComprobar;
    }

    public boolean isPermisoVentasAcuse() {
        return permisoVentasAcuse;
    }

    public void setPermisoVentasAcuse(boolean permisoVentasAcuse) {
        this.permisoVentasAcuse = permisoVentasAcuse;
    }

    public boolean isPermisoVentasObtenerXml() {
        return permisoVentasObtenerXml;
    }

    public void setPermisoVentasObtenerXml(boolean permisoVentasObtenerXml) {
        this.permisoVentasObtenerXml = permisoVentasObtenerXml;
    }

    public boolean isPermisoVentasFacturar() {
        return permisoVentasFacturar;
    }

    public void setPermisoVentasFacturar(boolean permisoVentasFacturar) {
        this.permisoVentasFacturar = permisoVentasFacturar;
    }

    public boolean isPermisoVentasCargarArchivo() {
        return permisoVentasCargarArchivo;
    }

    public void setPermisoVentasCargarArchivo(boolean permisoVentasCargarArchivo) {
        this.permisoVentasCargarArchivo = permisoVentasCargarArchivo;
    }

    public boolean isPermisoVentasBorrarArchivo() {
        return permisoVentasBorrarArchivo;
    }

    public void setPermisoVentasBorrarArchivo(boolean permisoVentasBorrarArchivo) {
        this.permisoVentasBorrarArchivo = permisoVentasBorrarArchivo;
    }

    public boolean isOtorgaPermisosVentas() {
        return otorgaPermisosVentas;
    }

    public void setOtorgaPermisosVentas(boolean otorgaPermisosVentas) {
        this.otorgaPermisosVentas = otorgaPermisosVentas;
    }

    public boolean isPermisoCotiza() {
        return permisoCotiza;
    }

    public void setPermisoCotiza(boolean permisoCotiza) {
        this.permisoCotiza = permisoCotiza;
    }

    public boolean isPermisoCotizaNueva() {
        return permisoCotizaNueva;
    }

    public void setPermisoCotizaNueva(boolean permisoCotizaNueva) {
        this.permisoCotizaNueva = permisoCotizaNueva;
    }

    public boolean isPermisoCotizaAbrir() {
        return permisoCotizaAbrir;
    }

    public void setPermisoCotizaAbrir(boolean permisoCotizaAbrir) {
        this.permisoCotizaAbrir = permisoCotizaAbrir;
    }

    public boolean isPermisoCotizaVer() {
        return permisoCotizaVer;
    }

    public void setPermisoCotizaVer(boolean permisoCotizaVer) {
        this.permisoCotizaVer = permisoCotizaVer;
    }

    public boolean isPermisoCotizaCancelar() {
        return permisoCotizaCancelar;
    }

    public void setPermisoCotizaCancelar(boolean permisoCotizaCancelar) {
        this.permisoCotizaCancelar = permisoCotizaCancelar;
    }

    public boolean isPermisoCotizaReenviar() {
        return permisoCotizaReenviar;
    }

    public void setPermisoCotizaReenviar(boolean permisoCotizaReenviar) {
        this.permisoCotizaReenviar = permisoCotizaReenviar;
    }

    public boolean isPermisoCotizaVenta() {
        return permisoCotizaVenta;
    }

    public void setPermisoCotizaVenta(boolean permisoCotizaVenta) {
        this.permisoCotizaVenta = permisoCotizaVenta;
    }

    public boolean isOtorgaPermisosCotiza() {
        return otorgaPermisosCotiza;
    }

    public void setOtorgaPermisosCotiza(boolean otorgaPermisosCotiza) {
        this.otorgaPermisosCotiza = otorgaPermisosCotiza;
    }

    public boolean isPermisoCxc() {
        return permisoCxc;
    }

    public void setPermisoCxc(boolean permisoCxc) {
        this.permisoCxc = permisoCxc;
    }

    public boolean isPermisoPagoNuevo() {
        return permisoPagoNuevo;
    }

    public void setPermisoPagoNuevo(boolean permisoPagoNuevo) {
        this.permisoPagoNuevo = permisoPagoNuevo;
    }

    public boolean isPermisoCancelarPago() {
        return permisoCancelarPago;
    }

    public void setPermisoCancelarPago(boolean permisoCancelarPago) {
        this.permisoCancelarPago = permisoCancelarPago;
    }

    public boolean isOtorgaPermisoCxc() {
        return otorgaPermisoCxc;
    }

    public void setOtorgaPermisoCxc(boolean otorgaPermisoCxc) {
        this.otorgaPermisoCxc = otorgaPermisoCxc;
    }

    public boolean isPermisProductosListaPrecio() {
        return permisProductosListaPrecio;
    }

    public void setPermisProductosListaPrecio(boolean permisProductosListaPrecio) {
        this.permisProductosListaPrecio = permisProductosListaPrecio;
    }

    public boolean isPermisProductosCargadoImagen() {
        return permisProductosCargadoImagen;
    }

    public void setPermisProductosCargadoImagen(boolean permisProductosCargadoImagen) {
        this.permisProductosCargadoImagen = permisProductosCargadoImagen;
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

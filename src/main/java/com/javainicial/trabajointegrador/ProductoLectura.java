/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javainicial.trabajointegrador;

import java.util.Date;

/**
 *
 * @author spike
 */
public abstract class ProductoLectura {
    private Date fechaPublicacion;
    private String nombreEditorial;
    private double precioDeCompra;
    private boolean esDigital;
    private int codigo;
    
    public ProductoLectura(int unCodigo, Date unaFecha,String unNombreEditorial, double unPrecioCompra, boolean unValor){
        this.fechaPublicacion = unaFecha;
        this.nombreEditorial = unNombreEditorial;
        this.precioDeCompra= unPrecioCompra;
        this.esDigital = unValor;
        this.codigo = unCodigo;}

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String unNombreEditorial) {
        this.nombreEditorial = unNombreEditorial;
    }

    public double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(double unPrecioDeCompra) {
        this.precioDeCompra = unPrecioDeCompra;
    }

    public boolean isEsDigital() {
        return esDigital;
    }

    public void setEsDigital(boolean unBooleano) {
        this.esDigital = unBooleano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int unCodigo) {
        this.codigo = unCodigo;
    }
    
    
    /**
     *
     * @return Se calcula el precio de venta en las clases hijas Revista y Libro.
     */
    public abstract double calcularPrecioVenta();
    
    public abstract String mostrarDetalles();
    
}

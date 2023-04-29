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
public class Libro extends ProductoLectura{
    private String titulo;
    private String autorPrincipal;
    
    public Libro(String unTitulo, String unAutorPrincipal, int unCodigo, Date unaFecha, String unaEditorial, double unPrecioCompra, boolean unValor){
        super(unCodigo,unaFecha,unaEditorial,unPrecioCompra,unValor);
        this.titulo = unTitulo;
        this.autorPrincipal = unAutorPrincipal;
        
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }
    
    @Override
    public double calcularPrecioVenta(){
    double preciofinal = 0;
        if(this.isEsDigital()){
        preciofinal = super.getPrecioDeCompra()+super.getPrecioDeCompra()*0.08;
        }
        else{
        preciofinal = super.getPrecioDeCompra()+super.getPrecioDeCompra()*0.18;
        }
        return preciofinal;
    }
    
    @Override
    public  String mostrarDetalles(){
        return "*Código de Libro: "+super.getCodigo()+"\n*Título de Libro: "+this.titulo+"\n*Autor: "+this.autorPrincipal+"\n*Fecha de publicación: "+super.getFechaPublicacion()+"\n*Precio de Venta:"+this.calcularPrecioVenta();
    }
    
    
    
    
}

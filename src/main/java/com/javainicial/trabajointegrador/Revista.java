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
public class Revista extends ProductoLectura{
   private String nombre;
   
   
    public Revista(String unNombre, int unCodigo, Date unaFecha, String unaEditorial, double unPrecioCompra, boolean unValor){
        super(unCodigo,unaFecha,unaEditorial,unPrecioCompra,unValor);
        this.nombre = unNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   @Override
    public double calcularPrecioVenta(){
        double preciofinal = 0;
        if(this.isEsDigital()){
        preciofinal = super.getPrecioDeCompra()+super.getPrecioDeCompra()*0.12;
        }
        else{
        preciofinal = super.getPrecioDeCompra()+super.getPrecioDeCompra()*0.22;
        }
        return preciofinal;
    }
    
   @Override
    public String mostrarDetalles(){
        return "*Código de Revista: "+super.getCodigo()+"\n*Nombre de Revista: "+this.nombre+"\n*Fecha de publicación: "+super.getFechaPublicacion()+"\n*Precio de Venta:"+this.calcularPrecioVenta();
    }
    
}

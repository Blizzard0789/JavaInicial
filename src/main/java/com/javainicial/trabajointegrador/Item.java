/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javainicial.trabajointegrador;


/**
 *
 * @author spike
 */
public class Item {
   private int cantidad;
   private ProductoLectura producto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int unaCantidad) {
        this.cantidad = unaCantidad;
    }

    public ProductoLectura getProducto() {
        return producto;
    }

    public void setProducto(ProductoLectura producto) {
        this.producto = producto;
    }
    
    public String mostrarItem(){
        return this.producto.mostrarDetalles();
    }
    
    public double getPrecioProducto(){
        return this.getProducto().calcularPrecioVenta();
    
    }
   
   
}

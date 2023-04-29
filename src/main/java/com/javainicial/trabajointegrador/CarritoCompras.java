/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javainicial.trabajointegrador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spike
 * Clase Carrito de compras
 */
public class CarritoCompras {
    private List<Item> listaItem;
    
    public CarritoCompras(){
    this.listaItem = new ArrayList<Item>();
    }
    
    public void agregarItem(Item unItem){
        this.listaItem.add(unItem);
    }
    public void eliminarItem(Item unItem){
        this.listaItem.remove(unItem);
    }
    public void mostrarItems(){
        for(Item unItem: this.listaItem){
            System.out.println(unItem.mostrarItem()+"\n*Cantidad: "+unItem.getCantidad());
            System.out.println("------------------------------------------------------------");
        }
    }
    public double calcularTotal(){
        double contador = 0;
        for(Item unItem: this.listaItem){
            contador =  contador + unItem.getPrecioProducto()*unItem.getCantidad();
        }
        return contador;
    }
}

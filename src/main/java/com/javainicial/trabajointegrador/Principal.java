/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.javainicial.trabajointegrador;

import java.util.Scanner;

/**
 *
 * @author spike
 */
public class Principal {

    public static void main(String[] args) {
        
        //Mensaje de Bienvenida
        System.out.println("JAVA INICIAL: Trabajo Integrador");
        CarritoCompras miCarrito = new CarritoCompras();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primero es necesario crear el stock de Revistas/Libros");
        
        //Crear un gestor de Stock para agregar Libros o Revistas al Inventario.
        GestionadorDeStock gestor = new GestionadorDeStock();
        //gestor.instanciarListado();
        gestor.generarStock();
        gestor.mostrarStockProductos();
        System.out.println("*******************************************************************");
        System.out.println("¿Desea agregar alguno de los items mostrados al carrito? (si/no)");
        String respuesta = teclado.next();
        while("si".equals(respuesta) && !"no".equals(respuesta)){
            Item unItem = new Item();
            int nroOrden = 0;
            int cantidad = 0;
            System.out.print("Ingresar el número de orden del producto que desea agregar al carrito: ");
            nroOrden = teclado.nextInt();
            unItem.setProducto(gestor.productoExtraido(nroOrden));
            System.out.print("Cantidad a agregar: ");
            cantidad = teclado.nextInt();
            unItem.setCantidad(cantidad);
            miCarrito.agregarItem(unItem);
            System.out.println("Item agregado correctamente");
            System.out.println("¿Desea agregar alguno de los items mostrados al carrito? (si/no)");
            respuesta = teclado.next();            
        }
        System.out.println("Se terminó de agregar Items al carrito");
        System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");
        System.out.println("Se muestran los items del carrito:");
        System.out.println("*******************************************************************");
        miCarrito.mostrarItems();
        System.out.println("**************[ MONTO TOTAL: "+ miCarrito.calcularTotal()+" ]**************");
        
        
        //System.out.println(unItem.mostrarItem()+"\nCantidad: "+unItem.getCantidad());
        
    }
    
}

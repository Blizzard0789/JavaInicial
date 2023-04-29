/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javainicial.trabajointegrador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spike
 * Esta clase, debido a que el programa no hace uso de base de datos, sirve para que el usuario pueda
 * agregar los items manualmente.
 * 
 */
public class GestionadorDeStock {
    List<ProductoLectura> stockProductoLectura;
    
    public GestionadorDeStock(){
    this.stockProductoLectura = new ArrayList<ProductoLectura>();
    }
    /**
     *
     */
    
    public void generarStock(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.print("Para agregar un LIBRO ingrese *1*, para una REVISTA ingrese *2*. Para salir *-1*: ");
        int tipoLibro = 0;
        while(tipoLibro!=-1){
            tipoLibro = teclado.nextInt();
            if(tipoLibro==1){
                System.out.println("Se ingresarán datos de revista: ");
                System.out.println("******************************************************************");
                System.out.print("Ingrese código de revista: ");
                int codigoRevista = teclado.nextInt();
                System.out.print("Ingrese nombre de revista:");
                String nombreRevista = teclado.next();
                System.out.print("ingrese la fecha de publicación (dd/mm/yyyy): ");
                String fechaRevistaTexto = teclado.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                Date fechaRevista = null;
                try {
                    fechaRevista = sdf.parse(fechaRevistaTexto);
                } catch (ParseException ex) {
                    System.out.println("Se produjo un error de parseo en la fecha");
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("Ingrese la editorial: ");
                String editorialRevista = teclado.next();
                System.out.print("Ingrese el precio de compra: ");
                double precioCompraRevista = teclado.nextDouble();
                System.out.print("Es formato digital (si/no): ");
                boolean valor = false;
                String unvalor = teclado.next();
                if("si".equals(unvalor)){
                    valor = true;
                }else if("no".equals(unvalor)){
                    valor = false;
                }
                ProductoLectura revista = new Revista(nombreRevista,codigoRevista,fechaRevista,editorialRevista,precioCompraRevista,valor);
                this.stockProductoLectura.add(revista);
                System.out.println("Revista ingresada correctamente");
            }
            else if(tipoLibro==2){
                System.out.println("Se ingresarán datos de Lbro");
                System.out.print("Ingrese código de libro: ");
                int codigoLibro = teclado.nextInt();
                System.out.print("Ingrese título de libro: ");
                String tituloLibro = teclado.next();
                System.out.print("Ingresar el nombre del autor: ");
                String autorPrincipal = teclado.next();
                System.out.print("Ingrese la fecha de publicación (dd/mm/yyyy): ");
                String fechaLibroTexto = teclado.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                Date fechaLibro = null;
                try {
                    fechaLibro = sdf.parse(fechaLibroTexto);
                } catch (ParseException ex) {
                    System.out.println("Se produjo un error de parseo en la fecha");
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("Ingrese la editorial: ");
                String editorialLibro = teclado.next();
                System.out.print("Ingrese el precio de compra: ");
                double precioCompraLibro = teclado.nextDouble();
                System.out.print("Es formato digital: ");
                boolean valor = false;
                String unvalor = teclado.next();
                if("si".equals(unvalor)){
                    valor = true;
                }else if("no".equals(unvalor)){
                    valor = false;
                }
                ProductoLectura libro = new Libro(tituloLibro,autorPrincipal,codigoLibro,fechaLibro,editorialLibro,precioCompraLibro,valor);
                this.stockProductoLectura.add(libro);
                System.out.println("Libro agregado correctamente ingresada correctamente");
            }
            System.out.println("Para agregar un LIBRO ingrese *1*, para una REVISTA ingrese *2*. Para salir, *-1*: ");
            tipoLibro = teclado.nextInt();
            
        }
        System.out.println("Se terminó la carga de revistas y libros");
        System.out.println("-------------------------------------------------------");
    }
    
    //public void instanciarListado(){
    //this.stockProductoLectura = new ArrayList<ProductoLectura>();
    //}
    
    public void mostrarStockProductos(){
        for(int i=0;i<this.stockProductoLectura.size();i++){
            ProductoLectura p = this.stockProductoLectura.get(i);
            System.out.println("****Item Stock: "+i+"****");
            System.out.println(p.mostrarDetalles());
        }
    }
    
    public ProductoLectura productoExtraido(int unIndice){
    return this.stockProductoLectura.get(unIndice);
    
    }

 
    
       
}

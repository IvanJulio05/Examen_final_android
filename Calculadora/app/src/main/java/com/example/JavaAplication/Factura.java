package com.example.JavaAplication;

import java.util.ArrayList;

public class Factura implements Imprimible{

    ArrayList<Producto> productos;
    int suma=0;
    public Factura(ArrayList<Producto> productos){
        this.productos=productos;
    }

    @Override
    public void imprimir() {
        System.out.println("FACTURA");
        for(Producto p:productos){
            System.out.println(p.toString());
            suma+=p.precio;
        }
        System.out.println("Total: "+suma);
    }
}

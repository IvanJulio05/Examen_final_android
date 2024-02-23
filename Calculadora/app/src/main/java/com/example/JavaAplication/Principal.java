package com.example.JavaAplication;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ProductoLiquido pl1=new ProductoLiquido(1500,"01/01/2025","Cristal",1);
        ProductoLiquido pl2=new ProductoLiquido(2500,"01/01/2030","Bonatura",2);

        //poductos solidos
        ProductoSolido ps1 = new ProductoSolido(65000,"01/02/2026","martillo",3);
        ProductoSolido ps2 = new ProductoSolido(65000,"01/02/2026","pala",6);

        //Array

        ArrayList<Producto> productos= new ArrayList<>();

        //agregando los productos
        productos.add(pl1);
        productos.add(pl2);
        productos.add(ps1);
        productos.add(ps2);

        //mostrando factura

        Factura factura = new Factura(productos);


    }

}

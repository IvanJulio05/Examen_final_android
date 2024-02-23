package com.example.JavaAplication;

public class ProductoLiquido extends Producto{

    int litros;

    public ProductoLiquido(int precio,String fechaVencimiento,String nombre,int litros){
        super(precio,fechaVencimiento,nombre);
        this.litros=litros;
    }


    public String toString(){
        return super.toString()+"Litros: "+this.litros;
    }
}

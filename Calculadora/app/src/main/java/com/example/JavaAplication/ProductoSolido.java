package com.example.JavaAplication;

public class ProductoSolido extends Producto{
    int libras;

    public ProductoSolido(int precio,String fechaVencimiento,String nombre,int libras){
        super(precio,fechaVencimiento,nombre);
        this.libras=libras;
    }


    public String toString(){
        return super.toString()+"Libras: "+this.libras;
    }

}

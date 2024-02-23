package com.example.JavaAplication;

public abstract class  Producto{

    int precio;
    String fechaVencimiento;

    String nombre;

    public Producto(int precio,String fechaVencimiento,String nombre){
        this.precio=precio;
        this.nombre=nombre;
        this.fechaVencimiento=fechaVencimiento;
    }


    public String toString(){
        return "Nombre: "+this.nombre+"Precio: "+this.precio+"Fecha de Vencimiento"+fechaVencimiento;
    }



}

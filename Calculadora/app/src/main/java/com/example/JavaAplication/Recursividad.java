package com.example.JavaAplication;

public class Recursividad {

    public static void main(String[] args) {

        int numero=16;


        System.out.println(dividir(numero));

    }

    public static int dividir(int numero){

        if(numero==1 || numero <1){
            return 1;
        }
        else{
            System.out.print(numero+"-");
            return dividir(numero/2);
        }

    }

}

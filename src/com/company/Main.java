package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        suma(10,20,30);

        Coche autoMazda = new Coche();
        autoMazda.incremento();
        System.out.println(autoMazda.numPuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int numPuertas;

    public void incremento(){
        this.numPuertas++;
    }
}

package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        int numeroif = 0;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "MARTES";

        /*condicionales*/
        if (numeroif > 0){
            System.out.println("Es positivo");
        }else if(numeroif < 0){
            System.out.println("Es negativo");
        }
        else if(numeroif == 0){
            System.out.println("Es cero");
        }

        /*while*/
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /*do while*/
        do{
            System.out.println(numeroWhile);
        }while(numeroWhile == 0);

        /*for*/
        for(int i = 0; i <= 3; i++){
            System.out.println(i);
        }

        /*switch*/
        switch(estacion){
            case "VERANO":
                System.out.println("nos encontramos en la estacion de VERANO");
                break;
            case "INVIERNO":
                System.out.println("nos encontramos en la estacion de VERANO");
                break;
            case "OTOÑO":
                System.out.println("nos encontramos en la estacion de VERANO");
                break;
            case "PRIMAVERA":
                System.out.println("nos encontramos en la estacion de VERANO");
                break;
            default:
                System.out.println("El valor ingresado no es una estacion");
        }



    }
}

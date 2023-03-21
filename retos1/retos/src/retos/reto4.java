package retos;

import java.util.Random;
import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {

        int apuesta; 
        int compu, jugador;
        
           Scanner papt =new Scanner(System.in);
    
           System.out.print("ingrese su apuesta"); 
           apuesta = papt.nextInt(); 
    
           System.out.print("ingrese que quiere elegir: 2 tijera, 3 papel, 4 piedra: ");
           jugador = papt.nextInt(); 
           
          Random random=new Random();
    
    compu=random.nextInt(3);
    if (compu==2 ) {
        if (jugador==4 ) {
        System.out.print("HA GANADO POR QUE LA COMPUTADORA SACO TIJERA");
        apuesta *=2;
        }
       else if (jugador==3) {
        System.out.print("HA GANADO LA COMPUTADORA POR QUE SACO TIJERA");
        apuesta =0;
       }
       else {
        System.out.print("NO HAY GANADOR POR QUE LA COMPUTADORA SACO TIJERA");
        apuesta *=1;
       }
    } 
    else if (compu==4) {
        if (jugador==4) {
            System.out.print("NO HAY GANADOR POR QUE LA COMPUTADORA SACO PIEDRA");
        }
       else if (jugador==3) {
        System.out.print("HA GANADO POR QUE LA COMPUTADORA SACO PIEDRA");
        apuesta *=2;
       }
       else {
        System.out.print("GANO LA COMPUTADORA POR QUE SACO PIEDRA");
        apuesta *=1;
       } 
    }
    else {
        if (jugador==4) {
            System.out.print("HA GANADO LA COMPUTADORA POR QUE SACO PAPEL");
            apuesta =0;
        }
       else if (jugador==3) {
        System.out.print("NO HAY GANADOR POR QUE LA MAQUINA SACO PAPEL");
        apuesta *=1;
       }
       else {
        System.out.print("HA GANADO POR QUE LA MAQUINA SACO PAPEL");
        apuesta *=2;
       } 
    
    }
    System.out.print(" SU DINERO ES " + apuesta);
    papt.close();
    }
}


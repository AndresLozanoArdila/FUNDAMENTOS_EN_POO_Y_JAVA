package retos;

import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String args[]) {

     
        Scanner carasello=new Scanner(System.in);
        int apuesta,jugador,computadora;
        
        System.out.println("elija la cantidad de dinero que quiere apostar"); 
        apuesta = carasello.nextInt();        
        
        System.out.println("ingrese que parte de la moneda quiere elegir: 0 cara 1 sello"); 
        jugador = carasello.nextInt();
            
        Random random=new Random();
        computadora=random.nextInt(2);
        
        if(jugador==computadora)
        {
        System.out.print("Usted ha ganado");
        apuesta += 2;
        } else {
        System.out.print("gana la computadora"); 
        apuesta = 0;
        
        
        
        }    
        System.out.println(" SU DINERO ES " + apuesta); 
        carasello.close();
    }
}


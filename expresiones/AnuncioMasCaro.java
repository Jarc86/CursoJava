/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;
import java.util.Scanner;

/**
 *
 * @author juan
 */

public class AnuncioMasCaro {
    public static final int segundosEn24h = 86400;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce duración anuncio");
        
        int hora =  sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        
        // -----------  Convierte la duración del anuncio en segundos ----------
        int segundos_anuncio = ((hora*3600) + (minutos*60) + segundos);
        
        // -----------  Le resta la duracion del anuncio en segundos
        // -----------  a los segundos que tiene un día
        int calculo = segundosEn24h - segundos_anuncio;
        
        // ----------- Convierte las horas, minutos y segundos 
        // ----------- que le quedan al dia una vez restado el anuncio
        hora = calculo/3600;
        int segundos_restantes = calculo%3600;
        minutos = segundos_restantes/60;
        segundos = segundos_restantes%60;
        
        System.out.println(hora+":"+minutos+":"+segundos);
    }
    
}

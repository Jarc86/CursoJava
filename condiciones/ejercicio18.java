/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;
import java.util.*;
/**
 *
 * @author juan
 */
public class ejercicio18 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        //################# Introduccion de datos ####################
        System.out.println("Introduce hora:");
        int hora = sc.nextInt();
        System.out.println("Introduce minutos");
        int minutos = sc.nextInt();
        System.out.println("Introduce segundos");
        int segundos = sc.nextInt();
        
        //################ Comprobación ##############################
        if ((hora > 24)||(minutos>60)||(segundos>60))
            System.out.println("Hora no valida.");
        else
            System.out.println("La hora es válida.");
    }
}

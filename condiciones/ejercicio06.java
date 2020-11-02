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
public class ejercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un dia de la semana");
        String dia=sc.nextLine();
        dia=dia.toLowerCase();
        
        switch (dia){
            case "lunes":
                System.out.println("A primera hora tienes FOL");
                break;
              
            case "martes":
                System.out.println("A primera hora tienes Sistemas");
                break;
            
            case "miercoles":
                System.out.println("A primera hora tienes BBDD");
                break;
                
            case "jueves":
                System.out.println("A primera hora tienes Programacion");
                break;
                
            case "viernes":
                System.out.println("A primera hora tienes Entornos");
                break;
                
            default:
                System.out.println("No has introducido un dia de lunes a viernes");
                break;
        }
    }
}

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
public class ejercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de alumno:");
        String nombre=sc.nextLine();
        
        System.out.println("Introduce nota de prácticas:");
        float practica=sc.nextFloat();
        
        System.out.println("Introduce nota de problemas");
        float problemas=sc.nextFloat();
        
        System.out.println("Introduce nota de teórica");
        float teorica=sc.nextFloat();
        /*
        float nota_practica = (practica*10)/10;
        float nota_problemas =(problemas*50)/10;
        float nota_teorica = (teorica*40)/10;
        */
        
        float notaFinal= (((practica*0.1f) + (problemas*0.5f) + (teorica*0.4f)));
        
        System.out.println(notaFinal);
    }
}

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
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce mes: ");
        String mes = sc.nextLine().toLowerCase();
        
        
        System.out.println("Introduce importe:");
        double importe = sc.nextDouble();
        
        if (mes.equals("octubre")){
            double resultado=importe-(importe*0.15);
            System.out.println(Math.round(resultado*100.0)/100.0);
        }
        else
            System.out.println("El importe a cobrar es: "+importe);
        
        
    }
    
}

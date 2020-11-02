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
public class ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero");
        int input = sc.nextInt();
        
        if ((input%2) != 0)
            System.out.println("El número introducido es impar.");
        else
            System.out.println("El número introducido es par.");
    }
    
}

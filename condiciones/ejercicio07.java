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
public class ejercicio07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una letra");
        char letra1=sc.nextLine().charAt(0);
        
        System.out.println("Introduce una letra");
        char letra2=sc.nextLine().charAt(0);
        
        if (letra1 == letra2)
            System.out.println("Ambas letras son iguales");
        else
            System.out.println("Has introducido dos letras distintas");
        
    }
}

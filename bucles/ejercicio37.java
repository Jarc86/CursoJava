/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
import java.util.*;
/**
 *
 * @author juan
 */
public class ejercicio37 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int input=0, suma=0, contador=0;
        
        do {
            System.out.println("Introduce numero");
            input = sc.nextInt();
            
            suma += input;
            contador++;
        } while (suma < 1000);
        
        System.out.println("La suma asciende a: "+suma);
        System.out.println("La se ha introducido "+contador+" números");
        System.out.println("La media es :"+(suma/contador));
        
    }
}

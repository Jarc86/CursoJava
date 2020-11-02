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
public class ejercicio26 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input,maximo =0,sumaImpares=0;
        double contador = 0;
        
        System.out.println("Introduce número (introduce negativo para salir):");
        input = sc.nextInt();
        
        while (input > 0) {
            contador++;
            
            if (input%2 == 0) {
                maximo = (input > maximo)?input:maximo;
            } else {   
                sumaImpares += input;
            }
            input = sc.nextInt();
        }
        System.out.println("Numeros introducidos: "+(int)contador);
        System.out.println("Media de impares: "+(sumaImpares/contador));
        System.out.println("Mayor de los pares: "+maximo);
    }
}

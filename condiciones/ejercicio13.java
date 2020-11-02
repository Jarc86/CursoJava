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
public class ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int valor = sc.nextInt();
        //Positivo o negativo
        if(valor < 0)
            System.out.println("Número negativo");
        else
            System.out.println("Número positivo");
        //Par o impar
        if (valor%2 == 0)
            System.out.println("Número par");
        else
            System.out.println("Número impar");
        //Múltiplo de 5
        if (valor%5 == 0)
            System.out.println("Número multiplo de 5");
        if (valor%10 == 0)
            System.out.println("Número no es múltiplo de 5");
        //Mayor o menor de 100
        if (valor<100)
            System.out.println("Número menor de 100");
        else if (valor > 100)
            System.out.println("Número mayor de 100");
    }
}

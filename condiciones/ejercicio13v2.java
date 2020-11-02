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
public class ejercicio13v2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int valor = sc.nextInt();
        //Positivo o negativo
        System.out.println((valor > 0)?"Número positivo":"Número Negativo");
        //Par o impar
        System.out.println((valor%2 == 0)?"Número par":"Número impar");
        //Múltiplo de 5
        System.out.println((valor%5 == 0)?"Número múltiplo de 5":"Número no múltiplo de 5");
        //Multiplo de 10
        System.out.println((valor%10 == 0)?"Número múltiplo de 10":"Número no múltiplo de 10");
        //Mayor o menor de 100
        System.out.println((valor > 100)&&(valor != 100)?"Número mayor que 100":"Número menor que 100");
    }
}
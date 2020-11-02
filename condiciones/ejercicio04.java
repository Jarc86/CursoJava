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
public class ejercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un entero");
        int valor1=sc.nextInt();
        
        System.out.println("Introduce un segundo numero entero");
        int valor2=sc.nextInt();
        
        if (valor1%valor2 == 0)
            System.out.printf("%d es multiplo de %d\n",valor1,valor2);
        else
            System.out.printf("%d no es multiplo de %d\n",valor1,valor2);
        
        if (valor2%valor1 == 0)
            System.out.printf("%d es multiplo de %d\n",valor2,valor1);
        else
            System.out.printf("%d no es multiplo de %d\n",valor2,valor1);
    }
}

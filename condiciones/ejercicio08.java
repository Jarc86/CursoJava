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
public class ejercicio08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter");
        
        char caracter= sc.nextLine().charAt(0);
        
        int ascii = (int) caracter;
        
        if ((ascii >= 65)&&(ascii <= 90))
            System.out.println("Letra Mayúscula");
        else if ((ascii >= 97)&&(ascii <= 122))
            System.out.println("Letra Minúscula");
        else if ((ascii >= 48)&&(ascii <= 57))
            System.out.println("Digito del 0 al 9");
        else if ((ascii >= 65)&&(ascii <= 90))
            System.out.println("");
        else if (ascii == 32)
            System.out.println("Espacio en blanco");
        else if (((ascii == 40) && (ascii == 41))||((ascii == 123) && (ascii == 125)))
            System.out.println("Parentesis o corchetes");
        else
            System.out.println("Otro simbolo");
            
    }
}

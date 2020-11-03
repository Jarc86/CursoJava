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
public class ejercicio35v2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input;
        boolean salir = false;
        int intentos=0;
        
        while (!salir && intentos != 3) {
            
            System.out.println("Introduce Pass");
            input = sc.nextLine();
            
            if (input.equals("eureka")) {
                salir = true;
            }else{
                intentos++;
            }               
        }
        if (!salir)
            System.out.println("Has agotado tus 3 intentos");
    }
}

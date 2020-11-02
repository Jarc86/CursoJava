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
public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora, sin minutos");
        
        int hora = sc.nextInt();
        
        if(hora >= 6 && hora <=12)
            System.out.println("Buenos días");
        else if (hora >= 13 && hora <= 20)
            System.out.println("Buenas tardes");
        else if (hora >= 21 || hora <= 5)
            System.out.println("Buenas noches");
    }
}

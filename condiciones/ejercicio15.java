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
public class ejercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Tiene título de Bachiller?");
        
        if (sc.nextLine().toLowerCase().equals("si"))
            System.out.println("Puede acceder al ciclo");
        else {
            System.out.println("¿Ha superado la prueba de acceso?");
            if (sc.nextLine().toLowerCase().equals("si")){
                System.out.println("Puede acceder al ciclo");
            } else{
                System.out.println("No puede acceder al ciclo");
            }
        }
        
    }
}

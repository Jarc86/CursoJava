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
public class ejercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Tiene bachiller?\nEscribe \"Si\" o \"No\"\n");
        
        String bachiller = sc.nextLine();
        bachiller = bachiller.toUpperCase();
        
        switch (bachiller){
            case "SI":
                System.out.println("Puedes acceder a un ciclo superior");
                break;
                
            case "NO":
                System.out.printf("¿Has superado la prueba de acceso al ciclo?\nIntroduce \"Si\" o \"No\"\n");
                String prueba = sc.nextLine();
                prueba = prueba.toUpperCase();
                
                if (prueba.equals("SI"))
                    System.out.println("Puedes acceder al ciclo");
                else
                    System.out.println("No puedes acceder al ciclo");
                break;
        }
    }
}

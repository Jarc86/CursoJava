package condiciones;
import java.util.*;

/**
 *
 * @author usuario
 */
public class vacasV2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //---------- Introducion Datos ------------------------
        System.out.println("Vacas Marrones: ");
        int vacasMarrones = sc.nextInt();
        System.out.println("Kilos Negra: ");
        int kilosN = sc.nextInt();
        
        //----------- Se resuelven las ecuaciones -------------
        int kilosMarrones = kilosN*2;       
        int vacasNegras = vacasMarrones/2;
        
        //---------- Resuelve totales de vacas y kilos --------
        //Solo se muestran los totales si el nº vacas marrones es par
        if ((vacasMarrones%2) == 0){
            System.out.println("Vacas Totales: "+(vacasNegras+vacasMarrones));
            System.out.println("Kilos totales necesarios: "+ ((kilosN*vacasNegras) + (kilosMarrones*vacasMarrones)));
        } else {
            System.out.println("¡ANIMAL!");
        }   
    }
}
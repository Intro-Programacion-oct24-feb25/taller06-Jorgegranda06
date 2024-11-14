/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double numero1;
        double numero2;
        int tipooperacion;
        double resultado;
        System.out.println("Ingrese el tipo de operacion que desee utilizar:"
                + "1. suma\n2. resta\n3. multiplicacion\n4. division5. modulo"
                + "\n7. potencia\n");
        tipooperacion=entrada.nextInt();
        System.out.println("Ingrese el primer valor");
        numero1= entrada.nextDouble();
        
        System.out.println("Ingrese el segundo valor");
        numero2= entrada.nextDouble();
        
        if (numero1>=numero2) {
            switch (tipooperacion) {
                case 1:
                    resultado= numero1+numero2;
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
        }
    }
    
}

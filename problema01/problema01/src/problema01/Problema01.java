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
        double num1;
        double num2;
        double resultado;
        resultado = 0;
        String operacion;
        System.out.println("Ingrese el numero 1:");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el numero 2:");
        num2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Que operacion desea ejecutar:");
        operacion = entrada.nextLine();
        operacion = operacion.toLowerCase();
        
        if (num1 > num2){
            switch(operacion){
                case "suma":
                    resultado = num1 + num2;
                break;
                case "resta":
                    resultado = num1 - num2;
                break;
                case "multiplicacion":
                    resultado = num1 * num2;
                break;
                case "division":
                    resultado = num1/num2;
                break;
                case "modulo":
                    resultado = num1 % num2;
                break;
                case "potencia":
                    resultado = Math.pow(num1, num2);
                break;   
                
            }
            System.out.printf("El resultado es: %.2f\n", resultado);
        }else{
            System.out.printf("El resultado no es posible\n");
        }
            
    }
}
    
    


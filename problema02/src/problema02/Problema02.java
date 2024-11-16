/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        int tipoVehiculo;
        double valorVehiculo;
        double peaje = 0;
        String tipoVehiculoTexto = "";

       
        System.out.printf("tipo 1: vehículo liviano particular",
                "tipo 2: vehículo grande particular",
                "tipo 3: taxi",
                "tipo 4: bus urbano\n");
        System.out.println("Seleccione el tipo de vehículo: ");
        tipoVehiculo = entrada.nextInt();
        entrada.nextLine(); 

        
        System.out.println("Ingrese el nombre del propietario: ");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el valor del vehículo: $");
        valorVehiculo = entrada.nextDouble();

        
        switch (tipoVehiculo) {
            case 1:
                peaje = (valorVehiculo * 0.01)/100 + 2.0; // 0.01% + $2
                tipoVehiculoTexto = "vehículo liviano particular";
                break;
            case 2:
                peaje = (valorVehiculo * 0.02)/100 + 2.5; // 0.02% + $2.5
                tipoVehiculoTexto = "vehículo grande particular";
                break;
            case 3:
                peaje = (valorVehiculo * 0.04)/100 + 1.5; // 0.04% + $1.5
                tipoVehiculoTexto = "taxi";
                break;
            case 4:
                peaje = (valorVehiculo * 0.05)/100 + 2.2; // 0.05% + $2.2
                tipoVehiculoTexto = "bus urbano";
                break;
        }

        System.out.printf("\nPeaje \"Buena vía\"\n\tPropietario: %s\nTipo: "
                + "%s\n\tValor: $%.2f\n\tPeaje: $%.2f\n",
                propietario, tipoVehiculoTexto, valorVehiculo, peaje);
    }
}

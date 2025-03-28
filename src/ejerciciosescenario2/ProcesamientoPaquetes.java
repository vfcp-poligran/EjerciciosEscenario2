/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosescenario2;

import java.util.Scanner; // Importamos Scanner para la entrada del usuario

public class ProcesamientoPaquetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner
        double costoTotal = 0.0; // Variable para el costo total
        double tarifaPorKilo = 5.0; // Costo fijo por kilogramo

        System.out.println("Procesamiento de paquetes de envío");
        System.out.println("Ingrese el peso de cada paquete en kg (o -1 para finalizar):");

        // Bucle para procesar paquetes
        while (true) {
            System.out.print("Peso del paquete: ");
            double peso = scanner.nextDouble(); // Leemos el peso del paquete

            // Condición de salida
            if (peso == -1) {
                break; // Termina el bucle si se ingresa -1
            }

            // Validación del peso con continue
            if (peso <= 0) {
                System.out.println("Peso inválido (" + peso + " kg). Paquete ignorado.");
                continue; // Salta este paquete y pasa a la siguiente iteración
            }

            // Cálculo del costo para paquetes válidos
            double costoPaquete = peso * tarifaPorKilo;
            costoTotal += costoPaquete;
            System.out.println("Paquete de " + peso + " kg - Costo: $" + costoPaquete);
        }

        // Resultado final
        System.out.println("Costo total de envío: $" + costoTotal);
        scanner.close(); // Cerramos el Scanner
    }
}
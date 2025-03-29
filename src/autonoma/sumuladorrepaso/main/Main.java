/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sumuladorrepaso.main;

import autonoma.simuladorrepaso.exceptions.CapacidadMotorException;
import autonoma.sumuladorrepaso.models.Motor;
import autonoma.sumuladorrepaso.models.Simulador;
import autonoma.sumuladorrepaso.models.Vehiculo;

/**
 *
 * @author Educacion
 */
public class Main {
    
    public static void main(String[] args) {
        Motor motor = new Motor(100);
        Vehiculo vehiculo = new Vehiculo(motor);
        Simulador simulador = new Simulador(vehiculo);
        
        simulador.encenderVehiculo();
        
        try {
            simulador.acelerarVehiculo(110);
        } catch (CapacidadMotorException e) {
            System.out.println("Ha sobrepasado la velocidad permitida por el motor");
            System.exit(0);
        }
        
        System.out.println("Has acelerado exitosamente");
        
    }
    
    
    
    
}

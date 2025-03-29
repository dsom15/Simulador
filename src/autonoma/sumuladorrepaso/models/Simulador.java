/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sumuladorrepaso.models;

import autonoma.simuladorrepaso.exceptions.CapacidadMotorException;

/**
 *
 * @author Educacion
 */
public class Simulador {
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Atributos
    private Vehiculo vehiculo;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor

    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos
    public void encenderVehiculo(){
        this.vehiculo.encender();
    }
    
    public void apagarVehiculo(){
        this.vehiculo.apagar();
    }
    
    public void acelerarVehiculo(double velocidad)throws CapacidadMotorException{
        try {
             this.vehiculo.acelerar(velocidad);
        } catch (CapacidadMotorException e) {
            this.vehiculo.accidentarVehiculo();
            throw e;
        }
       
    }
    
    
    
}

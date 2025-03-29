/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sumuladorrepaso.models;

import autonoma.simuladorrepaso.exceptions.CapacidadMotorException;
import autonoma.simuladorrepaso.exceptions.VehiculoEncendidoException;

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
    public void encenderVehiculo() throws VehiculoEncendidoException{
        try{
            this.vehiculo.encender();
            
        }catch(VehiculoEncendidoException e){
            throw e;
            
        }
        
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

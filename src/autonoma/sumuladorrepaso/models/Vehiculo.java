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
public class Vehiculo {
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Atributos
    private double velocidad;
    private Motor motor;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor

    public Vehiculo(Motor motor) {
        this.velocidad = 0;
        this.motor = motor;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos de acceso

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Metodos
    public void encender(){
        this.motor.encender();
    }
    
    public void apagar(){
        this.motor.apagar();
    }
    
    public void accidentarVehiculo(){
        this.setVelocidad(0);
        this.apagar();
    }
    
    public void acelerar(double velocidad) throws CapacidadMotorException{
        
        double nVelocidad = this.velocidad + velocidad;
        this.motor.validarVelocidadMaxima(nVelocidad);
        this.setVelocidad(nVelocidad);
        
    }
    
    
    
}

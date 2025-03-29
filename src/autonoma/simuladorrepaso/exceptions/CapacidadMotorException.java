/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorrepaso.exceptions;

/**
 *
 * @author Educacion
 */
public class CapacidadMotorException extends RuntimeException {
    
    public CapacidadMotorException(){
        super("La velocidad excedió el limite permitido por el motor");
    }
    
}

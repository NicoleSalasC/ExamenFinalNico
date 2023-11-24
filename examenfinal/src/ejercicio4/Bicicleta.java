/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author n
 */
public class Bicicleta extends Vehiculo
{
    @Override 
    public void acelerar() {
        
        System.out.println("Acelerando bicicleta...");

        System.out.println("Ha acelerado la bicicleta! :D yey\n");
        
        
    }

    @Override
    public void frenar() {
        System.out.println("Frenando bicicleta...");
        System.out.println("opa, frenó la bicicleta, ya llegó a la pul?");
    }
    
    
}

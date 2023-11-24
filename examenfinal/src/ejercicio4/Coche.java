/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author n
 */
public class Coche extends Vehiculo {

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando carrito...");
        System.out.println("brum brum, vamos pa la playa\n");
        
    }

    @Override
    public void frenar(){
        System.out.println("Frenando carrito...");
 
        System.out.println("Pip pip, frenó el cochesito");
    }

}

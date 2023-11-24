/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author n
 */
public class Computadora implements ConexionRed {

    @Override
    public void conectar() {
        System.out.println("Se ha conectado la computadorsita, a jugar minecraft! :D");
    }

    @Override
    public void desconectar() {
        System.out.println("Se ha desconectado la computadora :(");
    }
    
}

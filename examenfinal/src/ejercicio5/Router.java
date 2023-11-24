/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author n
 */
public class Router implements ConexionRed {

    @Override
    public void conectar() {
        
        System.out.println("Se ha conectado el router!");
        
    }

    @Override
    public void desconectar() {
        System.out.println("Apaguelo y vuelvalo a encender :(");
    }
    
    public void configurarRed(){
        System.out.println("Configurando router...");
        
    }

    
}

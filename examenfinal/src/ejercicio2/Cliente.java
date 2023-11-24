/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author n
 */
public class Cliente {
    
    private int amountOfMoney;
    private String nameClient;
    private String idClient;

    public Cliente(int amountOfMoney, String nameClient, String idClient) {
        this.amountOfMoney = amountOfMoney;
        this.nameClient = nameClient;
        this.idClient = idClient;
    }

    /**
     * @return the amountOfMoney
     */
    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * @param amountOfMoney the amountOfMoney to set
     */
    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    /**
     * @return the nameClient
     */
    public String getNameClient() {
        return nameClient;
    }

    /**
     * @param nameClient the nameClient to set
     */
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    /**
     * @return the idClient
     */
    public String getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
    
    
    
}

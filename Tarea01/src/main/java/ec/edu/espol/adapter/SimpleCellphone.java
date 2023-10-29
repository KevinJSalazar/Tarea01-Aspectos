/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapter;

/**
 *
 * @author agome
 */
public class SimpleCellphone {
    
    private String cNumber;
    private String cPrefix;

    public SimpleCellphone(String number, String prefix) {
        this.cNumber = number;
        this.cPrefix = prefix;
    }


//La clase SimpleCellphone tiene dos metodos 

    public String getPhoneNumber() {
        return cNumber;
        //El primero devuelve el numero celular en formato estandar "0921785412"
    }
    

    public String getPhonePrefix() {
        return cPrefix;
        //El segundo devuelve el prefijo telefónico del país
    }
    
    
}

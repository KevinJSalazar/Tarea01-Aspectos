/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapter;

/**
 *
 * @author agome
 */
public class AdapterCellphone implements Cellphone {
    
    private SimpleCellphone phone;

    public AdapterCellphone(SimpleCellphone phone) {
        this.phone = phone;
    }

    
    // Para solucionar la incompatibilidad de SimpleCellphone y Cellphone, implementamos una clase adaptador
    //Su función sera la de unir las dos salidas de los metódos get de SimpleCellphone para que la interfaz Cellphone
    //pueda comprenderlo en su formato

    @Override
    public String getCellphoneNumber(){
        return phone.getPhonePrefix() + " " + phone.getPhoneNumber();
    }
    
}

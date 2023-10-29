/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapter;

/**
 *
 * @author agome
 */
public class Test {
    
    public static void main(String[] args) {
        Cellphone phone;
        phone = new AdapterCellphone(new SimpleCellphone("0978654628", "+591"));
        System.out.println(phone.getCellphoneNumber());
    }
    //Ahora el metodo getCellphoneNumber() puede recibir instancias de SimpleCellphone
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapterSeccionB;

/**
 *
 * @author evin
 */
public class Item implements Equipable {
    protected String nombre;
    
    public Item(){}

    public Item(String nombre){
        this.nombre = nombre;
    }
    
    public void tirar(){
        System.out.println("Has tirado el objeto:" + this.nombre);
    }
    
    public void equipar(){
        System.out.println("Te has equipado el objeto:" + this.nombre);
    }

    public String getNombre(){
        return this.nombre;
    }
}
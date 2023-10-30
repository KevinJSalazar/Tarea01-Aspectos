
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapterSeccionB;

/**
 *
 * @author evin
 */
public class Armadura extends Item{
    private double defensa;

    public Armadura(String nombre, double defensa) {
        super(nombre);
        this.defensa = defensa;
    }

    public double getDefensa() {
        return this.defensa;
    }
}

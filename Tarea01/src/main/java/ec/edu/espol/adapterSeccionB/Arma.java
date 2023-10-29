/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapterSeccionB;

/**
 *
 * @author evin
 */
public class Arma extends Item{
    private double ataque;
    
    public Arma(){}
    
    public Arma(String nombre, int ataque){
        super(nombre);
        this.ataque = ataque;
    }

    public double getAtaque() {
        return this.ataque;
    }
}

<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapterSeccionB;

/**
 *
 * @author evin
 */
public class Jugador {
    private String nombre;
    private double vida;
    private double defensa;
    private double ataque;

    public Jugador(String nombre, double vida, double defensa, double ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
    }
    
    public void atacar(Arma arma){
        System.out.println("Has usado: " + arma.getNombre());
        System.out.println("Has hecho " + (arma.getAtaque()*this.ataque*1.5) + " puntos de daño");
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.adapterSeccionB;

/**
 *
 * @author evin
 */
public class Jugador {
    private String nombre;
    private double vida;
    private double defensa;
    private double ataque;

    public Jugador(String nombre, int vida, int defensa, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
    }
    
    public void atacar(Arma arma){
        System.out.println("Has usado: " + arma.getNombre());
        System.out.println("Has hecho " + (arma.getAtaque()*this.ataque*1.5) + " puntos de daño");
    }
}
>>>>>>> 319c755bfb927664c409a56df4324ff37efd21a1

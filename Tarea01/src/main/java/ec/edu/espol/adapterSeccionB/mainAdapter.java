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
public class mainAdapter {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Carlos", 100, 12, 11);
        Armadura casco = new Armadura("Cabeza de dragón", 21);
        Arma espada =  new Arma("Filo filoso", 17);
        
        j1.atacar(espada);
        ArmaduraArma cascoarma = new ArmaduraArma(casco);
        j1.atacar(cascoarma);
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
public class mainAdapter {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Carlos", 100, 12, 11);
        Armadura casco = new Armadura("Cabeza de dragón", 21);
        Arma espada =  new Arma("Filo filoso", 17);
        
        j1.atacar(espada);
        ArmaduraArma cascoarma = new ArmaduraArma(casco);
        j1.atacar(cascoarma);
    }
}
>>>>>>> 319c755bfb927664c409a56df4324ff37efd21a1

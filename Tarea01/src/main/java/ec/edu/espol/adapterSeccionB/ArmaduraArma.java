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
public class ArmaduraArma extends Arma{
    private Armadura armadura;

    public ArmaduraArma(Armadura armadura){
        this.nombre = armadura.nombre;
        this.armadura = armadura;
    }
    
    public double getAtaque(){
        return this.armadura.getDefensa() * 0.75;
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
public class ArmaduraArma extends Arma{
    private Armadura armadura;

    public ArmaduraArma(Armadura armadura){
        this.nombre = armadura.nombre;
        this.armadura = armadura;
    }
    
    public double getAtaque(){
        return this.armadura.getDefensa() * 0.75;
    }
}
>>>>>>> 319c755bfb927664c409a56df4324ff37efd21a1

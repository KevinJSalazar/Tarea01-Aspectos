/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tarea01;

import ec.edu.espol.singleton.Config;

/**
 *
 * @author evin
 */
public class Tarea01 {

    public static void main(String[] args) {
        Config config1 = Config.getConfig();
        System.out.println("NOMBRE DE LA APP: "+config1.getAppName());
        Config config2 = Config.getConfig();
        System.out.println("NOMBRE DE LA APP 2: "+config2.getAppName());
    }
}

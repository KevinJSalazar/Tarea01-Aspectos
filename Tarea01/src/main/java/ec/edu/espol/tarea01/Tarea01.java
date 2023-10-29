/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tarea01;

import ec.edu.espol.singleton.Config;
import ec.edu.espol.singleton.TimesLogin;

/**
 *
 * @author Silvia Saquisili
 */
public class Tarea01 {

    public static void main(String[] args) {
    	// Singleton - POO
        Config config1 = Config.getConfig();
        System.out.println("NOMBRE DE LA APP: "+config1.getAppName());
        Config config2 = Config.getConfig();
        System.out.println("NOMBRE DE LA APP 2: "+config2.getAppName());
        
        // Singleton - POA
        TimesLogin tLogin1 = TimesLogin.getTimesLogin();
        TimesLogin tLogin2 = TimesLogin.getTimesLogin();
        tLogin1.count();
        System.out.println("Your entry to the application has been posted.");
        int time = tLogin2.getTimes();
        System.out.println("In this application, you have been logged in the following number of times: "+ time);
    }
}

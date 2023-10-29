/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.singleton;

/**
 *
 * @author Silvia Saquisili 29.10.2023
 */ 
// Estamos en la clase Configuración de cualquier aplicación. 

public class Config {
    private static Config config;
    private String version;
    private String appName;
    
    private Config(){
        this.appName = "MY APPLICATION";
        this.version = "1.0";
    }
    
    public synchronized static Config getConfig(){
        if(config == null)
            config = new Config();
        return config;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }  
}

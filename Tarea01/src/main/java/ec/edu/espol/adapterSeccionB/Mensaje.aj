<<<<<<< HEAD
package ec.edu.espol.adapterSeccionB;

public aspect Mensaje {
	pointcut confirmacion():execution(void Jugador.atacar(..));
	
	before(): confirmacion(){
		System.out.println("Cargando ataque...");
	}
	
	after(): confirmacion(){
		System.out.println("¡Has acertado!" + "\n");
	}
}
=======
package ec.edu.espol.adapterSeccionB;

public aspect Mensaje {
	pointcut confirmacion():execution(void Jugador.atacar(..));
	
	before(): confirmacion(){
		System.out.println("Cargando ataque...");
	}
	
	after(): confirmacion(){
		System.out.println("¡Has acertado!" + "\n");
	}
}
>>>>>>> 319c755bfb927664c409a56df4324ff37efd21a1

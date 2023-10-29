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

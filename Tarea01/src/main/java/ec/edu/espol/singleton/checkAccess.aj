package ec.edu.espol.singleton;

public aspect checkAccess {
	
	pointcut verifyAccess(): execution(void TimesLogin.count(..));

	before() : verifyAccess(){
		System.out.println("You are logged in to the app...");
	}	
	
	pointcut confirmAccess(): execution(int TimesLogin.getTimes(..));
	
	after() : confirmAccess(){
		System.out.println("You logged in successfully!");
	}
}



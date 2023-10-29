package ec.edu.espol.singleton;

/**
*
*/ 

public class TimesLogin {
	private static TimesLogin timesLogin;
	private int times;
	
	private TimesLogin() {
		times = 0;
	}
	
	public synchronized static TimesLogin getTimesLogin(){
        if(timesLogin == null)
            timesLogin = new TimesLogin();
        return timesLogin;
    }
	
	public int getTimes() {
		return times;
	}
	
	public void count() {
		times++;
	}
}

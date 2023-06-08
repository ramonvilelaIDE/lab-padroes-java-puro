package one.dio.gof.singleton;

/*
 * Singleton "apressado"
 * 
 * @author ramonvilelaIDE
 * 
 * */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager () {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
	
	
}

package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

public class Teste {

	
	public static void main(String[] args) {
		// Testes relacionados ao Design Pattern Singleton: 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		//SingletonLazy lazy = SingletonLazy.getInstancia();
		//System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		//  Variação de comportamento através dos métodos normal, defensivo e agressivo.
		Robo robo =  new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Bárbara", "52171-900");
		
		
	}

}

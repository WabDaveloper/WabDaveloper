package br.com.usjt.Pizza;

//ABSTRACT FACTORY - Essa � minha classe abstrata mais gen�rica
//Quem extender dela � obrigado a implementar os m�todos montaRoda e montarSom

public abstract class PizzaFactory {
	
	public abstract Sabor montarPizza();	
	public abstract Pizzaiolo SelecionaPizzaiolo();
}

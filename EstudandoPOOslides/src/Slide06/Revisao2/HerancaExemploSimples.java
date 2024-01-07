package Slide06.Revisao2;

public class HerancaExemploSimples {
	class Animal {
	    public String nome;
	    public int idade;
	    public double peso;
	    public double altura;
	}
	
	class Cachorro extends Animal {
	    public void latir() {
	        System.out.println("Au au!");
	    }
	    public void abanarRabo() {
	        System.out.println("Abanando o rabo...");
	    }
	}
}

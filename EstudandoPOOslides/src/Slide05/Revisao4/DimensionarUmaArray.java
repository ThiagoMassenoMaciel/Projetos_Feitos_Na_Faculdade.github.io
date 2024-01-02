package Slide05.Revisao4;

public class DimensionarUmaArray {
	int[] arrayInteira;
	double[] arrayPontoFlutuante;
	String[] arrayPalavras;
	char[] arrayCaracteres;
	Object[] arrayObjetos;
	OutraClasse arrayObjetosOutraClasse[];
	/*
java.lang.Object


Class Object is the root of the class hierarchy.Every class has Object as a superclass. All objects,including arrays, implement the methods of this class.
Since:1.0See Also:java.lang.Class
	*/
	
	public DimensionarUmaArray() {
		this.arrayInteira = new int[10];
		this.arrayPontoFlutuante = new double[11];
		this.arrayPalavras = new String[12];
		this.arrayCaracteres = new char[13];
		this.arrayObjetos = new Object[14];
		this.arrayObjetosOutraClasse = new OutraClasse[15];
	}
	
}

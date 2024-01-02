package Slide05.Revisao6;

import java.util.HashMap;
import java.util.Map;

public class ExemploMedioMap {

	public static void main(String[] args) {
		Map< Integer, Funcionario> funcionarios = new HashMap<>();
		
		funcionarios.put(7 , new Funcionario("Jose Bonifacio da Silva", "Aulxiliar Administrativo" , 2000.0 , "Itaitinga - Caracanga - 349"));
		funcionarios.put(2, new Funcionario("Maria daSilva Maciel", "Aulxiliar Almoxarifado" , 3000.0 , "Itaitinga - Gereraú - 10"));
		funcionarios.put(221, new Funcionario("Felipe da Costa Lima", "Gerente Administrativo" , 3100.0 , "Itaitinga - Carapió - 120"));
		funcionarios.put(10, new Funcionario("Jose Bonifacio da Silva", "Gestora Empresarial" , 5000.0 , "Itaitinga - Alto do Bode - 3"));
		
		System.out.println(funcionarios);
		
		funcionarios.remove(2);
		
		System.out.println( "\nDepois de remover um dos funcionarios o map ficou assim: \n" +funcionarios);

	}

}

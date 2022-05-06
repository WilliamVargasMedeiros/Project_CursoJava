package executavel;

import javax.swing.JOptionPane;
import classes.Pessoa;

public class Start {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		System.out.println("Curso Java Full Stack");
		System.out.println("=================================================");
		
		/*Criação do OBJ pessoa1*/
		Pessoa pessoa1 = new Pessoa("William");
		pessoa1.setNome("William");
		pessoa1.setSobreNome("Vargas Medeiros");
		pessoa1.setIdade(22);
		pessoa1.setSexoM(true);
		pessoa1.setDataNascimento("27/02/2000");
		
		System.out.println("Nome            = " + pessoa1.getNome());
		System.out.println("Sobre Nome      = " + pessoa1.getSobreNome());
		System.out.println("Idade           = " + pessoa1.getIdade());
		System.out.println("SexoM           = " + pessoa1.isSexoM());
		System.out.println("Data Nascimento = " + pessoa1.getDataNascimento());
		
		/*=====================================================================*/
		
	}
}

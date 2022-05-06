package classes;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;
	private boolean sexoM;
	private String dataNascimento;
	
	public Pessoa(String nome_Padrao) {
		
	}
	public Pessoa(String nome_Padrao, String sobreNome_Padrao) {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSexoM() {
		return sexoM;
	}
	public void setSexoM(boolean sexoM) {
		this.sexoM = sexoM;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}

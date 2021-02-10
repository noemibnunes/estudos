package atividade2.questao2;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome, endereco, sexo;
	private long cpf;
	private int idade;
	
	public Pessoa(String nome, long cpf, int idade, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		
		if(this.nome.length() < o.nome.length()) {
			return -1;
		} 
		
		if(this.nome.length() > o.nome.length()) {
			return -1;
		} 
		
		return 0;
	}

}

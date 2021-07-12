package models;

public class Usuario {

	private Integer identificador;
	private String nome;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String usuario) {
		this.nome = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
}

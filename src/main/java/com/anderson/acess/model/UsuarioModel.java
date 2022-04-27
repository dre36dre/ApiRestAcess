package com.anderson.acess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="usuario")
public class UsuarioModel {

	@Id
	Integer codigo;
	@Column(nullable=false,length=50)
	String nome;
	@Column(nullable=false,length=10)
	String login;
	@Column(nullable=false,length=10)
	String senha;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}

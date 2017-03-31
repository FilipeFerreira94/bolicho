package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.*;

@Entity
public class Cliente {
	
	@Id
	@Column(nullable=false)
	private int cpf;
	@Column(length=40, nullable=false)
	private String nome;
	
	public int getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
}

package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.*;

@Entity
public class Produto {
	
	@Column(length=40, nullable=false)
	private String descricao;
	@Column(length=40)
	private double preco;
	@Id
	@Column(nullable=false)
	private int idproduto;
	
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}
	public int getIdproduto() {
		return idproduto;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	
	

}

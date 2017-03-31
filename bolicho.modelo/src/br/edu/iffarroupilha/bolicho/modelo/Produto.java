package br.edu.iffarroupilha.bolicho.modelo;

public class Produto {
	
	private String descricao;
	private double preco;
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

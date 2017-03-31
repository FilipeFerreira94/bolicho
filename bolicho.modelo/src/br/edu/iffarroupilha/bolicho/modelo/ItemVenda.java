package br.edu.iffarroupilha.bolicho.modelo;

public class ItemVenda {
	
	private int idItemVenda;
	private Venda venda;
	private Produto produto;
	private int quantidade;
	private double precoUnitario;
	
	public int getIdItemVenda() {
		return idItemVenda;
	}
	public Venda getVenda() {
		return venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setIdItemVenda(int idItemVenda) {
		this.idItemVenda = idItemVenda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	
	
}

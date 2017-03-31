package br.edu.iffarroupilha.bolicho.modelo;

import java.util.Date;

public class Venda {

	private int idvenda;
	private Cliente cliente;
	private Date data;
	
	public int getIdvenda() {
		return idvenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Date getData() {
		return data;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}

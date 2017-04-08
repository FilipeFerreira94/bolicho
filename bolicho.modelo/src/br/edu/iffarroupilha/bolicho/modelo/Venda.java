package br.edu.iffarroupilha.bolicho.modelo;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Venda {
	@Id
	@Column(nullable=false)
	private int idvenda;
	@Column(length=40, nullable=false)
	private Cliente cliente;
	@Temporal(TemporalType.DATE)
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

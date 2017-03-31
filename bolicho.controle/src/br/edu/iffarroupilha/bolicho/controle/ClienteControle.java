package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

/**
 *<p>
 * Classe de lógica para a entidade cliente
 * 
 * @author Aluno
 *</p>
 */
public class ClienteControle extends AControle {
	
	public String validarCliente(Cliente cliente){
		
		if(cliente != null){
			if(cliente.getCpf()==0){
				return "Informe o seu CPF!";
			}else if(cliente.getNome()==null || cliente.getNome().isEmpty() ){
				return "Informe o seu Nome!";				
			}
		}else{
			return "Dados do cliente não informados!";
		}
		return null;
	}
	
}

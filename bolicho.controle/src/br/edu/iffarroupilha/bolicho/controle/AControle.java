package br.edu.iffarroupilha.bolicho.controle;

import java.util.*;

/**
 * <p>
 * Controlador gen�rico que agrupa as fun��es comuns de l�gicas, como gravar, buscar, etc.
 * @author Aluno
 *</p>
 */

public abstract class AControle {
	// gravar ou atualizar uma informa��o em banco
	public void gravar(){
		
	}
	// busca todos os registros de uma determinada entidade(classe)
	public List buscarTodos(Class classe) {
		return null;

	}
	// excluir entidades
	private void excluir(Object entidade) {

	}
	/**
	 * <p>
	 * Converte um termo em n�mero, caso o n�mero esteja informado inv�lido, retorna-se 0
	 * </p>
	 * @param termo
	 * @return
	 */
	public int converteInteiro(String termo){
		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}
		
		
	}
	/**
	 * <p>
	 * Converte um termo em n�mero com virgulas, caso o n�mero esteja informado inv�lido, retorna-se 0
	 * </p>
	 * @param termo
	 * @return
	 */
	public int converteFloat(String termo){
		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}
		
		
	}
}

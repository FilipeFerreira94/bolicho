package br.edu.iffarroupilha.bolicho.controle;

import java.util.List;

import org.hibernate.Session;

import br.edu.iffarroupilha.bolicho.modelo.dao.HibernateDAO;

/**
 * <p>
 * Controlador genérico que agrupa as funções comuns de lógicas, como gravar, buscar, etc.
 * @author Aluno
 *</p>
 */

public abstract class AControle {
	// gravar ou atualizar uma informação em banco
	public void gravar(Object entidade){
		// estabelece uma conexão
		Session sessao = HibernateDAO.getSessao();
		// abre uma transação
		sessao.getTransaction().begin();
		// salva as alterações
		sessao.saveOrUpdate(entidade);
		// comita as alterações
		sessao.getTransaction().commit();
		
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
	 * Converte um termo em número, caso o número esteja informado inválido, retorna-se 0
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
	 * Converte um termo em número com virgulas, caso o número esteja informado inválido, retorna-se 0
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

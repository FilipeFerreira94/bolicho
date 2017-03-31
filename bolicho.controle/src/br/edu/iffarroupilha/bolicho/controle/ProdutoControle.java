package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe de l�gica para a entidade produto
 * 
 * @author Aluno
 *</p>
 */
public class ProdutoControle extends AControle {

	public String validarProduto(Produto produto) {

		if (produto != null) {
			if (produto.getDescricao() == null) {
				return "Informe a descri��o do produto!";
			} else if (produto.getPreco() == 0 ) {
				return "Informe o pre�o do produto!";
			}
		} else {
			return "Dados do produto n�o informados!";
		}
		return null;
	}
}

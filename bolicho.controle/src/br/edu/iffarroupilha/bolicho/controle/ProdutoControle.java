package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe de lógica para a entidade produto
 * 
 * @author Aluno
 *</p>
 */
public class ProdutoControle extends AControle {

	public String validarProduto(Produto produto) {

		if (produto != null) {
			if (produto.getDescricao() == null) {
				return "Informe a descrição do produto!";
			} else if (produto.getPreco() == 0 ) {
				return "Informe o preço do produto!";
			}
		} else {
			return "Dados do produto não informados!";
		}
		return null;
	}
}

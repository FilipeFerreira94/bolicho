package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bolicho.controle.ProdutoControle;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

public class FrmProduto extends JFrame{
	private Bolicho telaPrincipal;

	public FrmProduto(Bolicho telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		setTitle("Bolicho -> Clientes");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		// labels para as variaveis
		JLabel jbldescricao = new JLabel("Descrição:");
		JLabel jblpreco = new JLabel("Preço:");
		// textfields para as variaveis
		final JTextField jtfdescricao = new JTextField(30);
		final JTextField jtfpreco = new JTextField(30);
		// botao gravar
		JButton btngravar = new JButton("Gravar");
		// layout para a janela
		setLayout(new FlowLayout(FlowLayout.LEFT ) );
		
		//adiciona acao ao botao gravar
				btngravar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ProdutoControle controle = new ProdutoControle();
						//pegar os dados da tela
						Produto p = new Produto();
						p.setDescricao(jtfdescricao.getText() );
						// converte para um valor numerico
						float preco = controle.converteFloat(jtfpreco.getText() );
						p.setPreco(preco);
						
						//valida os dados
						String erro = controle.validarProduto(p);
						if(erro == null){
							//nenhum erro criado
							//realiza a gravacao
							controle.gravar();
							JOptionPane.showMessageDialog(null, "Salvo");
						}else{
							JOptionPane.showMessageDialog(null, erro, "Validacao", JOptionPane.WARNING_MESSAGE);
						}
												
					}
				});
		
		//adiciona os componentes em tela
		add(jbldescricao);
		add(jtfdescricao);
		add(jblpreco);
		add(jtfpreco);
		add(btngravar);
	}
}

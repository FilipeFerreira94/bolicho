package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * Classe principal do projeto
 * 
 * @author Usuario
 *
 */
public class Bolicho extends JFrame {
	public Bolicho(){
		setTitle(" :: Bolicho :: ");
		setLocationRelativeTo(null);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		//muda a aparencia da aplicacao JAVA
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel() );
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria a barra de menus
		JMenuBar menu = new JMenuBar();
		// cria o menu cadastro
		JMenu cadastro = new JMenu("Bolicho");
		menu.add(cadastro);
		// cria os submenus
		JMenuItem cliente = new JMenuItem("Cliente");
		JMenuItem venda = new JMenuItem("Venda");
		JMenuItem produto = new JMenuItem("Produto");
		// vincula ao menus cadstro
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		// vincula as ações aos submenus
		cliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FrmCliente(Bolicho.this);
			}
		});
		produto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FrmProduto(Bolicho.this);
			}
		});
		// adiciona o menu em tela
		setJMenuBar(menu);
	}

	public static void main(String[] args) {
		new Bolicho();
	}

}
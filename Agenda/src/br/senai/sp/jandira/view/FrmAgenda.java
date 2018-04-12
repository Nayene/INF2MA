package br.senai.sp.jandira.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class FrmAgenda extends JFrame {
	// declarou um painel 
	private JPanel painelPrincipal;
	private JLabel lblTitulo;
	private JTable tabelaConatos;
	// construtor da classe
	public FrmAgenda() {
		setTitle("Agenda de Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar
		setBounds(100, 100, 574, 573); //tamanho
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal); //dentro do frame
		painelPrincipal.setLayout(null);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(Color.PINK);
		painelTitulo.setBounds(0, 11, 558, 69);
		painelPrincipal.add(painelTitulo);
		painelTitulo.setLayout(null);
		
		lblTitulo = new JLabel("Agenda De Contatos");
		lblTitulo.setIcon(new ImageIcon(FrmAgenda.class.getResource("/br/senai/sp/jandira/imagens/icon64 (1).png")));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(237, 0, 311, 69);
		painelTitulo.add(lblTitulo);
		
		JPanel painelTabela = new JPanel();
		painelTabela.setBackground(SystemColor.menu);
		painelTabela.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Meus Contatos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(135, 206, 235)));
		painelTabela.setBounds(0, 91, 558, 326);
		painelPrincipal.add(painelTabela);
		painelTabela.setLayout(null);
		
		JScrollPane scrollTabela = new JScrollPane();
		scrollTabela.setBounds(10, 22, 538, 293);
		painelTabela.add(scrollTabela);
		
		tabelaConatos = new JTable();
		tabelaConatos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "NOME", "E-MAIL"
			}
		));
		tabelaConatos.getColumnModel().getColumn(0).setPreferredWidth(22);
		tabelaConatos.getColumnModel().getColumn(1).setPreferredWidth(143);
		tabelaConatos.getColumnModel().getColumn(2).setPreferredWidth(147);
		scrollTabela.setViewportView(tabelaConatos);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setBackground(Color.PINK);
		painelBotoes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelBotoes.setBounds(0, 427, 558, 75);
		painelPrincipal.add(painelBotoes);
		painelBotoes.setLayout(null);
		
		JButton btnNovo = new JButton("");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmContatos contato = new FrmContatos("ADICIONAR");
				contato.setTitle("Adicionar Contato");
				contato.setVisible(true);
			}
		});
		btnNovo.setIcon(new ImageIcon(FrmAgenda.class.getResource("/br/senai/sp/jandira/imagens/adicionar.png")));
		btnNovo.setToolTipText("Cadastrar novo contato");
		btnNovo.setBounds(14, 11, 63, 50);
		painelBotoes.add(btnNovo);
		
		JButton btnEditar = new JButton("");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmContatos contato = new FrmContatos("EDITAR");
				contato.setTitle("Editar Contato");
				contato.setVisible(true);
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmAgenda.class.getResource("/br/senai/sp/jandira/imagens/edit.png")));
		btnEditar.setToolTipText("Cadastrar novo contato");
		btnEditar.setBounds(87, 11, 63, 50);
		painelBotoes.add(btnEditar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmContatos contato = new FrmContatos("EXCLUIR");
				contato.setTitle("Excluir Contato");
				contato.setVisible(true);
			}
		});
		btnExcluir.setBackground(new Color(250, 240, 230));
		btnExcluir.setIcon(new ImageIcon(FrmAgenda.class.getResource("/br/senai/sp/jandira/imagens/cancel.png")));
		btnExcluir.setToolTipText("Cadastrar novo contato");
		btnExcluir.setBounds(164, 11, 63, 50);
		painelBotoes.add(btnExcluir);
		
		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(FrmAgenda.class.getResource("/br/senai/sp/jandira/imagens/exit.png")));
		btnSair.setToolTipText("Cadastrar novo contato");
		btnSair.setBounds(485, 11, 63, 50);
		painelBotoes.add(btnSair);
		
		
		
	}
}

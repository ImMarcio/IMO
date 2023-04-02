package IMCfiles;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

import Main.InterfaceMultOperacoes;



public class IMCFront {

	private JFrame frame;
	private JTextField AlturaField;
	private JTextField PesoField;

	
	/**
	 * Create the application.
	 */
	public IMCFront() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 48, 69, 35);
		frame.getContentPane().add(lblNewLabel);
		
		AlturaField = new JTextField();
		AlturaField.setBounds(91, 59, 54, 20);
		frame.getContentPane().add(AlturaField);
		AlturaField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cálculo do IMC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(99, 11, 216, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Peso(KG):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(24, 94, 96, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		PesoField = new JTextField();
		PesoField.setBounds(118, 100, 54, 20);
		frame.getContentPane().add(PesoField);
		PesoField.setColumns(10);
		
		JLabel situacaoLabel = new JLabel("");
		
		
		JButton CalcularButton = new JButton("Calcular");
		frame.getRootPane().setDefaultButton(CalcularButton);
		
		CalcularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				situacaoLabel.setText("");
//				Pegando as altura e peso do usuário
				double altura = Double.parseDouble(AlturaField.getText());
				double peso = Double.parseDouble(PesoField.getText());
//				chamando a classe imc
				IMC imcUser = new IMC(altura,peso);
//				Setando a situação em um label e reinciando os filds de altura e peso
				situacaoLabel.setText(imcUser.getStatus());
				AlturaField.setText("");
				PesoField.setText("");
				
			}
		});
		CalcularButton.setBounds(159, 190, 114, 46);
		frame.getContentPane().add(CalcularButton);
		
		
		situacaoLabel.setBounds(67, 146, 286, 20);
		frame.getContentPane().add(situacaoLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu SairMenu = new JMenu("<< Voltar");
		SairMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfaceMultOperacoes voltar = new InterfaceMultOperacoes();	
				frame.dispose();
				
			}
		});
		menuBar.add(SairMenu);
	}
}

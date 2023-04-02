package geometrica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Main.InterfaceMultOperacoes;

public class CalculadoraDeAreaFront {

	private JFrame frame;
	private JTextField textField;
	private JTextField AlturaField;
	private JTextField BaseField;
	private JLabel Resultado;

	
	/**
	 * Create the application.
	 */
	public CalculadoraDeAreaFront() {
		initialize();
		frame.setVisible(true);}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
//		frame.addKeyListener(new KeyAdapter() {
//			public void keyPressed(KeyEvent e) {
//				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
//					InterfaceMultOperacoes voltar = new InterfaceMultOperacoes();	
//					frame.dispose();}
//			}	
//			}	
//					);
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Resultado = new JLabel("");
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel formaLabel = new JLabel("");
		
		JLabel AlturaLabel = new JLabel("");
		AlturaField = new JTextField();
		AlturaField.setBorder(null);
		AlturaField.setBackground(new Color(240, 240, 240));
		
		JLabel BaseLabel = new JLabel("");
		BaseField = new JTextField();
		BaseField.setBackground(new Color(240, 240, 240));
		BaseField.setBorder(null);
	
		
		JButton btnNewButton = new JButton("Quadrado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText("");
				AlturaLabel.setText("Lado ");
				BaseLabel.setText("");
				AlturaField.setBackground(new Color(255, 255, 255));
				BaseField.setBackground(new Color(240, 240, 240));
				BaseField.setBorder(null);
				BaseField.setText("");
				formaLabel.setText("Quadrado");
			
				
				
			}
		});
		btnNewButton.setBounds(10, 31, 101, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRetngulo = new JButton("Retângulo");
		btnRetngulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText("");
				AlturaLabel.setText("Altura: ");
				BaseLabel.setText("Base:");
				AlturaField.setBackground(new Color(255, 255, 255));
				BaseField.setBackground(new Color(255, 255, 255));
				formaLabel.setText("Retângulo");
			}
		});
		btnRetngulo.setBounds(10, 85, 101, 42);
		frame.getContentPane().add(btnRetngulo);
		
		JButton btnTringulo = new JButton("Triângulo");
		btnTringulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText("");
				AlturaLabel.setText("Altura: ");
				BaseLabel.setText("Base:");
				AlturaField.setBackground(new Color(255, 255, 255));
				BaseField.setBackground(new Color(255, 255, 255));
				formaLabel.setText("Triângulo");

			}
		});
		btnTringulo.setBounds(10, 140, 101, 39);
		frame.getContentPane().add(btnTringulo);
		
		
		JButton CalcularButton = new JButton("Calcular");
		frame.getRootPane().setDefaultButton(CalcularButton);
		CalcularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String forma = formaLabel.getText();
				if(forma.equals("Quadrado")) {
					double base = Double.parseDouble(AlturaField.getText());
					CalculadoraDeArea calculadoraUser = new CalculadoraDeArea(forma,1,base);
					Resultado.setText("Área: " + Double.toString(calculadoraUser.calcularArea()));		
					
				}
				else {
					double altura = Double.parseDouble(AlturaField.getText());
					double base = Double.parseDouble(BaseField.getText());
					
					CalculadoraDeArea calculadoraUser = new CalculadoraDeArea(forma,altura,base);
					Resultado.setText("Área: " + Double.toString(calculadoraUser.calcularArea()));
					
				}
				AlturaField.setText("");
				BaseField.setText("");
				
			}
		});
		CalcularButton.setBounds(163, 205, 89, 23);
		frame.getContentPane().add(CalcularButton);
		
		JLabel lblNewLabel = new JLabel("Calculadora de área");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 11, 158, 31);
		frame.getContentPane().add(lblNewLabel);
		
		
		AlturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AlturaLabel.setBounds(183, 42, 69, 14);
		frame.getContentPane().add(AlturaLabel);
		
		
		AlturaField.setBounds(269, 42, 86, 20);
		frame.getContentPane().add(AlturaField);
		AlturaField.setColumns(10);
		
	
		BaseLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BaseLabel.setBounds(183, 91, 69, 14);
		frame.getContentPane().add(BaseLabel);
		
		
		BaseField.setBounds(269, 85, 86, 20);
		frame.getContentPane().add(BaseField);
		BaseField.setColumns(10);
		
		
		formaLabel.setBounds(10, 209, 14, 14);
		frame.getContentPane().add(formaLabel);
		
		
		Resultado.setBounds(183, 152, 212, 42);
		frame.getContentPane().add(Resultado);
//		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("<< Voltar");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfaceMultOperacoes voltar = new InterfaceMultOperacoes();	
				frame.dispose();
			}});
		
		menuBar.add(mnNewMenu);
	}

}

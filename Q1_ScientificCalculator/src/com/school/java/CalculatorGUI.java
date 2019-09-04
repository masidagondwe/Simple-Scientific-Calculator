package com.school.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;


public class CalculatorGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEquation;
	private JTextField txtCurrentResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlDisplay = new JPanel();
		pnlDisplay.setBackground(SystemColor.controlHighlight);
		pnlDisplay.setBounds(5, 5, 424, 78);
		contentPane.add(pnlDisplay);
		pnlDisplay.setLayout(null);
		
		txtEquation = new JTextField();
		txtEquation.setBackground(SystemColor.controlHighlight);
		txtEquation.setBounds(10, 5, 404, 32);
		pnlDisplay.add(txtEquation);
		txtEquation.setColumns(10);
		
		txtCurrentResult = new JTextField();
		txtCurrentResult.setForeground(SystemColor.window);
		txtCurrentResult.setBackground(SystemColor.controlHighlight);
		txtCurrentResult.setBounds(162, 37, 252, 32);
		pnlDisplay.add(txtCurrentResult);
		txtCurrentResult.setColumns(12);
		
		JPanel pnlCommands = new JPanel();
		pnlCommands.setBounds(5, 82, 424, 221);
		contentPane.add(pnlCommands);
		pnlCommands.setLayout(new BoxLayout(pnlCommands, BoxLayout.X_AXIS));
	
	}

}

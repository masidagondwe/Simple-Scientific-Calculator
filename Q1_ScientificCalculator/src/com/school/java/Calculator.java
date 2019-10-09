package com.school.java;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Calculator extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static JPanel contentPane;
	private static JTextField txtEquation;
	private static JTextField txtCurrentResult;

	static JFrame fDisplay;

	// store operator & operands
	String s0, s1, s2;

	// default constructor
	Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 425, 514);

		s0 = s1 = s2 = "";
	}

	/**
	 * Launch the application.
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// create a frame
		fDisplay = new JFrame("Scientific Calculator");

		try {
			// set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// create a object of class
		Calculator mCal = new Calculator();

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		JPanel pnlDisplay = new JPanel();
		pnlDisplay.setBackground(SystemColor.controlHighlight);
		pnlDisplay.setBounds(5, 5, 400, 78);
		contentPane.add(pnlDisplay);
		pnlDisplay.setLayout(null);

		txtEquation = new JTextField();
		txtEquation.setBackground(SystemColor.controlHighlight);
		txtEquation.setBounds(10, 5, 380, 32);
		pnlDisplay.add(txtEquation);
		txtEquation.setColumns(10);
		txtEquation.setEditable(false);

		txtCurrentResult = new JTextField();
		txtCurrentResult.setForeground(SystemColor.window);
		txtCurrentResult.setBackground(SystemColor.controlHighlight);
		txtCurrentResult.setBounds(10, 35, 380, 32);
		pnlDisplay.add(txtCurrentResult);
		txtCurrentResult.setColumns(12);
		txtCurrentResult.setEditable(false);

		JPanel pnlCommands = new JPanel();
		pnlCommands.setBounds(5, 82, 400, 335);
		contentPane.add(pnlCommands);
		pnlCommands.setLayout(null);

		// Calculator : Row 1
		JButton btnX2 = new JButton("^");
		btnX2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnX2.setBackground(SystemColor.control);
		btnX2.setBounds(12, 11, 74, 50);
		pnlCommands.add(btnX2);

		JButton btnN = new JButton("|x|");
		btnN.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnN.setBackground(SystemColor.control);
		btnN.setBounds(88, 11, 74, 50);// (12, 224, 74, 50);
		pnlCommands.add(btnN);

		JButton btnSIN = new JButton("sin");
		btnSIN.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnSIN.setBackground(SystemColor.control);
		btnSIN.setBounds(164, 11, 74, 50);
		pnlCommands.add(btnSIN);

		JButton btnCOS = new JButton("cos");
		btnCOS.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnCOS.setBackground(SystemColor.control);
		btnCOS.setBounds(240, 11, 74, 50);
		pnlCommands.add(btnCOS);

		JButton btnTAN = new JButton("tan");
		btnTAN.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnTAN.setBackground(SystemColor.control);
		btnTAN.setBounds(316, 11, 74, 50);
		pnlCommands.add(btnTAN);

		// Calculator : Row 2
		JButton btnSqRoot = new JButton("√");
		btnSqRoot.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnSqRoot.setBackground(SystemColor.control);
		btnSqRoot.setBounds(12, 65, 74, 50);
		pnlCommands.add(btnSqRoot);

		JButton btnPi = new JButton("π");
		btnPi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPi.setBackground(SystemColor.control);
		btnPi.setBounds(88, 65, 74, 50);// (12, 171, 74, 50);
		pnlCommands.add(btnPi);

		JButton btnLOG = new JButton("log");
		btnLOG.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnLOG.setBackground(SystemColor.control);
		btnLOG.setBounds(164, 65, 74, 50);
		pnlCommands.add(btnLOG);

		JButton btnExp = new JButton("e^x");
		btnExp.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnExp.setBackground(SystemColor.control);
		btnExp.setBounds(240, 65, 74, 50);
		pnlCommands.add(btnExp);

		JButton btnMod = new JButton("mod");
		btnMod.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnMod.setBackground(SystemColor.control);
		btnMod.setBounds(316, 65, 74, 50);
		pnlCommands.add(btnMod);

		// Calculator : Row 3
		JButton btnX = new JButton("*");
		btnX.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnX.setBackground(SystemColor.control);
		btnX.setBounds(12, 118, 74, 50);// (316, 171, 74, 50);
		pnlCommands.add(btnX);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Calibri", Font.BOLD, 22));
		btn7.setBackground(SystemColor.textHighlightText);
		btn7.setBounds(88, 118, 74, 50);// 171
		pnlCommands.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Calibri", Font.BOLD, 22));
		btn8.setBackground(SystemColor.window);
		btn8.setBounds(164, 118, 74, 50);
		pnlCommands.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Calibri", Font.BOLD, 22));
		btn9.setBackground(SystemColor.window);
		btn9.setBounds(240, 118, 74, 50);
		pnlCommands.add(btn9);

		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnDiv.setBackground(SystemColor.control);
		btnDiv.setBounds(316, 118, 74, 50);// (12, 118, 74, 50);
		pnlCommands.add(btnDiv);
		
		/*
		 * JButton btnC = new JButton("C"); btnC.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16)); btnC.setBackground(SystemColor.control);
		 * btnC.setBounds(316, 118, 74, 50);// (164, 118, 74, 50);
		 * pnlCommands.add(btnC);
		 */

		// Calculator : Row 4
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnMinus.setBackground(SystemColor.control);
		btnMinus.setBounds(12, 171, 74, 50);// (316, 224, 74, 50);
		pnlCommands.add(btnMinus);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Calibri", Font.BOLD, 22));
		btn4.setBackground(SystemColor.window);
		btn4.setBounds(88, 171, 74, 50);
		pnlCommands.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Calibri", Font.BOLD, 22));
		btn5.setBackground(SystemColor.window);
		btn5.setBounds(164, 171, 74, 50);
		pnlCommands.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Calibri", Font.BOLD, 22));
		btn6.setBackground(SystemColor.window);
		btn6.setBounds(240, 171, 74, 50);// 224
		pnlCommands.add(btn6);

		/*
		 * JButton btnBack = new JButton("<-"); btnBack.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16)); btnBack.setBackground(SystemColor.control);
		 * btnBack.setBounds(316, 171, 74, 50);//(240, 118, 74, 50);
		 * pnlCommands.add(btnBack);
		 */
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnC.setBackground(SystemColor.control);
		btnC.setBounds(316, 171, 74, 50);// (164, 118, 74, 50);
		pnlCommands.add(btnC);
		
		
		// Calculator : Row 5
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPlus.setBackground(SystemColor.control);
		btnPlus.setBounds(12, 224, 74, 50);// (316, 277, 74, 50);
		pnlCommands.add(btnPlus);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Calibri", Font.BOLD, 22));
		btn1.setBackground(SystemColor.window);
		btn1.setBounds(88, 224, 74, 50);
		pnlCommands.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Calibri", Font.BOLD, 22));
		btn2.setBackground(SystemColor.window);
		btn2.setBounds(164, 224, 74, 50);
		pnlCommands.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Calibri", Font.BOLD, 22));
		btn3.setBackground(SystemColor.window);
		btn3.setBounds(240, 224, 74, 50);// 277
		pnlCommands.add(btn3);

		/*
		 * JButton btnDiv = new JButton("/"); btnDiv.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16)); btnDiv.setBackground(SystemColor.control);
		 * btnDiv.setBounds(316, 224, 74, 50);// (12, 118, 74, 50);
		 * pnlCommands.add(btnDiv);
		 */

		// Calculator : Row 6
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPoint.setBackground(SystemColor.control);
		btnPoint.setBounds(12, 277, 74, 50);// 332
		pnlCommands.add(btnPoint);
		/*
		 * JButton btnBrac1 = new JButton("("); btnBrac1.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16)); btnBrac1.setBackground(SystemColor.control);
		 * btnBrac1.setBounds(12, 277, 74, 50); pnlCommands.add(btnBrac1);
		 * 
		 * JButton btnBrac2 = new JButton(")"); btnBrac2.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16));
		 * 
		 * btnBrac2.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } });
		 * 
		 * btnBrac2.setBackground(SystemColor.control); btnBrac2.setBounds(88, 277, 74,
		 * 50); pnlCommands.add(btnBrac2);
		 */

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Calibri", Font.BOLD, 22));
		btn0.setBackground(SystemColor.window);
		btn0.setBounds(88, 277, 225, 50);
		pnlCommands.add(btn0);

		/*
		 * JButton btnPoint = new JButton("."); btnPoint.setFont(new Font("Segoe UI",
		 * Font.PLAIN, 16)); btnPoint.setBackground(SystemColor.control);
		 * btnPoint.setBounds(240, 277, 74, 50);// 332 pnlCommands.add(btnPoint);
		 */

		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnEq.setBackground(SystemColor.control);
		btnEq.setBounds(316, 224, 74, 105);
		pnlCommands.add(btnEq);

		// Calculator : Add button event listeners
		btnX2.addActionListener(mCal);
		btnSIN.addActionListener(mCal);
		btnCOS.addActionListener(mCal);
		btnTAN.addActionListener(mCal);
		btnSqRoot.addActionListener(mCal);
		btnLOG.addActionListener(mCal);
		btnExp.addActionListener(mCal);
		btnMod.addActionListener(mCal);
		btnC.addActionListener(mCal);
//		btnBack.addActionListener(mCal);
		btnDiv.addActionListener(mCal);
		btnPi.addActionListener(mCal);
		btn7.addActionListener(mCal);
		btn8.addActionListener(mCal);
		btn9.addActionListener(mCal);
		btnX.addActionListener(mCal);
		btnN.addActionListener(mCal);
		btn4.addActionListener(mCal);
		btn5.addActionListener(mCal);
		btn6.addActionListener(mCal);
		btnMinus.addActionListener(mCal);
		btn1.addActionListener(mCal);
		btn2.addActionListener(mCal);
		btn3.addActionListener(mCal);
		btnPlus.addActionListener(mCal);
		/*
		 * btnBrac1.addActionListener(mCal); btnBrac2.addActionListener(mCal);
		 */
		btn0.addActionListener(mCal);
		btnPoint.addActionListener(mCal);
		btnEq.addActionListener(mCal);

		contentPane.setBackground(Color.black);
		fDisplay.add(contentPane);
		fDisplay.setSize(425, 460);
		fDisplay.show();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		// String eq = "";

		double result = 0;
		// if the value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if operand is present then add to second no
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;

			// set the value of text
			txtEquation.setText(s0 + s1 + s2);
			// txtCurrentResult.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == 'C') {
			// clear the one letter
			s0 = s1 = s2 = "";

			// set the value of text
			txtEquation.setText(s0 + s1 + s2);
			txtCurrentResult.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == '=') {

			// store the value in 1st
			switch (s1) {
			case "+":
				// txtEquation.setText(s0 + s1 + s);
				result = (Double.parseDouble(s0) + Double.parseDouble(s2));
				break;
			case "-":
				result = (Double.parseDouble(s0) - Double.parseDouble(s2));
				break;
			case "/":
				result = (Double.parseDouble(s0) / Double.parseDouble(s2));
				break;
			case "*":
				result = (Double.parseDouble(s0) * Double.parseDouble(s2));
				break;
			case "^":
				result = (Math.pow(Double.parseDouble(s0), Double.parseDouble(s2)));
				break;
			case "√":
				// txtEquation.setText(s0 + s1 + s2);
				result = Double.parseDouble(s0) + (Math.sqrt(Double.parseDouble(s2)));// ?(Math.sqrt(result));
				break;
			case "|x|":
				// txtEquation.setText(s0 + s1 + s2);
				result = Double.parseDouble(s0) + (Math.abs(Double.parseDouble(s2)));// ?(Math.sqrt(result));
				break;
			case "cos":
				result = Double.parseDouble(s0) + (Math.cos((Double.parseDouble(s2))));// ?(Math.cos(result));
				break;
			case "sin":
				result = Double.parseDouble(s0) + (Math.sin((Double.parseDouble(s2))));// ?(Math.cos(result));
				break;
			case "tan":
				result = Double.parseDouble(s0) + (Math.tan((Double.parseDouble(s2))));// ?(Math.cos(result));
				break;
			case "π":
				result = Double.parseDouble(s0) + Math.PI;
				break;
			case "e":
				result = Double.parseDouble(s0) + ((Double.parseDouble(s0) * Double.parseDouble(s2)) * Math.E);
				break;
			case "mod":
				result = Double.parseDouble(s0) + (Double.parseDouble(s0) % Double.parseDouble(s2));
				break;
			}

			// set the value of text
			txtCurrentResult.setText(Double.toString(result)); // (s0 + s1 + s2 + "=" + result);

			// convert it to string
			s0 = Double.toString(result);

			s1 = s2 = "";
		} else {
			// if there was no operand
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			// else evaluate
			else {
				// double result = 0;

				// store the value in 1st
				switch (s1) {
				case "+":
					result = (Double.parseDouble(s0) + Double.parseDouble(s2));
					break;
				case "-":
					result = (Double.parseDouble(s0) - Double.parseDouble(s2));
					break;
				case "/":
					result = (Double.parseDouble(s0) / Double.parseDouble(s2));
					break;
				case "*":
					result = (Double.parseDouble(s0) * Double.parseDouble(s2));
					break;
				case "^":
					result = (Math.pow(Double.parseDouble(s0), Double.parseDouble(s2)));
					break;
				case "√":
					result = (Math.sqrt(Double.parseDouble(s2)));// ?(Math.sqrt(result));
					break;
				case "cos":
					result = (Math.cos((Double.parseDouble(s2))));// ?(Math.cos(result));
					break;
				case "sin":
					result = (Math.sin((Double.parseDouble(s2))));// ?(Math.cos(result));
					break;
				case "tan":
					result = (Math.tan((Double.parseDouble(s2))));// ?(Math.cos(result));
					break;
				case "π":
					result = Math.PI;
					break;
				case "e":
					result = ((Double.parseDouble(s0) * Double.parseDouble(s2)) * Math.E);
					break;
				case "mod":
					result = (Double.parseDouble(s0) % Double.parseDouble(s2));
					break;
				}
				// convert it to string
				s0 = Double.toString(result);

				// place the operator
				s1 = s;

				// make the operand blank
				s2 = "";
			}

			// set the value of text
			// txtCurrentResult.setText(Double.toString(result));//(s0 + s1 + s2);
		}
	}
}

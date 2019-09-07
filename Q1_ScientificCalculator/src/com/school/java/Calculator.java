package com.school.java;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */ 
	//private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	//private JTextField txtEquation;
	//private JTextField txtCurrentResult;
	
	static JFrame f;
	
	static JTextField txtF;
	
	//store operator & operands
	String s0, s1, s2;
	
	//default constructor
	Calculator () {
		s0 = s1 = s2 ="";
	}

	/**
	 * Launch the application.
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	    // create a frame 
	    f = new JFrame("Scientific Calculator");
	    
	    try {
	    	// set look and feel 
	    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
	    } catch (Exception e) { 
	    	System.err.println(e.getMessage()); 
	    } 
	    
        // create a object of class 
        Calculator mCal = new Calculator(); 
  
        // create a text field 
        txtF = new JTextField(33); 
        txtF.setEditable(false); 
       // txtF.setBounds(100,60,150,30);
        // create number buttons and some operators 
        JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, 
        btnAdd, btnMinus, btnDiv, btnMulti, 
        btnSin, btnCos, btnTan, btnE, btnPi, btnMod, btnPower, btnSqRt,
        btnBack, btnOpBrac, btnClBrac, btnPoint, btnCls, btnEq; 
  
        // create number buttons 
        btn0 = new JButton("0"); 
        btn1 = new JButton("1"); 
        btn2 = new JButton("2"); 
        btn3 = new JButton("3"); 
        btn4 = new JButton("4"); 
        btn5 = new JButton("5"); 
        btn6 = new JButton("6"); 
        btn7 = new JButton("7"); 
        btn8 = new JButton("8"); 
        btn9 = new JButton("9");     
        

        // create operator buttons 
        btnAdd = new JButton("+"); 
        btnMinus = new JButton("-"); 
        btnDiv = new JButton("/"); 
        btnMulti = new JButton("*"); 
        
        btnSin = new JButton("sin"); 
        btnCos = new JButton("cos"); 
        btnTan = new JButton("tan"); 
        btnE = new JButton("e");  
        btnPi = new JButton("π"); 
        btnMod = new JButton("mod"); 
        btnPower = new JButton("^"); 
        btnSqRt = new JButton("√");              
  
        //text field related controls
        btnCls = new JButton("C"); 
        btnBack = new JButton("<-"); 
         
        btnPoint = new JButton("."); 
        btnOpBrac = new JButton("("); 
        btnClBrac = new JButton(")");       
        
        // equals button 
        btnEq = new JButton("="); 
  
        // create  panels 
        JPanel pBase = new JPanel(); 
        JPanel pBtns = new JPanel(new GridLayout(0,5)); 
       // JPanel pBtns = new JPanel(new GridLayout(0,1)); 
        
        // add action listeners 
        btn9.addActionListener(mCal);
        btn8.addActionListener(mCal);
        btn7.addActionListener(mCal);
        btn6.addActionListener(mCal);
        btn5.addActionListener(mCal);
        btn4.addActionListener(mCal);
        btn3.addActionListener(mCal);
        btn2.addActionListener(mCal);
        btn1.addActionListener(mCal);
        btn0.addActionListener(mCal);  
        btnAdd.addActionListener(mCal);
        btnMinus.addActionListener(mCal);
        btnMulti.addActionListener(mCal);
        btnDiv.addActionListener(mCal);
        
        btnSin.addActionListener(mCal);
        btnCos.addActionListener(mCal);
        btnTan.addActionListener(mCal);
        btnE.addActionListener(mCal);
        btnPi.addActionListener(mCal);
        btnMod.addActionListener(mCal);
        btnPower.addActionListener(mCal);
        btnSqRt.addActionListener(mCal); 
        
        btnPoint.addActionListener(mCal);
        btnOpBrac.addActionListener(mCal);
        btnClBrac.addActionListener(mCal);
        
        btnCls.addActionListener(mCal);
        btnBack.addActionListener(mCal);
        btnEq.addActionListener(mCal);
  
        // add elements to panel 
        pBase.add(txtF);

        //row 1
      pBtns.add(btnCos);
      pBtns.add(btnSin);
      pBtns.add(btnTan);
      pBtns.add(btnBack);
      pBtns.add(btnCls);
        //row 2
      pBtns.add(btnPi);
      pBtns.add(btnE);
      pBtns.add(btnMod);
      pBtns.add(btnOpBrac);
      pBtns.add(btnClBrac);
        //row 3
       pBtns.add(btn7); 
       pBtns.add(btn8); 
       pBtns.add(btn9);        
       pBtns.add(btnAdd); 
       pBtns.add(btnPower); 
        //row 4
       pBtns.add(btn4); 
       pBtns.add(btn5); 
       pBtns.add(btn6);
       pBtns.add(btnMinus);
       pBtns.add(btnSqRt);
        //row 5
       pBtns.add(btn1); 
       pBtns.add(btn2); 
       pBtns.add(btn3);                  
       pBtns.add(btnMulti); 
       pBtns.add(btnEq);// takes up tow rows
        
       pBtns.add(btn0); 
       pBtns.add(btnPoint);
       pBtns.add(btnDiv); 
         

        // set Background of panel 
        pBase.add(pBtns);

        pBase.setBackground(Color.black); 
  
        // add panel to frame 
        f.add(pBase); 
  
        f.setSize(350, 220); 
        f.show();         
        
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
        // if the value is a number 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            // set the value of text 
            txtF.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') { 
            // clear the one letter 
            s0 = s1 = s2 = ""; 
  
            // set the value of text 
            txtF.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
  
            // store the value in 1st 
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
            // set the value of text 
            txtF.setText(s0 + s1 + s2 + "=" + te); 
  
            // convert it to string 
            s0 = Double.toString(te); 
  
            s1 = s2 = ""; 
        } 
        else { 
            // if there was no operand 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            // else evaluate 
            else { 
                double te; 
  
                // store the value in 1st 
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
                // convert it to string 
                s0 = Double.toString(te); 
  
                // place the operator 
                s1 = s; 
  
                // make the operand blank 
                s2 = ""; 
            } 
  
            // set the value of text 
            txtF.setText(s0 + s1 + s2); 
        } 
		
	}

	/**
	 * Create the frame.
	 */
	/*public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 425, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		
		txtCurrentResult = new JTextField();
		txtCurrentResult.setForeground(SystemColor.window);
		txtCurrentResult.setBackground(SystemColor.controlHighlight);
		txtCurrentResult.setBounds(10, 35, 380, 32);
		pnlDisplay.add(txtCurrentResult);
		txtCurrentResult.setColumns(12);
		
		JPanel pnlCommands = new JPanel();
		pnlCommands.setBounds(5, 82, 400, 393);
		contentPane.add(pnlCommands);
		pnlCommands.setLayout(null);
		
		 JButton btnX2 = new JButton("x^2");
		btnX2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnX2.setBackground(SystemColor.control);
		btnX2.setBounds(12, 11, 74, 50);
		pnlCommands.add(btnX2);
		
		JButton btnXY = new JButton("x^y");
		btnXY.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnXY.setBackground(SystemColor.control);
		btnXY.setBounds(88, 11, 74, 50);
		pnlCommands.add(btnXY);
		
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
		
		JButton btnSqRoot = new JButton("x^y");
		btnSqRoot.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnSqRoot.setBackground(SystemColor.control);
		btnSqRoot.setBounds(12, 65, 74, 50);
		pnlCommands.add(btnSqRoot);
		
		JButton btn10X = new JButton("10^x");
		btn10X.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btn10X.setBackground(SystemColor.control);
		btn10X.setBounds(88, 65, 74, 50);
		pnlCommands.add(btn10X);
		
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
		
		JButton button_1 = new JButton("x^y");
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		button_1.setBackground(SystemColor.control);
		button_1.setBounds(12, 118, 74, 50);
		pnlCommands.add(button_1);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnCe.setBackground(SystemColor.control);
		btnCe.setBounds(88, 118, 74, 50);
		pnlCommands.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnC.setBackground(SystemColor.control);
		btnC.setBounds(164, 118, 74, 50);
		pnlCommands.add(btnC);
		
		JButton btnBack = new JButton("<-");
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnBack.setBackground(SystemColor.control);
		btnBack.setBounds(240, 118, 74, 50);
		pnlCommands.add(btnBack);
		
		JButton btnDiv = new JButton("div");
		btnDiv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnDiv.setBackground(SystemColor.control);
		btnDiv.setBounds(316, 118, 74, 50);
		pnlCommands.add(btnDiv);
		
		JButton btnPi = new JButton("pi");
		btnPi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPi.setBackground(SystemColor.control);
		btnPi.setBounds(12, 171, 74, 50);
		pnlCommands.add(btnPi);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Calibri", Font.BOLD, 22));
		btn7.setBackground(SystemColor.textHighlightText);
		btn7.setBounds(88, 171, 74, 50);
		pnlCommands.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Calibri", Font.BOLD, 22));
		btn8.setBackground(SystemColor.window);
		btn8.setBounds(164, 171, 74, 50);
		pnlCommands.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Calibri", Font.BOLD, 22));
		btn9.setBackground(SystemColor.window);
		btn9.setBounds(240, 171, 74, 50);
		pnlCommands.add(btn9);
		
		JButton btnX = new JButton("*");
		btnX.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnX.setBackground(SystemColor.control);
		btnX.setBounds(316, 171, 74, 50);
		pnlCommands.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnN.setBackground(SystemColor.control);
		btnN.setBounds(12, 224, 74, 50);
		pnlCommands.add(btnN);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Calibri", Font.BOLD, 22));
		btn4.setBackground(SystemColor.window);
		btn4.setBounds(88, 224, 74, 50);
		pnlCommands.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Calibri", Font.BOLD, 22));
		btn5.setBackground(SystemColor.window);
		btn5.setBounds(164, 224, 74, 50);
		pnlCommands.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Calibri", Font.BOLD, 22));
		btn6.setBackground(SystemColor.window);
		btn6.setBounds(240, 224, 74, 50);
		pnlCommands.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnMinus.setBackground(SystemColor.control);
		btnMinus.setBounds(316, 224, 74, 50);
		pnlCommands.add(btnMinus);
		
		JButton button_18 = new JButton("x^y");
		button_18.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		button_18.setBackground(SystemColor.control);
		button_18.setBounds(12, 277, 74, 50);
		pnlCommands.add(button_18);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Calibri", Font.BOLD, 22));
		btn1.setBackground(SystemColor.window);
		btn1.setBounds(88, 277, 74, 50);
		pnlCommands.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Calibri", Font.BOLD, 22));
		btn2.setBackground(SystemColor.window);
		btn2.setBounds(164, 277, 74, 50);
		pnlCommands.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Calibri", Font.BOLD, 22));
		btn3.setBackground(SystemColor.window);
		btn3.setBounds(240, 277, 74, 50);
		pnlCommands.add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPlus.setBackground(SystemColor.control);
		btnPlus.setBounds(316, 277, 74, 50);
		pnlCommands.add(btnPlus);
		
		JButton btnBrac1 = new JButton("(");
		btnBrac1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnBrac1.setBackground(SystemColor.control);
		btnBrac1.setBounds(12, 332, 74, 50);
		pnlCommands.add(btnBrac1);
		
		JButton btnBrac2 = new JButton(")");
		btnBrac2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnBrac2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBrac2.setBackground(SystemColor.control);
		btnBrac2.setBounds(88, 332, 74, 50);
		pnlCommands.add(btnBrac2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Calibri", Font.BOLD, 22));
		btn0.setBackground(SystemColor.window);
		btn0.setBounds(164, 332, 74, 50);
		pnlCommands.add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnPoint.setBackground(SystemColor.control);
		btnPoint.setBounds(240, 332, 74, 50);
		pnlCommands.add(btnPoint);
		
		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnEq.setBackground(SystemColor.control);
		btnEq.setBounds(316, 332, 74, 50);
		pnlCommands.add(btnEq); 
	
	}*/
}

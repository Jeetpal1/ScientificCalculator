/**
 * @author Jeetpal Singh (singhjeetpal001@gmail.com)
 * This Application can perform scientific calculations.
 * 
 * Why I made this project?
 * Ans: I am taking minor in Mathematics, and while studying courses, I use calculator most of the time.
 * I realized that I may need more functionalities in a scientific calculator in order to be more productive. For example, a result with specific number of digits after decimal point etc.
 * So, I made this project which can be modified by me according to my need. For example, if I am taking some Binary language course. I can add functionality to convert a number
 * to different number form such as Binary, Hexadecimal, octal etc.
 * 
 * Moreover, it was fun to make something useful:)
 * */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class ScientificCalculator {
	
	//Creating some variable to use
	double firstOp;
	double secondOp;
	double result;
	String operator;

	//Creating buttons and text field
	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnPlusMinus;
	private JButton btnPercentage;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnSin;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnBack;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnDot;
	private JButton btnDiv;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnAdd;
	private JButton btnEqual;
	private JButton btnClear;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnSinh;
	private JButton btnCosh;
	private JButton btnTanh;
	private JButton btnR;
	private JButton btnEx;
	private JButton btnLog;
	private JButton btnx;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}
	
	
	/**
	 * Recursively find factorial of number n
	 * @param n find factorial of this number
	 * @return double factorial of given number
	 * */
	private double fact(double n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n-1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JEETPAL'S SCIENTIFIC CALCULATOR");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 320, 49);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(10, 57, 315, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("Press 'ON' button to start.");
		
		btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x^y";
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton_2.setBounds(10, 254, 59, 57);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(textField.getText()+(temp*temp*temp));
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton_3.setBounds(10, 311, 59, 57);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(textField.getText()+(temp*temp));
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton_4.setBounds(10, 368, 59, 57);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp  = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(textField.getText() + fact(temp));
				
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_5.setBounds(10, 425, 59, 57);
		frame.getContentPane().add(btnNewButton_5);
		
		btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//getting the current value in the text field and swapping the sign
				textField.setText(String.valueOf((Double.parseDouble(String.valueOf(textField.getText()))) * (-1)));
			}
		});
		btnPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnPlusMinus.setBounds(10, 482, 59, 57);
		frame.getContentPane().add(btnPlusMinus);
		
		btnPercentage = new JButton("%");
		btnPercentage.setEnabled(false);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnPercentage.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnPercentage.setBounds(74, 254, 59, 57);
		frame.getContentPane().add(btnPercentage);
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn7.getText());
			}
		});
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn7.setBounds(74, 311, 59, 57);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn4.getText());
			}
		});
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn4.setBounds(74, 368, 59, 57);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn1.setBounds(74, 425, 59, 57);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn0.getText());
			}
		});
		btn0.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn0.setBounds(74, 482, 121, 57);
		frame.getContentPane().add(btn0);
		
		btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.sin(temp));
			}
		});
		btnSin.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnSin.setBounds(136, 139, 59, 57);
		frame.getContentPane().add(btnSin);
		
		btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnClear.setBounds(136, 254, 59, 57);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn8.setBounds(136, 311, 59, 57);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn5.getText());
			}
		});
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn5.setBounds(136, 368, 59, 57);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn2.setBounds(136, 425, 59, 57);
		frame.getContentPane().add(btn2);
		//Here \uF0E7 represents a left arrow symbol, which will work as a back space button in our calculator
		btnBack = new JButton("\uF0E7");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					textField.setText(str.toString());
					
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBack.setBounds(199, 254, 59, 57);
		frame.getContentPane().add(btnBack);
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn9.getText());
			}
		});
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn9.setBounds(199, 311, 59, 57);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn6.getText());
			}
		});
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn6.setBounds(199, 368, 59, 57);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn3.getText());
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn3.setBounds(199, 425, 59, 57);
		frame.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnDot.setBounds(199, 482, 59, 57);
		frame.getContentPane().add(btnDot);
		
		btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnDiv.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnDiv.setBounds(264, 254, 59, 57);
		frame.getContentPane().add(btnDiv);
		
		btnMul = new JButton("x");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnMul.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnMul.setBounds(264, 311, 59, 57);
		frame.getContentPane().add(btnMul);
		
		btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnSub.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnSub.setBounds(264, 368, 59, 57);
		frame.getContentPane().add(btnSub);
		
		btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstOp = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnAdd.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnAdd.setBounds(264, 425, 59, 57);
		frame.getContentPane().add(btnAdd);
		
		btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondOp = Double.parseDouble(textField.getText());
				switch(operator) {
				case "+":
					result = firstOp+secondOp;
					break;
				case "-":
					result = firstOp-secondOp;
					break;
				case "*":
					result = firstOp*secondOp;
					break;
				case "/":
					result = firstOp/secondOp;
					break;
				case "%":
					result = firstOp%secondOp;
					break;
				case "x^y":
					result = firstOp;
					while(secondOp > 1) {
						result *= result;
						secondOp--;
					}

					break;
					
				default:
					textField.setText("Error, invalid operator Mr/Dr/Miss/Mrs or anything else:)");
					
				}
				textField.setText(String.format("%.2f", result));
			}
		});
		btnEqual.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnEqual.setBounds(264, 482, 59, 57);
		frame.getContentPane().add(btnEqual);
		
		btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.cos(temp));
			}
		});
		btnCos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCos.setBounds(199, 139, 59, 57);
		frame.getContentPane().add(btnCos);
		
		btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.tan(temp));
			}
		});
		btnTan.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnTan.setBounds(264, 139, 59, 57);
		frame.getContentPane().add(btnTan);
		
		btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.sinh(temp));
			}
		});
		btnSinh.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnSinh.setBounds(136, 197, 59, 57);
		frame.getContentPane().add(btnSinh);
		
		btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.cosh(temp));
			}
		});
		btnCosh.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		btnCosh.setBounds(199, 197, 59, 57);
		frame.getContentPane().add(btnCosh);
		
		btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.tanh(temp));
			}
		});
		btnTanh.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		btnTanh.setBounds(264, 197, 59, 57);
		frame.getContentPane().add(btnTanh);
		
		btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.sqrt(temp));
			}
		});
		btnR.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnR.setBounds(11, 139, 59, 57);
		frame.getContentPane().add(btnR);
		
		btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.exp(temp));
			}
		});
		btnEx.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnEx.setBounds(74, 139, 59, 57);
		frame.getContentPane().add(btnEx);
		
		btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(""+Math.log(temp));
			}
		});
		btnLog.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnLog.setBounds(74, 197, 59, 57);
		frame.getContentPane().add(btnLog);
		
		btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = (1/Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(""+ temp);
			}
		});
		btnx.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnx.setBounds(11, 197, 59, 57);
		frame.getContentPane().add(btnx);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnEqual.setEnabled(true);
				btnMul.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDiv.setEnabled(true);
				btnSub.setEnabled(true);
				btnDot.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnR.setEnabled(true);
				btnx.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnLog.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnClear.setEnabled(true);
				btnBack.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 113, 59, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnEqual.setEnabled(false);
				btnMul.setEnabled(false);
				btnAdd.setEnabled(false);
				btnDiv.setEnabled(false);
				btnSub.setEnabled(false);
				btnDot.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnR.setEnabled(false);
				btnx.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnLog.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnClear.setEnabled(false);
				btnBack.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(76, 113, 57, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}

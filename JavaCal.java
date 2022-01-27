package javaCal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class JavaCal {

	private JFrame frmJavacalculator;
	private JTextField textField;
	private double material;	// 텍스트필드에 있던 값
	private double result; // 계산결과 저장 => '='누르면 띄우기
	private int fieldRefresh = 0;	// 1이면 이벤트 발생 시 화면 초기화 -> 초기화 후 0
	private int operator = 0;	// + = 1, - = 2, * = 3, / = 4

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCal window = new JavaCal();
					window.frmJavacalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/******************************************************
		
							COMPONENTS
		
		*******************************************************/
		
		frmJavacalculator = new JFrame();
		frmJavacalculator.setTitle("JavaCalculator");
		frmJavacalculator.setBounds(100, 100, 290, 430);
		frmJavacalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavacalculator.getContentPane().setLayout(null);
		frmJavacalculator.setResizable(false);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 11, 255, 46);
		frmJavacalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ************** button number *******************
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn1.setBounds(10, 128, 60, 60);
		frmJavacalculator.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
				
				JButton btnSource = (JButton)e.getSource();	// btn1
				textField.setText(textField.getText() + btnSource.getText());		// text + 1
			}
			
		});
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn2.setBounds(75, 128, 60, 60);
		frmJavacalculator.getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
				
				JButton btnSource = (JButton)e.getSource();	// btn2
				textField.setText(textField.getText() + btnSource.getText());		// text + 2
			}
			
		});
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn3.setBounds(140, 128, 60, 60);
		frmJavacalculator.getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn3
				textField.setText(textField.getText() + btnSource.getText());		// text + 3
			}
	
		});
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn4.setBounds(10, 193, 60, 60);
		frmJavacalculator.getContentPane().add(btn4);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn4
				textField.setText(textField.getText() + btnSource.getText());		// text + 4
			}
	
		});
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn5.setBounds(75, 193, 60, 60);
		frmJavacalculator.getContentPane().add(btn5);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
				
				JButton btnSource = (JButton)e.getSource();	// btn5
				textField.setText(textField.getText() + btnSource.getText());		// text + 5
			}
	
		});
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn6.setBounds(140, 193, 60, 60);
		frmJavacalculator.getContentPane().add(btn6);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn6
				textField.setText(textField.getText() + btnSource.getText());		// text + 6
			}
	
		});
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn7.setBounds(10, 258, 60, 60);
		frmJavacalculator.getContentPane().add(btn7);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn7
				textField.setText(textField.getText() + btnSource.getText());		// text + 7
			}
	
		});
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn8.setBounds(75, 258, 60, 60);
		frmJavacalculator.getContentPane().add(btn8);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn8
				textField.setText(textField.getText() + btnSource.getText());		// text + 8
			}
	
		});
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn9.setBounds(140, 258, 60, 60);
		frmJavacalculator.getContentPane().add(btn9);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				// erase '0' and enter the text
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
				
				JButton btnSource = (JButton)e.getSource();	// btn9
				textField.setText(textField.getText() + btnSource.getText());		// text + 9
			}
	
		});
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn0.setBounds(75, 323, 60, 60);
		frmJavacalculator.getContentPane().add(btn0);
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// erase '0' and enter the text 
				if(textField.getText().equals("0") || fieldRefresh == 1) {
					textField.setText("");
					fieldRefresh = 0;
				}
		
				JButton btnSource = (JButton)e.getSource();	// btn0
				textField.setText(textField.getText() + btnSource.getText());		// text + 0
			}
	
		});
		
		// ************** button + - * / *******************
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPlus.setBounds(205, 63, 60, 60);
		frmJavacalculator.getContentPane().add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// 이전 값이 있는 경우 -> 연산자 누르면 결과 출력 = 다중연산
				// 연산자를 여러번 누른 경우이므로 연산결과를 material에 재대입
				if(material != 0) {
					/*
					material = material + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material));	// 연산결과 출력
					fieldRefresh = 1;
					operator = 1;
					*/
					
					// material , textField.getText()
					switch(operator) {	
					// + = 1 
					case 1: material = material + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); // 결과 출력
					fieldRefresh = 1; // 필드 초기화 활성화
					operator = 1; break;
					// - = 2
					case 2: material = material - Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;  
					operator = 1; break;
					// * = 3
					case 3: material = material * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;
					operator = 1; break;
					// / = 4
					case 4: material = material / Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material));	
					fieldRefresh = 1;  
					operator = 1; break;
					// operator = 0
					default: break;
					}
					
				}else {
					// 텍스트 필드에 원래 나와있던 값 (후에 입력한 값과 연산)
					material = Double.parseDouble(textField.getText());
					fieldRefresh = 1;
					operator = 1;					
				}
			}
			
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnMinus.setBounds(205, 128, 60, 60);
		frmJavacalculator.getContentPane().add(btnMinus);
		btnMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				if(material != 0) {
					
					
					// material , textField.getText()
					switch(operator) {	
					// + = 1 
					case 1: material = material + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;  
					operator = 2; break;
					// - = 2
					case 2: material = material - Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1; 
					operator = 2; break;
					// * = 3
					case 3: material = material * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1; 
					operator = 2; break;
					// / = 4
					case 4: material = material / Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material));	
					fieldRefresh = 1; 
					operator = 2; break;
					// operator = 0
					default: break;
					}
					
				}else {
					
					material = Double.parseDouble(textField.getText());
					fieldRefresh = 1;
					operator = 2;					
				}
					
			}
			
		});
		
		JButton btnMultiple = new JButton("×");
		btnMultiple.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnMultiple.setBounds(205, 193, 60, 60);
		frmJavacalculator.getContentPane().add(btnMultiple);
		btnMultiple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(material != 0) {
					
					
					// material , textField.getText()
					switch(operator) {	
					// + = 1 
					case 1: material = material + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1; 
					operator = 3; break;
					// - = 2
					case 2: material = material - Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;  
					operator = 3; break;
					// * = 3
					case 3: material = material * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;  
					operator = 3; break;
					// / = 4
					case 4: material = material / Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material));	
					fieldRefresh = 1; 
					operator = 3; break;
					// operator = 0
					default: break;
					}
					
				}else {
					
					material = Double.parseDouble(textField.getText());
					fieldRefresh = 1;
					operator = 3;					
				}
					
			}
			
		});
		
		JButton btnDivide = new JButton("÷");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDivide.setBounds(205, 258, 60, 60);
		frmJavacalculator.getContentPane().add(btnDivide);
		btnDivide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(material != 0) {
					
					
					// material , textField.getText()
					switch(operator) {	
					// + = 1 
					case 1: material = material + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1; 
					operator = 4; break;
					// - = 2
					case 2: material = material - Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1;  
					operator = 4; break;
					// * = 3
					case 3: material = material * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material)); 
					fieldRefresh = 1; 
					operator = 4; break;
					// / = 4
					case 4: material = material / Double.parseDouble(textField.getText());
					textField.setText(Double.toString(material));	
					fieldRefresh = 1; 
					operator = 4; break;
					// operator = 0
					default: break;
					}
					
				}else {
					
					material = Double.parseDouble(textField.getText());
					fieldRefresh = 1;
					operator = 4;					
				}
					
			}
			
		});
		
		// ************** button <-, %, C, =, ., +/- *******************
		
		JButton btnDelete = new JButton("←");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDelete.setBounds(10, 63, 60, 60);
		frmJavacalculator.getContentPane().add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String[] numberArr = textField.getText().split("");
				//numberArr[numberArr.length - 1] = "\0";	
				String deletedNumber = ""; 
				for(int i = 0; i < numberArr.length - 1; i++) {
					deletedNumber += numberArr[i];
				}
				if(deletedNumber.equals(""))
					textField.setText("0");
				else
					textField.setText(deletedNumber);
			}
			
		});
		
		
		JButton btnHistory = new JButton("※");
		btnHistory.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnHistory.setBounds(75, 63, 60, 60);
		frmJavacalculator.getContentPane().add(btnHistory);
		
		
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnClear.setBounds(140, 63, 60, 60);
		frmJavacalculator.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// 전역변수 초기화
				fieldRefresh = 0;			// 필드 초기화 해제
				material = 0;				// 저장 값 초기화
				operator = 0;				// 연산자 초기화
				result = 0;					// 결과 값 초기화
				textField.setText("0");		// clear text field	
			}
			
		});
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEqual.setBounds(205, 323, 60, 60);
		frmJavacalculator.getContentPane().add(btnEqual);
		btnEqual.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// material , textField.getText()
				switch(operator) {	
				// + = 1 
				case 1: result = material + Double.parseDouble(textField.getText());
				textField.setText(Double.toString(result)); // 결과 출력
				fieldRefresh = 1; // 필드 초기화 활성화
				operator = 0; material = 0; break;
				// - = 2
				case 2: result = material - Double.parseDouble(textField.getText());
				textField.setText(Double.toString(result)); 
				fieldRefresh = 1; 
				operator = 0; material = 0; break;
				// * = 3
				case 3: result = material * Double.parseDouble(textField.getText());
				textField.setText(Double.toString(result)); 
				fieldRefresh = 1; 
				operator = 0; material = 0; break;
				// / = 4
				case 4: result = material / Double.parseDouble(textField.getText());
				textField.setText(Double.toString(result));	
				fieldRefresh = 1; 
				operator = 0; material = 0; break;
				// operator = 0
				default: break;
				}
				
			}
			
		});
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPoint.setBounds(140, 323, 60, 60);
		frmJavacalculator.getContentPane().add(btnPoint);
		btnPoint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(textField.getText().contains(".") == false)	// '.'이 없다면
					textField.setText(textField.getText() + ".");
				
			}
			
		});
		
		// 텍스트필드의 부호 반대로 바꾸기
		JButton btnSwitch = new JButton("±");
		btnSwitch.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnSwitch.setBounds(10, 323, 60, 60);
		frmJavacalculator.getContentPane().add(btnSwitch);
		btnSwitch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(textField.getText().contains("-") == false) {	// positive
					textField.setText("-" + textField.getText());
				}else {												// negative
					// make positive number
					Double negaToPosi = -1 * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(negaToPosi));
				}// if
				
			}// actionPerformed
		});// ActionListener
	}// initialize
	
}// JavaCal
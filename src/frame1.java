//import java.awt.*;
import javax.swing.*;
 import javax.swing.JApplet;
// import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.CardLayout;
//import java.awt.Font;
//import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.BorderLayout;
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import javax.swing.JRadioButton;
//import javax.swing.JRadioButtonMenuItem;
//import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
//import javax.swing.JTextField;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import javax.swing.*;
//import javax.swing.event.ChangeListener;
//import javax.swing.event.ChangeEvent;



public class frame1 extends JApplet {

	public JFrame frame;
	public final ButtonGroup buttonGroup = new ButtonGroup();
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	// private JRadioButton rdbtnNewRadioButton_1;
	public JRadioButton rdbtnNewRadioButton;
	public JTextField textField_7;
	public JTextField textField_8;
	public JLabel lblNewLabel_12;
	public String saved;
	public JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("��������");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(31, 51, 149, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
	

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("������� ���");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(31, 79, 149, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		 
		
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					textField_5.setVisible(false);
					textField_2.setVisible(true);
					textField_4.setVisible(true);


				}
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					textField_5.setVisible(true);
					textField_2.setVisible(false);
					textField_4.setVisible(false);

					

					
				}
			}
		});
			
		
		JButton btnNewButton = new JButton("����������");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				double Price_Flat = 0;
				double Price_House = 0;
			    double Hot_Water = Double.parseDouble(textField.getText());
			    double Cold_Water = Double.parseDouble(textField_1.getText());
			    double Electricity = Double.parseDouble(textField_3.getText());
							
			  if  ( rdbtnNewRadioButton.isSelected() == true) {
	  
			 	double Flat_Size = Double.parseDouble(textField_4.getText());
				double Gas_Flat = Double.parseDouble(textField_2.getText());
				Price_Flat = Calculations.getPrice_Flat(Flat_Size, Hot_Water, Cold_Water, Gas_Flat, Electricity);
			   	textField_8.setText(Double.toString(Price_Flat));
			   	JOptionPane.showMessageDialog(null, "������ ��� �������� ��������");
			   	
			   	saved = textField_8.getText();
				JOptionPane.showMessageDialog(null, saved);

			  
			  }
			  
			  if (rdbtnNewRadioButton_1.isSelected() == true)  {
			    	{    				
			    	JOptionPane.showMessageDialog(null, "������ ��� ��������� ���� ��������");

			    		double Gas_House = Double.parseDouble(textField_5.getText());
			   			Price_House = Calculations.getPrice_House(Cold_Water, Gas_House, Electricity);
			   			textField_8.setText(Double.toString(Price_House));
			   		
			   
						
				} }

			    
			}
		});
		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(319, 261, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�������� ��� �������������");
		lblNewLabel.setBounds(30, 28, 366, 15);
		frame.getContentPane().add(lblNewLabel);
			
		
		
		JLabel lblNewLabel_1 = new JLabel("������� ����");
		lblNewLabel_1.setBounds(31, 110, 117, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�������� ����");
		lblNewLabel_2.setBounds(31, 137, 120, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("���.�");
		lblNewLabel_3.setBounds(237, 110, 70, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("���.�");
		lblNewLabel_4.setBounds(237, 137, 70, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("���");
		lblNewLabel_5.setBounds(31, 163, 70, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("�������������");
		lblNewLabel_6.setBounds(31, 190, 117, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("���*���");
		lblNewLabel_7.setBounds(237, 190, 70, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("���.�");
		lblNewLabel_8.setBounds(237, 163, 70, 15);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("�������");
		lblNewLabel_9.setBounds(214, 55, 70, 15);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("��.�");
		lblNewLabel_10.setBounds(355, 55, 70, 15);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("���.���.�");
		lblNewLabel_11.setBounds(355, 163, 83, 15);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField = new JTextField();
		textField.setBounds(156, 110, 63, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 135, 63, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 161, 63, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 188, 63, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(292, 53, 45, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(292, 161, 51, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(118, 229, 114, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("�����");
		lblNewLabel_12.setBounds(31, 231, 70, 15);
		frame.getContentPane().add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("�����");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        System.exit(0);
	
			/*
				Auth_Form af = new Auth_Form();
				getContentPane().add(af, "Auth");
				cl.show(getContentPane(), "Auth");
			*/
			
				
			}
		});
		btnNewButton_1.setBounds(31, 261, 117, 25);
		frame.getContentPane().add(btnNewButton_1);
		
	
		 if  ( rdbtnNewRadioButton.isSelected() == true) {

			 	textField_5.setVisible(false);

				  }  
			
			}
	}
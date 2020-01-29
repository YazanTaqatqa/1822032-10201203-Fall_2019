package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;

public class staffsalarysys extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffsalarysys frame = new staffsalarysys();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public staffsalarysys() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Staff Salary");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(327, 13, 122, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search EMP:");
		lblNewLabel_1.setBounds(59, 96, 96, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(153, 93, 296, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(649, 93, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setBounds(595, 96, 42, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(153, 125, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Employee ID:");
		lblNewLabel_3.setBounds(59, 205, 96, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("First Name:");
		lblNewLabel_4.setBounds(59, 234, 96, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Surname:");
		lblNewLabel_5.setBounds(59, 263, 96, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender:");
		lblNewLabel_6.setBounds(59, 292, 96, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("D.O.B:");
		lblNewLabel_7.setBounds(59, 321, 96, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nic no:");
		lblNewLabel_8.setBounds(59, 350, 96, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contact:");
		lblNewLabel_9.setBounds(59, 379, 96, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address 1:");
		lblNewLabel_10.setBounds(59, 408, 96, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Address 2:");
		lblNewLabel_11.setBounds(59, 437, 96, 16);
		contentPane.add(lblNewLabel_11);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 202, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 231, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(153, 260, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(153, 288, 55, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(212, 288, 82, 25);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(153, 318, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(153, 347, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(153, 376, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(153, 405, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(153, 434, 116, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Apt./House No:");
		lblNewLabel_12.setBounds(489, 205, 96, 16);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Post Code:");
		lblNewLabel_13.setBounds(489, 234, 96, 16);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Department:");
		lblNewLabel_14.setBounds(489, 263, 96, 16);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Designation:");
		lblNewLabel_15.setBounds(489, 292, 96, 16);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Date Hired: ");
		lblNewLabel_16.setBounds(489, 321, 96, 16);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Basic Salary:");
		lblNewLabel_17.setBounds(489, 350, 96, 16);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Job Title:");
		lblNewLabel_18.setBounds(489, 379, 96, 16);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Status:");
		lblNewLabel_19.setBounds(489, 408, 96, 16);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Email:");
		lblNewLabel_20.setBounds(489, 437, 96, 16);
		contentPane.add(lblNewLabel_20);
		
		textField_10 = new JTextField();
		textField_10.setBounds(595, 202, 116, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(595, 231, 116, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(595, 260, 116, 22);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(595, 289, 116, 22);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(595, 318, 116, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(595, 347, 116, 22);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(595, 376, 116, 22);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(595, 405, 116, 22);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(595, 434, 116, 22);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add record");
		btnNewButton_1.setBounds(327, 538, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(436, 538, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(545, 538, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Clear");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBounds(649, 538, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Next");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services1.main(null);
			}
		});
		btnNewButton_5.setBounds(489, 618, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Cancel");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services1.main(null);
			}
		});
		btnNewButton_6.setBounds(283, 618, 97, 25);
		contentPane.add(btnNewButton_6);
	}
}

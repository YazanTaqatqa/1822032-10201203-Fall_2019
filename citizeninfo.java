package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class citizeninfo extends JFrame {

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
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					citizeninfo frame = new citizeninfo();
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
	public citizeninfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Citizen Information System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(276, 13, 298, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID NO.");
		lblNewLabel_1.setBounds(78, 111, 76, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(166, 108, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(385, 107, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(494, 107, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBounds(603, 107, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("First Name ");
		lblNewLabel_2.setBounds(102, 195, 71, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 225, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setBounds(243, 195, 97, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 225, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setBounds(398, 195, 76, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(374, 225, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contact NO.");
		lblNewLabel_5.setBounds(78, 282, 76, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 279, 338, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("E-mail");
		lblNewLabel_6.setBounds(78, 311, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(166, 314, 338, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Personal Information");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(39, 156, 203, 26);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Permanant Address");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(39, 379, 203, 22);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Flat/Door");
		lblNewLabel_9.setBounds(102, 430, 56, 16);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(78, 459, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Name of place");
		lblNewLabel_10.setBounds(243, 430, 97, 16);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(226, 459, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Road / Street");
		lblNewLabel_11.setBounds(102, 509, 92, 16);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(78, 538, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Area/locality");
		lblNewLabel_12.setBounds(243, 509, 97, 16);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(226, 538, 116, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Town/City/District");
		lblNewLabel_13.setBounds(88, 573, 106, 16);
		contentPane.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(78, 602, 116, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("State");
		lblNewLabel_14.setBounds(243, 573, 56, 16);
		contentPane.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(226, 602, 116, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Pincode");
		lblNewLabel_15.setBounds(398, 573, 56, 16);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(374, 602, 116, 22);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Father's Name");
		lblNewLabel_16.setBounds(603, 228, 97, 16);
		contentPane.add(lblNewLabel_16);
		
		textField_13 = new JTextField();
		textField_13.setBounds(712, 225, 116, 22);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Mother's Name");
		lblNewLabel_17.setBounds(603, 282, 86, 16);
		contentPane.add(lblNewLabel_17);
		
		textField_14 = new JTextField();
		textField_14.setBounds(712, 279, 116, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Nationality");
		lblNewLabel_18.setBounds(603, 332, 86, 16);
		contentPane.add(lblNewLabel_18);
		
		textField_15 = new JTextField();
		textField_15.setBounds(712, 329, 116, 22);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Religion");
		lblNewLabel_19.setBounds(603, 385, 56, 16);
		contentPane.add(lblNewLabel_19);
		
		textField_16 = new JTextField();
		textField_16.setBounds(712, 382, 116, 22);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("NO. of Siblings");
		lblNewLabel_20.setBounds(603, 440, 86, 16);
		contentPane.add(lblNewLabel_20);
		
		textField_17 = new JTextField();
		textField_17.setBounds(712, 437, 116, 22);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("PAN No.");
		lblNewLabel_21.setBounds(603, 492, 56, 16);
		contentPane.add(lblNewLabel_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(712, 489, 116, 22);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Voter ID No.");
		lblNewLabel_22.setBounds(603, 541, 86, 16);
		contentPane.add(lblNewLabel_22);
		
		textField_19 = new JTextField();
		textField_19.setBounds(712, 538, 116, 22);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Next");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setBounds(552, 640, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cancel");
		btnNewButton_5.setBounds(328, 640, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_23 = new JLabel("These buttons will");
		lblNewLabel_23.setBounds(398, 78, 106, 16);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("**But we will need database to save the informations**");
		lblNewLabel_24.setBounds(552, 78, 324, 16);
		contentPane.add(lblNewLabel_24);
	}

}

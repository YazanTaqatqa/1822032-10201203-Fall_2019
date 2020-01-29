package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class visaapplication extends JFrame {

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
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visaapplication frame = new visaapplication();
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
	public visaapplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1098, 1018);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application for visa");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(374, 13, 175, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*Please indicate type of visa requested:");
		lblNewLabel_1.setBounds(714, 80, 231, 16);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Diplomatic Visa");
		rdbtnNewRadioButton.setBounds(724, 100, 127, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Official Visa");
		rdbtnNewRadioButton_1.setBounds(724, 124, 127, 25);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Courtesy Visa");
		rdbtnNewRadioButton_2.setBounds(724, 154, 127, 25);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Non-immigrant Visa");
		rdbtnNewRadioButton_3.setBounds(724, 184, 141, 25);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Tourist Visa");
		rdbtnNewRadioButton_4.setBounds(724, 214, 127, 25);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Transit Visa");
		rdbtnNewRadioButton_5.setBounds(724, 244, 127, 25);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Entries Requested");
		lblNewLabel_2.setBounds(714, 277, 167, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(893, 274, 52, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mr.");
		chckbxNewCheckBox.setBounds(8, 100, 52, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mrs.");
		chckbxNewCheckBox_1.setBounds(59, 100, 60, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Ms.");
		chckbxNewCheckBox_2.setBounds(123, 100, 60, 25);
		contentPane.add(chckbxNewCheckBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 101, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(319, 101, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(447, 101, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(575, 101, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setBounds(204, 80, 69, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Middle Name");
		lblNewLabel_4.setBounds(339, 80, 74, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Family Name");
		lblNewLabel_5.setBounds(588, 80, 90, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Former Name (if any)");
		lblNewLabel_6.setBounds(8, 158, 141, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(157, 155, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nationality");
		lblNewLabel_7.setBounds(8, 188, 90, 16);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 185, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nationality at Birth");
		lblNewLabel_8.setBounds(8, 218, 111, 16);
		contentPane.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(157, 215, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Birth Place");
		lblNewLabel_9.setBounds(8, 248, 69, 16);
		contentPane.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(157, 245, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Marital Status");
		lblNewLabel_10.setBounds(285, 248, 90, 16);
		contentPane.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(374, 245, 116, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Date of Birth");
		lblNewLabel_11.setBounds(8, 277, 56, 16);
		contentPane.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(157, 274, 116, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Type of Travel Document");
		lblNewLabel_12.setBounds(8, 306, 144, 16);
		contentPane.add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(157, 303, 116, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setBounds(21, 335, 56, 16);
		contentPane.add(lblNewLabel_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(157, 332, 116, 22);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Issued at");
		lblNewLabel_14.setBounds(285, 335, 56, 16);
		contentPane.add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(374, 332, 116, 22);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Date of Issue ");
		lblNewLabel_15.setBounds(8, 364, 111, 16);
		contentPane.add(lblNewLabel_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(157, 361, 116, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Expiry Date");
		lblNewLabel_16.setBounds(285, 364, 90, 16);
		contentPane.add(lblNewLabel_16);
		
		textField_15 = new JTextField();
		textField_15.setBounds(374, 361, 116, 22);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Occupation (specify present position and name of employer)");
		lblNewLabel_17.setBounds(8, 393, 367, 16);
		contentPane.add(lblNewLabel_17);
		
		textField_16 = new JTextField();
		textField_16.setBounds(8, 422, 482, 22);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Current Address");
		lblNewLabel_18.setBounds(8, 457, 111, 16);
		contentPane.add(lblNewLabel_18);
		
		textField_17 = new JTextField();
		textField_17.setBounds(157, 457, 333, 22);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Tel.");
		lblNewLabel_19.setBounds(8, 486, 56, 16);
		contentPane.add(lblNewLabel_19);
		
		textField_18 = new JTextField();
		textField_18.setBounds(157, 483, 116, 22);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("E-mail");
		lblNewLabel_20.setBounds(285, 486, 56, 16);
		contentPane.add(lblNewLabel_20);
		
		textField_19 = new JTextField();
		textField_19.setBounds(374, 483, 116, 22);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Permanent Address (if different from above)");
		lblNewLabel_21.setBounds(8, 515, 265, 16);
		contentPane.add(lblNewLabel_21);
		
		textField_20 = new JTextField();
		textField_20.setBounds(8, 544, 482, 22);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Tel.");
		lblNewLabel_22.setBounds(8, 575, 56, 16);
		contentPane.add(lblNewLabel_22);
		
		textField_21 = new JTextField();
		textField_21.setBounds(157, 572, 116, 22);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Names, dates and places of birth of minor children (if accompanying)");
		lblNewLabel_23.setBounds(8, 604, 405, 16);
		contentPane.add(lblNewLabel_23);
		
		textField_22 = new JTextField();
		textField_22.setBounds(8, 633, 482, 22);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Date of Arrival in Jordan");
		lblNewLabel_24.setBounds(8, 668, 141, 16);
		contentPane.add(lblNewLabel_24);
		
		textField_23 = new JTextField();
		textField_23.setBounds(157, 665, 116, 22);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Traveling by");
		lblNewLabel_25.setBounds(8, 697, 111, 16);
		contentPane.add(lblNewLabel_25);
		
		textField_24 = new JTextField();
		textField_24.setBounds(157, 694, 116, 22);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Flight No. or Vessel's name");
		lblNewLabel_26.setBounds(59, 726, 156, 16);
		contentPane.add(lblNewLabel_26);
		
		textField_25 = new JTextField();
		textField_25.setBounds(227, 723, 116, 22);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Duration of proposed stay");
		lblNewLabel_27.setBounds(8, 755, 156, 16);
		contentPane.add(lblNewLabel_27);
		
		textField_26 = new JTextField();
		textField_26.setBounds(157, 752, 116, 22);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Date of previous Visit to Jordan");
		lblNewLabel_28.setBounds(8, 784, 190, 16);
		contentPane.add(lblNewLabel_28);
		
		textField_27 = new JTextField();
		textField_27.setBounds(8, 813, 482, 22);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Purpose of Visa:");
		lblNewLabel_29.setBounds(8, 848, 102, 16);
		contentPane.add(lblNewLabel_29);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Tourism");
		chckbxNewCheckBox_3.setBounds(118, 844, 113, 25);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Diplomatic/Official");
		chckbxNewCheckBox_4.setBounds(59, 880, 172, 25);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Transit");
		chckbxNewCheckBox_5.setBounds(235, 844, 113, 25);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Other");
		chckbxNewCheckBox_6.setBounds(235, 880, 69, 25);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Business");
		chckbxNewCheckBox_7.setBounds(352, 844, 113, 25);
		contentPane.add(chckbxNewCheckBox_7);
		
		textField_28 = new JTextField();
		textField_28.setBounds(297, 881, 116, 22);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Countries for which travel document is valid");
		lblNewLabel_30.setBounds(622, 335, 323, 16);
		contentPane.add(lblNewLabel_30);
		
		textField_29 = new JTextField();
		textField_29.setBounds(622, 361, 377, 22);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Proposed Address in Jordan");
		lblNewLabel_31.setBounds(622, 393, 251, 16);
		contentPane.add(lblNewLabel_31);
		
		textField_30 = new JTextField();
		textField_30.setBounds(622, 422, 377, 22);
		contentPane.add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Name and Address of local Guarantor");
		lblNewLabel_32.setBounds(622, 457, 259, 16);
		contentPane.add(lblNewLabel_32);
		
		textField_31 = new JTextField();
		textField_31.setBounds(622, 483, 377, 22);
		contentPane.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("Tel./Fax.");
		lblNewLabel_33.setBounds(622, 515, 69, 16);
		contentPane.add(lblNewLabel_33);
		
		textField_32 = new JTextField();
		textField_32.setBounds(703, 512, 116, 22);
		contentPane.add(textField_32);
		textField_32.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("Name and Address of guarantor in Jordan");
		lblNewLabel_34.setBounds(622, 547, 259, 16);
		contentPane.add(lblNewLabel_34);
		
		textField_33 = new JTextField();
		textField_33.setBounds(622, 572, 377, 22);
		contentPane.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("Tel./Fax.");
		lblNewLabel_35.setBounds(622, 604, 56, 16);
		contentPane.add(lblNewLabel_35);
		
		textField_34 = new JTextField();
		textField_34.setBounds(703, 601, 116, 22);
		contentPane.add(textField_34);
		textField_34.setColumns(10);
		
		JLabel lblNewLabel_36 = new JLabel("I hereby declare that I will not request any refund from my\r\npaid visa fee even if my application has been declined.  ");
		lblNewLabel_36.setBounds(622, 636, 458, 25);
		contentPane.add(lblNewLabel_36);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment.main(null);
			}
		});
		btnNewButton.setBounds(588, 933, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services1.main(null);
			}
		});
		btnNewButton_1.setBounds(316, 933, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}
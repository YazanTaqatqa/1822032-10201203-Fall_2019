package assignment;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class permitapplicationform extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					permitapplicationform frame = new permitapplicationform();
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
	public permitapplicationform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 11, 56, 39);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(61, 11, 56, 39);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("Entry permit application form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(297, 24, 324, 26);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(173, 11, 56, 39);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(229, 11, 56, 39);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(285, 11, 56, 39);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(341, 11, 56, 39);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(397, 11, 56, 39);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(453, 11, 56, 39);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(509, 11, 56, 39);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(565, 11, 56, 39);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(621, 11, 56, 39);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(5, 50, 56, 39);
		contentPane.add(label_11);
		
		JLabel lblNewLabel_1 = new JLabel("Particulars of applicant");
		lblNewLabel_1.setBounds(15, 63, 158, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(117, 50, 56, 39);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(173, 50, 56, 39);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(229, 50, 56, 39);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(285, 50, 56, 39);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(341, 50, 56, 39);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(397, 50, 56, 39);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(453, 50, 56, 39);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(509, 50, 56, 39);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(565, 50, 56, 39);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(621, 50, 56, 39);
		contentPane.add(label_21);
		
		JLabel lblNewLabel_2 = new JLabel("Full name");
		lblNewLabel_2.setBounds(5, 89, 56, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_22 = new JLabel("");
		label_22.setBounds(61, 89, 56, 39);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setBounds(173, 89, 56, 39);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(229, 89, 56, 39);
		contentPane.add(label_24);
		
		JLabel lblNewLabel_6 = new JLabel("Father's name");
		lblNewLabel_6.setBounds(285, 89, 84, 39);
		contentPane.add(lblNewLabel_6);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(341, 89, 56, 39);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("");
		label_26.setBounds(397, 89, 56, 39);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(509, 89, 56, 39);
		contentPane.add(label_27);
		
		JLabel lblNewLabel_9 = new JLabel("Mother's name");
		lblNewLabel_9.setBounds(565, 89, 88, 39);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MR,");
		rdbtnNewRadioButton.setBounds(5, 137, 56, 30);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel label_28 = new JLabel("");
		label_28.setBounds(61, 128, 56, 39);
		contentPane.add(label_28);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MRS,");
		rdbtnNewRadioButton_1.setBounds(117, 134, 74, 33);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel label_29 = new JLabel("");
		label_29.setBounds(173, 128, 56, 39);
		contentPane.add(label_29);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("MSS,");
		rdbtnNewRadioButton_2.setBounds(229, 134, 67, 33);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(285, 128, 56, 39);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setBounds(341, 128, 56, 39);
		contentPane.add(label_31);
		
		JLabel label_34 = new JLabel("");
		label_34.setBounds(509, 128, 56, 39);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("");
		label_35.setBounds(565, 128, 56, 39);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("");
		label_36.setBounds(621, 128, 56, 39);
		contentPane.add(label_36);
		
		JLabel lblNewLabel_3 = new JLabel("Nationality");
		lblNewLabel_3.setBounds(5, 167, 74, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_37 = new JLabel("");
		label_37.setBounds(61, 167, 56, 39);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("");
		label_38.setBounds(173, 167, 56, 39);
		contentPane.add(label_38);
		
		JLabel lblNewLabel_7 = new JLabel("Place of birth");
		lblNewLabel_7.setBounds(285, 167, 100, 39);
		contentPane.add(lblNewLabel_7);
		
		JLabel label_40 = new JLabel("");
		label_40.setBounds(341, 167, 56, 39);
		contentPane.add(label_40);
		
		JLabel label_42 = new JLabel("");
		label_42.setBounds(509, 167, 56, 39);
		contentPane.add(label_42);
		
		JLabel lblNewLabel_10 = new JLabel("Date of Birth");
		lblNewLabel_10.setBounds(565, 167, 100, 39);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_4 = new JLabel("Position Hield ");
		lblNewLabel_4.setBounds(5, 206, 97, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel label_43 = new JLabel("");
		label_43.setBounds(61, 206, 56, 39);
		contentPane.add(label_43);
		
		JLabel label_44 = new JLabel("");
		label_44.setBounds(173, 206, 56, 39);
		contentPane.add(label_44);
		
		JLabel lblNewLabel_8 = new JLabel("Passport no.");
		lblNewLabel_8.setBounds(285, 206, 84, 39);
		contentPane.add(lblNewLabel_8);
		
		JLabel label_46 = new JLabel("");
		label_46.setBounds(341, 206, 56, 39);
		contentPane.add(label_46);
		
		JLabel label_47 = new JLabel("");
		label_47.setBounds(397, 206, 56, 39);
		contentPane.add(label_47);
		
		JLabel label_48 = new JLabel("");
		label_48.setBounds(509, 206, 56, 39);
		contentPane.add(label_48);
		
		JLabel lblNewLabel_13 = new JLabel("Category");
		lblNewLabel_13.setBounds(565, 206, 100, 39);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_5 = new JLabel("Place of issue");
		lblNewLabel_5.setBounds(5, 245, 97, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel label_49 = new JLabel("");
		label_49.setBounds(61, 245, 56, 39);
		contentPane.add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setBounds(173, 245, 56, 39);
		contentPane.add(label_50);
		
		JLabel label_51 = new JLabel("");
		label_51.setBounds(229, 245, 56, 39);
		contentPane.add(label_51);
		
		JLabel lblNewLabel_11 = new JLabel("Date of issue");
		lblNewLabel_11.setBounds(285, 245, 100, 39);
		contentPane.add(lblNewLabel_11);
		
		JLabel label_52 = new JLabel("");
		label_52.setBounds(341, 245, 56, 39);
		contentPane.add(label_52);
		
		JLabel label_53 = new JLabel("");
		label_53.setBounds(397, 245, 56, 39);
		contentPane.add(label_53);
		
		JLabel label_54 = new JLabel("");
		label_54.setBounds(509, 245, 56, 39);
		contentPane.add(label_54);
		
		JLabel lblNewLabel_12 = new JLabel("Date of expiry ");
		lblNewLabel_12.setBounds(565, 245, 100, 39);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("Accompanied by:");
		lblNewLabel_14.setBounds(5, 297, 112, 26);
		contentPane.add(lblNewLabel_14);
		
		JLabel label_55 = new JLabel("");
		label_55.setBounds(61, 284, 56, 39);
		contentPane.add(label_55);
		
		JLabel label_61 = new JLabel("");
		label_61.setBounds(397, 284, 56, 39);
		contentPane.add(label_61);
		
		JLabel label_63 = new JLabel("");
		label_63.setBounds(509, 284, 56, 39);
		contentPane.add(label_63);
		
		JLabel label_65 = new JLabel("");
		label_65.setBounds(621, 284, 56, 39);
		contentPane.add(label_65);
		
		JLabel label_66 = new JLabel("");
		label_66.setBounds(5, 323, 56, 39);
		contentPane.add(label_66);
		
		JLabel label_68 = new JLabel("");
		label_68.setBounds(117, 323, 56, 39);
		contentPane.add(label_68);
		
		JLabel lblNewLabel_15 = new JLabel("Name");
		lblNewLabel_15.setBounds(173, 323, 56, 39);
		contentPane.add(lblNewLabel_15);
		
		JLabel label_69 = new JLabel("");
		label_69.setBounds(229, 323, 56, 39);
		contentPane.add(label_69);
		
		JLabel label_70 = new JLabel("");
		label_70.setBounds(285, 323, 56, 39);
		contentPane.add(label_70);
		
		JLabel label_71 = new JLabel("");
		label_71.setBounds(341, 323, 56, 39);
		contentPane.add(label_71);
		
		JLabel label_73 = new JLabel("");
		label_73.setBounds(453, 323, 56, 39);
		contentPane.add(label_73);
		
		JLabel lblNewLabel_16 = new JLabel("Relationship");
		lblNewLabel_16.setBounds(509, 323, 84, 39);
		contentPane.add(lblNewLabel_16);
		
		JLabel label_74 = new JLabel("");
		label_74.setBounds(565, 323, 56, 39);
		contentPane.add(label_74);
		
		JLabel lblNewLabel_18 = new JLabel("1)");
		lblNewLabel_18.setBounds(5, 362, 56, 39);
		contentPane.add(lblNewLabel_18);
		
		JLabel label_76 = new JLabel("");
		label_76.setBounds(117, 362, 56, 39);
		contentPane.add(label_76);
		
		JLabel label_77 = new JLabel("");
		label_77.setBounds(229, 362, 56, 39);
		contentPane.add(label_77);
		
		JLabel label_78 = new JLabel("");
		label_78.setBounds(285, 362, 56, 39);
		contentPane.add(label_78);
		
		JLabel label_79 = new JLabel("");
		label_79.setBounds(341, 362, 56, 39);
		contentPane.add(label_79);
		
		JLabel label_80 = new JLabel("");
		label_80.setBounds(397, 362, 56, 39);
		contentPane.add(label_80);
		
		JLabel label_82 = new JLabel("");
		label_82.setBounds(565, 362, 56, 39);
		contentPane.add(label_82);
		
		JLabel label_83 = new JLabel("");
		label_83.setBounds(621, 362, 56, 39);
		contentPane.add(label_83);
		
		JLabel lblNewLabel_19 = new JLabel("2)");
		lblNewLabel_19.setBounds(5, 401, 56, 39);
		contentPane.add(lblNewLabel_19);
		
		JLabel label_85 = new JLabel("");
		label_85.setBounds(173, 401, 56, 39);
		contentPane.add(label_85);
		
		JLabel label_86 = new JLabel("");
		label_86.setBounds(229, 401, 56, 39);
		contentPane.add(label_86);
		
		JLabel label_87 = new JLabel("");
		label_87.setBounds(285, 401, 56, 39);
		contentPane.add(label_87);
		
		JLabel label_88 = new JLabel("");
		label_88.setBounds(341, 401, 56, 39);
		contentPane.add(label_88);
		
		JLabel label_89 = new JLabel("");
		label_89.setBounds(397, 401, 56, 39);
		contentPane.add(label_89);
		
		JLabel label_91 = new JLabel("");
		label_91.setBounds(565, 401, 56, 39);
		contentPane.add(label_91);
		
		JLabel lblNewLabel_20 = new JLabel("3)");
		lblNewLabel_20.setBounds(5, 440, 56, 39);
		contentPane.add(lblNewLabel_20);
		
		JLabel label_95 = new JLabel("");
		label_95.setBounds(229, 440, 56, 39);
		contentPane.add(label_95);
		
		JLabel label_96 = new JLabel("");
		label_96.setBounds(285, 440, 56, 39);
		contentPane.add(label_96);
		
		JLabel label_97 = new JLabel("");
		label_97.setBounds(341, 440, 56, 39);
		contentPane.add(label_97);
		
		JLabel label_98 = new JLabel("");
		label_98.setBounds(397, 440, 56, 39);
		contentPane.add(label_98);
		
		JLabel label_101 = new JLabel("");
		label_101.setBounds(621, 440, 56, 39);
		contentPane.add(label_101);
		
		JLabel label_102 = new JLabel("");
		label_102.setBounds(5, 479, 56, 39);
		contentPane.add(label_102);
		
		JLabel lblNewLabel_21 = new JLabel("Permanent address:");
		lblNewLabel_21.setBounds(15, 492, 130, 26);
		contentPane.add(lblNewLabel_21);
		
		JLabel label_103 = new JLabel("");
		label_103.setBounds(117, 479, 56, 39);
		contentPane.add(label_103);
		
		JLabel label_105 = new JLabel("");
		label_105.setBounds(229, 479, 56, 39);
		contentPane.add(label_105);
		
		JLabel label_106 = new JLabel("");
		label_106.setBounds(285, 479, 56, 39);
		contentPane.add(label_106);
		
		JLabel label_109 = new JLabel("");
		label_109.setBounds(453, 479, 56, 39);
		contentPane.add(label_109);
		
		JLabel label_112 = new JLabel("");
		label_112.setBounds(621, 479, 56, 39);
		contentPane.add(label_112);
		
		JLabel label_113 = new JLabel("");
		label_113.setBounds(5, 518, 56, 39);
		contentPane.add(label_113);
		
		JLabel label_114 = new JLabel("");
		label_114.setBounds(117, 518, 56, 39);
		contentPane.add(label_114);
		
		JLabel label_115 = new JLabel("");
		label_115.setBounds(173, 518, 56, 39);
		contentPane.add(label_115);
		
		JLabel label_116 = new JLabel("");
		label_116.setBounds(229, 518, 56, 39);
		contentPane.add(label_116);
		
		JLabel label_117 = new JLabel("");
		label_117.setBounds(285, 518, 56, 39);
		contentPane.add(label_117);
		
		JLabel label_118 = new JLabel("");
		label_118.setBounds(341, 518, 56, 39);
		contentPane.add(label_118);
		
		JLabel label_119 = new JLabel("");
		label_119.setBounds(397, 518, 56, 39);
		contentPane.add(label_119);
		
		JLabel label_120 = new JLabel("");
		label_120.setBounds(453, 518, 56, 39);
		contentPane.add(label_120);
		
		JLabel label_122 = new JLabel("");
		label_122.setBounds(565, 518, 56, 39);
		contentPane.add(label_122);
		
		JLabel label_123 = new JLabel("");
		label_123.setBounds(621, 518, 56, 39);
		contentPane.add(label_123);
		
		JLabel lblNewLabel_22 = new JLabel("Mobile phone");
		lblNewLabel_22.setBounds(5, 557, 84, 39);
		contentPane.add(lblNewLabel_22);
		
		JLabel label_124 = new JLabel("");
		label_124.setBounds(61, 557, 56, 39);
		contentPane.add(label_124);
		
		JLabel label_125 = new JLabel("");
		label_125.setBounds(173, 557, 56, 39);
		contentPane.add(label_125);
		
		JLabel label_127 = new JLabel("");
		label_127.setBounds(285, 557, 56, 39);
		contentPane.add(label_127);
		
		JLabel lblNewLabel_23 = new JLabel("Email");
		lblNewLabel_23.setBounds(341, 557, 56, 39);
		contentPane.add(lblNewLabel_23);
		
		JLabel label_130 = new JLabel("");
		label_130.setBounds(565, 557, 56, 39);
		contentPane.add(label_130);
		
		JLabel label_131 = new JLabel("");
		label_131.setBounds(621, 557, 56, 39);
		contentPane.add(label_131);
		
		textField = new JTextField();
		textField.setBounds(101, 180, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 214, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 258, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(381, 175, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(381, 219, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(381, 253, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(665, 175, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(665, 214, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(665, 253, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(75, 375, 210, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(75, 97, 116, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(381, 97, 116, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(665, 97, 116, 22);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(453, 379, 200, 22);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(101, 565, 116, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(381, 565, 116, 22);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(73, 409, 212, 22);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(75, 448, 210, 22);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(453, 409, 200, 22);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(453, 448, 200, 22);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(15, 531, 281, 22);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			payment.main(null);
			}
		});
		btnNewButton.setBounds(565, 621, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			services1.main(null);
			}
		});
		btnNewButton_1.setBounds(297, 621, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}

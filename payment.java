package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Information");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(182, 13, 263, 25);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Credit Card");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(46, 71, 127, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("Cardholder's Name *");
		lblNewLabel_1.setBounds(46, 123, 127, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(46, 152, 342, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Card number *");
		lblNewLabel_2.setBounds(46, 187, 127, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 216, 342, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Expiration Date *");
		lblNewLabel_3.setBounds(46, 251, 127, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(46, 286, 173, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Security Code *");
		lblNewLabel_4.setBounds(46, 321, 127, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(46, 350, 173, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(197, 419, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continue ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thanks.main(null);
			}
		});
		btnNewButton_1.setBounds(385, 419, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}

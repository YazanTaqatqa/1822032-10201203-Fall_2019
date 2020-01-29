package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class homepage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage1 frame = new homepage1();
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
	public homepage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ministry of Interior");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(227, 13, 203, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Services");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			services1.main(null);
			}
		});
		btnNewButton.setBounds(12, 82, 203, 80);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Citizen information system");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			citizeninformationsystem.main(null);
			}
		});
		btnNewButton_1.setBounds(246, 82, 183, 80);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Help");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Help.main(null);
			}
		});
		btnNewButton_2.setBounds(460, 82, 203, 80);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("About us");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 266, 81, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The Ministry of Interior directs the Public Security Directorate; around 50,000 in 2016, the");
		lblNewLabel_2.setBounds(12, 304, 521, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("General Directorate of Gendarmerie, the Civil Defense Directorate and the Civil Status and");
		lblNewLabel_3.setBounds(12, 333, 521, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Passports Department.");
		lblNewLabel_4.setBounds(12, 362, 275, 16);
		contentPane.add(lblNewLabel_4);
	}

}

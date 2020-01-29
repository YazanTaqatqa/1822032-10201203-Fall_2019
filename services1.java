package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class services1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					services1 frame = new services1();
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
	public services1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Services");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(190, 13, 96, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the service");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 65, 133, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Permit application form");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			permitapplicationform.main(null);
			}
		});
		btnNewButton.setBounds(12, 111, 208, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Visa application form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			visaapplication.main(null);
			}
		});
		btnNewButton_1.setBounds(12, 149, 208, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Staff salary");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			staffsalarysys.main(null);
			}
		});
		btnNewButton_2.setBounds(12, 187, 208, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancel");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			homepage1.main(null);
			}
		});
		btnNewButton_3.setBounds(189, 235, 97, 25);
		contentPane.add(btnNewButton_3);
	}
}

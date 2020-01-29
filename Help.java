package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Font;

public class Help extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Help");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(254, 13, 66, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Contact us");
		lblNewLabel_3.setBounds(51, 82, 71, 16);
		contentPane.add(lblNewLabel_3);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(111, 321, -60, -85);
		contentPane.add(table);
		
		JLabel lblNewLabel_4 = new JLabel("* Phone number : (9626)-5691141");
		lblNewLabel_4.setBounds(51, 111, 238, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("* Email : info@moi.gov.jo");
		lblNewLabel_5.setBounds(51, 157, 207, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("*Location: Haroun Ar-Rashid St. ,Amman");
		lblNewLabel_6.setBounds(51, 186, 238, 16);
		contentPane.add(lblNewLabel_6);
	}
}

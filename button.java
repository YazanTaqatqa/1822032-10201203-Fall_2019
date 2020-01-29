package assignment;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
public class button {
	static JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					button window = new button();
					window.frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public button() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 128));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel UserName = new JLabel("UserName");
		UserName.setForeground(Color.BLUE);
		UserName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		UserName.setBounds(29, 103, 97, 16);
		frame.getContentPane().add(UserName);
		JLabel Password = new JLabel("Password");
		Password.setForeground(Color.BLUE);
		Password.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Password.setBounds(29, 147, 80, 16);
		frame.getContentPane().add(Password);
		username = new JTextField();
		username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		username.setBounds(121, 101, 164, 22);
		frame.getContentPane().add(username);
		username.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 145, 164, 22);
		frame.getContentPane().add(passwordField);
		btnNewButton = new JButton("login");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Username= username.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				
				if(Username.equals("159753") && password.equals("357951"))
				{
				    JOptionPane.showMessageDialog(frame, "you are sucessfully logined");
				    homepage1 pi =new homepage1();
					pi.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Invalid username or password");
				}
			}
		});
		btnNewButton.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Ministry of Interior");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 13, 215, 25);
		frame.getContentPane().add(lblNewLabel);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
	}
}

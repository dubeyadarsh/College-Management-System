package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Registeration {

	private JFrame frmRegistration;
	private JLabel FirstName;
	private JTextField FirstNametextField;
	private JLabel LastName;
	private JTextField LastNametextField;
	private JLabel IdNumber;
	private JTextField IDNumbertextField;
	private JLabel Password;
	private JPasswordField passwordField;
	private JLabel Email;
	private JTextField EmailtextField;
	private JButton SignUpButton;
	private Connection con;
	private JLabel limage;

	/**
	 * Launch the application.
	 */
	public static void Registeration() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registeration window = new Registeration();
					window.frmRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registeration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = DB.dbconnect() ;
		frmRegistration = new JFrame();
		frmRegistration.setTitle("Registration");
		frmRegistration.getContentPane().setBackground(Color.BLACK);
		frmRegistration.setBounds(100, 100, 523, 418);
		frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(233, 28, 159, 33);
		frmRegistration.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		FirstName = new JLabel("First Name");
		FirstName.setBounds(197, 106, 100, 14);
		frmRegistration.getContentPane().add(FirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(327, 103, 120, 20);
		frmRegistration.getContentPane().add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		LastName = new JLabel("Last Name");
		LastName.setBounds(197, 131, 100, 14);
		frmRegistration.getContentPane().add(LastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(327, 128, 120, 20);
		frmRegistration.getContentPane().add(LastNametextField);
		LastNametextField.setColumns(10);
		
		IdNumber = new JLabel("Id Number");
		IdNumber.setBounds(197, 156, 100, 14);
		frmRegistration.getContentPane().add(IdNumber);
		
		IDNumbertextField = new JTextField();
		IDNumbertextField.setBounds(327, 153, 120, 20);
		frmRegistration.getContentPane().add(IDNumbertextField);
		IDNumbertextField.setColumns(10);
		
		Password = new JLabel("Password");
		Password.setBounds(197, 181, 100, 14);
		frmRegistration.getContentPane().add(Password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(327, 178, 120, 20);
		frmRegistration.getContentPane().add(passwordField);
		
		Email = new JLabel("Email");
		Email.setBounds(197, 206, 46, 14);
		frmRegistration.getContentPane().add(Email);
		
		EmailtextField = new JTextField();
		EmailtextField.setBounds(327, 203, 120, 20);
		frmRegistration.getContentPane().add(EmailtextField);
		EmailtextField.setColumns(10);
		
		SignUpButton = new JButton("Sign Up");
		SignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					
					
					String firstName = FirstNametextField.getText();
					String lastName = LastNametextField.getText();
					String IDNumber = IDNumbertextField.getText();
					String Password = passwordField.getText();
					String Email = EmailtextField.getText();
					// agar My sql me naam agal hai field ka to accordingly change karo 
					PreparedStatement pst= con.prepareStatement("insert into signupinfo(firstName,lastName,Id,password,Email) values(?,?,?,?,?)"); 
					pst.setString(1, firstName );
					pst.setString(2, lastName );
					pst.setString(3, IDNumber );
					pst.setString(4, Password );
					pst.setString(5, Email );
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Added");
					
					FirstNametextField.setText("");
					LastNametextField.setText("");
					IDNumbertextField.setText("");
					passwordField.setText("");
					EmailtextField.setText("");
					HomeScreen hs=new HomeScreen();				
					hs.homeScreen();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		SignUpButton.setBounds(303, 286, 89, 23);
		frmRegistration.getContentPane().add(SignUpButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(187, 11, 310, 357);
		frmRegistration.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 11, 487, 357);
		frmRegistration.getContentPane().add(panel);
		panel.setLayout(null);
		limage = new JLabel("image");
		limage.setIcon(new ImageIcon(getClass().getResource("/images/login.jpg")));
		limage.setBounds(-25, 54, 205, 195);
		panel.add(limage);
	}
}

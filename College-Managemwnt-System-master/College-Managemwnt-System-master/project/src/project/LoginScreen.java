package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginScreen {

	private JFrame frmLoginPage;
	private JTextField user;
	private JLabel limage;
	private JPasswordField pass;
	private Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = DB.dbconnect() ;
		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Window");
		frmLoginPage.getContentPane().setBackground(Color.BLACK);
		frmLoginPage.setBounds(100, 100, 563, 376);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		frmLoginPage.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 11, 527, 315);
		frmLoginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(180, 0, 347, 315);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		user = new JTextField();
		user.setBounds(165, 114, 159, 20);
		panel_1.add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Id:");
		lblNewLabel.setBounds(72, 114, 65, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(72, 142, 65, 14);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","");
					Statement stm = (Statement) con.createStatement();
					String sql = "Select * from signupinfo where Id='"+user.getText()+"'and password = '"+String.valueOf(pass.getPassword())+"'";
					ResultSet r = stm.executeQuery(sql); 
					if(r.next()) {
						HomeScreen hs=new HomeScreen();				
						hs.homeScreen();
					}else {
						JOptionPane.showMessageDialog(null,"Incorrect User ID or Password");
					}
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(72, 224, 89, 23);
		panel_1.add(btnNewButton);
		
		pass = new JPasswordField();
		pass.setBounds(165, 139, 159, 20);
		panel_1.add(pass);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registeration hs=new Registeration();
				hs.Registeration();
				frmLoginPage.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(235, 224, 89, 23);
		panel_1.add(btnNewButton_1);
		
		limage = new JLabel("image");
		limage.setIcon(new ImageIcon(getClass().getResource("/images/login.jpg")));
		limage.setBounds(-25, 54, 205, 195);
		panel.add(limage);
	}
}
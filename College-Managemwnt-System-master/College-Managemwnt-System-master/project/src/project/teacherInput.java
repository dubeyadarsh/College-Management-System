package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class teacherInput {

	private JFrame frmNewTeacherDetailes;
	private JTextField NameInput;
	private JTextField AgeInput;
	private JTextField AddressInput;
	private JTextField EmailInput;
	private JTextField PhoneInput;
	private JTextField EmpIdInput;
	private JTextField FathernameInput;
	private JTextField DOBInput;
	private JTextField XIIInput;
	private JTextField XInput;
	private JTextField AadharInput;
	private Connection con;
	private JComboBox BranchInput;
	private JComboBox CourseInput;

	/**
	 * Launch the application.
	 */
	public static void teacherInput() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherInput window = new teacherInput();
					window.frmNewTeacherDetailes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public teacherInput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = DB.dbconnect() ;
		frmNewTeacherDetailes = new JFrame();
		frmNewTeacherDetailes.setTitle("New Teacher detailes");
		frmNewTeacherDetailes.getContentPane().setBackground(new Color(240, 230, 140));
		frmNewTeacherDetailes.setBounds(100, 100, 863, 510);
		frmNewTeacherDetailes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmNewTeacherDetailes.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Teacher Detail");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel.setBounds(267, 0, 274, 49);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(36, 109, 51, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_1);
		
		NameInput = new JTextField();
		NameInput.setBounds(125, 106, 182, 23);
		frmNewTeacherDetailes.getContentPane().add(NameInput);
		NameInput.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(36, 145, 46, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_2);
		
		AgeInput = new JTextField();
		AgeInput.setBounds(125, 140, 182, 26);
		frmNewTeacherDetailes.getContentPane().add(AgeInput);
		AgeInput.setColumns(10);
		
		AddressInput = new JTextField();
		AddressInput.setBounds(125, 177, 182, 23);
		frmNewTeacherDetailes.getContentPane().add(AddressInput);
		AddressInput.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(36, 177, 79, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_3);
		
		EmailInput = new JTextField();
		EmailInput.setBounds(125, 219, 182, 26);
		frmNewTeacherDetailes.getContentPane().add(EmailInput);
		EmailInput.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(36, 221, 67, 20);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_4);
		
		PhoneInput = new JTextField();
		PhoneInput.setBounds(125, 256, 182, 26);
		frmNewTeacherDetailes.getContentPane().add(PhoneInput);
		PhoneInput.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Emp ID");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(455, 331, 60, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_5);
		
		BranchInput = new JComboBox();
		BranchInput.setBounds(125, 293, 182, 22);
		frmNewTeacherDetailes.getContentPane().add(BranchInput);
		BranchInput.addItem("");
		BranchInput.addItem("Computer Science");
		BranchInput.addItem("Information and Technology");
		BranchInput.addItem("Mechanical");
		BranchInput.addItem("Electronics & Telecommunication");
		BranchInput.addItem("Aerospace Aviation");
		BranchInput.addItem("Biotechnology ");
		BranchInput.addItem("Civil");
		
		
		JLabel lblNewLabel_6 = new JLabel("Branch");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(36, 297, 46, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_6);
		
		EmpIdInput = new JTextField();
		EmpIdInput.setBounds(590, 326, 182, 26);
		frmNewTeacherDetailes.getContentPane().add(EmpIdInput);
		EmpIdInput.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone No.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(36, 261, 79, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Father's Name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(455, 109, 118, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_8);
		
		FathernameInput = new JTextField();
		FathernameInput.setBounds(590, 106, 204, 23);
		frmNewTeacherDetailes.getContentPane().add(FathernameInput);
		FathernameInput.setColumns(10);
		
		DOBInput = new JTextField();
		DOBInput.setBounds(590, 143, 204, 20);
		frmNewTeacherDetailes.getContentPane().add(DOBInput);
		DOBInput.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("DOB(dd/mm/yyyy)");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(455, 142, 136, 20);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_9);
		
		XIIInput = new JTextField();
		XIIInput.setBounds(590, 178, 204, 22);
		frmNewTeacherDetailes.getContentPane().add(XIIInput);
		XIIInput.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Class XII(%)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(455, 181, 96, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_10);
		
		XInput = new JTextField();
		XInput.setBounds(590, 221, 204, 20);
		frmNewTeacherDetailes.getContentPane().add(XInput);
		XInput.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Class X(%)");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(455, 225, 118, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_11);
		
		AadharInput = new JTextField();
		AadharInput.setBounds(590, 252, 204, 30);
		frmNewTeacherDetailes.getContentPane().add(AadharInput);
		AadharInput.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Aadhar No.");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(455, 262, 118, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_12);
		
		CourseInput = new JComboBox();
		CourseInput.setBounds(590, 293, 204, 22);
		frmNewTeacherDetailes.getContentPane().add(CourseInput);
		CourseInput.addItem("");
		CourseInput.addItem("B.tech");
		CourseInput.addItem("M.tech");
		CourseInput.addItem("PhD");
		
		
		
		JLabel lblNewLabel_13 = new JLabel("Course");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(455, 297, 86, 14);
		frmNewTeacherDetailes.getContentPane().add(lblNewLabel_13);
		
		JButton SubmitBotton = new JButton("Submit");
		SubmitBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				
					String name = NameInput.getText();
					String age = AgeInput.getText();
					String address = AddressInput.getText();
					String email = EmailInput.getText();
					String phone = PhoneInput.getText();
					String branch = (String)BranchInput.getSelectedItem();
					String father = FathernameInput.getText();
					String DOB = DOBInput.getText();
					String XIIpercentage = XIIInput.getText();
					String Xpercentage = XInput.getText();
					String aadhar = AadharInput.getText();
					String course = (String)CourseInput.getSelectedItem();
					String empId = EmpIdInput.getText();
					PreparedStatement pst= con.prepareStatement("insert into teacher(name,age,address,email,phone,branch,father,DOB,XII,X,aadhar,course,empId) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					
					pst.setString(1, name);
					pst.setString(2, age);
					pst.setString(3, address);
					pst.setString(4, email);
					pst.setString(5, phone);
					pst.setString(6, branch);
					pst.setString(7, father);
					pst.setString(8, DOB);
					pst.setString(9, XIIpercentage);
					pst.setString(10, Xpercentage);
					pst.setString(11, aadhar);
					pst.setString(12, course);
					pst.setString(13, empId);
					
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Added");
					
					NameInput.setText("");
					AgeInput.setText("");
					AddressInput.setText("");
					EmailInput.setText("");
					PhoneInput.setText("");
					BranchInput.setSelectedIndex(0);
					FathernameInput.setText("");
					DOBInput.setText("");
					XIIInput.setText("");
					XInput.setText("");
					AadharInput.setText("");
					CourseInput.setSelectedIndex(0);
					EmpIdInput.setText("");
					
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		SubmitBotton.setBackground(SystemColor.activeCaption);
		SubmitBotton.setBounds(262, 395, 89, 23);
		frmNewTeacherDetailes.getContentPane().add(SubmitBotton);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNewTeacherDetailes.dispose();
			}
		});
		CancelButton.setBackground(SystemColor.activeCaption);
		CancelButton.setForeground(SystemColor.controlText);
		CancelButton.setBounds(455, 395, 89, 23);
		frmNewTeacherDetailes.getContentPane().add(CancelButton);
	}
}

package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class studentInput {

	private JFrame frmNewStudentDetail;
	private JTextField NameInput;
	private JTextField AgeInput;
	private JTextField EmailInput;
	private JTextField RollNoInput;
	private JTextField PhoneInput;
	private JTextField FathersNameInput;
	private JTextField DOBInput;
	private JTextField XIIInput;
	private JTextField XInput;
	private JTextField AadharInput;
	private Connection con;
	private JComboBox BranchInput;
	private JComboBox CourseInput;
	private JTextArea AddressInput;

	/**
	 * Launch the application.
	 */
	public static void studentInput() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentInput window = new studentInput();
					window.frmNewStudentDetail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentInput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = DB.dbconnect() ;
		frmNewStudentDetail = new JFrame();
		frmNewStudentDetail.setTitle("New Student Detail");
		frmNewStudentDetail.getContentPane().setBackground(new Color(240, 230, 140));
		frmNewStudentDetail.setBounds(100, 100, 863, 510);
		frmNewStudentDetail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmNewStudentDetail.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Student Detail");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel.setBounds(267, 0, 274, 49);
		frmNewStudentDetail.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(36, 109, 51, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_1);
		
		NameInput = new JTextField();
		NameInput.setBounds(156, 106, 182, 23);
		frmNewStudentDetail.getContentPane().add(NameInput);
		NameInput.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(36, 145, 46, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_2);
		
		AgeInput = new JTextField();
		AgeInput.setBounds(156, 140, 182, 26);
		frmNewStudentDetail.getContentPane().add(AgeInput);
		AgeInput.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(36, 177, 79, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_3);
		
		EmailInput = new JTextField();
		EmailInput.setBounds(156, 277, 182, 26);
		frmNewStudentDetail.getContentPane().add(EmailInput);
		EmailInput.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(36, 279, 67, 20);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_4);
		
		RollNoInput = new JTextField();
		RollNoInput.setBounds(156, 356, 182, 26);
		frmNewStudentDetail.getContentPane().add(RollNoInput);
		RollNoInput.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mother's Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(36, 361, 110, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_5);
		
		BranchInput = new JComboBox();
		BranchInput.setBounds(156, 323, 182, 22);
		frmNewStudentDetail.getContentPane().add(BranchInput);
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
		lblNewLabel_6.setBounds(36, 317, 46, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_6);
		
		PhoneInput = new JTextField();
		PhoneInput.setBounds(156, 393, 182, 26);
		frmNewStudentDetail.getContentPane().add(PhoneInput);
		PhoneInput.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone No.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(36, 398, 79, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Father's Name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(455, 109, 118, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_8);
		
		FathersNameInput = new JTextField();
		FathersNameInput.setBounds(590, 106, 204, 23);
		frmNewStudentDetail.getContentPane().add(FathersNameInput);
		FathersNameInput.setColumns(10);
		
		DOBInput = new JTextField();
		DOBInput.setBounds(590, 143, 204, 20);
		frmNewStudentDetail.getContentPane().add(DOBInput);
		DOBInput.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("DOB(dd/mm/yyyy)");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(455, 142, 136, 20);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_9);
		
		XIIInput = new JTextField();
		XIIInput.setBounds(590, 178, 204, 22);
		frmNewStudentDetail.getContentPane().add(XIIInput);
		XIIInput.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Class XII(%)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(455, 181, 96, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_10);
		
		XInput = new JTextField();
		XInput.setBounds(590, 221, 204, 20);
		frmNewStudentDetail.getContentPane().add(XInput);
		XInput.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Class X(%)");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(455, 225, 118, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_11);
		
		AadharInput = new JTextField();
		AadharInput.setBounds(590, 252, 204, 30);
		frmNewStudentDetail.getContentPane().add(AadharInput);
		AadharInput.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Aadhar No.");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(455, 262, 118, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_12);
		
		CourseInput = new JComboBox();
		CourseInput.setBounds(590, 293, 204, 22);
		frmNewStudentDetail.getContentPane().add(CourseInput);
		CourseInput.addItem("");
		CourseInput.addItem("B.tech");
		CourseInput.addItem("M.tech");
		CourseInput.addItem("PhD");
		
		
		
		JLabel lblNewLabel_13 = new JLabel("Course");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(455, 297, 86, 14);
		frmNewStudentDetail.getContentPane().add(lblNewLabel_13);
		
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				try {
					
					String name = NameInput.getText();
					String age = AgeInput.getText();
					String address = AddressInput.getText();
					String email = EmailInput.getText();
					String phone = PhoneInput.getText();
					String branch = (String)BranchInput.getSelectedItem();
					String father = FathersNameInput.getText();
					String DOB = DOBInput.getText();
					String XIIpercentage = XIIInput.getText();
					String Xpercentage = XInput.getText();
					String aadhar = AadharInput.getText();
					String course = (String)CourseInput.getSelectedItem();
					String rollNo = RollNoInput.getText();
					PreparedStatement pst= con.prepareStatement("INSERT INTO `studentinfo`(`name`, `age`, `address`, `email`, `phone`, `branch`, `father`, `DOB`, `XII`, `X`, `aadhar`, `course`, `mother`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					
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
					pst.setString(13, rollNo);
					
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Added");
					
					NameInput.setText("");
					AgeInput.setText("");
					AddressInput.setText("");
					EmailInput.setText("");
					PhoneInput.setText("");
					BranchInput.setSelectedIndex(0);
					FathersNameInput.setText("");
					DOBInput.setText("");
					XIIInput.setText("");
					XInput.setText("");
					AadharInput.setText("");
					CourseInput.setSelectedIndex(0);
					RollNoInput.setText("");
					
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				
				
				
				
				
			}
		});
		SubmitButton.setBackground(SystemColor.activeCaption);
		SubmitButton.setBounds(452, 395, 89, 23);
		frmNewStudentDetail.getContentPane().add(SubmitButton);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNewStudentDetail.dispose();
			}
		});
		CancelButton.setBackground(SystemColor.activeCaption);
		CancelButton.setForeground(SystemColor.controlText);
		CancelButton.setBounds(590, 395, 89, 23);
		frmNewStudentDetail.getContentPane().add(CancelButton);
		
		AddressInput = new JTextArea();
		AddressInput.setBounds(156, 173, 182, 89);
		frmNewStudentDetail.getContentPane().add(AddressInput);
	}
}

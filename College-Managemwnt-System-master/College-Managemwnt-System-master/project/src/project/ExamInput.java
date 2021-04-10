package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ExamInput {

	private JFrame frmEnterMarks;
	private JTextField RollInput;
	private JTextField subname1;
	private JTextField subinput1;
	private JTextField subname2;
	private JTextField subinput2;
	private JTextField subname3;
	private JTextField subinput3;
	private JTextField subname4;
	private JTextField subinput4;
	private JTextField subname5;
	private JTextField subinput5;
	private JTextField subname6;
	private JTextField subinput6;
	private JButton Cancel;
	private JButton Submit;
	private JLabel lblNewLabel_3;
	private JTextField Total;
	private Connection con;

	/**
	 * Launch the application.
	 */
	public static void ExamInput() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamInput window = new ExamInput();
					window.frmEnterMarks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExamInput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = DB.dbconnect() ;
		frmEnterMarks = new JFrame();
		frmEnterMarks.setTitle("Enter marks");
		frmEnterMarks.setBounds(100, 100, 454, 480);
		frmEnterMarks.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEnterMarks.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter marks");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(89, 11, 231, 74);
		frmEnterMarks.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subjects:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 140, 115, 14);
		frmEnterMarks.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roll No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 102, 58, 18);
		frmEnterMarks.getContentPane().add(lblNewLabel_2);
		
		RollInput = new JTextField();
		RollInput.setBounds(78, 103, 86, 20);
		frmEnterMarks.getContentPane().add(RollInput);
		RollInput.setColumns(10);
		
		subname1 = new JTextField();
		subname1.setBounds(10, 165, 194, 20);
		frmEnterMarks.getContentPane().add(subname1);
		subname1.setColumns(10);
		
		subinput1 = new JTextField();
		subinput1.setBounds(214, 165, 194, 20);
		frmEnterMarks.getContentPane().add(subinput1);
		subinput1.setColumns(10);
		
		subname2 = new JTextField();
		subname2.setColumns(10);
		subname2.setBounds(10, 196, 194, 20);
		frmEnterMarks.getContentPane().add(subname2);
		
		subinput2 = new JTextField();
		subinput2.setColumns(10);
		subinput2.setBounds(214, 196, 194, 20);
		frmEnterMarks.getContentPane().add(subinput2);
		
		subname3 = new JTextField();
		subname3.setColumns(10);
		subname3.setBounds(10, 227, 194, 20);
		frmEnterMarks.getContentPane().add(subname3);
		
		subinput3 = new JTextField();
		subinput3.setColumns(10);
		subinput3.setBounds(214, 227, 194, 20);
		frmEnterMarks.getContentPane().add(subinput3);
		
		subname4 = new JTextField();
		subname4.setColumns(10);
		subname4.setBounds(10, 258, 194, 20);
		frmEnterMarks.getContentPane().add(subname4);
		
		subinput4 = new JTextField();
		subinput4.setColumns(10);
		subinput4.setBounds(214, 258, 194, 20);
		frmEnterMarks.getContentPane().add(subinput4);
		
		subname5 = new JTextField();
		subname5.setColumns(10);
		subname5.setBounds(10, 289, 194, 20);
		frmEnterMarks.getContentPane().add(subname5);
		
		subinput5 = new JTextField();
		subinput5.setColumns(10);
		subinput5.setBounds(214, 289, 194, 20);
		frmEnterMarks.getContentPane().add(subinput5);
		
		subname6 = new JTextField();
		subname6.setColumns(10);
		subname6.setBounds(10, 320, 194, 20);
		frmEnterMarks.getContentPane().add(subname6);
		
		subinput6 = new JTextField();
		subinput6.setColumns(10);
		subinput6.setBounds(214, 320, 194, 20);
		frmEnterMarks.getContentPane().add(subinput6);
		
		Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEnterMarks.dispose();
			}
		});
		Cancel.setBounds(217, 394, 89, 23);
		frmEnterMarks.getContentPane().add(Cancel);
		
		Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String roll = RollInput.getText();
					String Subname1 = subname1.getText();
					String Subname2 = subname2.getText();
					String Subname3 = subname3.getText();
					String Subname4 = subname4.getText();
					String Subname5 = subname5.getText();
					String Subname6 = subname6.getText();
					String Submrk1 = subinput1.getText();
					String Submrk2 = subinput2.getText();
					String Submrk3 = subinput3.getText();
					String Submrk4 = subinput4.getText();
					String Submrk5 = subinput5.getText();
					String Submrk6 = subinput6.getText();
					String total = Total.getText();
					String s1 = Subname1+" - "+Submrk1;
					String s2 = Subname2+" - "+Submrk2;
					String s3 = Subname3+" - "+Submrk3;
					String s4 = Subname4+" - "+Submrk4;
					String s5 = Subname5+" - "+Submrk5;
					String s6 = Subname6+" - "+Submrk6;
					
					
					PreparedStatement pst= con.prepareStatement("INSERT INTO `result`(`Id`, `Subject1`, `Subject2`, `Subject3`, `Subject4`, `Subject5`, `Subject6`, `Total`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
					
					pst.setString(1, roll);
					pst.setString(2, s1);
					pst.setString(3, s2);
					pst.setString(4, s3);
					pst.setString(5, s4);
					pst.setString(6, s5);
					pst.setString(7, s6);
					pst.setString(8, total);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Added");
					
					
					RollInput.setText("");
					subname1.setText("");
					subname2.setText("");
					subname3.setText("");
					subname4.setText("");
					subname5.setText("");
					subname6.setText("");
					subinput1.setText("");
					subinput2.setText("");
					subinput3.setText("");
					subinput4.setText("");
					subinput5.setText("");
					subinput6.setText("");
					Total.setText("");
					
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		Submit.setBounds(104, 394, 89, 23);
		frmEnterMarks.getContentPane().add(Submit);
		
		lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(146, 351, 58, 14);
		frmEnterMarks.getContentPane().add(lblNewLabel_3);
		
		Total = new JTextField();
		Total.setBounds(214, 350, 194, 20);
		frmEnterMarks.getContentPane().add(Total);
		Total.setColumns(10);
	}
}

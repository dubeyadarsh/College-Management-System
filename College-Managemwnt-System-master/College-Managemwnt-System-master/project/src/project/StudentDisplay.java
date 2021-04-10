package project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class StudentDisplay {

	private JFrame frmStudentInformation;
	private JTable table;
	private Connection conn;
	private JLabel NewStudentLabel;
	private JButton NewStudent;

	/**
	 * Launch the application.
	 */
	public static void StudentDisplay() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDisplay window = new StudentDisplay();
					window.frmStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conn = DB.dbconnect();
		frmStudentInformation = new JFrame();
		frmStudentInformation.setTitle("Student Information");
		frmStudentInformation.setBounds(100, 100, 866, 510);
		frmStudentInformation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStudentInformation.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 818, 349);
		frmStudentInformation.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Aadhar", "X", "XII", "DOB", "Phone", "Email", "Name", "Father Name", "Mother Name", "Branch", "Address", "Age", "Course"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(225);
		table.getColumnModel().getColumn(6).setPreferredWidth(205);
		table.getColumnModel().getColumn(7).setPreferredWidth(205);
		table.getColumnModel().getColumn(8).setPreferredWidth(205);
		table.getColumnModel().getColumn(9).setPreferredWidth(175);
		table.getColumnModel().getColumn(10).setPreferredWidth(375);
		
		NewStudentLabel = new JLabel("Add new Student");
		NewStudentLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewStudentLabel.setBounds(123, 395, 145, 14);
		frmStudentInformation.getContentPane().add(NewStudentLabel);
		
		NewStudent = new JButton("Add");
		NewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				studentInput hs=new studentInput();				
				hs.studentInput();
			}
		});
		NewStudent.setBounds(314, 391, 89, 23);
		frmStudentInformation.getContentPane().add(NewStudent);
		
		
		try {
			
			int a ;
			PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement("SELECT * FROM `studentinfo`");
			ResultSet rs = pst1.executeQuery();
			ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
			a = rd.getColumnCount();
			DefaultTableModel df = (DefaultTableModel) table.getModel();
			df.setRowCount(0);
			while(rs.next()) {
				Vector v2 = new Vector();
				for(int i = 1 ; i <= a ; i++ ) {
					
					v2.add(rs.getString("aadhar"));
					v2.add(rs.getString("X"));
					v2.add(rs.getString("XII"));
					v2.add(rs.getString("DOB"));
					v2.add(rs.getString("phone"));
					v2.add(rs.getString("email"));
					v2.add(rs.getString("name"));
					v2.add(rs.getString("father"));
					v2.add(rs.getString("mother"));
					v2.add(rs.getString("branch"));
					v2.add(rs.getString("address"));
					v2.add(rs.getString("age"));
					v2.add(rs.getString("course"));
					
				}
				
				df.addRow(v2);
				
			}
			
			
		}catch(Exception e3) {
			e3.printStackTrace();
		}
		
		

	}
}
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

public class Teacher_Display {

	private JFrame frmTeachersInformation;
	private JTable table;
	private Connection conn;

	/**
	 * Launch the application.
	 */
	public static void Teacher_Display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_Display window = new Teacher_Display();
					window.frmTeachersInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teacher_Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conn = DB.dbconnect();
		frmTeachersInformation = new JFrame();
		frmTeachersInformation.setTitle("Teachers Information");
		frmTeachersInformation.setBounds(100, 100, 866, 510);
		frmTeachersInformation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTeachersInformation.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 818, 349);
		frmTeachersInformation.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Aadhar", "X", "XII", "DOB", "Phone", "Email", "Name", "Father Name", "Emp Id", "Branch", "Address", "Age", "Course"
			}
		));
		
		JLabel NewTeacherlabel = new JLabel("Add New Teacher");
		NewTeacherlabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewTeacherlabel.setBounds(126, 387, 202, 14);
		frmTeachersInformation.getContentPane().add(NewTeacherlabel);
		
		JButton NewTeacher = new JButton("Add");
		NewTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teacherInput hs=new teacherInput();				
				hs.teacherInput();
			}
		});
		NewTeacher.setBounds(301, 384, 89, 23);
		frmTeachersInformation.getContentPane().add(NewTeacher);
		
		
		try {
			
			int a ;
			PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement("SELECT * FROM `teacher`");
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
					v2.add(rs.getString("empId"));
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

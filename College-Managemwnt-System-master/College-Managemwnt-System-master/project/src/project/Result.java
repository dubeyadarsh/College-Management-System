package project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class Result {

	private JFrame frmResults;
	private JTable table;
	private JScrollPane scrollPane;
	private Connection conn;

	/**
	 * Launch the application.
	 */
	public static void Result() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result window = new Result();
					window.frmResults.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conn = DB.dbconnect();
		frmResults = new JFrame();
		frmResults.setTitle("Results");
		frmResults.setBounds(100, 100, 854, 482);
		frmResults.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmResults.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 73, 818, 359);
		frmResults.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Roll No.", "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5", "Subject 6", "Total"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		table.getColumnModel().getColumn(2).setPreferredWidth(175);
		table.getColumnModel().getColumn(3).setPreferredWidth(175);
		table.getColumnModel().getColumn(4).setPreferredWidth(175);
		table.getColumnModel().getColumn(5).setPreferredWidth(175);
		table.getColumnModel().getColumn(6).setPreferredWidth(175);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Results");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(325, 11, 103, 40);
		frmResults.getContentPane().add(lblNewLabel);
		
		
		try {
			
			int a ;
			PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement("SELECT * FROM `result`");
			ResultSet rs = pst1.executeQuery();
			ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
			a = rd.getColumnCount();
			DefaultTableModel df = (DefaultTableModel) table.getModel();
			df.setRowCount(0);
			while(rs.next()) {
				Vector v2 = new Vector();
				for(int i = 1 ; i <= a ; i++ ) {
					
					v2.add(rs.getString("Id"));
					v2.add(rs.getString("Subject1"));
					v2.add(rs.getString("Subject2"));
					v2.add(rs.getString("Subject3"));
					v2.add(rs.getString("Subject4"));
					v2.add(rs.getString("Subject5"));
					v2.add(rs.getString("Subject6"));
					v2.add(rs.getString("Total"));
					
				}
				
				df.addRow(v2);
				
			}
			
			
		}catch(Exception e3) {
			e3.printStackTrace();
		}
		
	}
}

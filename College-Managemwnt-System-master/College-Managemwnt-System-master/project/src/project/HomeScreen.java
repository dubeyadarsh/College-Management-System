package project;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class HomeScreen {

	private JFrame frmCollegeManagementSystem;

	/**
	 * Launch the application.
	 */
	public static void homeScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frmCollegeManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCollegeManagementSystem = new JFrame();
		frmCollegeManagementSystem.setResizable(false);
		frmCollegeManagementSystem.setTitle("College Management System");
		frmCollegeManagementSystem.setBounds(100, 100, 1000, 600);
		frmCollegeManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCollegeManagementSystem.getContentPane().setLayout(null);
		
		JLabel bgimage = new JLabel("background");
		bgimage.setIcon(new ImageIcon(getClass().getResource("/images/oops.jpg")));
		bgimage.setBounds(0, 0, 1000, 600);
		frmCollegeManagementSystem.getContentPane().add(bgimage);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setBounds(0, 30, 137, 26);
		frmCollegeManagementSystem.getContentPane().add(mntmNewMenuItem);
		
		JMenuBar menubar= new JMenuBar();
		frmCollegeManagementSystem.setJMenuBar(menubar);
		
		JMenu add=new JMenu("Add");
		menubar.add(add);
		JMenuItem nf= new JMenuItem("New Faculty");
		nf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teacherInput hs=new teacherInput();				
				hs.teacherInput();
			}
		});
		add.add(nf);
		JMenuItem ns= new JMenuItem("New Student");
		ns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				studentInput hs=new studentInput();				
				hs.studentInput();

			}
		});
		add.add(ns);
		
		JMenu det=new JMenu("Details");
		menubar.add(det);
		JMenuItem td= new JMenuItem("Teacher Details");
		td.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Teacher_Display hs=new Teacher_Display();				
				hs.Teacher_Display();
				
			}
		});
		det.add(td);
		JMenuItem sd= new JMenuItem("Student Details");
		sd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				StudentDisplay hs=new StudentDisplay();				
				hs.StudentDisplay();
				
			}
		});
		det.add(sd);
		
		JMenu exam=new JMenu("Examination");
		menubar.add(exam);
		JMenuItem ed= new JMenuItem("Examination Details");
		ed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Result hs=new Result();				
				hs.Result();
			}
		});
		exam.add(ed);
		JMenuItem em= new JMenuItem("Enter Marks");
		em.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExamInput hs=new ExamInput();				
				hs.ExamInput();
			}
		});
		exam.add(em);
		
		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setActionCommand("About");
		menubar.add(mnNewMenu);
		JMenuItem u= new JMenuItem("About");
		u.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about ab=new about();
				ab.about();
				
			}
		});
		mnNewMenu.add(u);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Visit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String URL="https://vcet.edu.in/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
				}
				catch(Exception E) {
					JOptionPane.showMessageDialog(null, E.getMessage());
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		JMenu mu = new JMenu("exit");
		
		menubar.add(mu);
		JMenuItem m= new JMenuItem("exit");
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mu.add(m);
		
		
	}
}
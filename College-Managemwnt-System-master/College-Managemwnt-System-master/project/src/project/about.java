package project;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class about {

	private JFrame frmAbout;
	JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	/**
	 * Launch the application.
	 */
	public static void about() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about window = new about();
					window.frmAbout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public about() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbout = new JFrame();
		frmAbout.setTitle("About");
		frmAbout.setForeground(SystemColor.controlText);
		frmAbout.setBounds(100, 100, 706, 413);
		frmAbout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAbout.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 153));
		panel.setBounds(0, 0, 690, 374);
		frmAbout.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("images");
		lblNewLabel.setBounds(0, 0, 160, 156);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/images/logo1.jpg")));
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Vidyavardhini College of Engineering and Technology");
		lblNewLabel_1.setBounds(154, 11, 536, 38);
		lblNewLabel_1.setIconTextGap(15);
		lblNewLabel_1.setFont(new Font("Cambria Math", lblNewLabel_1.getFont().getStyle() | Font.BOLD, 23));
		lblNewLabel_1.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_1.setBackground(SystemColor.text);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(164, 42, 516, 16);
		panel.add(separator);
		
		lblNewLabel_2 = new JLabel("Founder President Late Padmashri H.G. Vartak");
		lblNewLabel_2.setBounds(203, 49, 449, 21);
		lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 21));
		lblNewLabel_2.setForeground(SystemColor.text);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("(Approved by AICTE and Affiliated to the University of Mumbai)");
		lblNewLabel_3.setBounds(214, 81, 414, 21);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(SystemColor.info);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Four Branches Permanently Affiliated to the University of Mumbai");
		lblNewLabel_4.setBounds(214, 105, 425, 21);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(SystemColor.info);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Accredited by NAAC");
		lblNewLabel_5.setBounds(309, 127, 152, 29);
		lblNewLabel_5.setForeground(SystemColor.info);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		panel.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 227, 690, 2);
		separator_1.setBackground(Color.CYAN);
		separator_1.setForeground(Color.BLACK);
		panel.add(separator_1);
		
		JLabel lblNewLabel_7 = new JLabel("Event");
		lblNewLabel_7.setBounds(417, 236, 69, 14);
		lblNewLabel_7.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_7.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Contacts");
		lblNewLabel_8.setBounds(25, 235, 71, 16);
		lblNewLabel_8.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_8.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("- K.T. Marg, Vartak College Campus, Vasai Road (W),\r\n");
		lblNewLabel_6.setBounds(35, 250, 262, 29);
		lblNewLabel_6.setForeground(SystemColor.info);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("    Dist-Palghar, Vasai, Maharashtra 401202");
		lblNewLabel_9.setBounds(34, 274, 253, 14);
		lblNewLabel_9.setForeground(SystemColor.info);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(" \u260F 0250-233 9486");
		lblNewLabel_10.setBounds(32, 290, 101, 14);
		lblNewLabel_10.setForeground(SystemColor.info);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\uD83D\uDCDE 0250 233 8234 (6 Lines)");
		lblNewLabel_11.setBounds(35, 305, 136, 14);
		lblNewLabel_11.setForeground(SystemColor.info);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u2709 vcet_inbox@vcet.edu.in");
		lblNewLabel_12.setBounds(35, 322, 142, 14);
		lblNewLabel_12.setForeground(SystemColor.info);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\uD83D\uDD17 https://vcet.edu.in/");
		lblNewLabel_13.setBounds(35, 338, 136, 14);
		lblNewLabel_13.setForeground(SystemColor.info);
		panel.add(lblNewLabel_13);

		
		JLabel lblNewLabel_14 = new JLabel("# Zeal");
		lblNewLabel_14.setForeground(SystemColor.info);
		lblNewLabel_14.setBounds(424, 257, 59, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("# Avahan");
		lblNewLabel_15.setForeground(SystemColor.info);
		lblNewLabel_15.setBounds(424, 274, 59, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("  # Ethan");
		lblNewLabel_16.setForeground(SystemColor.info);
		lblNewLabel_16.setBounds(417, 290, 69, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("  # VNPS");
		lblNewLabel_17.setForeground(SystemColor.info);
		lblNewLabel_17.setBounds(417, 305, 69, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("  # Solecthon");
		lblNewLabel_18.setForeground(SystemColor.info);
		lblNewLabel_18.setBounds(417, 322, 84, 14);
		panel.add(lblNewLabel_18);
	}
}
package gr.aueb.cf.schoolapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JSeparator headerSeperator = new JSeparator();
	private final JPanel header = new JPanel();
//	private static Connection connection;

	public MainMenuFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuFrame.class.getResource("/resources/eduv2.png")));
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowOpened(WindowEvent e) {
//				
//				String sql = "jdbc:mysql://localhost:3306/school6db?serverTimeZone=UTC";
//				String username = "userdb6";
//				String password = "12345";		// Password should not appear (not be visible) in code-base 
//				
//				try {
//					connection = DriverManager.getConnection(sql, username, password);
//					System.out.println("Connection was succsessful");
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
		setTitle("Quality in Education");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		headerSeperator.setBounds(0, 50, 488, 1);
		contentPane.add(headerSeperator);
		header.setBackground(new Color(18, 18, 194));
		header.setBounds(0, -1, 488, 52);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coding Factory");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 0, 141, 52);
		header.add(lblNewLabel);
		
		JButton teachersBtn = new JButton("");
		teachersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getTeachersMenuFrame().setVisible(true);
				Main.getMainMenuFrame().setEnabled(false);
			}
		});
		teachersBtn.setBounds(10, 75, 40, 40);
		contentPane.add(teachersBtn);
		
		JLabel teachersLabel = new JLabel("Teachers");
		teachersLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		teachersLabel.setForeground(new Color(18, 18, 194));
		teachersLabel.setBounds(60, 75, 79, 40);
		contentPane.add(teachersLabel);
		
		JButton studentsBtn = new JButton("");
		studentsBtn.setBounds(10, 126, 40, 40);
		contentPane.add(studentsBtn);
		
		JLabel studentsLabel = new JLabel("Students");
		studentsLabel.setForeground(new Color(18, 18, 194));
		studentsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		studentsLabel.setBounds(60, 126, 79, 40);
		contentPane.add(studentsLabel);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(143, 139, 152));
		footer.setBounds(0, 259, 488, 51);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel manual = new JLabel("User Manual");
		manual.setForeground(new Color(18, 18, 194));
		manual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		manual.setBounds(10, 11, 88, 29);
		footer.add(manual);
	}

//	public static Connection getConnection() {
//		return connection;
//	}
	
	
}

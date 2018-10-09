package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblNochKeinenAccount;
	
	String testUser = "Alexander";
	String testPassword = "hallo";
	
	private JLabel labelError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginWindow() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(300, 175);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblBenutzername = new JLabel("Benutzername:");
		lblBenutzername.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
		lblBenutzername.setBounds(10, 11, 100, 20);
		contentPane.add(lblBenutzername);
		
		JLabel lblPasswort = new JLabel("Passwort:");
		lblPasswort.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
		lblPasswort.setBounds(10, 42, 100, 20);
		contentPane.add(lblPasswort);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Username");
		txtUsername.setBounds(120, 12, 164, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(120, 43, 164, 20);
		contentPane.add(txtPassword);
		
		lblNochKeinenAccount = new JLabel("Noch keinen Account?");
		lblNochKeinenAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNochKeinenAccount.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNochKeinenAccount.setBounds(10, 93, 274, 20);
		contentPane.add(lblNochKeinenAccount);
		
		JButton buttonLogin = new JButton("Anmelden");
		buttonLogin.setToolTipText("Login");
		buttonLogin.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
		buttonLogin.setBounds(10, 111, 130, 25);
		contentPane.add(buttonLogin);
		buttonLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					if(true){
						MainWindow.logedinUser = "Alexander";
						MainWindow.setUser(MainWindow.logedinUser);
						
					}else{
						labelError.setText("Benutzername und Passwort stimmen nicht über ein");
						buttonLogin.setEnabled(false);
						Timer timer = new Timer();
						timer.schedule(new TimerTask() {
							  @Override
							  public void run() {
							    labelError.setText("");
							    buttonLogin.setEnabled(true);
							  }
							}, 3000);
					}
			}
		}); 
		
		JButton buttonRegister = new JButton("Registrieren");
		buttonRegister.setToolTipText("Register");
		buttonRegister.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
		buttonRegister.setBounds(154, 111, 130, 25);
		contentPane.add(buttonRegister);
		
		labelError = new JLabel("");
		labelError.setForeground(Color.red);
		labelError.setFont(new Font("Book Antiqua", Font.PLAIN, 10));
		labelError.setBounds(10, 68, 274, 20);
		contentPane.add(labelError);
	}
	
}

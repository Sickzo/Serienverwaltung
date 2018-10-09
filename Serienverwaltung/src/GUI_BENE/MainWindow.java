package GUI_BENE;

import GUI.LoginWindow;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {

	public static Boolean loggedin = false;
	public static String loggedinUser;
	public static JButton buttonLogin;
	private static final String getInsets = null;
	private JPanel contentPane;
	Font myFont = new Font("Calibri", Font.BOLD, 12);
	static JLabel labelGreeting = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setTitle("Serienverwaltung");
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/Ressourcen/star.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/Ressourcen/star2.png")).getImage();
		Image defaultPicture = new ImageIcon(this.getClass().getResource("/Ressourcen/defaultpicture.png")).getImage();
		
		//Oberes Panel erstellen
		JPanel panelTop = new JPanel();
		panelTop.setBounds(0, 0, 894, 35);
		panelTop.setBackground(Color.decode("#03A9F4"));
		contentPane.add(panelTop);
		panelTop.setLayout(null);
		
			labelGreeting.setText("");;
			labelGreeting.setSize(163, 16);
			labelGreeting.setLocation(10,10);
			labelGreeting.setFont(new Font("Book Antiqua", Font.BOLD, 14));
			panelTop.add(labelGreeting);
			
			buttonLogin = new JButton("Login");
			buttonLogin.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			buttonLogin.setBounds(760, 5, 129, 25);
			panelTop.add(buttonLogin);
			buttonLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					/*
					 * Boolean-wert um abzufragen, ob benutzer schon eingeloggt ist, falls ja,
					 * dann andere funktionalitaet des buttons durch selektive anweisung
					 * */
					if (loggedin) {
						loggedinUser = "";
						labelGreeting.setText("");
						buttonLogin.setText("Login");
						loggedin = false;
					} else if (!loggedin) {
						LoginWindow loginWindow = new LoginWindow();
						loginWindow.setVisible(true);
						loggedin = true;
					} else {
						System.out.println("Fehler bei Button Login/Logout");
					}
					
					
					
				}
			});
		
		//Linkes Panel erstellen
		JPanel panelLeft = new JPanel();
		panelLeft.setBounds(0, 35, 200, 537);
		panelLeft.setBackground(Color.decode("#4FC3F7"));
		panelLeft.setLayout(null);
		contentPane.add(panelLeft);
		
			JTextField txtSearch = new JTextField();
			txtSearch.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			txtSearch.setText("Suchen");
			txtSearch.setToolTipText("");
			txtSearch.setBounds(10, 11, 180, 20);
			panelLeft.add(txtSearch);
			txtSearch.setColumns(10);
			
			JList listFavorites = new JList();
			listFavorites.setFont(new Font("Cambria", Font.PLAIN, 14));
			listFavorites.setBounds(10, 42, 180, 450);
			panelLeft.add(listFavorites);
			
			JButton buttonShowFavorites = new JButton("Alle Favoriten anzeigen");
			buttonShowFavorites.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			buttonShowFavorites.setBounds(10, 501, 180, 25);
			panelLeft.add(buttonShowFavorites);
		
		//Rechtes Panel erstellen
		JPanel panelRight = new JPanel();
		panelRight.setBounds(694, 35, 200, 537);
		panelRight.setBackground(Color.decode("#4FC3F7"));
		panelRight.setLayout(null);
		contentPane.add(panelRight);
		
			JLabel labelTopMovies = new JLabel("Beliebte Filme und Serien");
			labelTopMovies.setFont(new Font("Book Antiqua", Font.BOLD, 14));
			labelTopMovies.setBounds(10, 17, 180, 20);
			panelRight.add(labelTopMovies);
			
			JList listTopMovies = new JList();
			listTopMovies.setBounds(10, 42, 180, 484);
			panelRight.add(listTopMovies);
		
		//Mittiges Panel erstellen
		JLabel panelCenter = new JLabel();
		panelCenter.setIcon(new ImageIcon(defaultPicture));
		panelCenter.setBounds(200, 35, 494, 215);
		panelCenter.setBackground(Color.decode("#FFFFFF"));
		panelCenter.setLayout(null);
		contentPane.add(panelCenter);
		
		//Unteres Panel erstellen
		JPanel panelBottom = new JPanel();
		panelBottom.setBounds(200, 250, 494, 322);
		panelBottom.setBackground(Color.decode("#81D4FA"));
		panelBottom.setLayout(null);
		contentPane.add(panelBottom);
		
			//Bilder f�r Rating
		
			JLabel rating1 = new JLabel();
			JLabel rating2 = new JLabel();
			JLabel rating3 = new JLabel();
			JLabel rating4 = new JLabel();
			JLabel rating5 = new JLabel();
			
			rating1.setIcon(new ImageIcon(img));
			rating1.setBounds(10, 11, 25, 25);
			panelBottom.add(rating1);
			rating1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img2));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img));
					rating2.setIcon(new ImageIcon(img));
					rating3.setIcon(new ImageIcon(img));
					rating4.setIcon(new ImageIcon(img));
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			rating2.setIcon(new ImageIcon(img));
			rating2.setBounds(35, 11, 25, 25);
			panelBottom.add(rating2);
			rating2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img2));
					rating2.setIcon(new ImageIcon(img2));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					rating2.setIcon(new ImageIcon(img));
					rating3.setIcon(new ImageIcon(img));
					rating4.setIcon(new ImageIcon(img));
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			rating3.setIcon(new ImageIcon(img));
			rating3.setBounds(60, 11, 25, 25);
			panelBottom.add(rating3);
			rating3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img2));
					rating2.setIcon(new ImageIcon(img2));
					rating3.setIcon(new ImageIcon(img2));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					rating3.setIcon(new ImageIcon(img));
					rating4.setIcon(new ImageIcon(img));
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			rating4.setIcon(new ImageIcon(img));
			rating4.setBounds(85, 11, 25, 25);
			panelBottom.add(rating4);
			rating4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img2));
					rating2.setIcon(new ImageIcon(img2));
					rating3.setIcon(new ImageIcon(img2));
					rating4.setIcon(new ImageIcon(img2));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					rating4.setIcon(new ImageIcon(img));
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			rating5.setIcon(new ImageIcon(img));
			rating5.setBounds(110, 11, 25, 25);
			panelBottom.add(rating5);
			rating5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img2));
					rating2.setIcon(new ImageIcon(img2));
					rating3.setIcon(new ImageIcon(img2));
					rating4.setIcon(new ImageIcon(img2));
					rating5.setIcon(new ImageIcon(img2));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			JPanel panelCheck= new JPanel();
			panelCheck.setBackground(null);
			panelCheck.setBounds(0, 0, 147, 47);
			panelBottom.add(panelCheck);
			panelCheck.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					rating1.setIcon(new ImageIcon(img));
					rating2.setIcon(new ImageIcon(img));
					rating3.setIcon(new ImageIcon(img));
					rating4.setIcon(new ImageIcon(img));
					rating5.setIcon(new ImageIcon(img));
				}
			});
			
			JButton buttonAddToFavorites = new JButton("zu Favoriten hinzuf\u00FCgen");
			buttonAddToFavorites.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			buttonAddToFavorites.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			buttonAddToFavorites.setBounds(282, 11, 202, 25);
			panelBottom.add(buttonAddToFavorites);
			
			JLabel labelTitle = new JLabel("Titel des Films (Erscheinungsjahr)");
			labelTitle.setFont(new Font("Book Antiqua", Font.BOLD, 20));
			labelTitle.setBounds(10, 47, 474, 25);
			panelBottom.add(labelTitle);
			
			JLabel labelGenre = new JLabel("Horror, Thriller");
			labelGenre.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			labelGenre.setBounds(10, 70, 170, 20);
			panelBottom.add(labelGenre);
			
			JLabel labelDuration = new JLabel("Spieldauer 90 Min.");
			labelDuration.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			labelDuration.setBounds(205, 70, 128, 20);
			panelBottom.add(labelDuration);
			
			JLabel labelActor = new JLabel("mit Til Schweiger, Matthias Schweigh\u00F6fer");
			labelActor.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			labelActor.setBounds(10, 112, 474, 20);
			panelBottom.add(labelActor);
			
			JTextArea txtDescription = new JTextArea();
			txtDescription.setText("Hier kommt eine Kurzbeschreibung des Films rein.");
			txtDescription.setEditable(false);
			txtDescription.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			txtDescription.setBackground(null);
			txtDescription.setRows(10);
			txtDescription.setLineWrap(true);
			txtDescription.setBounds(10, 137, 474, 143);
			panelBottom.add(txtDescription);
			
			//Design �nderungen
			JPanel panelChooseColorGray = new JPanel();
			panelChooseColorGray.setBackground(Color.decode("#607D8B"));
			panelChooseColorGray.setBounds(404, 291, 20, 20);
			panelBottom.add(panelChooseColorGray);
			panelChooseColorGray.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
						panelTop.setBackground(Color.decode("#607D8B"));
						panelLeft.setBackground(Color.decode("#90A4AE"));
						panelRight.setBackground(Color.decode("#90A4AE"));
						panelBottom.setBackground(Color.decode("#B0BEC5"));
				}
			});
			
			JPanel panelChooseColorBlue = new JPanel();
			panelChooseColorBlue.setBackground(Color.decode("#03A9F4"));
			panelChooseColorBlue.setBounds(434, 291, 20, 20);
			panelBottom.add(panelChooseColorBlue);
			panelChooseColorBlue.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
						panelTop.setBackground(Color.decode("#03A9F4"));
						panelLeft.setBackground(Color.decode("#4FC3F7"));
						panelRight.setBackground(Color.decode("#4FC3F7"));
						panelBottom.setBackground(Color.decode("#81D4FA"));
				}
			});
			
			JPanel panelChooseColorRed = new JPanel();
			panelChooseColorRed.setBackground(Color.decode("#F44336"));
			panelChooseColorRed.setBounds(464, 291, 20, 20);
			panelBottom.add(panelChooseColorRed);
			
			panelChooseColorRed.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
						panelTop.setBackground(Color.decode("#F44336"));
						panelLeft.setBackground(Color.decode("#E57373"));
						panelRight.setBackground(Color.decode("#E57373"));
						panelBottom.setBackground(Color.decode("#EF9A9A"));
				}
			});
	
	}
	
	//Getter und Setter
	public static void setUser(String s) {
		labelGreeting.setText("Hallo " + s);
	}
	
}



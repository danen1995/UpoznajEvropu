package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

import gui.zemlje.Austrija;
import gui.zemlje.Francuska;
import gui.zemlje.Holandija;
import gui.zemlje.Nemacka;
import gui.zemlje.Norveska;
import gui.zemlje.Poljska;
import gui.zemlje.Spanija;
import gui.zemlje.Srbija;
import gui.zemlje.Svedska;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpoznajEvropu extends JFrame {

	private JPanel contentPane;
	
	Austrija austrija = new Austrija();
	Srbija srbija = new Srbija();
	Nemacka nemacka = new Nemacka();
	Francuska francuska = new Francuska();
	Holandija holandija = new Holandija();
	Norveska norveska = new Norveska();
	Poljska poljska = new Poljska();
	Spanija spanija = new Spanija();
	Svedska svedska = new Svedska();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public UpoznajEvropu() {
		setTitle("Upoznaj Evropu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblFrancuska = new JLabel("Francuska");
		lblFrancuska.setVisible(false);
		lblFrancuska.setBounds(328, 98, 71, 14);
		panel.add(lblFrancuska);
		
		JButton buttonFrancuska = new JButton("");
		buttonFrancuska.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				francuska.setVisible(true);
				francuska.setLocationRelativeTo(null);
			}
		});
		buttonFrancuska.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblFrancuska.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblFrancuska.setVisible(false);
			}
		});
		buttonFrancuska.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16736524_10203235194597620_2022055548_n.jpg")));
		buttonFrancuska.setBounds(294, 0, 120, 98);
		panel.add(buttonFrancuska);
		
		JLabel lblSpanija = new JLabel("\u0160panija");
		lblSpanija.setVisible(false);
		lblSpanija.setBounds(188, 98, 61, 14);
		panel.add(lblSpanija);
		
		JButton buttonSpanija = new JButton("");
		buttonSpanija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spanija.setVisible(true);
				spanija.setLocationRelativeTo(null);
			}
		});
		buttonSpanija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSpanija.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSpanija.setVisible(false);
			}
		});
		buttonSpanija.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16780397_10203235194397615_726884553_n.jpg")));
		buttonSpanija.setBounds(152, 0, 120, 98);
		panel.add(buttonSpanija);
		
		JLabel lblSvedska = new JLabel("\u0160vedska");
		lblSvedska.setVisible(false);
		lblSvedska.setBounds(42, 220, 61, 14);
		panel.add(lblSvedska);
		
		JButton buttonSvedska = new JButton("");
		buttonSvedska.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				svedska.setVisible(true);
				svedska.setLocationRelativeTo(null);
			}
		});
		
		buttonSvedska.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSvedska.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSvedska.setVisible(false);
			}
		});
		buttonSvedska.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16754336_10203235194517618_1617436318_n.jpg")));
		buttonSvedska.setBounds(10, 123, 120, 98);
		panel.add(buttonSvedska);
		
		JLabel lblNemacka = new JLabel("Nema\u010Dka");
		lblNemacka.setVisible(false);
		lblNemacka.setBounds(188, 220, 61, 14);
		panel.add(lblNemacka);
		
		JButton buttonNemacka = new JButton("");
		buttonNemacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nemacka.setVisible(true);
				nemacka.setLocationRelativeTo(null);
			}
		});
		
		buttonNemacka.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNemacka.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNemacka.setVisible(false);
			}
		});
		buttonNemacka.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16780365_10203235194557619_2024807682_n.jpg")));
		buttonNemacka.setBounds(152, 123, 120, 98);
		panel.add(buttonNemacka);
		
		JLabel lblNorveska = new JLabel("Norve\u0161ka");
		lblNorveska.setVisible(false);
		lblNorveska.setBounds(329, 220, 70, 14);
		panel.add(lblNorveska);
		
		JButton buttonNorveska = new JButton("");
		buttonNorveska.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				norveska.setVisible(true);
				norveska.setLocationRelativeTo(null);
			}
		});
		buttonNorveska.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNorveska.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNorveska.setVisible(false);
			}
		});
		buttonNorveska.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16780154_10203235194437616_609177775_n.jpg")));
		buttonNorveska.setBounds(294, 123, 120, 98);
		panel.add(buttonNorveska);
		
		JLabel lblAustrija = new JLabel("Austrija");
		lblAustrija.setVisible(false);
		lblAustrija.setBounds(42, 339, 61, 14);
		panel.add(lblAustrija);
		
		JButton buttonAustrija = new JButton("");
		buttonAustrija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				austrija.setVisible(true);
				austrija.setLocationRelativeTo(null);
			}
		});
		
		buttonAustrija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAustrija.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAustrija.setVisible(false);
			}
		});
		buttonAustrija.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16753899_10203235213398090_1421740185_n.png")));
		buttonAustrija.setBounds(10, 241, 120, 98);
		panel.add(buttonAustrija);
		
		JLabel lblPoljska = new JLabel("Poljska");
		lblPoljska.setVisible(false);
		lblPoljska.setBounds(188, 339, 61, 14);
		panel.add(lblPoljska);
		
		JButton buttonPoljska = new JButton("");
		buttonPoljska.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poljska.setVisible(true);
				poljska.setLocationRelativeTo(null);
			}
		});
		buttonPoljska.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPoljska.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPoljska.setVisible(false);
			}
		});
		buttonPoljska.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16736630_10203235213358089_308744446_n.jpg")));
		buttonPoljska.setBounds(152, 241, 120, 98);
		panel.add(buttonPoljska);
		
		JLabel lblHolandija = new JLabel("Holandija");
		lblHolandija.setVisible(false);
		lblHolandija.setBounds(329, 339, 70, 14);
		panel.add(lblHolandija);
		
		JButton buttonHolandija = new JButton("");
		buttonHolandija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				holandija.setVisible(true);
				holandija.setLocationRelativeTo(null);
			}
		});
		buttonHolandija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblHolandija.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblHolandija.setVisible(false);
			}
		});
		buttonHolandija.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16736691_10203235213438091_1982199061_n.jpg")));
		buttonHolandija.setBounds(294, 241, 120, 98);
		panel.add(buttonHolandija);
		
		JLabel lblSrbija = new JLabel("Srbija");
		lblSrbija.setVisible(false);
		lblSrbija.setBounds(59, 98, 71, 14);
		panel.add(lblSrbija);
		
		JButton buttonSrbija = new JButton("");
		buttonSrbija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				srbija.setVisible(true);
				srbija.setLocationRelativeTo(null);
				
			}
		});
		buttonSrbija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSrbija.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSrbija.setVisible(false);
			}
		});
		buttonSrbija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		buttonSrbija.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16780157_10203235194477617_1828456671_n.jpg")));
		buttonSrbija.setBounds(10, 0, 120, 98);
		panel.add(buttonSrbija);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(154, 205, 50));
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setIcon(new ImageIcon(UpoznajEvropu.class.getResource("/slike/16780255_10203235467004430_90068637_n.png")));
		btnNewButton.setBounds(20, 359, 36, 36);
		panel.add(btnNewButton);
		
		
		
		
	}
}

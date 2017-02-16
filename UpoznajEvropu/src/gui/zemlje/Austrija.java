package gui.zemlje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.GUIKontroler;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Austrija extends JFrame {

	private JPanel contentPane;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label;
	private JLabel lblDsfsdfsdfsdfsf;
	private JButton btnNazad;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public Austrija() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		setTitle("Austrija");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		 btn1  = new JButton("Mapa");
		 btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				panel2.setVisible(false);
				panel1.setVisible(true);
				panel3.setVisible(false);
			}

		

		
		});
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNazad.setIcon(new ImageIcon(Srbija.class.getResource("/slike/bacicon.png")));
		btnNazad.setForeground(Color.BLACK);
		btnNazad.setBackground(Color.WHITE);
		panel.add(btnNazad);
		btn1.setName("btn1");
		btn1.setIcon(new ImageIcon(Srbija.class.getResource("/slike/one.png")));
		panel.add(btn1);
		btn1.setEnabled(false);
		 btn2 = new JButton("Glavni grad");
		 btn2.setBackground(Color.WHITE);
		btn2.setIcon(new ImageIcon(Srbija.class.getResource("/slike/two.png")));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(false);
				btn3.setEnabled(true);
				panel2.setVisible(true);
				panel1.setVisible(false);
				panel3.setVisible(false);
			}
		});
		panel.add(btn2);
		 btn3 = new JButton("Zastava");
		 btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(false);
				panel2.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(true);
			}
		});
		btn3.setIcon(new ImageIcon(Srbija.class.getResource("/slike/three.png")));
		panel.add(btn3);
		
		
		
		JPanel parentPanel = new JPanel();
		contentPane.add(parentPanel, BorderLayout.CENTER);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		parentPanel.add(panel1, "name_519136036181722");
		panel1.setLayout(null);
		
		label = new JLabel("");
		label.setBounds(-13, -35, 500, 490);
		label.setIcon(new ImageIcon(Austrija.class.getResource("/zemlje/Austrija.png")));
		panel1.add(label);
		
		panel2 = new JPanel();
		parentPanel.add(panel2, "name_519142343888746");
		panel2.setLayout(null);
		
		lblDsfsdfsdfsdfsf = new JLabel("");
		lblDsfsdfsdfsdfsf.setBounds(0, -31, 474, 474);
		lblDsfsdfsdfsdfsf.setIcon(new ImageIcon(Austrija.class.getResource("/gradovi/bec.png")));
		panel2.add(lblDsfsdfsdfsdfsf);
		
		panel3 = new JPanel();
		parentPanel.add(panel3, "name_519148990046526");
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Austrija.class.getResource("/slike/zastave/austrija.png")));
		panel3.add(lblNewLabel);
	}
	

	
}

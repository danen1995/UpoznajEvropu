package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pocetna extends JFrame {

	private JPanel contentPane;
	UpoznajEvropu upoznajEvropu = new UpoznajEvropu();
	Kviz kviz = new Kviz();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pocetna() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		setTitle("Upoznaj Evropu");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnUpoznajEvropu = new JButton("");
		btnUpoznajEvropu.setMinimumSize(new Dimension(109, 200));
		btnUpoznajEvropu.setMaximumSize(new Dimension(109, 150));
		btnUpoznajEvropu.setBounds(29, 11, 154, 153);
		btnUpoznajEvropu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				upoznajEvropu.setVisible(true);
				upoznajEvropu.setLocationRelativeTo(null);
			}
		});
		btnUpoznajEvropu.setIcon(new ImageIcon(Pocetna.class.getResource("/slike/europe-128.png")));
		btnUpoznajEvropu.setPreferredSize(new Dimension(128, 150));
		panel.add(btnUpoznajEvropu);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kviz.setVisible(true);
				kviz.setLocationRelativeTo(null);
				kviz.nasumicnoPitanje();
				kviz.osveziRbrPitanja();
				
			}

	
		});
		button.setIcon(new ImageIcon(Pocetna.class.getResource("/slike/d509520b.png")));
		button.setPreferredSize(new Dimension(128, 150));
		button.setMinimumSize(new Dimension(109, 200));
		button.setMaximumSize(new Dimension(109, 150));
		button.setBounds(232, 11, 154, 153);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Pocetna.class.getResource("/slike/9-128.png")));
		button_1.setPreferredSize(new Dimension(128, 150));
		button_1.setMinimumSize(new Dimension(109, 200));
		button_1.setMaximumSize(new Dimension(109, 150));
		button_1.setBounds(29, 186, 154, 153);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		button_2.setIcon(new ImageIcon(Pocetna.class.getResource("/slike/quit_exit-128.png")));
		button_2.setPreferredSize(new Dimension(128, 150));
		button_2.setMinimumSize(new Dimension(109, 200));
		button_2.setMaximumSize(new Dimension(109, 150));
		button_2.setBounds(232, 186, 154, 153);
		panel.add(button_2);
	}
}

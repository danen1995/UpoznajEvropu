package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kviz.GrupaPitanja;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class Kviz extends JFrame {

	private JPanel contentPane;
	public JLabel lblPitanje, lblBrojPoena;
	public JButton btna, btnb, btnc, btnd;
	public String tacanOdgovor;
	public int rezultat = 0;
	public int rbrPitanja = 1;
	private JLabel lblRezultat;
	private JLabel lblrbrPitanja;
	private JLabel label;
	private JTextField textField;
	private JLabel lblCestitamo;
	JPanel panel_2;
	JPanel panel_3;
	public Kviz() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				rezultat = 0;
				rbrPitanja = 1;
				osveziRezultat();
				osveziRbrPitanja();
			}
		});
		setTitle("Kviz");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		lblBrojPoena = new JLabel("Broj poena:");
		panel.add(lblBrojPoena);
		
		lblRezultat = new JLabel("");
		panel.add(lblRezultat);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		 panel_3 = new JPanel();
		panel_1.add(panel_3, "name_536321232942352");
		panel_3.setLayout(null);
		
		lblPitanje = new JLabel("PITANJE");
		lblPitanje.setBounds(50, 21, 364, 39);
		panel_3.add(lblPitanje);
		
		 btna = new JButton("");
		 btna.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		if(btna.getText().contains(tacanOdgovor)){
		 			rezultat++;
		 			rbrPitanja++;
		 			osveziRezultat();
					if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}else {
		 			rezultat--;
		 			rbrPitanja++;
		 			osveziRezultat();
		 			
		 			if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}
		 		
		 	}
		 });
		btna.setBounds(50, 90, 132, 23);
		panel_3.add(btna);
		
		 btnb = new JButton("");
		 btnb.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		if(btnb.getText().contains(tacanOdgovor)){
		 			rezultat++;
		 			rbrPitanja++;
		 			osveziRezultat();
					if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}else {
		 			rezultat--;
		 			rbrPitanja++;
		 			osveziRezultat();
		 			
		 			if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}
		 	}
		 });
		btnb.setBounds(244, 90, 132, 23);
		panel_3.add(btnb);
		
		 btnc = new JButton("");
		 btnc.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(btnc.getText().contains(tacanOdgovor)){
		 			rezultat++;
		 			rbrPitanja++;
		 			osveziRezultat();
					if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}else {
		 			rezultat--;
		 			rbrPitanja++;
		 			osveziRezultat();
		 			
		 			if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}
		 	}
		 });
		btnc.setBounds(50, 135, 132, 23);
		panel_3.add(btnc);
		
		 btnd = new JButton("");
		 btnd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(btnd.getText().contains(tacanOdgovor)){
		 			rezultat++;
		 			rbrPitanja++;
		 			osveziRezultat();
					if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}else {
		 			rezultat--;
		 			rbrPitanja++;
		 			osveziRezultat();
		 			
		 			if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 		}
		 	}

		
		 });
		btnd.setBounds(244, 135, 132, 23);
		panel_3.add(btnd);
		
		JButton btnNewButton = new JButton("Preskoci");
		btnNewButton.setBounds(279, 181, 135, 23);
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					rbrPitanja++;
					osveziRezultat();
		 			if(lblPitanje.getText()=="11"){
						upisiSe();
						return;
					}
		 			osveziRbrPitanja();
		 			nasumicnoPitanje();
		 			
			}

	
		});
		
		lblrbrPitanja = new JLabel("");
		lblrbrPitanja.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblrbrPitanja.setBounds(10, 11, 46, 54);
		panel_3.add(lblrbrPitanja);
		
		label = new JLabel(" ");
		label.setIcon(new ImageIcon(Kviz.class.getResource("/slike/pozadinaKviza.png")));
		label.setBounds(0, 0, 434, 229);
		panel_3.add(label);
		
		 panel_2 = new JPanel();
		panel_1.add(panel_2, "name_169688616700768");
		panel_2.setLayout(null);
		
		lblCestitamo = new JLabel("Cestitamo!");
		lblCestitamo.setFont(new Font("Bradley Hand ITC", Font.BOLD, 34));
		lblCestitamo.setBounds(136, 11, 200, 51);
		panel_2.add(lblCestitamo);
		
		JLabel lblUnesiteIme = new JLabel("Unesite ime : ");
		lblUnesiteIme.setBounds(119, 98, 76, 14);
		panel_2.add(lblUnesiteIme);
		
		textField = new JTextField();
		textField.setBounds(205, 95, 146, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Kviz.class.getResource("/slike/16809584_10203262022188293_1877923371_n.png")));
		lblNewLabel.setBounds(0, -31, 424, 258);
		panel_2.add(lblNewLabel);
		
	}
	public void nasumicnoPitanje(){
		int i = GUIKontroler.nasumicniRedniBrojPitanja();
		lblPitanje.setText(GUIKontroler.vratiPitanja().get(i).getPitanje());
		btna.setText(GUIKontroler.vratiPitanja().get(i).getPonudjeniOdgovori()[0]);
		btnb.setText(GUIKontroler.vratiPitanja().get(i).getPonudjeniOdgovori()[1]);
		btnc.setText(GUIKontroler.vratiPitanja().get(i).getPonudjeniOdgovori()[2]);
		btnd.setText(GUIKontroler.vratiPitanja().get(i).getPonudjeniOdgovori()[3]);
		tacanOdgovor = GUIKontroler.vratiPitanja().get(i).getTacanOdgovor();
	}
	public void osveziRezultat(){
		lblRezultat.setText(Integer.toString(rezultat));
	}
	public void osveziRbrPitanja() {
		lblrbrPitanja.setText(Integer.toString(rbrPitanja));
		
	}
	public void upisiSe() {
		panel_2.setVisible(true);
		panel_3.setVisible(false);
		
	}
}

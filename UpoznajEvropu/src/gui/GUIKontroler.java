package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kviz.GrupaPitanja;
import kviz.Pitanje;


public class GUIKontroler extends JFrame {

	private JPanel contentPane;
	private static Pocetna glavniProzor;
	private static GrupaPitanja grupa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					glavniProzor = new Pocetna();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public GUIKontroler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da zatvorite program?",
				"Zatvaranje aplikacije", JOptionPane.YES_NO_OPTION);
		
		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		
		}
	}
	public static void unesiPitanje(String pitanje,String odgovor){
		try{
			Pitanje p = new Pitanje(pitanje, odgovor);
			grupa.unesiPitanje(p);
			GUIKontroler.sacuvajUFajl();
			
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Proveri formu "+ e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	public static void sacuvajUFajl(){
		try {
			grupa.upisiUFajl();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}

package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Kviz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kviz frame = new Kviz();
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
	public Kviz() {
		setTitle("Kviz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblUnesiteOdgovor = new JLabel("Unesite odgovor:");
		panel.add(lblUnesiteOdgovor);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Potvrdi");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Preskoci");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_536321232942352");
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 35, 368, 22);
		panel_3.add(textArea);
		
	}
}

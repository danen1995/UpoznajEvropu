package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.models.RangListaTableModel;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RangLista extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public RangLista() {
		setResizable(false);
		setTitle("Rang Lista");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(255, 255, 204));
		scrollPane.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		scrollPane.setBackground(new Color(255, 228, 196));
		scrollPane.setBounds(0, 0, 424, 171);
		panel.add(scrollPane);
		
		table = getTable();
		scrollPane.setViewportView(table);
	}
	public JTable getTable() {
		if(table == null ){
			table = new JTable();
			table.setGridColor(new Color(0, 0, 0));
		
			table.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			table.setBackground(new Color(255, 255, 255));
			RangListaTableModel model = new RangListaTableModel(null);
			table.setModel(model);
		}
		return table;
	}
}

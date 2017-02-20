package gui.models;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;


import ucesnici.Ucesnik;


public class RangListaTableModel extends AbstractTableModel {
	
	private final String[] kolone = new String[] {"Rang","Ime","Poeni"};
	
	private LinkedList<Ucesnik> ucesnici ;
	
	

	public RangListaTableModel(LinkedList<Ucesnik> ucesnici) {
		if(ucesnici==null){
			this.ucesnici= new LinkedList<>();
		}else this.ucesnici = ucesnici;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ucesnici.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return kolone.length; 
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Ucesnik u = ucesnici.get(rowIndex);
		switch (columnIndex) {
		case 0: return rowIndex+1;
		case 1: return u.getIme();
		case 2: return u.getBrPoena();
		default: return "NN";
		
		}
	}
	@Override
	public String getColumnName(int column) {
			return kolone[column];
	}
	public void ucitajUcesnike(LinkedList<Ucesnik> ucesnici){
		this.ucesnici=ucesnici;
		fireTableDataChanged();
	}
	
	public Ucesnik getUcesnikByIndex(int index){
		return ucesnici.get(index);
	}

}

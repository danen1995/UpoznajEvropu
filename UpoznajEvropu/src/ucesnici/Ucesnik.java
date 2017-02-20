package ucesnici;

import java.io.Serializable;

public class Ucesnik implements Serializable{

	private String ime;
	private int brPoena;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getBrPoena() {
		return brPoena;
	}
	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}
	public Ucesnik() {
		// TODO Auto-generated constructor stub
	}
	public Ucesnik(String ime, int brPoena) {
		super();
		this.ime = ime;
		this.brPoena = brPoena;
	}
	@Override
	public String toString() {
		return "Ucesnik [ime=" + ime + ", brPoena=" + brPoena + "]";
	}
	
	
}

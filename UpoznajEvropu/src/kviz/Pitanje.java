package kviz;

public class Pitanje {
	public Pitanje(String pitanje, String odgovor) {
		super();
		this.pitanje = pitanje;
		this.odgovor = odgovor;
	}
	private String pitanje;
	private String odgovor;
	
	public Pitanje() {
		// TODO Auto-generated constructor stub
	}
	


	public String getOdgovor() {
		return odgovor;
	}
	public String getPitanje() {
		return pitanje;
	}
	public void setOdgovor(String odgovor) {
		this.odgovor = odgovor;
	}
	public void setPitanje(String pitanje) {
		this.pitanje = pitanje;
	}
	
}

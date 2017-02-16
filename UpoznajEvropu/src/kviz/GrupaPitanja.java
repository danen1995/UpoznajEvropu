package kviz;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class GrupaPitanja {
	 private LinkedList<Pitanje> pitanja = new LinkedList<>();

	@Override
	public String toString() {
		return "GrupaPitanja [pitanja=" + pitanja + "]";
	}

	public LinkedList<Pitanje> getPitanja() {
		return pitanja;
	}

	public void setPitanja(LinkedList<Pitanje> pitanja) {
		this.pitanja = pitanja;
	}
	
	public void unesiPitanje(Pitanje pitanje){
		pitanja.add(pitanje);
		upisiUFajl();
	}

	public void upisiUFajl() {
			try {
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("pitanja.txt")));
					out.writeObject(pitanja);
				out.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}
}

package ucesnici;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;



public class GrupaUcesnika {
	private LinkedList<Ucesnik> ucesnici = new LinkedList<>();

	public LinkedList<Ucesnik> getUcesnici() {
		return ucesnici;
	}

	public void setUcesnici(LinkedList<Ucesnik> ucesnici) {
		this.ucesnici = ucesnici;
	}

	public LinkedList<Ucesnik> vratiSveUcesnike(){
		return ucesnici; 
	}

	public void unesiUcesnika(Ucesnik u) {
		int m =0;
		if(ucesnici.isEmpty()) ucesnici.add(u);
		else{
		for(int i = 0; i< ucesnici.size(); i++){
			if(ucesnici.get(i).getBrPoena() < u.getBrPoena()){
				ucesnici.add(i, u);
				m++;
				break;
			}
		}
		if(m == 0) ucesnici.add(u);
		}
		serijalizuj();
		
	}

	private void serijalizuj() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ucesnici.txt")));
			
				out.writeObject(ucesnici);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	public void ucitajIzFajlaDeserijalizacijom() {
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ucesnici.txt")));
			LinkedList<Ucesnik> ucesnici2 = (LinkedList<Ucesnik>) (in.readObject());
			ucesnici.clear();
			ucesnici.addAll(ucesnici2);

			in.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		
	}
}

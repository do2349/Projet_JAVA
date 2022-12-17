package appli;

import consoCarbonne.Alimentation;
import consoCarbonne.BienConso;
import consoCarbonne.CE;
import consoCarbonne.Logement;
import consoCarbonne.Taille;
import consoCarbonne.Transport;

public class AppliMain {
	
	private static Alimentation alimentation;
	private static Logement logement;
	private static BienConso bienConso;
	private static Transport transport; 
	
	public static void main(String[] args) {
		
		alimentation = new Alimentation(0.7, 0.2);
		logement = new Logement(72, CE.B);
		bienConso = new BienConso(3000);
		transport = new Transport(true, Taille.G, 2000, 5);
		
		Alimentation.empreinteAlimentation();
		Logement.empreinteLogement();
		BienConso.empreinteBienConso();
		Transport.empreinteTransport();
		
		alimentation.setImpact();
		logement.setImpact();
		bienConso.setImpact();
		transport.setImpact();
		
		
		System.out.println(alimentation.toString());
		System.out.println(logement.toString());
		System.out.println(bienConso.toString());
		System.out.println(transport.toString());
	}
}

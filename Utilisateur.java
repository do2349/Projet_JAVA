package utilisateur;

import consoCarbonne.*;

public class Utilisateur {
	private Alimentation alimentation;
	private BienConso bienConso;
	private Logement logement; 
	private Transport transport;
	private ServicesPublics services;
	
	public Utilisateur() {
		alimentation = new Alimentation(0.7, 0.2);
		logement = new Logement(72, CE.B);
		bienConso = new BienConso(3000);
		transport = new Transport(true, Taille.G, 2000, 5);
	}
	
	public double calculerEmpreinte() {
		return alimentation.getImpact() + bienConso.getImpact() + logement.getImpact() + transport.getImpact();
	}
	
	public void detaillerEmpreinte() {
		System.out.println(alimentation.toString());
		System.out.println(logement.toString());
		System.out.println(bienConso.toString());
		System.out.println(transport.toString());
	}
}

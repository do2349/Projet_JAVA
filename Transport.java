package consoCarbonne;

import java.lang.Math;
import java.text.DecimalFormat;

public class Transport extends ConsoCarbone {
	private boolean possede;
	private Taille taille; 
	private int kilomAnnee; 
	private int amortissement; 
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static double empruntMoyenne;
	private final static int trainEtBus = 85;
	private final static int fretEtMessagerie = 383;
	private final static int avion = 480;
	private final static int voiture = 1972;
	
	public Transport(boolean possede, Taille taille, int amortissement, int kilomAnnee) {
		super();
		this.possede = possede; 
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement; 
	}

	public Taille getTaille() {
		return taille;
	}
	
	public void setTaille(Taille taille) {
		this.taille = taille;
	}
	
	public boolean getPossede() {
		return possede;
	}
	
	public void setPossede(boolean possede) {
		this.possede = possede;
	}
	
	public int getKilomAnnee() {
		return kilomAnnee;
	}
	
	public void setKilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}
	
	public int getAmortissement() {
		return amortissement;
	}
	
	public void setamortissement(Taille taille) {
		this.taille = taille;
	}
	
	@Override
	public void setImpact() {
		if(possede) {
			impact = kilomAnnee + 1.93 * Math.pow(10, -4) + taille.getEmission()/amortissement;
		}
		else {
			impact = 0.0; 
		}
	}
	
	public static void empreinteTransport() {
		empruntMoyenne = (trainEtBus + fretEtMessagerie + avion + voiture) * Math.pow(10, -3);
	}
	
	@Override
	public String toString() {
		return "L'empreinte moyenne d'un français en une année due au transport est de " + df2.format(empruntMoyenne) + " TCO2eq\n" + "L'empreinte carbone d'une " + taille + " voiture est de " + df2.format(impact) + " TCO2eq";
	}
}

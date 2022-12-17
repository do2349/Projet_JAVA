package consoCarbonne;

import java.lang.Math;
import java.text.DecimalFormat;

public class Alimentation extends ConsoCarbone {
	private double txBoeuf;
	private double txVege; 
	private static double empruntMoyenne;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private final static int COEFFBOEUF = 8;
    private final static double COEFFVOLAILLE = 1.6;
    private final static double COEFFVEGE = 0.9;
	private final static int boissons = 263;
	private final static int autres = 538;
	private final static int produitsLaitiers = 408;
	private final static int viandesPoissons = 1144;
	
	public Alimentation(double txBoeuf, double txVege) {
		super();
		this.txBoeuf = txBoeuf;
		this.txVege = txVege;
	}
	
	public double getTxBoeuf() {
		return txBoeuf;
	}
	
	public double getTxVege() {
		return txVege;
	}
	
	public void setTxBoeuf(double txBoeuf) {
		this.txBoeuf = txBoeuf;
	}
	
	public void setTxVege(double txVege) {
		this.txVege = txVege;
	}
	
	@Override
	public void setImpact() {
		impact = COEFFBOEUF * txBoeuf + COEFFVOLAILLE * (1- txVege - txBoeuf) + COEFFVEGE * txVege;
	}
	
	public static void empreinteAlimentation() {
		empruntMoyenne = (boissons + autres + produitsLaitiers + viandesPoissons) * Math.pow(10, -3);
	}
	
	@Override
	public String toString() {
		return "L'empreinte carbone moyenne anuelle d'un français due à son alimentation est de " + df2.format(empruntMoyenne) + " TCO2eq\n" + "L'empreinte carbone d'une alimentation composée à " + txBoeuf*100 + "% de repas à base de boeuf, à " + txVege*100 + "% de repas végétarien et à " + df2.format((1-txVege-txBoeuf)*100) + "% de repas à base de volaille est de " + df2.format(impact) + " TCO2eq";
	}
}

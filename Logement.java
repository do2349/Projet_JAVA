package consoCarbonne;

import java.lang.Math;
import java.text.DecimalFormat;

public class Logement extends ConsoCarbone {
	private int superficie;
	private CE ce;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static double empruntMoyenne;
	private final static int equipement = 335;
	private final static int construction = 675;
	private final static int energie = 1696;
	
	public Logement(int superficie, CE ce) {
		super();
		this.superficie = superficie;
		this.ce = ce;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public CE getCe() {
		return ce;
	}
	
	public double getImpact() {
		return impact;
	}
	
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public void setCe(CE ce) {
		this.ce = ce;
	}
	
	@Override
	public void setImpact() {
		impact = ce.getCoeff()*superficie;
	}
	
	public static void empreinteLogement() {
		empruntMoyenne = (equipement + construction + energie) * Math.pow(10, -3);
	}
	
	@Override
	public String toString() {
		return "L'empreinte carbone moyenne anuelle d'un français due à son logement est de " + df2.format(empruntMoyenne) + " TCO2eq\n" + "L'empreinte carbone d'un logement de classe énergétique " + ce + " et de superficie " + superficie + " est de " + impact + " TCO2eq";
	}
}

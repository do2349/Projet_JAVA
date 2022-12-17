package consoCarbonne;

import java.text.DecimalFormat;

public class BienConso extends ConsoCarbone {
	private double montant;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private final static int habillement = 763;
	private final static int biensEtServices = 682;
	private final static int internet = 1180;
	private static double empruntMoyenne;
	
	public BienConso(double montant) {
		super();
		this.montant = montant;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public void setImpact() {
		impact = montant/1750.0;
	}
	
	public static void empreinteBienConso() {
		empruntMoyenne = (habillement + biensEtServices + internet) * Math.pow(10, -3);
	}
	
	@Override
	public String toString() {
		return "L'empreinte carbone moyenne anuelle d'un français due à sa consommation de bien est de " + df2.format(empruntMoyenne) + " TCO2eq\n" + "L'empreinte carbone due à la consommation de bien d'un montant de " + montant + "€ est de " + df2.format(impact) + "TCO2eq";
	}

}

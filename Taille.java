package consoCarbonne;

public enum Taille {
	P(4.2), G(19.0);
	
	private double emission;
	
	private Taille(double emission){
		this.emission = emission;
	}
	
	public double getEmission() {
		return this.emission;
	}
}
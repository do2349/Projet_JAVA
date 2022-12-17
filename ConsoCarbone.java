package consoCarbonne;

public abstract class ConsoCarbone {
	private int id = 0;
	protected double impact;
	
	public ConsoCarbone() {
    	++this.id;
    	this.impact = 0;
	}
	
	public double getImpact() {
		return impact;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract void setImpact();
}

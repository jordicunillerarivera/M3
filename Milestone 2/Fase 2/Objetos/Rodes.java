package Objetos;

public class Rodes {
	
	// Atributs
	private String marcaRodes;
	private double diametreRodes;
	private final double DIAMETRERODES=2;
	
	public Rodes(String marcaRodes, double diametreRodes) {
		
		this.marcaRodes = marcaRodes;
		this.diametreRodes = comprovarDiametre(diametreRodes);
		
	}
	
	// Metodes
	public double comprovarDiametre(double diametre) {
		
		if (diametre >=0.4 && diametre <= 4) {
			return diametre;
		} else {
			return this.DIAMETRERODES;
		}
		
	}
	@Override
	public String toString() {
		return "Rodes [marcaRodes=" + marcaRodes + ", diametreRodes=" + diametreRodes + "]";
	}
	
	// Setters & Getters

	public String getMarcaRodes() {
		return marcaRodes;
	}

	public void setMarcaRodes(String marcaRodes) {
		this.marcaRodes = marcaRodes;
	}

	public double getDiametreRodes() {
		return diametreRodes;
	}

	public void setDiametreRodes(double diametreRodes) {
		this.diametreRodes = diametreRodes;
	}
	
	

}

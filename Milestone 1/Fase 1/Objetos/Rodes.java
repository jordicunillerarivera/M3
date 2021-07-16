package Objetos;

public class Rodes {
	
	// Atributs
	private String marcaRodes;
	private double diametreRodes;
	
	public Rodes(String marcaRodes, double diametreRodes) {
		
		this.marcaRodes = marcaRodes;
		this.diametreRodes = diametreRodes;
		
	}
	
	// Metodes
	
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

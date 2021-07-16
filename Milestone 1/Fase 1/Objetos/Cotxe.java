package Objetos;

public class Cotxe {
	
	// Atributs
	
	private String matricula;
	private String marca;
	private String color;
	private Rodes rodesDavanteres;
	private Rodes rodesPosteriors;
	
	// Constructors
	
	public Cotxe(String matricula, String marca, String color) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		
	}
	
	// Metodes
	
	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]"
				+ "\nrodesDavanteres " + rodesDavanteres.toString() + "\nrodesPosteriors " + rodesPosteriors.toString() + " ]";
	}
	
	// Setters i Getters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Rodes getRodesDavanteres() {
		return rodesDavanteres;
	}

	public void setRodesDavanteres(Rodes rodesDavanteres) {
		this.rodesDavanteres = rodesDavanteres;
	}

	public Rodes getRodesPosteriors() {
		return rodesPosteriors;
	}

	public void setRodesPosteriors(Rodes rodesPosteriors) {
		this.rodesPosteriors = rodesPosteriors;
	}

}

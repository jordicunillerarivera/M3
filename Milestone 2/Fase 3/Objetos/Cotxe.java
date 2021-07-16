package Objetos;

public class Cotxe extends Vehicles {

	

	// Constructors

	public Cotxe(String matricula, String marca, String color) {

		super(matricula, marca, color);

	}

	// Metodes

	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]" + "\nrodesDavanteres "
				+ rodesDavanteres.toString() + "\nrodesPosteriors " + rodesPosteriors.toString();
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

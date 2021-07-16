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

		this.matricula = comprMatricula();
		this.marca = marca;
		this.color = color;

	}

	// Metodes

	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]" + "\nrodesDavanteres "
				+ rodesDavanteres.toString() + "\nrodesPosteriors " + rodesPosteriors.toString() + " ]";
	}

	public String comprMatricula() {

		String matBuffer = "";
		int length = this.matricula.length();

		final String diccionariNum = "1234567890";
		final String diccionariLlet = "BCDFGHJKLMNPRSTVWXYZ";

		for (int i = 0; i < length; i++) {

			if (i >= 0 && i <= 3) {

				for (int e = 0; e < diccionariNum.length(); e++) {

					if (matricula.charAt(i) == diccionariNum.charAt(e)) {

						matBuffer += matricula.charAt(i);

					} else {

						matBuffer = "Matrícula errónea";
					}
					
				}

			} else if (i >= 4 && i <= 6) {

				for (int e = 0; e < diccionariLlet.length(); e++) {

					if (matricula.charAt(i) == diccionariLlet.charAt(e)) {

						matBuffer += matricula.charAt(i);

					} else if (matricula.charAt(i) != diccionariLlet.charAt(e)) {

						matBuffer = "Matrícula errónea";

					}

				}

			}
			
		}

		return matBuffer;

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

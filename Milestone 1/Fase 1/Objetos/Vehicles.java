package Objetos;

public class Vehicles {

	// Atributs
	
		protected String matricula;
		protected String marca;
		protected String color;
		protected Rodes rodesDavanteres;
		protected Rodes rodesPosteriors;

		
		// Constructors
		
		public Vehicles(String matricula, String marca, String color) {
			
			this.matricula = matricula;
			this.marca = marca;
			this.color = color;
			
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

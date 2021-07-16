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
			
			this.matricula = comprMatricula(matricula);
			this.marca = marca;
			this.color = color;
			
		}
		
		// Metodes
		
		// Metode per a comprovar que la matricula sigue correcta
		public String comprMatricula(String matricula) {

			String matBuffer = "";
			int length = matricula.length();

			final String diccionariNum = "1234567890";
			final String diccionariLlet = "BCDFGHJKLMNPRSTVWXYZ";

			if (length >= 7) {
				
				for (int i = 0; i < length; i++) {
		
					if (i >= 0 && i <= 3) {
		
						for (int e = 0; e < diccionariNum.length(); e++) {
		
							if (matricula.charAt(i) == diccionariNum.charAt(e)) {
		
								matBuffer += matricula.charAt(i);
		
							} else {
		
								matBuffer = "Matr�cula err�nea";
							}
						}
		
					} else if (i >= 4 && i <= 6) {
		
						for (int e = 0; e < diccionariLlet.length(); e++) {
		
							if (matricula.charAt(i) == diccionariLlet.charAt(e)) {
		
								matBuffer += matricula.charAt(i);
		
							} else if (matricula.charAt(i) != diccionariLlet.charAt(e)) {
		
								matBuffer = "Matr�cula err�nea";
							}
						}
					}
				}
			} else {
				matBuffer = "Matr�cula err�nea";
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

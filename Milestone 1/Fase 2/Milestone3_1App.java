import javax.swing.JOptionPane;
import Objetos.*;

public class Milestone3_1App {

	public static void main(String[] args) {
		
		Cotxe cotxe = crearCotxe();
		afegirRodes(cotxe);
		
		System.out.println(cotxe.toString());

	}
	
	public static Cotxe crearCotxe() {
		
		// Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
		
		String matricula = JOptionPane.showInputDialog("Introdueix la matricula del vehicle");
		String marca = JOptionPane.showInputDialog("Introdueix la marca del vehicle");
		String color = JOptionPane.showInputDialog("Introdueix el color del vehicle");
		
		// Crear el cotxe amb les dades anteriors.
		
		Cotxe cotxe = new Cotxe(matricula, marca, color);
		
		return cotxe;
		
	}
	
	public static void afegirRodes(Cotxe cotxe) {
		
		// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
		
		String marcaRodesPosteriors = JOptionPane.showInputDialog("Introdueix la marca de les rodes posteriors");
		double diametreRodesPosteriors = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes posteriors"));
		
		Rodes rodesPosteriors = new Rodes(marcaRodesPosteriors, diametreRodesPosteriors);
		
		// Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
		
		String marcaRodesDavanteres = JOptionPane.showInputDialog("Introdueix la marca de les rodes davanteres");
		double diametreRodesDavanteres = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes davanteres"));
		
		Rodes rodesDavanteres = new Rodes(marcaRodesDavanteres, diametreRodesDavanteres);
		
		cotxe.setRodesPosteriors(rodesPosteriors);
		cotxe.setRodesDavanteres(rodesDavanteres);
		
	}

}

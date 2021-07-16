import javax.swing.JOptionPane;
import Objetos.*;

public class Milestone3_1App {

	public static void main(String[] args) {
		
		
		String eleccio = JOptionPane.showInputDialog("Introdueix el tipus de vehicle que tens (Cotxe/Moto");
		
		seleccioVehicle(eleccio);
		
	//	Cotxe cotxe = crearVehicle();
	//	afegirRodes(cotxe);
		
		//System.out.println(cotxe.toString());

	}
	
	public static Object crearVehiculo(String eleccio) {
		
		// Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
		
		String matricula = JOptionPane.showInputDialog("Introdueix la matricula del vehicle");
		String marca = JOptionPane.showInputDialog("Introdueix la marca del vehicle");
		String color = JOptionPane.showInputDialog("Introdueix el color del vehicle");
		
		// Crear el cotxe amb les dades anteriors.
		
		if(eleccio.equals("cotxe")) {
			
			Cotxe cotxe = new Cotxe(matricula, marca, color);
			return cotxe;
		}else if(eleccio.equals("moto")) {
			
			Moto moto = new Moto(matricula, marca, color);
			return moto;
		}
		return null;
		
		
		
	}
	
	public static void afegirRodes(Object vehicle) {
		
		// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
		
		String marcaRodesPosteriors = JOptionPane.showInputDialog("Introdueix la marca de les rodes posteriors");
		double diametreRodesPosteriors = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes posteriors"));
		
		Rodes rodesPosteriors = new Rodes(marcaRodesPosteriors, diametreRodesPosteriors);
		
		// Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
		
		String marcaRodesDavanteres = JOptionPane.showInputDialog("Introdueix la marca de les rodes davanteres");
		double diametreRodesDavanteres = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes davanteres"));
		
		Rodes rodesDavanteres = new Rodes(marcaRodesDavanteres, diametreRodesDavanteres);
		
		if(vehicle instanceof Cotxe) {
			((Cotxe) vehicle).setRodesPosteriors(rodesPosteriors);
			((Cotxe) vehicle).setRodesDavanteres(rodesDavanteres);
		}else if(vehicle instanceof Moto) {
			((Moto) vehicle).setRodesPosteriors(rodesPosteriors);
			((Moto) vehicle).setRodesDavanteres(rodesDavanteres);
		}
		
	}
	public static void seleccioVehicle(String eleccio) {
		
		eleccio = eleccio.toLowerCase();
		
		switch(eleccio) {
		
		case"moto":
			Moto moto = (Moto) crearVehiculo(eleccio);
			afegirRodes(moto);
			
			System.out.println(moto.toString());
			break;
		case"cotxe":
			Cotxe cotxe = (Cotxe) crearVehiculo(eleccio);
			afegirRodes(cotxe);
			
			System.out.println(cotxe.toString());
			break;
			
		
		}
		
		
	}

}

import javax.swing.JOptionPane;
import Objetos.*;

public class Milestone3_2App {

	public static void main(String[] args) {

		Llicencia llicencia = new Llicencia(1, "camio", "Izan Abad Sanchez", "03/12/2029");

		@SuppressWarnings("unused")
		Titular titular = new Titular("Izan", "Abad Sanchez", "3/12/2001", llicencia, true, false);

		String eleccio = "";

		eleccio = comprovarLlicencia(llicencia);

		seleccioVehicle(eleccio);

	}

	public static Object crearVehiculo(String eleccio) {

		// Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.

		String matricula = JOptionPane.showInputDialog("Introdueix la matricula del vehicle");
		String marca = JOptionPane.showInputDialog("Introdueix la marca del vehicle");
		String color = JOptionPane.showInputDialog("Introdueix el color del vehicle");

		// Crear el cotxe amb les dades anteriors.

		if (eleccio.equals("cotxe")) {

			Cotxe cotxe = new Cotxe(matricula, marca, color);
			return cotxe;
		} else if (eleccio.equals("moto")) {

			Moto moto = new Moto(matricula, marca, color);
			return moto;
		} else if (eleccio.equals("camio")) {

			Camio camio = new Camio(matricula, marca, color);
			return camio;
		}
		return null;

	}

	public static void afegirRodes(Object vehicle) {

		// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.

		String marcaRodesPosteriors = JOptionPane.showInputDialog("Introdueix la marca de les rodes posteriors");
		double diametreRodesPosteriors = Double
				.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes posteriors"));

		Rodes rodesPosteriors = new Rodes(marcaRodesPosteriors, diametreRodesPosteriors);

		// Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.

		String marcaRodesDavanteres = JOptionPane.showInputDialog("Introdueix la marca de les rodes davanteres");
		double diametreRodesDavanteres = Double
				.parseDouble(JOptionPane.showInputDialog("Introdueix el diametre de les rodes davanteres"));

		Rodes rodesDavanteres = new Rodes(marcaRodesDavanteres, diametreRodesDavanteres);

		if (vehicle instanceof Cotxe) {
			((Cotxe) vehicle).setRodesPosteriors(rodesPosteriors);
			((Cotxe) vehicle).setRodesDavanteres(rodesDavanteres);
		} else if (vehicle instanceof Moto) {
			((Moto) vehicle).setRodesPosteriors(rodesPosteriors);
			((Moto) vehicle).setRodesDavanteres(rodesDavanteres);
		} else if (vehicle instanceof Camio) {
			((Camio) vehicle).setRodesPosteriors(rodesPosteriors);
			((Camio) vehicle).setRodesDavanteres(rodesDavanteres);
		}

	}

	@SuppressWarnings("unused")
	public static void seleccioVehicle(String eleccio) {

		eleccio = eleccio.toLowerCase();
		String conductor;
		switch (eleccio) {

		case "moto":

			Moto moto = (Moto) crearVehiculo(eleccio);
			afegirRodes(moto);

			conductor = JOptionPane.showInputDialog("El titular conduirá el vehicle?");

			if (conductor.equalsIgnoreCase("no")) {

				Llicencia novaLlicencia = crearLlicencia(eleccio);

				Conductor nouConductor = crearConductor(novaLlicencia);
			}

			System.out.println(moto.toString());
			break;
		case "cotxe":

			Cotxe cotxe = (Cotxe) crearVehiculo(eleccio);

			afegirRodes(cotxe);
			conductor = JOptionPane.showInputDialog("El titular conduirá el vehicle?");

			if (conductor.equalsIgnoreCase("no")) {

				Llicencia novaLlicencia = crearLlicencia(eleccio);

				Conductor nouConductor = crearConductor(novaLlicencia);
			}
			System.out.println(cotxe.toString());
			break;
		case "camio":

			Camio camio = (Camio) crearVehiculo(eleccio);

			afegirRodes(camio);

			conductor = JOptionPane.showInputDialog("El titular conduirá el vehicle?");

			if (conductor.equalsIgnoreCase("no")) {

				Llicencia novaLlicencia = crearLlicencia(eleccio);

				Conductor nouConductor = crearConductor(novaLlicencia);
			}

			System.out.println(camio.toString());
			break;

		}

	}

	public static String comprovarLlicencia(Llicencia llicencia) {

		String eleccio;

		do {

			eleccio = JOptionPane.showInputDialog("Introdueix el tipus de vehicle que tens (Cotxe/Moto/Camió)");

		} while (!llicencia.getTipusLlicencia().equals(eleccio));

		return eleccio;
	}

	public static Llicencia crearLlicencia(String eleccio) {
		String tipusLlicencia;
		String id = JOptionPane.showInputDialog("Introdueix l'id de la llicencia");
		int parseId = Integer.parseInt(id);

		do {

			tipusLlicencia = JOptionPane.showInputDialog("Introdueix el tipus de llicencia (Cotxe/Moto/Camio)");

		} while (!tipusLlicencia.equalsIgnoreCase(eleccio));

		String nomComplet = JOptionPane.showInputDialog("Introdueix el nom complet");

		String dataCaducitat = JOptionPane.showInputDialog("introdueix data de caducitat");

		Llicencia llicencia = new Llicencia(parseId, tipusLlicencia, nomComplet, dataCaducitat);

		return llicencia;
	}

	public static Conductor crearConductor(Llicencia llicencia) {

		String nom = JOptionPane.showInputDialog("Introdueix el teu nom");

		String cognom = JOptionPane.showInputDialog("Introdueix el teu cognom");

		String dataNaixement = JOptionPane.showInputDialog("Introdueix la teva data de naixement");

		Conductor conductor = new Conductor(nom, cognom, dataNaixement, llicencia);

		return conductor;
	}

}

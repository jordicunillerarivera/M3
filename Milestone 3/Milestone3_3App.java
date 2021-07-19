import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import Objetos.*;

public class Milestone3_3App {

	public static void main(String[] args) {
		
		ArrayList<Llicencia> llicencies = new ArrayList<>();
		ArrayList<Persona> persones = new ArrayList<>();
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		String eleccio = "";
		
		menu1(llicencies, persones, eleccio, vehicles);

	}
	
	public static void menu1(ArrayList<Llicencia> llicencies, ArrayList<Persona> persones, String eleccio, ArrayList<Vehicle> vehicles) {
		
		int opcio = Integer.parseInt(JOptionPane.showInputDialog("Seleccioni una opció:\n1. Afegir una persona\n2. Afegir un vehicle\n3. Veure persones\n4 Veure cotxes\n5 Sortir"));
		
		switch (opcio) {
			case 1:
				crearPersona(llicencies, persones, eleccio, vehicles);
				break;
			case 2:
				seleccioVehicle(eleccio, persones, llicencies, vehicles);
				break;
			case 3:
				Iterator<Persona> it = persones.iterator();
				Persona num;
				int cont = 0;
				while (it.hasNext()) {
					num = it.next();
					System.out.println(cont + ". " + num);
					cont++;
				}
				menu1(llicencies, persones, eleccio, vehicles);
				break;
			case 4:
				Iterator<Vehicle> it2 = vehicles.iterator();
				Vehicle num2;
				int cont2 = 0;
				while (it2.hasNext()) {
					num2 = it2.next();
					System.out.println(cont2 + ". " + num2);
					cont2++;
				}
				menu1(llicencies, persones, eleccio, vehicles);
				break;
			case 5:
				break;
	
			default:
				JOptionPane.showInternalMessageDialog(null, "Selecciona una opcio valida");
				menu1(llicencies, persones, eleccio, vehicles);
		}
		
	}

	public static Object crearVehiculo(String eleccio, ArrayList<Persona> persones, ArrayList<Vehicle> vehicles) {

		// Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.

		String matricula = JOptionPane.showInputDialog("Introdueix la matricula del vehicle");
		String marca = JOptionPane.showInputDialog("Introdueix la marca del vehicle");
		String color = JOptionPane.showInputDialog("Introdueix el color del vehicle");
		
		Iterator<Persona> it = persones.iterator();
		Persona num;
		int cont = 0;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(cont + ". " + num);
			cont++;
		}
		
		int auxTitular;
		do {
			auxTitular = Integer.parseInt(JOptionPane.showInputDialog("Qui sera el titular(introdueixi el id)"));
			
			Persona personaAux = persones.get(auxTitular);
			while (!(eleccio.equals(personaAux.getLlicenciaConduir().getTipusLlicencia()))) {
				System.out.println("Introdueix un titular amb una llicencia valida");
				auxTitular = Integer.parseInt(JOptionPane.showInputDialog("Qui sera el titular(introdueixi el id)"));
				personaAux = persones.get(auxTitular);
			}
			
		} while (auxTitular >= persones.size());
		Persona titular = persones.get(auxTitular);

		ArrayList<Persona> conductors = new ArrayList<>();
		int opcio;
		do {
			opcio = JOptionPane.showConfirmDialog(null, "Hi ha un altre conductor?", null, 0);
			if (opcio == 0) {
				int aux = Integer.parseInt(JOptionPane.showInputDialog("Escull el conductor per el id"));
				if (aux < conductors.size()) {
					conductors.add(persones.get(aux));
					System.out.println("Conductor introduit");
				} else {
					System.out.println("Aquest id no existeix");
				}
			}
			 
		} while (opcio == 0);

		// Crear el cotxe amb les dades anteriors.

		if (eleccio.equals("cotxe")) {

			Cotxe cotxe = new Cotxe(matricula, marca, color, titular, conductors);
			vehicles.add(cotxe);
			return cotxe;
		} else if (eleccio.equals("moto")) {

			Moto moto = new Moto(matricula, marca, color, titular, conductors);
			vehicles.add(moto);
			return moto;
		} else if (eleccio.equals("camio")) {

			Camio camio = new Camio(matricula, marca, color,  titular, conductors);
			vehicles.add(camio);
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
	public static void seleccioVehicle(String eleccio, ArrayList<Persona> persones, ArrayList<Llicencia> llicencies, ArrayList<Vehicle> vehicles) {

		eleccio = JOptionPane.showInputDialog("Quin tipus de vehicle vols afegir");
		eleccio = eleccio.toLowerCase();
		String conductor;
		switch (eleccio) {

		case "moto":

			Moto moto = (Moto) crearVehiculo(eleccio, persones, vehicles);
			afegirRodes(moto);

			menu1(llicencies, persones, eleccio, vehicles);
			break;
		case "cotxe":

			Cotxe cotxe = (Cotxe) crearVehiculo(eleccio, persones, vehicles);

			afegirRodes(cotxe);
			menu1(llicencies, persones, eleccio, vehicles);
			break;
		case "camio":

			Camio camio = (Camio) crearVehiculo(eleccio, persones, vehicles);

			afegirRodes(camio);

			menu1(llicencies, persones, eleccio, vehicles);
			break;
			
			default:
				menu1(llicencies, persones, eleccio, vehicles);

		}

	}

	public static String comprovarLlicencia(Llicencia llicencia) {

		String eleccio;

		do {

			eleccio = JOptionPane.showInputDialog("Introdueix el tipus de vehicle que tens (Cotxe/Moto/Camió)");

		} while (!llicencia.getTipusLlicencia().equals(eleccio));

		return eleccio;
	}
	
	public static void crearPersona(ArrayList<Llicencia> llicencies, ArrayList<Persona> persones, String eleccio, ArrayList<Vehicle> vehicles) {
		
		String nom = JOptionPane.showInputDialog("Nom:");
		String cognoms = JOptionPane.showInputDialog("Cognoms:");
		String dataNaixement = JOptionPane.showInputDialog("Data de Naixement:");
		String tipusLlicencia = JOptionPane.showInputDialog("Tipus de llicencia");
		String dataCaducitat = JOptionPane.showInputDialog("Data de caducitat de la llicencia");
		
		String nomComplet = nom + " " + cognoms;
		
		llicencies.add(new Llicencia((llicencies.size() + 1), tipusLlicencia, nomComplet, dataCaducitat));
		
		int idL = (llicencies.size());
		persones.add(new Conductor(nom, cognoms, dataNaixement, llicencies.get(idL - 1)));
		
		menu1(llicencies, persones, eleccio, vehicles);
		
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

		String nom = JOptionPane.showInputDialog("Introdueix el nom");

		String cognom = JOptionPane.showInputDialog("Introdueix el cognom");

		String dataNaixement = JOptionPane.showInputDialog("Introdueix la data de naixement");

		Conductor conductor = new Conductor(nom, cognom, dataNaixement, llicencia);

		return conductor;
	}

}

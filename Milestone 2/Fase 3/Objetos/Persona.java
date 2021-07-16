package Objetos;

public class Persona {

	protected String nom;
	protected String cognoms;
	protected String dataNaixement;
	protected Llicencia llicenciaConduir;
	
	public Persona(String nom, String cognoms, String dataNaixement, Llicencia llicenciaConduir) {
		
		this.nom = nom;
		this.cognoms=cognoms;
		this.dataNaixement=dataNaixement;
		this.llicenciaConduir=llicenciaConduir;
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public Llicencia getLlicenciaConduir() {
		return llicenciaConduir;
	}

	public void setLlicenciaConduir(Llicencia llicenciaConduir) {
		this.llicenciaConduir = llicenciaConduir;
	}
	
	
	
	
}

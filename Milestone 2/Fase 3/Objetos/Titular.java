package Objetos;

public class Titular extends Persona{

	private boolean assegurat;
	private boolean garatge;
	
	public Titular(String nom, String cognoms, String dataNaixement, Llicencia llicenciaConduir, boolean assegurat, boolean garatge) {
		
		super(nom, cognoms, dataNaixement, llicenciaConduir);
		this.assegurat = assegurat;
		this.garatge = garatge;
		
	}

	public boolean isAssegurat() {
		return assegurat;
	}

	public void setAssegurat(boolean assegurat) {
		this.assegurat = assegurat;
	}

	public boolean isGaratge() {
		return garatge;
	}

	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}
	
	
	
}

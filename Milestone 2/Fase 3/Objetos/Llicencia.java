package Objetos;

public class Llicencia {

	private int ID;
	private String tipusLlicencia;
	private String nomComplet;
	private String dataCaducitat;
	
	
	public Llicencia(int id, String tipusLlicencia, String nomComplet, String dataCaducitat) {
		
		this.ID= id;
		this.tipusLlicencia = tipusLlicencia;
		this.nomComplet = nomComplet;
		this.dataCaducitat = dataCaducitat;
		
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getTipusLlicencia() {
		return tipusLlicencia;
	}


	public void setTipusLlicencia(String tipusLlicencia) {
		this.tipusLlicencia = tipusLlicencia;
	}


	public String getNomComplet() {
		return nomComplet;
	}


	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}


	public String getDataCaducitat() {
		return dataCaducitat;
	}


	public void setDataCaducitat(String dataCaducitat) {
		this.dataCaducitat = dataCaducitat;
	}
	
	
}

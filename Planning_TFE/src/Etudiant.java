
public class Etudiant {
	
	protected String nomEtudiant,prenomEtudiant,sujetEtudiant;
	protected int idEtudiant,idEntreprise,idEnseignant,idSoutenance;
	
	public Etudiant(int idEtudiant){
		this.idEtudiant=idEtudiant;
	
	}
	

	public String getNomEtudiant() {
		return nomEtudiant;
	}


	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}


	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}


	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}


	public String getSujetEtudiant() {
		return sujetEtudiant;
	}


	public void setSujetEtudiant(String sujetEtudiant) {
		this.sujetEtudiant = sujetEtudiant;
	}


	public int getIdEtudiant() {
		return idEtudiant;
	}


	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}


	public int getIdEntreprise() {
		return idEntreprise;
	}


	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}


	public int getIdEnseignant() {
		return idEnseignant;
	}


	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}


	public int getIdSoutenance() {
		return idSoutenance;
	}


	public void setIdSoutenance(int idSoutenance) {
		this.idSoutenance = idSoutenance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

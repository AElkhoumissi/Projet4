package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

@Entity
public class Projet implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;

    @NotEmpty(message="Ce champ doit être renseigné")
    private String nomProjet;

    @Length(max = 1000, message = "Description doit être inférieure à 1000 caractères")
    private String descriptionProjet;

    private String etatProjet;

    private Date dateCreationProjet;

    @ManyToMany
    @JoinTable(
            name = "Projets_Utilisateurs",
            joinColumns = @JoinColumn(name = "Id_Projet", referencedColumnName = "idProjet"),
            inverseJoinColumns = @JoinColumn(name = "Id_Utilisateurs", referencedColumnName = "idUtilisateur")
    )
    private List<Utilisateur> utilisateurs;

    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<Tache> taches;

	public Projet() {
		
	}

	public Projet(String nomProjet, String descriptionProjet, String etatProjet,
			Date dateCreationProjet) {
		super();
		
		this.nomProjet = nomProjet;
		this.descriptionProjet = descriptionProjet;
		this.etatProjet = etatProjet;
		this.dateCreationProjet = dateCreationProjet;
	}

	public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public String getNomProjet() {
		return nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public String getDescriptionProjet() {
		return descriptionProjet;
	}

	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}

	public String getEtatProjet() {
		return etatProjet;
	}

	public void setEtatProjet(String etatProjet) {
		this.etatProjet = etatProjet;
	}

	public Date getDateCreationProjet() {
		return dateCreationProjet;
	}

	public void setDateCreationProjet(Date dateCreationProjet) {
		this.dateCreationProjet = dateCreationProjet;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	
	
    
    
}

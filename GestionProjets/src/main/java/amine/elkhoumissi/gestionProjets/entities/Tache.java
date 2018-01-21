package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

@Entity
public class Tache implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;

    @NotEmpty(message = "Titre doit être renseigné")
    private String titreTache;

    @Length(max = 1000, message = "Description doit être inférieure à 1000 caractères")
    private String descriptionTache;

    private String etatTache;

    private Date dateDebutTache;

    private Date dateFinTache;

    @ManyToOne
    @JoinColumn(name = "Id_Projet")
    private Projet projet;

    @ManyToOne
    @JoinColumn(name = "Id_Utilisateur")
    private Utilisateur utilisateur;

	public Tache() {
		
	}

	public Tache(String titreTache, String descriptionTache, String etatTache, Date dateDebutTache, Date dateFinTache,
			Projet projet, Utilisateur utilisateur) {
		super();
		this.titreTache = titreTache;
		this.descriptionTache = descriptionTache;
		this.etatTache = etatTache;
		this.dateDebutTache = dateDebutTache;
		this.dateFinTache = dateFinTache;
		this.projet = projet;
		this.utilisateur = utilisateur;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public String getTitreTache() {
		return titreTache;
	}

	public void setTitreTache(String titreTache) {
		this.titreTache = titreTache;
	}

	public String getDescriptionTache() {
		return descriptionTache;
	}

	public void setDescriptionTache(String descriptionTache) {
		this.descriptionTache = descriptionTache;
	}

	public String getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(String etatTache) {
		this.etatTache = etatTache;
	}

	public Date getDateDebutTache() {
		return dateDebutTache;
	}

	public void setDateDebutTache(Date dateDebutTache) {
		this.dateDebutTache = dateDebutTache;
	}

	public Date getDateFinTache() {
		return dateFinTache;
	}

	public void setDateFinTache(Date dateFinTache) {
		this.dateFinTache = dateFinTache;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
    
    

}

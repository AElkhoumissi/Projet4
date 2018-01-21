package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

@Entity
public class Utilisateur implements Serializable{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idUtilisateur;

	 @NotEmpty(message = "Prénom Utilisateur doit être renseigné")
	 private String prenomUtilisateur;
	 
	 @NotEmpty(message = "Nom Utilisateur doit être renseigné")
	 private String nomUtilisateur;

	 @NotEmpty(message = "Email doit être renseigné")
	 private String emailUtilisateur;
	 
	 @Length(min = 5, message = "Mot De Passe doit contenir au moins 5 caractères")
	 @Transient//Demander de ne pas tenir compte du champ lors du mapping
	 private String motPasse;

	 @ManyToMany(fetch = FetchType.EAGER)
	 @JoinTable(
	 name = "Utilisateurs_Roles",
	 joinColumns = @JoinColumn(name = "Id_Utilisateur", referencedColumnName = "idUtilisateur"),
	 inverseJoinColumns = @JoinColumn(name = "Id_Role", referencedColumnName = "idRole")
	 )
	 private List<Role> roles;

	 @ManyToMany(mappedBy = "utilisateurs")
	 private List<Projet> projets;

	 @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.DETACH)
	 private List<Tache> taches;
	    
	 @OneToOne(mappedBy = "utilisateur")
	 private Demande demande;

	public Utilisateur() {
		
	}

	public Utilisateur(String prenomUtilisateur, String nomUtilisateur, String emailUtilisateur, String motPasse,
			Demande demande) {
		super();
		this.prenomUtilisateur = prenomUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.motPasse = motPasse;
		this.demande = demande;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}
	
	
	 
	 

}

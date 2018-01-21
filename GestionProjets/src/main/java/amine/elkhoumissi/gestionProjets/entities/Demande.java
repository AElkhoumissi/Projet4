package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


/*
 * Réalisé par: AMINE EL KHOUMISSI
 */
@Entity
public class Demande implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDemande;
	
    @OneToOne(cascade=CascadeType.DETACH)
    @JoinColumn(name = "Id_Utilisateur")
    private Utilisateur utilisateur;

	public Demande() {
		
	}

	public Demande(Utilisateur utilisateur) {
		super();
		this.utilisateur = utilisateur;
	}

	public Long getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Long idDemande) {
		this.idDemande = idDemande;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
    
    

}

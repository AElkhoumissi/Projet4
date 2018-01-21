package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

@Entity
public class Message implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;

    @NotEmpty(message = "Email doit être renseigné")
    @Email(message = "Email doit être valide")
    private String EmailEmetteur;

    @Length(max = 1000, message = "Message doit être inférieure à 1000 caractères")
    private String corpsMessage;
    private Date dateEmission;
	
    public Message() {
		
	}

	public Message(String emailEmetteur, String corpsMessage, Date dateEmission) {
		super();
		EmailEmetteur = emailEmetteur;
		this.corpsMessage = corpsMessage;
		this.dateEmission = dateEmission;
	}

	public Long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}

	public String getEmailEmetteur() {
		return EmailEmetteur;
	}

	public void setEmailEmetteur(String emailEmetteur) {
		EmailEmetteur = emailEmetteur;
	}

	public String getCorpsMessage() {
		return corpsMessage;
	}

	public void setCorpsMessage(String corpsMessage) {
		this.corpsMessage = corpsMessage;
	}

	public Date getDateEmission() {
		return dateEmission;
	}

	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
    
    
    
    
}

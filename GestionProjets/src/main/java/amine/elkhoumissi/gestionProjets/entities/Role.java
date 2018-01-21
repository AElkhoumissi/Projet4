package amine.elkhoumissi.gestionProjets.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

@Entity
public class Role implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    private String nomRole;

    @ManyToMany(mappedBy = "roles")
    private List<Utilisateur> utilisateurs;

	public Role() {
		
	}

	public Role(String nomRole) {
		
		this.nomRole = nomRole;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
    
    


}

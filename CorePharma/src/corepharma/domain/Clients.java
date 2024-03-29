package corepharma.domain;

// default package
// Generated 16 juil. 2011 14:29:33 by Hibernate Tools 3.3.0.GA

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clients generated by hbm2java
 */
@Entity
@Table(name = "clients", catalog = "corepharma")
public class Clients implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6795514779346446239L;
	private Integer idClient;
	private Integer idType;
	private Integer idGestion;
	private Integer idEtatClient;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String numeroIdentification;
	private String dateCreation;
	private String dateModification;
	private String idAuteurCreation;
	private String idAuteurModification;
	private Set<Commandes> commandesProduits;
	private Set<Adresses> addresses;
	private Set<Comptesbancaires> comptesbancaires;
	
	public Clients() {
	}

	public Clients(Integer idType, Integer idGestion, Integer idEtatClient,
			String nom, String prenom, String tel, String email,
			String numeroIdentification, String dateCreation,
			String dateModification, String idAuteurCreation,
			String idAuteurModification) {
		this.idType = idType;
		this.idGestion = idGestion;
		this.idEtatClient = idEtatClient;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.numeroIdentification = numeroIdentification;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.idAuteurCreation = idAuteurCreation;
		this.idAuteurModification = idAuteurModification;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idClient", unique = true, nullable = false)
	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	@Column(name = "idType")
	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	@Column(name = "idGestion")
	public Integer getIdGestion() {
		return this.idGestion;
	}

	public void setIdGestion(Integer idGestion) {
		this.idGestion = idGestion;
	}

	@Column(name = "idEtatClient")
	public Integer getIdEtatClient() {
		return this.idEtatClient;
	}

	public void setIdEtatClient(Integer idEtatClient) {
		this.idEtatClient = idEtatClient;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 254)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "tel", length = 254)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "numeroIdentification", length = 254)
	public String getNumeroIdentification() {
		return this.numeroIdentification;
	}

	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}

	@Column(name = "dateCreation", length = 254)
	public String getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Column(name = "dateModification", length = 254)
	public String getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}

	@Column(name = "idAuteurCreation", length = 254)
	public String getIdAuteurCreation() {
		return this.idAuteurCreation;
	}

	public void setIdAuteurCreation(String idAuteurCreation) {
		this.idAuteurCreation = idAuteurCreation;
	}

	@Column(name = "idAuteurModification", length = 254)
	public String getIdAuteurModification() {
		return this.idAuteurModification;
	}

	public void setIdAuteurModification(String idAuteurModification) {
		this.idAuteurModification = idAuteurModification;
	}

	public Set<Commandes> getCommandesProduits() {
		return commandesProduits;
	}

	public void setCommandesProduits(Set<Commandes> commandesProduits) {
		this.commandesProduits = commandesProduits;
	}

	public Set<Adresses> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Adresses> addresses) {
		this.addresses = addresses;
	}

	public Set<Comptesbancaires> getComptesbancaires() {
		return comptesbancaires;
	}

	public void setComptesbancaires(Set<Comptesbancaires> comptesbancaires) {
		this.comptesbancaires = comptesbancaires;
	}

	
}

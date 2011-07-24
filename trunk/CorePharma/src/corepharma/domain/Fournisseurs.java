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
 * Fournisseurs generated by hbm2java
 */
@Entity
@Table(name = "fournisseurs", catalog = "corepharma")
public class Fournisseurs implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6073851637138203670L;
	private Integer idFournisseur;
	private Integer idGestion;
	private Integer idEtatClient;
	private Integer idAlarme;
	private String nomFournisseur;
	private String codeFournisseur;
	private String tel;
	private String dateCreation;
	private String dateModification;
	private String idAuteurCreation;
	private String idAuteurModification;
	private Set<Commandes> commandesProduits;
	private Set<Adresses> addresses;
	private Set<Comptesbancaires> comptesbancaires;

	public Fournisseurs() {
	}

	public Fournisseurs(Integer idGestion, Integer idEtatClient,
			Integer idAlarme, String nomFournisseur, String codeFournisseur,
			String tel, String dateCreation, String dateModification,
			String idAuteurCreation, String idAuteurModification) {
		this.idGestion = idGestion;
		this.idEtatClient = idEtatClient;
		this.idAlarme = idAlarme;
		this.nomFournisseur = nomFournisseur;
		this.codeFournisseur = codeFournisseur;
		this.tel = tel;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.idAuteurCreation = idAuteurCreation;
		this.idAuteurModification = idAuteurModification;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFournisseur", unique = true, nullable = false)
	public Integer getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
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

	@Column(name = "idAlarme")
	public Integer getIdAlarme() {
		return this.idAlarme;
	}

	public void setIdAlarme(Integer idAlarme) {
		this.idAlarme = idAlarme;
	}

	@Column(name = "nomFournisseur", length = 254)
	public String getNomFournisseur() {
		return this.nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	@Column(name = "codeFournisseur", length = 254)
	public String getCodeFournisseur() {
		return this.codeFournisseur;
	}

	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}

	@Column(name = "tel", length = 254)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

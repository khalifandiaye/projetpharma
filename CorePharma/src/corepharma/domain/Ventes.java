package corepharma.domain;

// default package
// Generated 12 juil. 2011 22:37:21 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ventes generated by hbm2java
 */
@Entity
@Table(name = "ventes", catalog = "corepharma")
public class Ventes implements java.io.Serializable {

	private Integer idVente;
	private Integer idMode;
	private String dateCreation;
	private String dateModification;
	private Integer idAuteurCreation;
	private Integer idAuteurModification;
	private String codeVente;
	private Integer montantRecu;
	private Integer montantVente;

	public Ventes() {
	}

	public Ventes(Integer idMode, String dateCreation, String dateModification,
			Integer idAuteurCreation, Integer idAuteurModification,
			String codeVente, Integer montantRecu, Integer montantVente) {
		this.idMode = idMode;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.idAuteurCreation = idAuteurCreation;
		this.idAuteurModification = idAuteurModification;
		this.codeVente = codeVente;
		this.montantRecu = montantRecu;
		this.montantVente = montantVente;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idVente", unique = true, nullable = false)
	public Integer getIdVente() {
		return this.idVente;
	}

	public void setIdVente(Integer idVente) {
		this.idVente = idVente;
	}

	@Column(name = "idMode")
	public Integer getIdMode() {
		return this.idMode;
	}

	public void setIdMode(Integer idMode) {
		this.idMode = idMode;
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

	@Column(name = "idAuteurCreation")
	public Integer getIdAuteurCreation() {
		return this.idAuteurCreation;
	}

	public void setIdAuteurCreation(Integer idAuteurCreation) {
		this.idAuteurCreation = idAuteurCreation;
	}

	@Column(name = "idAuteurModification")
	public Integer getIdAuteurModification() {
		return this.idAuteurModification;
	}

	public void setIdAuteurModification(Integer idAuteurModification) {
		this.idAuteurModification = idAuteurModification;
	}

	@Column(name = "codeVente", length = 254)
	public String getCodeVente() {
		return this.codeVente;
	}

	public void setCodeVente(String codeVente) {
		this.codeVente = codeVente;
	}

	@Column(name = "montantRecu", precision = 8, scale = 0)
	public Integer getMontantRecu() {
		return this.montantRecu;
	}

	public void setMontantRecu(Integer montantRecu) {
		this.montantRecu = montantRecu;
	}

	@Column(name = "montantVente", precision = 8, scale = 0)
	public Integer getMontantVente() {
		return this.montantVente;
	}

	public void setMontantVente(Integer montantVente) {
		this.montantVente = montantVente;
	}

}

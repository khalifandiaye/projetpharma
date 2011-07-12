package corepharma.domain;

// default package
// Generated 12 juil. 2011 22:37:21 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AssosfournisseurscomptesbancairesId generated by hbm2java
 */
@Embeddable
public class AssosfournisseurscomptesbancairesId implements
		java.io.Serializable {

	private Integer idFournisseur;
	private Integer idCompte;

	public AssosfournisseurscomptesbancairesId() {
	}

	public AssosfournisseurscomptesbancairesId(Integer idFournisseur,
			Integer idCompte) {
		this.idFournisseur = idFournisseur;
		this.idCompte = idCompte;
	}

	@Column(name = "idFournisseur")
	public Integer getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	@Column(name = "idCompte")
	public Integer getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AssosfournisseurscomptesbancairesId))
			return false;
		AssosfournisseurscomptesbancairesId castOther = (AssosfournisseurscomptesbancairesId) other;

		return ((this.getIdFournisseur() == castOther.getIdFournisseur()) || (this
				.getIdFournisseur() != null
				&& castOther.getIdFournisseur() != null && this
				.getIdFournisseur().equals(castOther.getIdFournisseur())))
				&& ((this.getIdCompte() == castOther.getIdCompte()) || (this
						.getIdCompte() != null
						&& castOther.getIdCompte() != null && this
						.getIdCompte().equals(castOther.getIdCompte())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdFournisseur() == null ? 0 : this.getIdFournisseur()
						.hashCode());
		result = 37 * result
				+ (getIdCompte() == null ? 0 : this.getIdCompte().hashCode());
		return result;
	}

}
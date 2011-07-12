package corepharma.domain;

// default package
// Generated 12 juil. 2011 22:37:21 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AssocommandesproduitsId generated by hbm2java
 */
@Embeddable
public class AssocommandesproduitsId implements java.io.Serializable {

	private Integer idCommande;
	private Integer idProduit;

	public AssocommandesproduitsId() {
	}

	public AssocommandesproduitsId(Integer idCommande, Integer idProduit) {
		this.idCommande = idCommande;
		this.idProduit = idProduit;
	}

	@Column(name = "idCommande")
	public Integer getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	@Column(name = "idProduit")
	public Integer getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AssocommandesproduitsId))
			return false;
		AssocommandesproduitsId castOther = (AssocommandesproduitsId) other;

		return ((this.getIdCommande() == castOther.getIdCommande()) || (this
				.getIdCommande() != null
				&& castOther.getIdCommande() != null && this.getIdCommande()
				.equals(castOther.getIdCommande())))
				&& ((this.getIdProduit() == castOther.getIdProduit()) || (this
						.getIdProduit() != null
						&& castOther.getIdProduit() != null && this
						.getIdProduit().equals(castOther.getIdProduit())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdCommande() == null ? 0 : this.getIdCommande()
						.hashCode());
		result = 37 * result
				+ (getIdProduit() == null ? 0 : this.getIdProduit().hashCode());
		return result;
	}

}
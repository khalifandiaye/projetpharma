package corepharma.domain;

// default package
// Generated 12 juil. 2011 22:37:21 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AssoclientscomptesbancairesId generated by hbm2java
 */
@Embeddable
public class AssoclientscomptesbancairesId implements java.io.Serializable {

	private Integer idClient;
	private Integer idCompte;

	public AssoclientscomptesbancairesId() {
	}

	public AssoclientscomptesbancairesId(Integer idClient, Integer idCompte) {
		this.idClient = idClient;
		this.idCompte = idCompte;
	}

	@Column(name = "idClient")
	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
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
		if (!(other instanceof AssoclientscomptesbancairesId))
			return false;
		AssoclientscomptesbancairesId castOther = (AssoclientscomptesbancairesId) other;

		return ((this.getIdClient() == castOther.getIdClient()) || (this
				.getIdClient() != null
				&& castOther.getIdClient() != null && this.getIdClient()
				.equals(castOther.getIdClient())))
				&& ((this.getIdCompte() == castOther.getIdCompte()) || (this
						.getIdCompte() != null
						&& castOther.getIdCompte() != null && this
						.getIdCompte().equals(castOther.getIdCompte())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdClient() == null ? 0 : this.getIdClient().hashCode());
		result = 37 * result
				+ (getIdCompte() == null ? 0 : this.getIdCompte().hashCode());
		return result;
	}

}

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
 * Typeetatcommande generated by hbm2java
 */
@Entity
@Table(name = "typeetatcommande", catalog = "corepharma")
public class Typeetatcommande implements java.io.Serializable {

	private Integer idEtat;
	private String nomEtat;

	public Typeetatcommande() {
	}

	public Typeetatcommande(String nomEtat) {
		this.nomEtat = nomEtat;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idEtat", unique = true, nullable = false)
	public Integer getIdEtat() {
		return this.idEtat;
	}

	public void setIdEtat(Integer idEtat) {
		this.idEtat = idEtat;
	}

	@Column(name = "nomEtat", length = 254)
	public String getNomEtat() {
		return this.nomEtat;
	}

	public void setNomEtat(String nomEtat) {
		this.nomEtat = nomEtat;
	}

}

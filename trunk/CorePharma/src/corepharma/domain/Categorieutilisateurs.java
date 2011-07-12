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
 * Categorieutilisateurs generated by hbm2java
 */
@Entity
@Table(name = "categorieutilisateurs", catalog = "corepharma")
public class Categorieutilisateurs implements java.io.Serializable {

	private Integer idCategorie;
	private String nomCategorie;

	public Categorieutilisateurs() {
	}

	public Categorieutilisateurs(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCategorie", unique = true, nullable = false)
	public Integer getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Column(name = "nomCategorie", length = 254)
	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

}

// default package
// Generated 27 avr. 2011 12:11:52 by Hibernate Tools 3.4.0.CR1
package corepharma.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateurs generated by hbm2java
 */
@Entity
@Table(name = "utilisateurs", catalog = "corepharma")
public class Utilisateurs implements java.io.Serializable {

	private Integer idUtilisateur;
	private Integer idCategorie;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String motdepasse;

	public Utilisateurs() {
	}

	public Utilisateurs(Integer idCategorie, String nom, String prenom,
			String tel, String email, String motdepasse) {
		this.idCategorie = idCategorie;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.motdepasse = motdepasse;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idUtilisateur", unique = true, nullable = false)
	public Integer getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Column(name = "idCategorie")
	public Integer getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
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

	@Column(name = "motdepasse", length = 254)
	public String getMotdepasse() {
		return this.motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

}

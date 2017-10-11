package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="depanneurs")
public class Depanneurs implements Cloneable{

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "NOM", length = 30, nullable = false, unique = true)
	private String nom;

	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id", nullable = true)
	private Interventions interventions;
	
	// constructeurs
	public Depanneurs() {
	}

	public Depanneurs(String nom, String prenom) {
		setNom(nom);
		setPrenom(prenom);
	}

	// getters and setters
	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    @Override
    public Object clone() throws CloneNotSupportedException {
        Depanneurs d = new Depanneurs(nom, prenom);
        return d;
    }
        
        
}

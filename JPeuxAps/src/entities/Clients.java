package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="jpa01_client")
public class Clients implements Cloneable{

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "NOM", length = 30, nullable = false, unique = true)
	private String nom;

	@Column(name = "ADRESSE", nullable = false)
	private String adresse;
	// constructeurs
	public Clients() {
	}

	public Clients(String nom, String adresse) {
		setNom(nom);
		setAdresse(adresse);
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
    @Override
    public Object clone() throws CloneNotSupportedException {
        Clients c = new Clients(nom, adresse);
        return c;
    }
        
        
}

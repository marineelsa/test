package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="jpa01_interventions")
public class Interventions implements Cloneable{

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;


	@Column(name = "URGENCE", nullable = false)
	private Integer urgence;

	@Column(name = "DEMANDE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date demande;
	
	@Column(name = "ETAT", length = 30, nullable = false)
	private String etat;
	
	
	@Column(name = "DATE_ETAT", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date_etat;
	
	@OneToMany(mappedBy = "depanneurs", cascade = { CascadeType.ALL })
	private Set<Depanneurs> depanneurs = new HashSet<Depanneurs>();
	
	@OneToMany(mappedBy = "clients", cascade = { CascadeType.ALL })
	private Set<Clients> clients = new HashSet<Clients>();
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUrgence() {
		return urgence;
	}

	public void setUrgence(Integer urgence) {
		this.urgence = urgence;
	}

	public Date getDemande() {
		return demande;
	}

	public void setDemande(Date demande) {
		this.demande = demande;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDate_etat() {
		return date_etat;
	}

	public void setDate_etat(Date date_etat) {
		this.date_etat = date_etat;
	}

	public Set<Depanneurs> getDepanneurs() {
		return depanneurs;
	}

	public void setDepanneurs(Set<Depanneurs> depanneurs) {
		this.depanneurs = depanneurs;
	}

	public Set<Clients> getClients() {
		return clients;
	}

	public void setClients(Set<Clients> clients) {
		this.clients = clients;
	}

	
	// constructeurs
		public Interventions() {
		}
		

		
		public Interventions(Integer urgence, Date demande, String etat,
				Date date_etat, Set<Depanneurs> depanneurs, Set<Clients> clients) {
			super();
			this.urgence = urgence;
			this.demande = demande;
			this.etat = etat;
			this.date_etat = date_etat;
			this.depanneurs = depanneurs;
			this.clients = clients;
		}


	        
}

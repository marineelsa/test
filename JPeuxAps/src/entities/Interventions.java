package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	        
}

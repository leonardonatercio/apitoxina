package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
import sun.text.resources.cldr.FormatData;

@Entity
public class Apiario extends Model{
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	public Double total;
	public Date data;
	
	@ManyToOne
	public Operador operador;
	
	@OneToMany(mappedBy="apiario")
	public List<Colmeia> colmeia;
}
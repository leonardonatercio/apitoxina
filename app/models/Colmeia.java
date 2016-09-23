package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Colmeia extends Model {

	public String nome;
	public Double valor;
	public String tipo;

	@ManyToOne
	@JoinColumn(name = "apiario_fk")
	public Apiario apiario;
	
	public Blob foto;

	@Enumerated(EnumType.STRING)
	public Status status;
}
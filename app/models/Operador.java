package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Operador extends Model{

	public String nome;
	public String email;
	public String rua;
	public String cidade;
	public String estado;
	public String cpf;
	public String telefone1;
	public String telefone2;
	public String data_nascimento;
	public String username;
	public String pass;
	
	public Blob foto;
	
	@Enumerated(EnumType.STRING)
	public Status status;
}

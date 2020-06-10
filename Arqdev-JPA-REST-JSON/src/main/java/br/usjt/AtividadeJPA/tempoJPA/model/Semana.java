	package br.usjt.AtividadeJPA.tempoJPA.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_semana")
@Getter
@Setter

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Semana implements Serializable {

	private static final long serialVersionUID = 7L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 100)
	private String semana;
	
	@Override
	public String toString() {
		return "Semana [id=" + id + ", semana=" + semana + "]";
	}

	@OneToMany(mappedBy = "semana", cascade = CascadeType.ALL)
	private List<Clima> clima;

	
	
	
}
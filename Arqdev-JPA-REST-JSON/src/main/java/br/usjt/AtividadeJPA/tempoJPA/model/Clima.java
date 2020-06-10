package br.usjt.AtividadeJPA.tempoJPA.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_clima")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor // faz praticamente tudo get set e bla bla bla
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Clima {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 200)
	private int minima;

	@Column(nullable = false, length = 30)
	private int maxima;

	@Column(nullable = true, length = 100)
	private double umidade;

	@Column(nullable = true, length = 100)
	private String descricao;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, length = 100)
	private Date data;

	@ManyToOne(cascade = CascadeType.ALL)
	private Semana semana;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cidade cidade;

	@Override
	public String toString() {
		return "Clima [id=" + id + ", minima=" + minima + ", maxima=" + maxima + ", umidade=" + umidade + ", descricao="
				+ descricao + ", data=" + data + "]";
	}

	
	
}
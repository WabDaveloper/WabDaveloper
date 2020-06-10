package br.usjt.AtividadeJPA.tempoJPA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_cidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = true, length = 10)
	private Long id;
	@Column(nullable = true, length = 100)
	private String nome;
	@Column(nullable = true, length = 100)
	private double latitude;
	@Column(nullable = true, length = 100)
	private double longitude;

	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<Clima> clima;
	
	@Override
	public String toString() {
		return "[id: " + id +"Nome: " + nome +"Latitude: " + latitude +"Longitude: " +longitude;
	}
}
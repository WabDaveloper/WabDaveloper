package br.usjt.AtividadeJPA.tempoJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.AtividadeJPA.tempoJPA.model.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{
	
	Cidade findByLatitudeAndLongitude(double latitude, double longitude);
	
	
    List<Cidade> findByNomeStartingWith(String nome);
	
	
}

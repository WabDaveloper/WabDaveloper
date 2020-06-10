package br.usjt.AtividadeJPA.tempoJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.AtividadeJPA.tempoJPA.model.Clima;
import br.usjt.AtividadeJPA.tempoJPA.repository.ClimaTempoRepository;


@Service
public class ClimaTempoService {


	@Autowired
	private ClimaTempoRepository climaTempoRepo;

	public List<Clima> listarTodos() {
		List <Clima> periodos = climaTempoRepo.findAll();
		return periodos;
	}
}

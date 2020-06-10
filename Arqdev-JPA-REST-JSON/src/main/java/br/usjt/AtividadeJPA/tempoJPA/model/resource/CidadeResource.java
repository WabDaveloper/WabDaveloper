package br.usjt.AtividadeJPA.tempoJPA.model.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.usjt.AtividadeJPA.tempoJPA.model.Cidade;
import br.usjt.AtividadeJPA.tempoJPA.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepo;

	@GetMapping("/lista")
	@JsonIgnoreProperties
	public List<Cidade> todasAsCidades() {
		return cidadeRepo.findAll();
	}

	@PostMapping("/salvar")
	// @ResponseStatus (HttpStatus.CREATED)
	public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade, HttpServletResponse response) {
		Cidade c = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(c.getId())
				.toUri();

		// response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(c);
	}

	@GetMapping("/{latitude}" + "/{longitude}")
	public Cidade buscarPelaLatitudeLongitude(@PathVariable(value="latitude") String latitude, @PathVariable(value="longitude")String longitude) {
		return cidadeRepo.findByLatitudeAndLongitude(Double.parseDouble(latitude), Double.parseDouble(longitude));
	}
	
	@GetMapping("/{nome}")
	public List findByLetterName(@PathVariable(value="nome") String nome){
		return cidadeRepo.findByNomeStartingWith(nome);
	}
}

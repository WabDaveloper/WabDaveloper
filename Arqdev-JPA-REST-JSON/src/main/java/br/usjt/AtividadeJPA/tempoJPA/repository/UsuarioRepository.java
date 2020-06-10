package br.usjt.AtividadeJPA.tempoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.AtividadeJPA.tempoJPA.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}

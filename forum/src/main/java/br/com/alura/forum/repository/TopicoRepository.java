package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//este método filtra pela entidade Curso, e pelo atributo da entidade Nome. O _ configura o relacionamento entre Classe e Atributo.
	List<Topico> findByCurso_Nome(String nomeCurso);
	
	

}

package br.com.ProjetoLoja.endereco.repository;

import br.com.ProjetoLoja.endereco.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

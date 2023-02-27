package br.com.ProjetoLoja.item.repository;

import br.com.ProjetoLoja.item.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

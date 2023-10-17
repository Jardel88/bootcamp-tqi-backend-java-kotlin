package dio.desafio.design.patterns.vendas.domain.repository;

import dio.desafio.design.patterns.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}

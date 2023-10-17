package dio.desafio.design.patterns.vendas.domain.repository;


import dio.desafio.design.patterns.vendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}

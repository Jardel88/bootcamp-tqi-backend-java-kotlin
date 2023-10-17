package dio.desafio.design.patterns.vendas.service;

import dio.desafio.design.patterns.vendas.domain.entity.Pedido;
import dio.desafio.design.patterns.vendas.domain.enums.StatusPedido;
import dio.desafio.design.patterns.vendas.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

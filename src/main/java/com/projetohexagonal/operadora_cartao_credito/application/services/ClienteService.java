package com.projetohexagonal.operadora_cartao_credito.application.services;

import com.projetohexagonal.operadora_cartao_credito.application.domain.CartaoDomain;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import com.projetohexagonal.operadora_cartao_credito.ports.out.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final GeraDadosCartaoService geraCartao;

    public ClienteDomain solicitarCartao(ClienteDomain cliente) {
        if (clienteRepository.buscarUusuarioporEmail(cliente.getEmail())) {
            throw new IllegalArgumentException("Usuário já possui um cartão.");
        }

        CartaoDomain cartao = geraCartao.gerarParaCliente(cliente);
        cliente.setCartao(cartao);
        return clienteRepository.salvar(cliente);

    }

    public ClienteDomain buscarPorCpf(String cpf) {
        return clienteRepository.buscarUsuarioPorCpf(cpf).
                orElseThrow(()-> new IllegalArgumentException("Cliente não encontrado"));
    }
}

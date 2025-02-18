package com.projetohexagonal.operadora_cartao_credito.adapters.out;

import com.projetohexagonal.operadora_cartao_credito.adapters.mapper.ClienteMapper;
import com.projetohexagonal.operadora_cartao_credito.adapters.out.repository.ClienteJpaRepository;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import com.projetohexagonal.operadora_cartao_credito.ports.out.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor

public class ClienteRepositoryImpl implements ClienteRepository {

    private final ClienteJpaRepository clienteJpaRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public ClienteDomain salvar(ClienteDomain clienteDomain) {
        return clienteMapper.paraDomain(
                clienteJpaRepository.save(
                        clienteMapper.paraEntity(clienteDomain)));
    }

    @Override
    public Boolean buscarUusuarioporEmail(String email) {
        return clienteJpaRepository.existsByEmail(email);
    }

    @Override
    public Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf) {
        return clienteJpaRepository.findByCpf(cpf)
                .map(clienteMapper::paraDomain);
    }
}

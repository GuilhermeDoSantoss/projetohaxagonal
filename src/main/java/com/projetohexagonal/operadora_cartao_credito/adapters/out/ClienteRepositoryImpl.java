package com.projetohexagonal.operadora_cartao_credito.adapters.out;

import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import com.projetohexagonal.operadora_cartao_credito.ports.out.ClienteRepository;

import java.util.Optional;

public class ClienteRepositoryImpl implements ClienteRepository {



    @Override
    public ClienteDomain salvar(ClienteDomain clienteDomain) {
        return null;
    }

    @Override
    public Boolean buscarUusuarioporEmail(String Email) {
        return null;
    }

    @Override
    public Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf) {
        return Optional.empty();
    }
}

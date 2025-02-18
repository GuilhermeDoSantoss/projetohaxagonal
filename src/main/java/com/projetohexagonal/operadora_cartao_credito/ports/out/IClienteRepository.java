package com.projetohexagonal.operadora_cartao_credito.ports.out;

import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;

import java.util.Optional;

public interface IClienteRepository {

    ClienteDomain salvar(ClienteDomain clienteDomain);

    Boolean buscarUusuarioporEmail(String Email);

    Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf);
}

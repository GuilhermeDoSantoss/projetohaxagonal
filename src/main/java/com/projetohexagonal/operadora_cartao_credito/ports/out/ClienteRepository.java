package com.projetohexagonal.operadora_cartao_credito.ports.out;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;

import java.util.Optional;

public interface ClienteRepository {

    ClienteDomain salvar(ClienteDomain clienteDomain);

    Boolean buscarUusuarioporEmail(String Email);

    Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf);
}

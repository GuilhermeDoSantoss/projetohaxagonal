package com.projetohexagonal.operadora_cartao_credito.adapters.out.repository;


import com.projetohexagonal.operadora_cartao_credito.adapters.out.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {

    boolean existsByEmail(String email);

    Optional<ClienteEntity> findByCpf(String cpf);

}
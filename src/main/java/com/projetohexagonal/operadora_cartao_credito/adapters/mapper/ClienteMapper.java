package com.projetohexagonal.operadora_cartao_credito.adapters.mapper;

import com.projetohexagonal.operadora_cartao_credito.adapters.out.entities.ClienteEntity;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity paraEntity(ClienteDomain clienteDomain);

    ClienteDomain paraDomain(ClienteEntity clienteEntity);
}

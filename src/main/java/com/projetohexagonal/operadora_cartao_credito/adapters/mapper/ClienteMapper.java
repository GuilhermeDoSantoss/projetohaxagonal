package com.projetohexagonal.operadora_cartao_credito.adapters.mapper;

import com.projetohexagonal.operadora_cartao_credito.adapters.out.entities.CartaoEntity;
import com.projetohexagonal.operadora_cartao_credito.adapters.out.entities.ClienteEntity;
import com.projetohexagonal.operadora_cartao_credito.application.domain.CartaoDomain;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity paraEntity(ClienteDomain clienteDomain);

    ClienteDomain paraDomain(ClienteEntity clienteEntity);

    @Mapping(target = "cartao", expression = "java(toCartaoDomain(cliente))")
    ClienteDomain toDomain(ClienteRequestDTO cliente);

    ClienteResponseDTO toResponse(ClienteDomain cliente);

    @Mapping(source = "dataVencimentoFatura", target = "dataVencimentoFatura")
    CartaoDomain toCartaoDomain(ClienteRequestDTO clienteRequestDTO);

}

package com.projetohexagonal.operadora_cartao_credito.adapters.in.controller;



import com.projetohexagonal.operadora_cartao_credito.adapters.in.IClienteService;
import com.projetohexagonal.operadora_cartao_credito.adapters.in.dto.request.ClienteRequestDTO;
import com.projetohexagonal.operadora_cartao_credito.adapters.in.dto.response.ClienteResponseDTO;
import com.projetohexagonal.operadora_cartao_credito.adapters.mapper.ClienteMapper;
import com.projetohexagonal.operadora_cartao_credito.adapters.out.entities.ClienteEntity;
import com.projetohexagonal.operadora_cartao_credito.application.domain.ClienteDomain;
import com.projetohexagonal.operadora_cartao_credito.application.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final IClienteService clienteService;
    private final ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> solicitaCartao(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        mapper.toResponse(clienteService.solicitarCartao(mapper.toDomain(clienteRequestDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClienteResponseDTO> buscaClientePorCpf(@RequestParam String cpf) {
        ClienteDomain cliente = clienteService.buscarPorCpf(cpf);
        return ResponseEntity.ok(mapper.toResponse(cliente));
    }
}

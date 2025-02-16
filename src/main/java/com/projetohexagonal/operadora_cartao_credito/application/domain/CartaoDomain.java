package com.projetohexagonal.operadora_cartao_credito.application.domain;

import java.time.LocalDate;

public class CartaoDomain {

    private Long id;
    private String numero;
    private LocalDate dataExpiracao;
    private String cvv;
    private double limite;
    private double availadleLimit;
    private LocalDate ltimaAteracaoLimite;
    private Integer dataVencimentoFatura;
    private ClienteDomain cliente;


    public CartaoDomain(Long id, String numero, LocalDate dataExpiracao, String cvv, double limite,
                        double availadleLimit, LocalDate ltimaAteracaoLimite, Integer dataVencimentoFatura, ClienteDomain cliente) {
        this.id = id;
        this.numero = numero;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
        this.limite = limite;
        this.availadleLimit = availadleLimit;
        this.ltimaAteracaoLimite = ltimaAteracaoLimite;
        this.dataVencimentoFatura = dataVencimentoFatura;
        this.cliente = cliente;
    }

    public CartaoDomain() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getAvailadleLimit() {
        return availadleLimit;
    }

    public void setAvailadleLimit(double availadleLimit) {
        this.availadleLimit = availadleLimit;
    }

    public LocalDate getLtimaAteracaoLimite() {
        return ltimaAteracaoLimite;
    }

    public void setLtimaAteracaoLimite(LocalDate ltimaAteracaoLimite) {
        this.ltimaAteracaoLimite = ltimaAteracaoLimite;
    }

    public ClienteDomain getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDomain cliente) {
        this.cliente = cliente;
    }

    public Integer getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    public void setDataVencimentoFatura(Integer dataVencimentoFatura) {
        this.dataVencimentoFatura = dataVencimentoFatura;
    }
}

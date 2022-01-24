package com.raiadrogasil.backommerce.poc.strategy.domain.rota;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.NonNull;


public class Rota {

    private final Set<InstrucaoDaRota> instrucoesDaRota;

    private Rota() {
        this.instrucoesDaRota = new LinkedHashSet<>();
    }

    public static Rota novaRota(Local a, Local b) {
        return new Rota();
    }

    public static Rota tokenRotaNaoDisponivel() {
        Rota rota = new Rota();
        return rota.adicionarNovaInstrucao(InstrucaoDaRota.builder().instrucao("Não disponível").build());
    }

    public Rota adicionarNovaInstrucao(@NonNull InstrucaoDaRota instrucaoDaRota) {
        this.instrucoesDaRota.add(instrucaoDaRota);
        return this;
    }

    public Set<String> listarInstrucoesDaRota() {

        return this.instrucoesDaRota.stream()
                                    .map(InstrucaoDaRota::getInstrucao)
                                    .collect(Collectors.toSet());

    }

}

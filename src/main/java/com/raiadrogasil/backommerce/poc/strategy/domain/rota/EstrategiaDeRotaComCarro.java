package com.raiadrogasil.backommerce.poc.strategy.domain.rota;

import java.util.Objects;

public class EstrategiaDeRotaComCarro implements EstrategiaDeRota {

    @Override
    public Rota calcularRota(Local a, Local b) {

        boolean rotaÉPossivel = verificarSeRotaComCarroÉPossivel(a, b);

        if (rotaÉPossivel) {
            return this.criarRotaParaCarro(a,b);
        }

        return Rota.tokenRotaNaoDisponivel();
    }

    private Rota criarRotaParaCarro(Local a, Local b) {

        return Rota.novaRota(a, b)
                   .adicionarNovaInstrucao(InstrucaoDaRota.builder()
                                                          .instrucao("Seguir reto")
                                                          .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Acelera meu fio!")
                                      .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Freia que tem radar!")
                                      .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Chegou!")
                                      .build());
    }

    private boolean verificarSeRotaComCarroÉPossivel(Local a, Local b) {

        if (Objects.isNull(a.getEndereco()) || Objects.isNull(b.getEndereco())) {
            return false;
        }
        return true;
    }


}

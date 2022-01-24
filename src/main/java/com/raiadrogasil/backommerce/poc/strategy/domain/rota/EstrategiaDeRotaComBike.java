package com.raiadrogasil.backommerce.poc.strategy.domain.rota;

import java.util.Objects;
import java.util.Random;

public class EstrategiaDeRotaComBike implements  EstrategiaDeRota {
    @Override
    public Rota calcularRota(Local a, Local b) {

        boolean rotaÉPossivel = this.verificarSeRotaComBikeÉPossivel(a, b);

        if (rotaÉPossivel) {
            return this.criarRota(a,b);
        }

        return null;
    }

    private Rota criarRota(Local a, Local b) {

        return Rota.novaRota(a, b)
                   .adicionarNovaInstrucao(InstrucaoDaRota.builder()
                                                          .instrucao("Montar na bike")
                                                          .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Começa a pedalar")
                                      .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Cuidado com o carro!")
                                      .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Olha o pedestre!")
                                      .build())
                   .adicionarNovaInstrucao(
                       InstrucaoDaRota.builder()
                                      .instrucao("Chegou!")
                                      .build());

    }

    private boolean verificarSeRotaComBikeÉPossivel(Local a, Local b) {

        int tempoRandomico = new Random().nextInt(1);

        if (tempoRandomico == 0) {
            //ta sol
            return true;
        }

        return false;

    }
}

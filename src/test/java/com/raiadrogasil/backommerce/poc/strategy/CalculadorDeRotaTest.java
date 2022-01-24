package com.raiadrogasil.backommerce.poc.strategy;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import com.raiadrogasil.backommerce.poc.strategy.application.CalculadorDeRota;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Chegada;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Partida;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Rota;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.TipoDeTransporte;
import java.util.Set;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadorDeRotaTest {

    @Test
    public void When_UsandoCarro_Then_RotaComCarro() {

        Partida partida = new Partida("Rua X, Numero 2");
        Chegada chegada = new Chegada("Rua Y, Numero 3");

        CalculadorDeRota calculadorDeRota = new CalculadorDeRota();
        Rota rota = calculadorDeRota.calcularRota(partida, chegada, TipoDeTransporte.CARRO);

        assertNotNull(rota);

        Set<String> listarInstrucoesDaRota = rota.listarInstrucoesDaRota();

        assertNotNull(listarInstrucoesDaRota);
        assertFalse(listarInstrucoesDaRota.isEmpty());
        assertThat(listarInstrucoesDaRota,
            Matchers.hasItem("Acelera meu fio!"));

    }


    public void When_UsandoBike_Then_RotaComBike() {
        Partida partida = new Partida("Rua X, Numero 2");
        Chegada chegada = new Chegada("Rua Y, Numero 3");

        CalculadorDeRota calculadorDeRota = new CalculadorDeRota();
        Rota rota = calculadorDeRota.calcularRota(partida, chegada, TipoDeTransporte.BIKE);

        assertNotNull(rota);

        Set<String> listarInstrucoesDaRota = rota.listarInstrucoesDaRota();

        assertNotNull(listarInstrucoesDaRota);
        assertFalse(listarInstrucoesDaRota.isEmpty());
        assertThat(listarInstrucoesDaRota,
            Matchers.hasItem("Olha o pedestre!"));

    }

}

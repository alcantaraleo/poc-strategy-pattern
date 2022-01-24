package com.raiadrogasil.backommerce.poc.strategy.application;

import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Chegada;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.EstrategiaDeRota;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.EstrategiaDeRotaFactory;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Partida;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.Rota;
import com.raiadrogasil.backommerce.poc.strategy.domain.rota.TipoDeTransporte;
import java.util.List;
import java.util.Set;

public class CalculadorDeRota {


    public Rota calcularRota(Partida partida, Chegada chegada, TipoDeTransporte tipoDeTransporte) {

        EstrategiaDeRota estrategiaDeRota = EstrategiaDeRotaFactory.determinarEstrategia(tipoDeTransporte);
        Rota rota = estrategiaDeRota.calcularRota(partida, chegada);
        return rota;
    }

}

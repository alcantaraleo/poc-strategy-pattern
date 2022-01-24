package com.raiadrogasil.backommerce.poc.strategy.domain.rota;

public class EstrategiaDeRotaFactory {


    public static EstrategiaDeRota determinarEstrategia(TipoDeTransporte tipoDeTransporte) {
        if (TipoDeTransporte.CARRO.equals(tipoDeTransporte)) {
            return new EstrategiaDeRotaComCarro();
        } else if (TipoDeTransporte.BIKE.equals(tipoDeTransporte)) {
            return new EstrategiaDeRotaComBike();
        } else {
            throw new IllegalArgumentException("Tipo de Transporte não suportado");
        }
    }
}

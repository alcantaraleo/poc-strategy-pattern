package com.raiadrogasil.backommerce.poc.strategy.domain.rota;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Chegada implements Local {

    @Getter
    final String endereco;
}

package com.Ryanair.ryanair.features.vuelo.presentation;

import com.Ryanair.ryanair.features.vuelo.data.VueloDataRepository;
import com.Ryanair.ryanair.features.vuelo.domain.AddVueloUseCase;
import com.Ryanair.ryanair.features.vuelo.domain.Vuelo;

public class MainVuelo {
    public static void save(Vuelo vuelo){
        AddVueloUseCase addVueloUseCase = new AddVueloUseCase(new VueloDataRepository());
        addVueloUseCase.execute(vuelo);
    }
}

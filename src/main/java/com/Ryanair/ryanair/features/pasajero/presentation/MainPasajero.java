package com.Ryanair.ryanair.features.pasajero.presentation;

import com.Ryanair.ryanair.features.pasajero.data.PasajeroDataRepository;
import com.Ryanair.ryanair.features.pasajero.domain.AddPasajeroUseCase;
import com.Ryanair.ryanair.features.pasajero.domain.Pasajero;

public class MainPasajero {
    public static void save(Pasajero pasajero){
        AddPasajeroUseCase addPasajeroUseCase= new AddPasajeroUseCase(new PasajeroDataRepository());
        addPasajeroUseCase.execute(pasajero);
    }
}

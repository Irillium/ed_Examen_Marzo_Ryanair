package com.Ryanair.ryanair.features.pasajero.presentation;

import com.Ryanair.ryanair.features.pasajero.data.PasajeroDataRepository;
import com.Ryanair.ryanair.features.pasajero.domain.AddPasajeroUseCase;
import com.Ryanair.ryanair.features.pasajero.domain.GetPasajeroUseCase;
import com.Ryanair.ryanair.features.pasajero.domain.Pasajero;

public class MainPasajero {
    private static PasajeroDataRepository pasajeroDataRepository= new PasajeroDataRepository();
    public static void save(Pasajero pasajero){
        AddPasajeroUseCase addPasajeroUseCase= new AddPasajeroUseCase(pasajeroDataRepository);
        addPasajeroUseCase.execute(pasajero);
    }
    public static  Pasajero obtain(String id){
        GetPasajeroUseCase getPasajeroUseCase = new GetPasajeroUseCase(pasajeroDataRepository);
        return getPasajeroUseCase.execute(id);
    }
}

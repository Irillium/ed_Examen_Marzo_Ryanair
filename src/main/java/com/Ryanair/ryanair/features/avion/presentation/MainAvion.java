package com.Ryanair.ryanair.features.avion.presentation;

import com.Ryanair.ryanair.features.avion.data.AvionDataRepository;
import com.Ryanair.ryanair.features.avion.domain.AddAvionUseCase;
import com.Ryanair.ryanair.features.avion.domain.Avion;

public class MainAvion {
    public static void save(Avion avion){
        AddAvionUseCase addAvionUseCase = new AddAvionUseCase(new AvionDataRepository());
        addAvionUseCase.execute(avion);
    }
}

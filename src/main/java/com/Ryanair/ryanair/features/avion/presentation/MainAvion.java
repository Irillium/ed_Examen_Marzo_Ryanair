package com.Ryanair.ryanair.features.avion.presentation;

import com.Ryanair.ryanair.features.avion.data.AvionDataRepository;
import com.Ryanair.ryanair.features.avion.domain.AddAvionUseCase;
import com.Ryanair.ryanair.features.avion.domain.Avion;
import com.Ryanair.ryanair.features.avion.domain.GetAvionUseCase;

public class MainAvion {
    private static AvionDataRepository avionDataRepository= new AvionDataRepository();
    public static void save(Avion avion){
        AddAvionUseCase addAvionUseCase = new AddAvionUseCase(avionDataRepository);
        addAvionUseCase.execute(avion);
    }
    public static Avion obtein(String id){
        GetAvionUseCase getAvionUseCase= new GetAvionUseCase(avionDataRepository);
        return getAvionUseCase.execute(id);
    }
}

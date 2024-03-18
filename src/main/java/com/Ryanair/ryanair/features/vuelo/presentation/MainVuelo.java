package com.Ryanair.ryanair.features.vuelo.presentation;

import com.Ryanair.ryanair.features.vuelo.data.VueloDataRepository;
import com.Ryanair.ryanair.features.vuelo.domain.AddVueloUseCase;
import com.Ryanair.ryanair.features.vuelo.domain.GetVueloUseCase;
import com.Ryanair.ryanair.features.vuelo.domain.Vuelo;

public class MainVuelo {
    private static VueloDataRepository vueloDataRepository=new VueloDataRepository() ;
    public static void save(Vuelo vuelo){
        AddVueloUseCase addVueloUseCase = new AddVueloUseCase(vueloDataRepository);
        addVueloUseCase.execute(vuelo);
    }
    public static Vuelo obtain(String id){
        GetVueloUseCase getVueloUseCase=new GetVueloUseCase(vueloDataRepository);
        return getVueloUseCase.execute(id);
    }
}

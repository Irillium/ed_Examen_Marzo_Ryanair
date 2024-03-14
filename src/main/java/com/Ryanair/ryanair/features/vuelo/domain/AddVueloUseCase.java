package com.Ryanair.ryanair.features.vuelo.domain;

public class AddVueloUseCase {
    VueloRepository vueloRepository;

    public AddVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public void execute(Vuelo vuelo){
        vueloRepository.save(vuelo);
    }
}

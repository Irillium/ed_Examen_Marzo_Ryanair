package com.Ryanair.ryanair.features.vuelo.domain;

public class GetVueloUseCase {
    VueloRepository vueloRepository;

    public GetVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Vuelo execute(String id){
        return vueloRepository.obtain(id);
    }
}

package com.Ryanair.ryanair.features.avion.domain;

public class UsedAvionUseCase {
    AvionRepository avionRepository;

    public UsedAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public boolean execute(String id){
        Avion avion = avionRepository.obtain(id);
        return avion.isAsignado();
    }
}

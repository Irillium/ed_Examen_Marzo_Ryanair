package com.Ryanair.ryanair.features.avion.domain;

public class UsedAvionUseCase {
    AvionRepository avionRepository;

    public UsedAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public boolean execute(String id){

        return avionRepository.isUsed(id);
    }

}

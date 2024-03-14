package com.Ryanair.ryanair.features.avion.domain;

public class GetAvionUseCase {
    AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public Avion execute(String id){
        return avionRepository.obtain(id);
    }
}

package com.Ryanair.ryanair.features.avion.domain;

public class AddAvionUseCase {
    AvionRepository avionRepository;

    public AddAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }
    public void execute(Avion avion){
        avionRepository.save(avion);
    }
}

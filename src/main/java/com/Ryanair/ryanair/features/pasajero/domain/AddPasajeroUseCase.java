package com.Ryanair.ryanair.features.pasajero.domain;

public class AddPasajeroUseCase {
    PasajeroRepository pasajeroRepository;

    public AddPasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public void execute(Pasajero pasajero){
        pasajeroRepository.save(pasajero);
    }
}

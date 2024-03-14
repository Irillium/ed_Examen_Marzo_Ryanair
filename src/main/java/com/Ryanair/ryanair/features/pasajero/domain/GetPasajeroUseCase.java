package com.Ryanair.ryanair.features.pasajero.domain;

public class GetPasajeroUseCase {
    PasajeroRepository pasajeroRepository;

    public GetPasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public Pasajero execute(String id){
        return pasajeroRepository.obtain(id);
    }
}

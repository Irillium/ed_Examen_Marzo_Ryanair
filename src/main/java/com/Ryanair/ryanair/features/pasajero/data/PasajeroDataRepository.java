package com.Ryanair.ryanair.features.pasajero.data;

import com.Ryanair.ryanair.features.pasajero.data.local.PasajeroFileLocalDataSource;
import com.Ryanair.ryanair.features.pasajero.domain.Pasajero;
import com.Ryanair.ryanair.features.pasajero.domain.PasajeroRepository;

public class PasajeroDataRepository implements PasajeroRepository {
    PasajeroFileLocalDataSource pasajeroFileLocalDataSource;

    @Override
    public void save(Pasajero pasajero) {
        pasajeroFileLocalDataSource.save(pasajero);
    }

    @Override
    public Pasajero obtain(String id) {
        return pasajeroFileLocalDataSource.findById(id);
    }
}

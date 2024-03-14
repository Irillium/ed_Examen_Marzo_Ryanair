package com.Ryanair.ryanair.features.avion.data;

import com.Ryanair.ryanair.features.avion.data.local.AvionFileLocalDataSource;
import com.Ryanair.ryanair.features.avion.domain.Avion;
import com.Ryanair.ryanair.features.avion.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {
    private AvionFileLocalDataSource avionFileLocalDataSource;
    @Override
    public void save(Avion avion) {
        avionFileLocalDataSource.save(avion);
    }

    @Override
    public Avion obtain(String id) {
        return avionFileLocalDataSource.findById(id);
    }

    @Override
    public boolean isUsed(String id) {
        Avion avion = obtain(id);
        return avion.isAsignado();
    }
}

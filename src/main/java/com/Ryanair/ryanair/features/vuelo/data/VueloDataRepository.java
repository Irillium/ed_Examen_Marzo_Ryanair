package com.Ryanair.ryanair.features.vuelo.data;

import com.Ryanair.ryanair.features.vuelo.data.local.VueloFileLocalDataSource;
import com.Ryanair.ryanair.features.vuelo.domain.Vuelo;
import com.Ryanair.ryanair.features.vuelo.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {
    VueloFileLocalDataSource vueloFileLocalDataSource= new VueloFileLocalDataSource();

    @Override
    public void save(Vuelo vuelo) {
        vueloFileLocalDataSource.save(vuelo);
    }

    @Override
    public Vuelo obtain(String id) {
        return vueloFileLocalDataSource.findById(id);
    }
}

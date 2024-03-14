package com.Ryanair.ryanair.features.avion.data;

import com.Ryanair.ryanair.features.avion.domain.Avion;
import com.Ryanair.ryanair.features.avion.domain.AvionRepository;

import java.util.ArrayList;

public class StubTrueAvionDataRepository implements AvionRepository {

    ArrayList<Avion> avionesPrueba= new ArrayList<>();
    @Override
    public void save(Avion avion) {
    }

    @Override
    public Avion obtain(String id) {
        return null;
    }

    @Override
    public boolean isUsed(String id) {
        Avion avion = new Avion("2345","","","",true);
        if(id.equals(avion.getCodigo())){
            return avion.isAsignado();
        }
        return false;
    }

}

package com.Ryanair.ryanair.features.avion.domain;

public interface AvionRepository {
    void save(Avion avion);
    Avion obtain(String id);
    boolean isUsed(String id);
}

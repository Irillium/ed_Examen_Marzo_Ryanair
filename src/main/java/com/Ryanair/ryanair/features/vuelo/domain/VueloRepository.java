package com.Ryanair.ryanair.features.vuelo.domain;

public interface VueloRepository {
    void save(Vuelo vuelo);
    Vuelo obtain(String id);
}

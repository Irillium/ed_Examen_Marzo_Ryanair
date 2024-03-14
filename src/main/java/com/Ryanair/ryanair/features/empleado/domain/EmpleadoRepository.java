package com.Ryanair.ryanair.features.empleado.domain;

public interface EmpleadoRepository {
    void save(Empleado empleado);
    Empleado obtain(String id);
}

package com.Ryanair.ryanair.features.empleado.data;

import com.Ryanair.ryanair.features.empleado.data.local.EmpleadoMemLocalDataSource;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.empleado.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {
    private EmpleadoMemLocalDataSource empleadoMemLocalDataSource;
    @Override
    public void save(Empleado empleado) {
        empleadoMemLocalDataSource.save(empleado);
    }

    @Override
    public Empleado obtain(String id) {
        return empleadoMemLocalDataSource.findById(id);

    }
}

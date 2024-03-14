package com.Ryanair.ryanair.features.empleado.data;

import com.Ryanair.ryanair.features.empleado.data.local.EmpleadoFileLocalDataSource;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.empleado.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {
    private EmpleadoFileLocalDataSource empleadoFileLocalDataSource;
    @Override
    public void save(Empleado empleado) {
        empleadoFileLocalDataSource.save(empleado);
    }
}

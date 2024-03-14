package com.Ryanair.ryanair.features.empleado.presentation;

import com.Ryanair.ryanair.features.empleado.data.EmpleadoDataRepository;
import com.Ryanair.ryanair.features.empleado.domain.AddEmpleadoUseCase;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;

public class MainEmpleado {
    public static void save(Empleado empleado){
        AddEmpleadoUseCase addEmpleadoUseCase= new AddEmpleadoUseCase(new EmpleadoDataRepository());
        addEmpleadoUseCase.execute(empleado);
    }
}

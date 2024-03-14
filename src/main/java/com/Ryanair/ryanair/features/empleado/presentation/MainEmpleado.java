package com.Ryanair.ryanair.features.empleado.presentation;

import com.Ryanair.ryanair.features.empleado.data.EmpleadoDataRepository;
import com.Ryanair.ryanair.features.empleado.domain.AddEmpleadoUseCase;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.empleado.domain.GetEmpleadoUseCase;

public class MainEmpleado {
    private static EmpleadoDataRepository empleadoDataRepository = new EmpleadoDataRepository();
    public static void save(Empleado empleado){
        AddEmpleadoUseCase addEmpleadoUseCase= new AddEmpleadoUseCase(empleadoDataRepository);
        addEmpleadoUseCase.execute(empleado);
    }
    public static Empleado obtain(String id){
        GetEmpleadoUseCase getEmpleadoUseCase=new GetEmpleadoUseCase(empleadoDataRepository);
        return getEmpleadoUseCase.execute(id);
    }
}

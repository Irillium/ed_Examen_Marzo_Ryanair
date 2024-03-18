package com.Ryanair.ryanair.features.empleado.presentation;

import com.Ryanair.ryanair.features.empleado.data.EmpleadoFileDataRepository;
import com.Ryanair.ryanair.features.empleado.data.EmpleadoMemDataRepository;
import com.Ryanair.ryanair.features.empleado.data.local.EmpleadoMemLocalDataSource;
import com.Ryanair.ryanair.features.empleado.domain.AddEmpleadoUseCase;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.empleado.domain.GetEmpleadoUseCase;

public class MainEmpleado {
    private static EmpleadoMemDataRepository empleadoMenDataRepository = new EmpleadoMemDataRepository(EmpleadoMemLocalDataSource.newInstance());
    private static EmpleadoFileDataRepository empleadoFileDataRepository= new EmpleadoFileDataRepository();
    public static void save(Empleado empleado){
        AddEmpleadoUseCase addEmpleadoUseCase= new AddEmpleadoUseCase(empleadoMenDataRepository);
        addEmpleadoUseCase.execute(empleado);
    }
    public static Empleado obtain(String id){
        GetEmpleadoUseCase getEmpleadoUseCase=new GetEmpleadoUseCase(empleadoMenDataRepository);
        return getEmpleadoUseCase.execute(id);
    }
}

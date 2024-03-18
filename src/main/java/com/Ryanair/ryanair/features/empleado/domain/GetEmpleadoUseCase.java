package com.Ryanair.ryanair.features.empleado.domain;

public class GetEmpleadoUseCase {
    EmpleadoRepository empleadoRepository;

    public GetEmpleadoUseCase(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    public Empleado execute(String id){
        return empleadoRepository.obtain(id);
    }
}

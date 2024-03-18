package com.Ryanair.ryanair.features.empleado.domain;

public class AddEmpleadoUseCase {
    EmpleadoRepository empleadoRepository;

    public AddEmpleadoUseCase(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    public void execute(Empleado empleado){
        empleadoRepository.save(empleado);
    }
}

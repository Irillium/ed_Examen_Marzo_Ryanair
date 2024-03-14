package com.Ryanair.ryanair.features.empleado.data.local;

import com.Ryanair.ryanair.features.empleado.domain.Empleado;

import java.util.*;

public class EmpleadoMemLocalDataSource {

    private static EmpleadoMemLocalDataSource empleadoMemLocalDataSource=null;
    private static EmpleadoMemLocalDataSource newInstance(){
        if(empleadoMemLocalDataSource ==null){
            empleadoMemLocalDataSource= new EmpleadoMemLocalDataSource();
        }
        return empleadoMemLocalDataSource;
    }
    private Map<String, Empleado> dataStore = new TreeMap<>();

    public void save(Empleado model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Empleado> models) {
        for (Empleado demo : models) {
            save(demo);
        }
    }

    public Empleado findById(String id) {
        return dataStore.get(id);
    }

    public List<Empleado> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}

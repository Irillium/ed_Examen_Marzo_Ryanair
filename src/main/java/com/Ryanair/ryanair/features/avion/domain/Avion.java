package com.Ryanair.ryanair.features.avion.domain;

public class Avion {
    private final String codigo;
    private final String nombre;
    private final String modelo;
    private final String asientos;

    private boolean asignado;


    public Avion(String codigo, String nombre, String modelo, String asientos, boolean asignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.asientos = asientos;
        this.asignado = asignado;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAsientos() {
        return asientos;
    }
}

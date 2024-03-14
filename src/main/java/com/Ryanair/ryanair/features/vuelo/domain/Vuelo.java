package com.Ryanair.ryanair.features.vuelo.domain;

import com.Ryanair.ryanair.features.avion.domain.Avion;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.pasajero.domain.Pasajero;

import java.util.ArrayList;

public class Vuelo {
    private final String id;
    private final Avion avion;
    private final ArrayList<Empleado> tripulantes;
    private final  ArrayList<Pasajero> pasajeros;
    private final String fecha;
    private final String hora;
    private final String precio;
    private final String origen;
    private final String destino;

    public Vuelo(String id, Avion avion, ArrayList<Empleado> tripulantes, ArrayList<Pasajero> pasajeros, String fecha, String hora, String precio, String origen, String destino) {
        this.id = id;
        this.avion = avion;
        avion.setAsignado(true);
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public String getId() {
        return id;
    }

    public Avion getAvion() {
        return avion;
    }

    public ArrayList<Empleado> getTripulantes() {
        return tripulantes;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getPrecio() {
        return precio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}

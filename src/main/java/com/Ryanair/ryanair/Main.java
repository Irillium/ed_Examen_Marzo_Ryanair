package com.Ryanair.ryanair;

import com.Ryanair.ryanair.features.avion.domain.Avion;
import com.Ryanair.ryanair.features.avion.presentation.MainAvion;
import com.Ryanair.ryanair.features.empleado.domain.Empleado;
import com.Ryanair.ryanair.features.empleado.presentation.MainEmpleado;
import com.Ryanair.ryanair.features.pasajero.domain.Pasajero;
import com.Ryanair.ryanair.features.pasajero.presentation.MainPasajero;
import com.Ryanair.ryanair.features.vuelo.domain.Vuelo;
import com.Ryanair.ryanair.features.vuelo.presentation.MainVuelo;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Empleado
        MainEmpleado.save(new Empleado("700001", "Empleado1", "EmpleadoApellido1", "Piloto"));
        MainEmpleado.save( new Empleado("700002", "Empleado2", "EmpleadoApellido2", "Piloto"));
        MainEmpleado.save( new Empleado("700003", "Empleado3", "EmpleadoApellido3", "Azafata"));

        //Pasajeros
        MainPasajero.save( new Pasajero("800001","Pasajero1", "Apellidospasajero1","Avila", "Avila"));
        MainPasajero.save( new Pasajero("800002","Pasajero2", "Apellidospasajero2","Avila", "Avila"));

        //Aviones
        MainAvion.save(new Avion("100001","Pajarito","Boing701","200",false));
        MainAvion.save( new Avion("100002","Nube","Boing705","250",false));
        MainAvion.save( new Avion("100003","Rayo","Boing710","100",false));

        //Vuelos
        Avion avion= MainAvion.obtein("100001");

        ArrayList<Empleado> empleadosVuelo=new ArrayList<>();
        empleadosVuelo.add(MainEmpleado.obtain("700001"));
        empleadosVuelo.add(MainEmpleado.obtain("700003"));

        ArrayList<Pasajero> pasajerosVuelo=new ArrayList<>();
        pasajerosVuelo.add(MainPasajero.obtain("800001"));
        pasajerosVuelo.add(MainPasajero.obtain("800002"));

        MainVuelo.save(new Vuelo("1",avion, empleadosVuelo,pasajerosVuelo,"10/02/2024","10:30h", "90e","Madrid","Barcelona" ));
        MainVuelo.obtain("1");

    }
}
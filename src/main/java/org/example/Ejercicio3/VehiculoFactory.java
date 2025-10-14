package org.example.Ejercicio3;

public class VehiculoFactory {
    public Vehiculo crearVehiculo(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("auto")) {
            return new auto();
        } else if (tipo.equalsIgnoreCase("moto")) {
            return new moto();
        }
        return null;
    }
}



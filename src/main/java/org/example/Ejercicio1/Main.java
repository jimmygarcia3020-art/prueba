package org.example.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ejercicio 1:");
        ConfiguracionApp config1 = ConfiguracionApp.getInstancia();
        System.out.println("Idioma inicial: " + config1.getIdioma());

        ConfiguracionApp config2 = ConfiguracionApp.getInstancia();
        System.out.println("Idioma desde segunda instancia: " + config2.getIdioma());
        System.out.println("¿Misma instancia? " + (config1 == config2));
    }
}

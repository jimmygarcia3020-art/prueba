package org.example.Ejercicio4;

public class Pizza {

    private final String tamaño;
    private final boolean queso;
    private final boolean pepperoni;

    private Pizza(PizzaBuilder builder) {
        this.tamaño = builder.tamaño;
        this.queso = builder.queso;
        this.pepperoni = builder.pepperoni;
    }

    public String getTamaño() {
        return tamaño;
    }

    public boolean tieneQueso() {
            return queso;
    }

    public boolean tienePepperoni() {
        return pepperoni;
    }

    public static class PizzaBuilder {
        private String tamaño;
        private boolean queso;
        private boolean pepperoni;

        public PizzaBuilder setTamaño(String tamaño) {
            this.tamaño = tamaño;
            return this;
        }

        public PizzaBuilder conQueso(boolean queso) {
            this.queso = queso;
            return this;
        }

        public PizzaBuilder conPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

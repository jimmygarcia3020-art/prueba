package org.example.Ejercicio1;

public class ConfiguracionApp {
        private static ConfiguracionApp instancia;

        private String idioma;

        public static ConfiguracionApp getInstancia() {
            if (instancia == null) {
                instancia = new ConfiguracionApp();
            }
            return instancia;
        }

        public String getIdioma() {
            return idioma;
        }

      public void setIdioma(String idioma) {
          this.idioma = idioma;
        }
}

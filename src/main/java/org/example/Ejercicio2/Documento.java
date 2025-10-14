package org.example.Ejercicio2;

    public class Documento implements Cloneable {
        private String titulo;
        private String contenido;

        public Documento(String titulo, String contenido) {
            this.titulo = titulo;
            this.contenido = contenido;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getContenido() {
            return contenido;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        @Override
        public Documento clone() {
            try {
                return (Documento) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Error al clonar el documento", e);
            }
        }
    }



package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    // Atributos privados
    private String nombre;
    private int edad;
    private final String posicion;  // La posición no puede cambiar una vez establecida

    // Constructor con parámetros
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Constructor por defecto
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    // Método toString para imprimir la información del futbolista
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " anos, y juega de " + posicion + ".";
    }

    // Método equals para comparar dos objetos Futbolista
    public boolean equals(Futbolista f) {
        if (this == f) return true;
        if (f == null) return false;
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }

    // Método abstracto jugarConLasManos
    public abstract boolean jugarConLasManos();

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    // Implementación de la interfaz Comparable para comparar por edads
    public int compareTo(Futbolista otro) {
        return Integer.compare(this.edad, otro.edad);
    }
}

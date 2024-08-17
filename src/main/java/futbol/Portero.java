package futbol;

public class Portero extends Futbolista {
    // Atributos públicos
    public short golesRecibidos;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");  // Llama al constructor de la clase padre
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // Método toString para imprimir la información del portero
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " +
            getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
    }

    // Implementación del método abstracto jugarConLasManos
    public boolean jugarConLasManos() {
        return true;  // Un portero siempre puede jugar con las manos
    }

    // Implementación del método compareTo de la interfaz Comparables
    public int compareTo(Futbolista otro) {
        if (otro instanceof Portero) {
            Portero otroPortero = (Portero) otro;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        } else {
            throw new IllegalArgumentException("El objeto comparado no es un Portero");
        }
    }
}


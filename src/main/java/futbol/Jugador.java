package futbol;

public class Jugador extends Futbolista {
    // Atributos públicos
    public short golesMarcados;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);  // Llama al constructor de la clase padre
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // Constructor por defecto
    public Jugador() {
        super("Jugador Default", 30, "Delantero");  // Llama al constructor de la clase padre con valores por defecto
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    // Método toString para imprimir la información del jugador
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " +
               getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }

    // Implementación del método compareTo de la interfaz Comparable
    public int compareTo(Futbolista otro) {
        return Math.abs(this.getEdad() - otro.getEdad());
    }

    // Implementación del método abstracto jugarConLasManos
    public boolean jugarConLasManos() {
        return false;  // Un jugador normal no puede jugar con las manos
    }
}

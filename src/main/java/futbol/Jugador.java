package futbol;

public class Jugador extends Futbolista {
    // Atributos publicos
    public short golesMarcados;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // Constructor por defecto
    public Jugador() {
        super();  // Llama al constructor de la clase padre con valores por defecto
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    // Metodo toString para imprimir la informacion del jugador
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " anos, y juega de " +
               getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }

    // Implementacion del metodo compareTo de la interfaz Comparable
    public int compareTo(Futbolista otro) {
        return Math.abs(this.getEdad() - otro.getEdad());
    }

    // Implementacion del mestodo abstracto jugarConLasManos
    public boolean jugarConLasManos() {
        return false; 
    }
}

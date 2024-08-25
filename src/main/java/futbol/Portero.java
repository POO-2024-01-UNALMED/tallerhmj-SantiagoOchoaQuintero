package futbol;

public class Portero extends Futbolista {
    // Atributos publicos
    public short golesRecibidos;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");  // Llama al constructor de la clase padre
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // Metodo toString para imprimir la informacion del portero
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " anos, y juega de " +
            getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
    }

    // Implementación del metodo abstracto jugarConLasManos
    public boolean jugarConLasManos() {
        return true; 
    }

    // Implementacion del metodo compareTo de la interfaz Comparables
    public int compareTo(Portero otro) {
            return Math.abs(this.golesRecibidos - otro.golesRecibidos);
         
    }
}


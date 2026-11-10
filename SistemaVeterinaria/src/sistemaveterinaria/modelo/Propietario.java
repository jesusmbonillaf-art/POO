package sistemaveterinaria.modelo;

public class Propietario extends Persona {
    private String codigoPropietario;

    public Propietario() {
        super();
    }

    public Propietario(String dni, String nombre, String telefono, String direccion, String codigoPropietario) {
        super(dni, nombre, telefono, direccion);
        setCodigoPropietario(codigoPropietario);
    }

    // Obligatorio por la clase abstracta Persona
    @Override
    public String obtenerDatos() {
        return "Propietario: " + nombre + " [DNI: " + dni + "]";
    }

    // Opcional: Si quieres personalizar el toString() propio del Propietario
    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }

    public String getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(String codigoPropietario) {
        if (codigoPropietario == null || codigoPropietario.trim().isEmpty()) {
            throw new IllegalArgumentException("El código del propietario es obligatorio.");
        }
        this.codigoPropietario = codigoPropietario.trim();
    }
}
package sistemaveterinaria.modelo;

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String telefono;
    protected String direccion;

    public Persona() {
    }

    public Persona(String dni, String nombre, String telefono, String direccion) {
        setDni(dni);
        setNombre(nombre);
        setTelefono(telefono);
        setDireccion(direccion);
    }

    // Método abstracto obligatorio: obliga a las clases hijas a implementarlo
    public abstract String obtenerDatos();

    // --- GETTERS Y SETTERS CON VALIDACIONES ---

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            throw new IllegalArgumentException("El DNI es obligatorio.");
        }
        this.dni = dni.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombre = nombre.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono es obligatorio.");
        }
        this.telefono = telefono.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección es obligatoria.");
        }
        this.direccion = direccion.trim();
    }

    // toString base por seguridad para los JComboBox o listas en NetBeans
    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}
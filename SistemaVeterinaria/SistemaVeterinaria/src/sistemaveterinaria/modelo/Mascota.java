package sistemaveterinaria.modelo;

public class Mascota {
    private String codigo;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private double peso;
    
    // Asociación: Una mascota pertenece a un Propietario
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, String especie, String raza, int edad, String sexo, double peso, Propietario propietario) {
        setCodigo(codigo);
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setSexo(sexo);
        setPeso(peso);
        setPropietario(propietario);
    }

    // --- GETTERS Y SETTERS CON VALIDACIONES ANTI-CRASH ---

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la mascota es obligatorio.");
        }
        this.codigo = codigo.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la mascota es obligatorio.");
        }
        this.nombre = nombre.trim();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("La especie es obligatoria.");
        }
        this.especie = especie.trim();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = (raza == null || raza.trim().isEmpty()) ? "Sin raza" : raza.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.trim().isEmpty()) {
            throw new IllegalArgumentException("El sexo es obligatorio.");
        }
        this.sexo = sexo.trim();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.");
        }
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        if (propietario == null) {
            throw new IllegalArgumentException("La mascota debe estar asociada a un propietario válido.");
        }
        this.propietario = propietario;
    }

    // Vital para que los JComboBox o listas en NetBeans muestren información legible
    @Override
    public String toString() {
        return nombre + " (" + especie + ")";
    }
}
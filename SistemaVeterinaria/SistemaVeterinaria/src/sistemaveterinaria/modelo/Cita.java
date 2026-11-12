package sistemaveterinaria.modelo;

public final class Cita {
    private String codigo;
    private String fecha;   // dd/MM/yyyy
    private String hora;    // HH:mm
    private String motivo;
    private String estado;  // Pendiente, Atendida, Cancelada
    private Mascota mascota;

    public Cita() {}

    public Cita(String codigo, String fecha, String hora, String motivo,
                String estado, Mascota mascota) {
        setCodigo(codigo);
        setFecha(fecha);
        setHora(hora);
        setMotivo(motivo);
        setEstado(estado);
        setMascota(mascota);
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty())
            throw new IllegalArgumentException("El código de la cita es obligatorio.");
        this.codigo = codigo.trim();
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) {
        if (fecha == null || fecha.trim().isEmpty())
            throw new IllegalArgumentException("La fecha es obligatoria.");
        this.fecha = fecha.trim();
    }

    public String getHora() { return hora; }
    public void setHora(String hora) {
        if (hora == null || hora.trim().isEmpty())
            throw new IllegalArgumentException("La hora es obligatoria.");
        this.hora = hora.trim();
    }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) {
        if (motivo == null || motivo.trim().isEmpty())
            throw new IllegalArgumentException("El motivo es obligatorio.");
        this.motivo = motivo.trim();
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty())
            throw new IllegalArgumentException("El estado es obligatorio.");
        this.estado = estado.trim();
    }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) {
        if (mascota == null)
            throw new IllegalArgumentException("Debe seleccionar una mascota.");
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return fecha + " " + hora + " - " + mascota.getNombre()
             + " (" + mascota.getPropietario().getNombre() + ")";
    }
}
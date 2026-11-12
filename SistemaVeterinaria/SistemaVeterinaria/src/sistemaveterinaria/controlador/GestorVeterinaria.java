package sistemaveterinaria.controlador;

import java.util.ArrayList;
import sistemaveterinaria.modelo.Propietario;
import sistemaveterinaria.modelo.Mascota;
import sistemaveterinaria.modelo.Cita;                    // CITAS
import sistemaveterinaria.modelo.VeterinariaExcepcion;

public class GestorVeterinaria {
    
    public static ArrayList<Propietario> listaPropietarios = new ArrayList<>();
    public static ArrayList<Mascota> listaMascotas = new ArrayList<>();
    public static ArrayList<Cita> listaCitas = new ArrayList<>();

    public static void precargarDatos() {
        if (listaPropietarios.isEmpty()) {
            // 1. Propietario(dni, nombre, telefono, direccion, codigoPropietario)
            Propietario p1 = new Propietario("45678901", "Carlos Mendoza", "987654321", "Av. Perú 123", "P001");
            Propietario p2 = new Propietario("45678902", "Ana Torres", "912345678", "Jr. Lima 456", "P002");
            Propietario p3 = new Propietario("45678903", "Luis Quispe", "998877665", "Calle Las Flores 789", "P003");
            Propietario p4 = new Propietario("45678904", "Sofía Ramos", "944556677", "Av. Universitaria 321", "P004");
            Propietario p5 = new Propietario("45678905", "Jorge Castillo", "922334455", "Jr. Cusco 654", "P005");

            listaPropietarios.add(p1);
            listaPropietarios.add(p2);
            listaPropietarios.add(p3);
            listaPropietarios.add(p4);
            listaPropietarios.add(p5);

            // 2. Mascota(codigo, nombre, especie, raza, edad, sexo, peso, propietario)
            Mascota m1 = new Mascota("M001", "Firulais", "Canino", "Labrador", 3, "Macho", 15.5, p1);
            Mascota m2 = new Mascota("M002", "Michi", "Felino", "Siamés", 2, "Hembra", 4.0, p2);
            Mascota m3 = new Mascota("M003", "Rocky", "Canino", "Bulldog", 4, "Macho", 20.0, p3);
            Mascota m4 = new Mascota("M004", "Luna", "Felino", "Angora", 1, "Hembra", 3.2, p4);
            Mascota m5 = new Mascota("M005", "Bolt", "Canino", "Pastor Alemán", 5, "Macho", 25.0, p5);

            listaMascotas.add(m1);
            listaMascotas.add(m2);
            listaMascotas.add(m3);
            listaMascotas.add(m4);
            listaMascotas.add(m5);
            
            // 3. Cita (codigo, fecha, hora, motivo, estado, mascota)
            listaCitas.add(new Cita("C001", "2026-06-01", "10:00", "Control general", "Pendiente", m1));
            listaCitas.add(new Cita("C002", "2026-06-02", "11:30", "Vacuna antirrábica", "Atendida", m2));
            listaCitas.add(new Cita("C003", "2026-06-03", "15:00", "Limpieza dental", "Pendiente", m3));
            listaCitas.add(new Cita("C004", "2026-06-04", "09:00", "Revisión de patas", "Cancelada", m4));
            listaCitas.add(new Cita("C005", "2026-06-05", "16:15", "Desparasitación", "Pendiente", m5));
        }
    }
}

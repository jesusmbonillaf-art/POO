package sistemaveterinaria.controlador;

import java.util.ArrayList;
import sistemaveterinaria.modelo.Propietario;
import sistemaveterinaria.modelo.Mascota;

public class GestorVeterinaria {
    
    public static ArrayList<Propietario> listaPropietarios = new ArrayList<>();
    public static ArrayList<Mascota> listaMascotas = new ArrayList<>();

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
            listaMascotas.add(new Mascota("M001", "Firulais", "Canino", "Labrador", 3, "Macho", 15.5, p1));
            listaMascotas.add(new Mascota("M002", "Michi", "Felino", "Siamés", 2, "Hembra", 4.0, p2));
            listaMascotas.add(new Mascota("M003", "Rocky", "Canino", "Bulldog", 4, "Macho", 20.0, p3));
            listaMascotas.add(new Mascota("M004", "Luna", "Felino", "Angora", 1, "Hembra", 3.2, p4));
            listaMascotas.add(new Mascota("M005", "Bolt", "Canino", "Pastor Alemán", 5, "Macho", 25.0, p5));
        }
    }
}
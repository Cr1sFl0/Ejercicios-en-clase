import java.util.Scanner;
import java.time.LocalDate;

// --- CLASE PERSONA (Basada en la Imagen 3) ---
class Persona {
    public String name; 
    public int id;
    public String nacionalidad;
    public double altura;
    public double peso;
    public LocalDate nacimiento;

    public String mostrar() {
        return this.name + " (" + this.nacionalidad + ")";
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // --- 1. VALIDACIÓN DE EDAD (Imagen 1) ---
        System.out.println("=== EJERCICIO 1: VALIDACIÓN ===");
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = leer.nextLine();
        System.out.print(nombreUsuario + ", ingrese su año de nacimiento: ");
        short actual = 2026;
        short anioNacimiento = leer.nextShort();
        byte edad = (byte) (actual - anioNacimiento);
        
        if (edad < 18) {
            System.out.println("Resultado: No puede entrar (Menor de edad)");
        } else {
            System.out.println("Resultado: Bienvenide");
        }
        leer.nextLine(); // Limpiar el buffer del Scanner

        // --- 2. TABLA DE MULTIPLICAR (Imagen 2) ---
        System.out.println("\n=== EJERCICIO 2: TABLA DE MULTIPLICAR ===");
        System.out.print("Ingrese un número para ver su tabla: ");
        byte numTabla = leer.nextByte();
        System.out.println("La tabla del " + numTabla + " es:");
        byte i = 0;
        while (i <= 10) {
            System.out.println(numTabla + " X " + i + " = " + (numTabla * i));
            i++;
        }

        // --- 3. ANIMAL ESPIRITUAL (Nuevo sistema por Mes) ---
        System.out.println("\n=== EJERCICIO 3: TU ANIMAL ESPIRITUAL ===");
        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = leer.nextInt();
        
        String animal = switch (mes) {
            case 1  -> "Lobo (Lealtad y Resistencia)";
            case 2  -> "Halcón (Visión y Rapidez)";
            case 3  -> "Castor (Esfuerzo y Construcción)";
            case 4  -> "Ciervo (Gentileza y Energía)";
            case 5  -> "Búho (Sabiduría y Misterio)";
            case 6  -> "Salmón (Creatividad y Flujo)";
            case 7  -> "Oso (Fuerza y Protección)";
            case 8  -> "Cuervo (Inteligencia e Intuición)";
            case 9  -> "Ganso (Ambición y Familia)";
            case 10 -> "Nutria (Alegría y Curiosidad)";
            case 11 -> "Tigre (Poder y Fuego)";
            case 12 -> "Pavo Real (Belleza y Confianza)";
            default -> "Desconocido (Mes inválido)";
        };
        System.out.println("Para el mes " + mes + ", tu animal espiritual es: " + animal);

        // --- 4. OBJETOS PERSONA (Imagen 3) ---
        System.out.println("\n=== EJERCICIO 4: REGISTRO DE PERSONAS ===");
        Persona p1 = new Persona();
        p1.name = "Maduro";
        p1.nacionalidad = "Venezuela";
        p1.nacimiento = LocalDate.of(1950, 3, 2);

        Persona p2 = new Persona();
        p2.name = "Mencho";
        p2.nacionalidad = "Mexico";

        System.out.println("Registro 1: " + p1.mostrar());
        System.out.println("Registro 2: " + p2.mostrar());
        
        System.out.println("\n--- PROCESO FINALIZADO CON ÉXITO ---");
        leer.close();
    }
}

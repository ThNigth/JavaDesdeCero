public class EjerciciosHolaMundo {

    static void main() {
        System.out.println("Hola, David"); //Imprime texto normal en este caso mi nombre
        System.out.println("Hola\nMundo"); //Se utiliza "\n" para saltar el texto a la siguiente linea
        /*
        Mi primer comentario
        en varias lineas
        de codigo
         */
        System.out.println("Edad: 20 años\nColor favorito: azul\nCiudad: Soacha, Cundinamarca"); //Imprimi edad, color favorito y ciudad en donde resido
        /*System.XXX.println(); existen 3 segun lo que investigue
        System.out = Se utiliza para imprimir texto de manera normal
        System.err = Se ultiza para imprimir codigos de error o advertencias (suelen estar resaltadas en rojo)
        System.in = Se usa para captura los datos del teclado generalmente junto a el scanner (no tiene metodo .println())
         */
        System.out.println("El tren nocturno avanzaba en silencio,");
        System.out.println("cruzando las montañas nevadas bajo una luna llena,");
        System.out.println("mientras los pasajeros dormían profundamente.");
        System.out.println("  .:::.   .:::.\n :::::::.:::::::\n :::::::::::::::\n ':::::::::::::'\n   ':::::::::'\n     ':::::'\n       ':'");
    }

    // === Mejoras sugeridas por el asistente (sin modificar tu código original) ===
    // Nota de compatibilidad: fuera de Java 25+, el punto de entrada estándar es:
    // public static void main(String[] args)
    static void mejoras() {
        String nombre = "David";
        int edad = 20;
        String colorFavorito = "azul";
        String ciudad = "Soacha, Cundinamarca";

        /*
         * Aclaración sobre los flujos estándar:
         * - System.out: flujo de salida estándar (PrintStream) para texto normal.
         * - System.err: flujo de error estándar (PrintStream) para mensajes de error o advertencias.
         * - System.in: flujo de entrada estándar (InputStream); se utiliza junto a Scanner y no tiene .println().
         */
        System.out.printf("Hola, %s%n", nombre);
        System.out.printf("Edad: %d años%nColor favorito: %s%nCiudad: %s%n", edad, colorFavorito, ciudad);

        System.out.println("""
                El tren nocturno avanzaba en silencio,
                cruzando las montañas nevadas bajo una luna llena,
                mientras los pasajeros dormían profundamente.""");
        System.out.println("  .:::.   .:::.\n :::::::.:::::::\n :::::::::::::::\n ':::::::::::::'\n   ':::::::::'\n     ':::::'\n       ':'");
    }
}

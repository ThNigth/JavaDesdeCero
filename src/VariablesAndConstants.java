public class VariablesAndConstants {

    static void main() {

        //Variables

        String name = "David";
        System.out.println(name);

        name = "Santiago";
        System.out.println(name);

        // name = 20;  Error (no se puede cambiar el tipo de dato)

        int age = 20;
        System.out.println(age);

        //Ejemplos de inferencia de tipos

        var email = "ejemplo@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        //Constantes

        final String EMAIL = "ejemplo@gmail.com";
        // EMAIL = "ejemplo@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}

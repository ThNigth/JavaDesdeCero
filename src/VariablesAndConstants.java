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

        var email = "martinez075479@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        //Constantes

        final String EMAIL = "martinez075479@gmail.com";
        // EMAIL = "david075479@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}

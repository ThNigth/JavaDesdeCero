public class DataTypes {

    static void main() {

        //Tipos de datos primitivos

        int myInt = 20;
        System.out.println(myInt);

        double myDouble = 1.67;
        System.out.println(myDouble);

        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java!";
        System.out.println(myString);

        //Tipo de dato en tiempo de compilacion

        System.out.println(myString.getClass().getSimpleName()); // Se utiliza para obtener el tipo de variable
    }
}

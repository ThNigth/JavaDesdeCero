public class Operators {

    static void main() {

        // Operadores

        // Aritmeticos

        var a = 5;
        var b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Asignacion

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a); //Aqui "a" es iagual a 6

        a += 1;   // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 1;
        System.out.println(a);
        a /= 1;
        System.out.println(a);
        a %= 1;
        System.out.println(a);

        // Comparacion (relaciones)

        System.out.println(a == b); // Igualdad
        System.out.println(a == 0);

        System.out.println(a != b); // Desigualdad
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Logicos



    }
}

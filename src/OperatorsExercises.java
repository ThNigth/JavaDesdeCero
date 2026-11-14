import javax.swing.text.html.StyleSheet;

public class OperatorsExercises {

    static void main() {

        // Aritmetica

        double num1 = 42;
        double num2 = 79;

        double sum = num1 + num2;
        double res = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % num2;
        System.out.println(sum+"\n"+res+"\n"+mul+"\n"+div+"\n"+mod+"\n");

        // Asignacion

        int a = 3;
        int b = 6;
        int c = 12;
        int d = 75;
        int e = 26;

        a += 45;
        System.out.println(a);
        b -= 8;
        System.out.println(b);
        c *= 30;
        System.out.println(c);
        d /= 17;
        System.out.println(d);
        e %= 5;
        System.out.println(e);

        // Comparaciones verdaderas

        var num3 = 8;
        var num4 = 8;

        System.out.println(num3 == num4);
        System.out.println(num1 > num3);
        System.out.println(num3 <= num2);

        // Comparaciones falsas

        System.out.println(num3 != num4);
        System.out.println(num1 < num3);
        System.out.println(num4 >= num1);

        // AND

        boolean and1 = 7 == 90 && 63 <= 12;
        System.out.println(and1);
        boolean and2 = 8 == num3 && 14 <= num2;
        System.out.println(and2);

        // OR

        boolean or1 = num2 >= 27 || 79 != num2;
        System.out.println(or1);
        boolean or2 = num1 >= 56 || 8 != num4;
        System.out.println(or2);

        // Combinacion

        System.out.println(or1&&(and1||or2));

        // Negacion

        System.out.println(!(or1&&(and1||or2)));

        // Unarios

        System.out.println(++num2);
        System.out.println(-num2);
        num1--;
        System.out.println(num1);

        // Comibinacion operadores aritmeticos, comparacion y logicos

        System.out.println((num4 - num3 >= num1 * num4)&&(num3 / num4 != num2 - num3));

    }
}

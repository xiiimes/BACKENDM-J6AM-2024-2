package JavaNotes;

import org.w3c.dom.ls.LSOutput;

public class Variable {
    public static void main(String[] args) {
        byte moveLeft; // declarando variable

        moveLeft = 127;

        short moveLeft2 = (short) moveLeft;

        System.out.println(moveLeft2);

        moveLeft2 = 130;

        // recibe dos valores numerciso pero uno de ellos

        int num1 = 19;

        String num2 = "23";

        // PARSEO DE VARIABLE

        int newNum2 = Integer.parseInt(num2);

        float promedio = (num1 + newNum2)/ 2;

        System.out.println(promedio);
    }
}

package com.estudo.carol.estudo_carol.Operadores;

public class Operadores {

    public static void main(String[] args) {
        double x = 7 - 3;
        System.out.println(x);
    }
}

class Positivo {

    public static void main(String[] args) {
        double x = +3;
        System.out.println(x);
    }
}

class Incremento {
    public static void main(String[] args) {
        int x = 3;
        int y = 4 + x;

        System.out.println(x = +x);
        System.out.println(y = +y);
    }
}

class OperadorLogicoE {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println(a && b);
        System.out.println(a && c);
    }

}

class OperadorLogico {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(a || b);
        System.out.println(b || c);
    }

}

class OperadorLog {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(!a);
        System.out.println(!b || c);
    }

}
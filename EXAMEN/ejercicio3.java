package EXAMEN;


public class ejercicio3 extends Thread {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
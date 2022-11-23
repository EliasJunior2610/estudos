public class Exercicio07 {
    public static int contator = 0;

    public static boolean contar() {
        contator = contator + 5;
        return true;
    }

    public static void main(String[] args) {
        int numero = 4;
        if (contar() && numero == 0) {
            System.out.println("Número: " + numero);
        }
        if (contar() && numero == 2) {
            System.out.println("Número: " + numero);
        }
        if (contar() && numero == 5) {
            System.out.println("Número: " + numero);
        }
        if (contar() && numero == 1) {
            System.out.println("Número: " + numero);
        }
        if (contar() && numero == 3) {
            System.out.println("Número: " + numero);
        }
        if (contar() && numero == 4) {
            System.out.println("Número: " + numero);
        }
        System.out.println("Contador: " + contator);
    }
}

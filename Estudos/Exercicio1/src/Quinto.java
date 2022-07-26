import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner ted = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite o primeiro valor: ");
        n1 = ted.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = ted.nextInt();
        if (n1 == n2) {
            System.out.println(n1 + " é igual a " + n2);
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " é maior que " + n2);
            } else {
                System.out.println(n2 + " é maior que " + n1);
            }
        }
    }
}

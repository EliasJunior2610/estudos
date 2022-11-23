import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args)  {
        Scanner ted = new Scanner(System.in);
        int n1, n2;
        System.out.print("Insira o primeiro valor: ");
        n1 = ted.nextInt();
        System.out.print("Insira o segundo valor: ");
        n2 = ted.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2 + ".");
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1 + ".");
        } else {
            System.out.println(n1 + " = " + n2);
        }
        
    }
}



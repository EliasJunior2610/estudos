import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner ted = new Scanner(System.in);
        int numA, numB, troca;
        System.out.print("Digite o valor do número A: ");
        numA = ted.nextInt();
        System.out.print("Digite o valor do número B: ");
        numB = ted.nextInt();
        troca = numA;
        numA = numB;
        numB = troca;
        System.out.println("Número A: " + numA);
        System.out.println("Número B: " + numB);
    }
}

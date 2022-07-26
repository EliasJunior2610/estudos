import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
       Scanner ted = new Scanner(System.in);
       int x;
       System.out.print("Digite um valor maior que 0: ");
       x = ted.nextInt();
       while (x > 0) {
        System.out.println(x);
        x = x - 1;
       }
       System.out.println("0"); 
    }
}

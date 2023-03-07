//Integrantes: Denyel, Elias, Luan Santos, Lucas Oliveira, Tathyanne, João Pedro, João Carlos, Ricardo Junior;
import java.util.Stack;
public class Exercicio {
    public static void main(String[] args) {
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();
        pilha1.push(6);
        pilha1.push(5);
        pilha1.push(4);
        pilha1.push(3);
        pilha1.push(2);
        pilha1.push(1);
        System.out.printf("Pilha 1: %s \n", pilha1);
        System.out.printf("Pilha 2: %s \n", pilha2);
        System.out.printf("Pilha 3: %s \n", pilha3);
        System.out.println();
        torre(pilha1.size(), pilha1, pilha3, pilha2);
    }

    public static void torre(int i, Stack<Integer> pilha1, Stack<Integer> pilha3, Stack<Integer> pilha2) {
        if (i> 0) {
            torre(i-1, pilha1, pilha2, pilha3);
            pilha3.push(pilha1.pop());
            System.out.printf("Pilha 1: %s \n", pilha1);
            System.out.printf("Pilha 2: %s \n", pilha2);
            System.out.printf("Pilha 3: %s \n", pilha3);
            System.out.println();
            torre(i-1, pilha2, pilha3, pilha1);
            
        }
    }
}

//Alunos: Denyel Fernando, Elias Sales, João Carlos, João Pedro, Luan Santos, Lucas Oliveira e Ricardo Junior.
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static List<Integer> listinha = new ArrayList<>();

    public static void main(String[] args) {
        adicionar(1);
        adicionar(2);
        adicionar(3);
        imprimir();

        info();

        deletar(2);
        imprimir();

        next(1);
        last();
    }

    public static void adicionar(int valor) {
        listinha.add(valor);
    }

    public static void inserir(int index, int valor) {
        listinha.add(index, valor);
    }

    public static void deletar(int valor) {
        listinha.removeIf(n -> n == valor);
    }

    public static void imprimir() {
        imprimir(listinha);
    }

    public static void info() {
        System.out.println("Tamanho da lista: " + listinha.size());
        System.out.println("Elementos da lista: " + listinha);
    }

    public static void next(int valor) {
        int index = listinha.indexOf(valor);
        if (index == -1 || index == listinha.size() - 1) {
            System.out.println("Não há próximo elemento.");
        } else {
            System.out.println("Próximo elemento: " + listinha.get(index + 1));
        }
    }

    public static void last() {
        System.out.println("Último elemento: " + listinha.get(listinha.size() - 1));
    }

    private static void imprimir(List<Integer> n) {
        if (n.isEmpty()) {
            return;
        }

        System.out.println(n.get(0));
        imprimir(n.subList(1, n.size()));
    }
}



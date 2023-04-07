import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static List<Integer> listinha = new ArrayList<>();

    public static void main(String[] args) {
        listinha.add(1);
        listinha.add(2);
        listinha.add(3);
        imprimir(listinha);
    }

    public static void imprimir(List<Integer> n) {
        if (n.isEmpty()) {
            return;
        }

        System.out.println(n.get(0));
        imprimir(n.subList(1, n.size()));
    }
}


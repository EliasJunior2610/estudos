import java.util.Scanner;

public class Revisao1 {
    public static void main(String[] args) {
        String[] animal = { "Cachorro", "Gato", "Aranha", "Coelho", "Caranguejo", "Onça Pintada", "Pato", "Rinoceronte",
                "Carneiro", "Borboleta" };
        String[] alimento = { "Lasanha", "Feijoada", "Arroz", "Pudim", "Mousse", "Sorvete", "Cuscuz", "Pamonha",
                "Canjica", "Macarrão" };
        String[] veiculo = { "BMW", "Lamborghini", "Ferrari", "Ford", "Chevrolet", "Porsche", "Mitsubishi", "Honda",
                "Toyota", "Dodge" };
        String[] artista = { "Luiz Gonzaga", "João Gomes", "Lenine", "Alceu Valença", "Priscila Sena", "Leo Santana",
                "Zezo", "Conde do Brega", "Reginaldo Rossi", "Xand Avião" };
        String[] eletronico = { "Laptop", "Celular", "Tablet", "Televisão", "Computador", "Headset", "Caixa de Som",
                "Headphone", "Mouse", "Teclado" };
        Scanner ler = new Scanner(System.in);
        String resposta;
        System.out.print("Diga o nome de um animal, alimento, veículo, artista ou eletrônico: ");
        resposta = ler.nextLine();
        for (int c = 0; c < 10; c++) {
            if (animal[c].equalsIgnoreCase(resposta)) {
                System.out.println("Nome do item na lista: " + resposta);
                System.out.println("Posição do item na lista: " + c);
                System.out.println("Nome da lista onde o item foi encontrado: Animal");
            } else if (alimento[c].equalsIgnoreCase(resposta)) {
                System.out.println("Nome do item na lista: " + resposta);
                System.out.println("Posição do item na lista: " + c);
                System.out.println("Nome da lista onde o item foi encontrado: Alimento");
            } else if (veiculo[c].equalsIgnoreCase(resposta)) {
                System.out.println("Nome do item na lista: " + resposta);
                System.out.println("Posição do item na lista: " + c);
                System.out.println("Nome da lista onde o item foi encontrado: Veículo");
            } else if (artista[c].equalsIgnoreCase(resposta)) {
                System.out.println("Nome do item na lista: " + resposta);
                System.out.println("Posição do item na lista: " + c);
                System.out.println("Nome da lista onde o item foi encontrado: Artista");
            } else if (eletronico[c].equalsIgnoreCase(resposta)) {
                System.out.println("Nome do item na lista: " + resposta);
                System.out.println("Posição do item na lista: " + c);
                System.out.println("Nome da lista onde o item foi encontrado: Eletrônico");
            }
        }
    }
}

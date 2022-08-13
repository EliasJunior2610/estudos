import java.util.Scanner;

public class Revisao2 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int[] idade = new int[10];
        String velho = null, novo = null;
        int idadeVelho = 0, idadeNovo = 0;
        Scanner ler = new Scanner(System.in);
        for (int c = 0; c < 10; c++) {
            System.out.print("Digite o nome da pessoa: ");
            nome[c] = ler.next();
            System.out.print("Digite a idade da pessoa: ");
            idade[c] = ler.nextInt();
            if (c == 0) {
                novo = nome[c];
                velho = nome[c];
                idadeNovo = idade[c];
                idadeVelho = idade[c];
            } else {
                if (idade[c] < idadeNovo) {
                    novo = nome[c];
                    idadeNovo = idade[c];
                }
                if (idade[c] > idadeVelho) {
                    velho = nome[c];
                    idadeVelho = idade[c];
                }
            }
        }
        System.out.println();
        for (int c = 0; c < 10; c++) {
            System.out.print(nome[c] + " possui ");
            System.out.print(idade[c] + " anos. ");
            System.out.println();
        }
        System.out.println(novo + " é o mais o mais novo com " + idadeNovo + " anos.");
        System.out.println(velho + " é o mais o mais velho com " + idadeVelho + " anos.");
    }
}

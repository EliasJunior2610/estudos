import java.util.ArrayList;

public class Revisao3 {
    public static void main(String[] args) {
        // Listas:
        String listaMulheres[] = { "Rosimere", "Merielly", "Natália", "Tathyanne", "Máyra", "Cecília", "Maria",
                "Karine", "Eliane", "Amanda", "Vanessa", "Júlia", "Grazielly", "Luísa", "Bárbara", "Larissa", "Sabrina",
                "Nicole", "Rebeca", "Danielle" };
        int idadeMulheres[] = { 40, 27, 24, 23, 19, 19, 19, 20, 32, 18, 36, 39, 30, 21, 37, 38, 22, 20, 27, 26 };

        String listaHomens[] = { "Elias", "Júnior", "Lucas", "Gabriel", "William", "Raony", "João", "Carlos", "Pedro",
                "Fernando", "Henrique", "Cláudio", "Elvis", "José", "Denyel", "Luan", "Ricardo", "Thiago", "Arthur",
                "Nícolas", "Miguel", "Samuel", "Juan", "Eduardo", "Ivo", "Breno", "Vitor", "Caio", "Ronaldo",
                "Gustavo" };
        int idadeHomens[] = { 20, 19, 24, 40, 28, 37, 22, 40, 38, 32, 27, 36, 19, 40, 20, 19, 32, 22, 24, 33, 30, 29,
                35, 24, 20, 23, 30, 29, 19, 20 };

        ArrayList<String> primeirosInscritos = new ArrayList<String>();
        ArrayList<String> contratados = new ArrayList<String>();
        ArrayList<String> maisProvaveisFeminino = new ArrayList<String>();
        ArrayList<String> maisProvaveisMasculino = new ArrayList<String>();

        // Questão 1:
        for (int i = 0; i < 7; i++) {
            primeirosInscritos.add(listaMulheres[i]);
            primeirosInscritos.add(listaHomens[i]);
        }
        System.out.print("Os primeiros sete inscritos são: ");
        for (int i = 0; i < primeirosInscritos.size(); i++) {
            if (i < (primeirosInscritos.size() - 1)) {
                System.out.print(primeirosInscritos.get(i) + ", ");
            } else {
                System.out.print(primeirosInscritos.get(i) + ".");
            }
        }
        System.out.println();

        // Questão 2:
        for (int i = 0; i < 20; i++) {
            if (idadeMulheres[i] >= 38) {
                contratados.add(listaMulheres[i]);
            }
        }
        for (int i = 0; i < 30; i++) {
            if (idadeHomens[i] >= 38) {
                contratados.add(listaHomens[i]);
            }
        }
        System.out.print("Os mais prováveis de serem contratados são: ");
        for (int i = 0; i < contratados.size(); i++) {
            if (i < (contratados.size() - 1)) {
                System.out.print(contratados.get(i) + ", ");
            } else {
                System.out.print(contratados.get(i) + ".");
            }
        }
        System.out.println();

        // Questão 3:
        for (int i = 0; i < 20; i++) {
            if (idadeMulheres[i] >= 35) {
                maisProvaveisFeminino.add(listaMulheres[i]);
            }
        }
        System.out.print("Os inscritos de sexo feminino com mais chance de serem contratados são: ");
        for (int i = 0; i < maisProvaveisFeminino.size(); i++) {
            if (i < (maisProvaveisFeminino.size() - 1)) {
                System.out.print(maisProvaveisFeminino.get(i) + ", ");
            } else {
                System.out.print(maisProvaveisFeminino.get(i) + ".");
            }
        }
        System.out.println();

        // Questão 4:
        for (int i = 0; i < 30; i++) {
            if (idadeHomens[i] >= 35) {
                maisProvaveisMasculino.add(listaHomens[i]);
            }
        }
        System.out.print("Os inscritos de sexo masculino com mais chance de serem contratados são: ");
        for (int i = 0; i < maisProvaveisMasculino.size(); i++) {
            if (i < (maisProvaveisMasculino.size() - 1)) {
                System.out.print(maisProvaveisMasculino.get(i) + ", ");
            } else {
                System.out.print(maisProvaveisMasculino.get(i) + ".");
            }
        }
    }
}
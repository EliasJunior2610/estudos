import javax.print.event.PrintEvent;

public class Revisao3 {
    public static void main(String[] args) {
        String listaMulheres[] = { "Rosimere", "Merielly", "Natália", "Tathyanne", "Máyra", "Cecília", "Maria",
                "Karine", "Eliane", "Amanda", "Vanessa", "Júlia", "Grazielly", "Luísa", "Bárbara", "Larissa", "Sabrina",
                "Nicole", "Rebeca", "Danielle" };
        int idadeMulheres[] = { 40, 27, 24, 23, 19, 19, 19, 20, 32, 18, 36, 39, 30, 21, 37, 38, 22, 20, 27, 26 };

        String listaHomens[] = { "Elias", "Júnior", "Lucas", "Gabriel", "William", "Raony", "João", "Carlos", "Pedro",
                "Fernando", "Henrique", "Cláudio", "Elvis", "José", "Denyel", "Luan", "Ricardo", "Thiago", "Arthur",
                "Nícolas", "Miguel", "Samuel", "Juan", "Eduardo", "Ivo", "Breno", "Vitor", "Caio", "Ronaldo",
                "Gustavo" };
        int idadeHomens[] = { 20, 19, 24, 40, 28, 37, 22, 40, 38, 32, 27, 36, 19, 40, 20, 19, 32, 22, 24, 33, 30, 29,
                35, 24, 40, 23, 30, 29, 19, 20 };

        String primeirosIncritos[] = new String[7];
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                primeirosIncritos[i] = listaMulheres[i];
            } else {
                primeirosIncritos[i] = listaHomens[i];
            }
        }
        System.out.print("Os primeiros sete inscritos são: ");
        for (int i = 0; i < 7; i++) {
            if (i < 6) {
                System.out.print(primeirosIncritos[i] + ", ");
            } else {
                System.out.print(primeirosIncritos[i] + ".");
            }
        }
    }
}
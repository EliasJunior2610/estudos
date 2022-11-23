//Exercício 5
public class Lobo {
    public String habitat;
    public String corDaPelagem;
    public String corDosOlhos;
    public String gênero;
    public int idade;

    void inserirHabitat(String habitat) {
        this.habitat = habitat;
    }

    void inserirCorDaPelagem(String corDaPelagem) {
        this.corDaPelagem = corDaPelagem;
    }

    void inserirCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    void inserirGênero(String gênero) {
        this.gênero = gênero;
    }

    void inserirIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Lobo l1 = new Lobo();
        l1.inserirHabitat("Europa");
        l1.inserirCorDaPelagem("Cinza");
        l1.inserirCorDosOlhos("Amarelo");
        l1.inserirGênero("Feminino");
        l1.inserirIdade(9);
    }
}

//Exercício 3
public class Religiao {
    public int númeroDeDivindades;
    public String localDeOrigem;
    public String livroSagrado;
    
    void inserirNúmeroDeDivindades(int númeroDeDivindades) {
        this.númeroDeDivindades = númeroDeDivindades;
    }
    void inserirLocalDeOrigem(String localdeOrigem) {
        this.localDeOrigem = localdeOrigem;
    }
    void inserirLivroSagrado(String livroSagrado) {
        this.livroSagrado = livroSagrado;
    }

    public static void main(String[] args) {
        Religiao r1 = new Religiao();
        r1.inserirNúmeroDeDivindades(1);
        r1.inserirLocalDeOrigem("Jerusalém");
        r1.inserirLivroSagrado("Bíblia");
    }
}

//Exercício 1
public class Raquete {
    public String composição;
    public double comprimento;
    public double pesoSemCorda;
    public double perfilDoAro;
    public String cor;

    void inserirComposição(String composição) {
        this.composição = composição;
    }

    void inserirComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    void inserirPesoSemCorda(double pesoSemCorda) {
        this.pesoSemCorda = pesoSemCorda;
    }

    void inserirPerfilDoAro(double perfilDoAro) {
        this.perfilDoAro = perfilDoAro;
    }

    void inserirCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Raquete r1 = new Raquete();
        r1.inserirComposição("Alumínio");
        r1.inserirComprimento(27);
        r1.inserirPesoSemCorda(270);
        r1.inserirPerfilDoAro(24);
        r1.inserirCor("Azul");
        r1.cor = "verde";
    }
}

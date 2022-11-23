//Exercício 4
public class Planeta {
    public String composição;
    public boolean anelPlanetário;
    public int luas;
    public int diâmetro;
    public int tempoDeRotação;
    public int tempoDeTranslação;

    void inserirComposição(String composição) {
        this.composição = composição;
    }

    void inserirAnelPlanetário(boolean anelPlanetário) {
        this.anelPlanetário = anelPlanetário;
    }

    void inserirLuas(int luas) {
        this.luas = luas;
    }

    void inserirDiâmetro(int diâmetro) {
        this.diâmetro = diâmetro;
    }

    void inserirTempoDeRotação(int tempoDeRotação) {
        this.tempoDeRotação = tempoDeRotação;
    }

    void inserirTempoDeTranslação(int tempoDeTranslação) {
        this.tempoDeTranslação = tempoDeTranslação;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta();
        p1.inserirComposição("Rochoso");
        p1.inserirAnelPlanetário(false);
        p1.inserirLuas(1);
        p1.inserirDiâmetro(12742);
        p1.inserirTempoDeRotação(24);
        p1.inserirTempoDeTranslação(365);
    }
}

//Exercício 2
public class Bola {
    public String cor;
    public int pressão;
    public String material;
    public int cincunferência;

    void inserirCor(String cor) {
        this.cor = cor;
    }

    void inserirPressão(int pressão) {
        this.pressão = pressão;
    }

    void inserirMaterial(String material) {
        this.material = material;
    }

    void inserirCircunferência(int cincunferência) {
        this.cincunferência = cincunferência;
    }

    public static void main(String[] args) {
        Bola b1 = new Bola();
        b1.inserirCor("Verde");
        b1.inserirPressão(4);
        b1.inserirMaterial("Poliuretano");
        b1.inserirCircunferência(65);
    }
}

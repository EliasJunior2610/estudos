public class Caneta {
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("Não consigo rabiscar, a caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar() {
        if (this.tampada) {
            System.out.println("A caneta já está tampada.");
        } else {
            this.tampada = true;
        }
    }

    void destampar() {
        if (this.tampada == false) {
            System.out.println("A caneta já está destampada.");
        } else {
            this.tampada = false;
        }
    }
}

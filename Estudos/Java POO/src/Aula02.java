public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampada = false;

        c1.status();
        c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}

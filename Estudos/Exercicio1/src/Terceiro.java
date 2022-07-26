public class Terceiro {
    public static void main(String[] args) {
        int pares = 1, impares = 0;
        for (int i=0; i<=30; i++) {
            if (i%2 != 0) {
                impares = impares + i;
            } else {
                pares = pares * i;
            }
        }
        System.out.println("A soma dos números ímpares entre 0 e 30 é igual a:" + impares);
        System.out.println("A multiplicação dos números pares entre 0 e 30 é igual a:" + pares);
    }
}

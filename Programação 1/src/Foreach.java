public class Foreach {
    public static void main(String[] args) {
        String animais[] = {"Cachorro", "Gato", "Papagaio"};
        String x = "cachorro";
        for(String animal : animais) {
            if (animal.equalsIgnoreCase(x)) {
                System.out.println("O seguinte item está na lista: " + x);
            }
        }
    }
}

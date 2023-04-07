public class Fatorial {
    public static int fatorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorial(120));
        System.out.println(fatorial(289934));
        System.out.println(fatorial(98767888));
    }
}

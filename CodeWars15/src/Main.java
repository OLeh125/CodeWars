public class Main {
    public static void main(String[] args) {
        Psychic.guess();
        System.out.println(System.nanoTime());
        double d = Math.random() / System.nanoTime();
        System.out.println(d);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 16;
        int d = 18;

        int maximum =
                Math.max(Math.max(a, b),
                        Math.max(c,d));

        System.out.println("Максимум: " + maximum);

    }
}

public class Variables {
    public static void main(String[] args) {
        int b = 20;
        for (int i = 1; i <= 5; i++) {
            final int a = 10;
            if (a < 20) {
                a = (a + b);
                System.out.println(a);
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
public class Variables {
    public static void main(String[] args) {
        final int a = 0;
        int b = 20;
        ///Infinite loop with a static variable (a)
        for (int i = 0; i <= 5; i--, b++) {
            int c = 0;
            if (c < 20) {
                c = (a + b);
                System.out.println(c);
                System.out.println(i);
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
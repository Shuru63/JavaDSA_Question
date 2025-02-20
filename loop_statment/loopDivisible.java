public class loopDivisible {
    public static void loopDivisible100() {
        int i = 1;
        while (i <= 1000) {
            if (i % 7 == 0 && i % 10 == 7) {
                System.out.println(i);
            }
            i++;

        }
        System.out.println("print all the number");
    }

    public static void main(String arg[]) {
        System.out.println("print all the number which is divisible by");
        loopDivisible100();
    }
}

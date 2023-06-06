package info.dmerej;

public class Application {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String res = FizzBuzz.fizzBuzz(i);
            System.out.format("%d %s\n", i, res);
        }
    }
}

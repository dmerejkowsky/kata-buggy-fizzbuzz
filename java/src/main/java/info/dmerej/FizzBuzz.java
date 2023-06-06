package info.dmerej;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (i % 3 == 0) {
            return "fizz";
        }
        if (i % 5 == 0) {
            return "buzz";
        }
        if (i % 15 == 0) {
            return "fizzbuzz";
        }
        return String.valueOf(i);
    }

    public int getAnswer() {
        return 42;
    }
}

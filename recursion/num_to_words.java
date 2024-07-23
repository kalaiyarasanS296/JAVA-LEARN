public class num_to_words {
    static String map[] = { "zero", "one", "two",
            "three", "four", "five", "six",
            "seven", "eight", "nine" };

    public static void convert(int num) {
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        convert(num / 10);
        System.out.print(map[lastDigit] + " ");
    }

    public static void main(String args[]) {
        int n = 219;
        System.out.println("The number is "+n);
        convert(n);
    }
}

public class Multiples {
    public static void main(String[] args) {
        int number_of_multiples = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5== 0) {
                number_of_multiples += 1;
            }
        }
        System.out.println(number_of_multiples);
    }
}

/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        doFizzBuzz();

        int i2 = 1;
        while (i2 < 100 ) {
            boolean d3 = i2 % 3 == 0;
            boolean d5 = i2 % 5 == 0;

            if (d3 && d5) {

                System.out.println("Fizz Buzz");

            } else if (d3) {

                System.out.println("Fizz");

            } else if (d5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i2);
            }
            i2++;
        }
    }

    private static void doFizzBuzz() {
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }


    public static void doFizzBuzz(int i) {
    }
}

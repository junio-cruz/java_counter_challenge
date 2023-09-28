import java.util.Scanner;
import java.util.Locale;

public class Counter {
    public static void main(String[] args) throws InvalidParametersException {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("PLEASE, INSERT START COUNT!");
            int start = input.nextInt();
            System.out.println("PLEASE, INSERT END COUNT!");
            int end = input.nextInt();;
            input.close();
            String[] initClass = {};

            if (start >= end) {
                throw new InvalidParametersException();
            } else {
                counter(start, end);
            }
            System.out.println("\n FINISH COUNTER!");

        } catch (InvalidParametersException error) {
            System.out.println("PLEASE, INSERT START LESS THAN END");
        }
    }

    static void counter(int start, int end) {
        for (int current = start; current <= end; current++) {
            System.out.println(current);
        }
    }
}

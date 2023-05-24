import java.util.*;

public class SumDigits {

    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        return lastDigit + sumDigits(remainingDigits);
    }

    public static void main(String[] args) {
        int n, sum;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        sum = sumDigits(n);
        System.out.println("The sum of digits in " + n + " is: " + sum);

    }

}
/**
 * Created by changuito on 2/25/16.
 */
public class Smallest_Multiple {
    public static void main(String[] args) {
        int num = 2520;
        while (!divideByAllNumbers(num)) {
            num++;
        }
        System.out.println("The smallest multiple of all numbers from 1 to 20 is: " + num);
    }

    private static Boolean divideByAllNumbers (int N) {
        int counter = 0;
        for (int i = 11; i <=20 ; i++) {
            Boolean isNoRemainder = isDividedWithNoRemainder(N,i);
            if (isNoRemainder)
                counter = counter+1; else {
                return false;
            }
            if (counter == 10) {
                return true;
            }
        }
        return false;
    }

    private static Boolean isDividedWithNoRemainder (int dividee, int divider) {
        if ( dividee % divider == 0)
            return true; else
            return false;
    }
}



public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i+=step) {
            range += i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for (int i = start; i < stop; i++) {
            if (i%2 == 0) {
                even += i;
            }
        }
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for (int i = start; i < stop; i++) {
            if (i%2 == 1) {
                odd += i;
            }
        }
        return odd;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String exponential = "";
        int exponentSum = 1;
        for (int i = start; i <= stop; i++) {
            exponentSum = 1;
            for (int j = 1; j <= exponent; j++) {
                exponentSum *= i;
            }
            exponential += exponentSum;
        }
        return exponential;
    }
}

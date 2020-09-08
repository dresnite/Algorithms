public class Math {

    public static int factorialOf(int num) {
        if(num == 0) {
            return 1;
        }

        int result = num;
        for(int multiplier = num - 1; multiplier > 0; multiplier--) {
            result *= multiplier;
        }

        return result;
    }

    public static int[] fibonacci(int length) {
        int last = 1;
        int number = 0;

        int[] result = new int[length];
        for(int i = 0; i < length; i++) {
            int n = number;
            number += last;
            last = n;

            result[i] = number;
        }

        return result;
    }

    public static int recFactorialOf(int num) {
        return num == 0 ? 1 : num * recFactorialOf(num - 1);
    }

}

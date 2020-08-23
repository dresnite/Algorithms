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

    public static int recFactorialOf(int num) {
        return num == 1 ? 1 : num * recFactorialOf(num - 1);
    }

}

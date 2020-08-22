public class App {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        Sort.shellSort(arr);

        for(int value : arr) {
            System.out.println("> " + value);
        }
    }

}

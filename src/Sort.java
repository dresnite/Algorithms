public class Sort {

    public static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length - 1);
    }

    private static void bubbleSort(int[] arr, int lastUnsortedIndex) {
        for(int i = 0; i <= lastUnsortedIndex; i++) {
            Integer next = i < lastUnsortedIndex ? arr[i + 1] : null;
            if(next != null && arr[i] > next) {
                arr[i + 1] = arr[i];
                arr[i] = next;
            }
        }
        lastUnsortedIndex--;

        if(lastUnsortedIndex > 0) {
            bubbleSort(arr, lastUnsortedIndex);
        }
    }

    public static void selectionSort(int[] arr) {
        selectionSort(arr, arr.length - 1);
    }

    private static void selectionSort(int[] arr, int lastUnsortedIndex) {
        int biggestElementIndex = 0;

        for(int i = 0; i <= lastUnsortedIndex; i++) {
            if(arr[i] > arr[biggestElementIndex]) {
                biggestElementIndex = i;
            }
        }

        int biggest = arr[biggestElementIndex];
        arr[biggestElementIndex] = arr[lastUnsortedIndex];
        arr[lastUnsortedIndex] = biggest;

        lastUnsortedIndex--;

        if(lastUnsortedIndex > 0) {
            selectionSort(arr, lastUnsortedIndex);
        }
    }

    public static void insertionSort(int[] arr) {
        insertionSort(arr, 1);
    }

    private static void insertionSort(int[] arr, int firstUnsortedIndex) {
        int element = arr[firstUnsortedIndex];

        int rightPos;

        for(rightPos = firstUnsortedIndex; rightPos > 0 && arr[rightPos - 1] > element; rightPos--) {
            arr[rightPos] = arr[rightPos - 1];
        }

        arr[rightPos] = element;

        firstUnsortedIndex++;
        if(firstUnsortedIndex < arr.length) {
            insertionSort(arr, firstUnsortedIndex);
        }
    }

    public static void shellSort(int[] arr) {
        shellSort(arr, arr.length / 2);
    }

    private static void shellSort(int[] arr, int gap) {
        for(int i = gap; i < arr.length; i++) {
            int element = arr[i];

            int currentElementIndex = i;
            while(currentElementIndex >= gap && arr[currentElementIndex - gap] > element) {
                arr[currentElementIndex] = arr[currentElementIndex - gap];
                currentElementIndex -= gap;
            }

            arr[currentElementIndex] = element;
        }

        gap /= 2;
        if(gap > 0) {
            shellSort(arr, gap);
        }
    }

}

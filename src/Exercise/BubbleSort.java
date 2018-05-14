package Exercise;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 5, 7, 3, 7, 3, 9, 1, 4};
        bubbleSort(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
    }

    public static void bubbleSort(Integer[] array) {

        for (int j = 0; j < array.length; j++) {
            boolean noStop = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    noStop = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            if (!noStop){
                System.out.println("Iterration: " + j);
                break;
            }
        }
    }
}



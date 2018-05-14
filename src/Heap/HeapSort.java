package Heap;

public class HeapSort {

    public static void main(String[] args) {
        Integer[] inputArray = {1, 5, 7, 3, 7, 3, 9, 1, 4};
        sort(inputArray);
    }

    public static Integer[] sort(Integer[] array) {
        int currentHeapSize = 0;
        for (int i = 0; i < array.length; i++) {
            Integer toInsert = array[i];
            int index = currentHeapSize;
            currentHeapSize++;
            int parentIndex = Math.floorDiv(index - 1, 2);
            while (index > 0 && array[parentIndex] < toInsert) {
                array[index] = array[parentIndex];
                index = parentIndex;
                parentIndex = Math.floorDiv(index - 1, 2);
            }
            array[index] = toInsert;
        }
        currentHeapSize = array.length;

        for (int i = 0; i < array.length; i++) {
            Integer result = array[0];
            currentHeapSize--;
            Integer value = array[currentHeapSize];
            int index = 0;
            int sonIndex = 1;
            while (sonIndex < currentHeapSize) {
                if (sonIndex + 1 < currentHeapSize && array[sonIndex + 1] > array[sonIndex]) {
                    sonIndex++;
                }
                if (value >= array[sonIndex]) {
                    break;
                }
                array[index] = array[sonIndex];
                index = sonIndex;
                sonIndex = 2 * sonIndex + 1;
            }
            array[index] = value;
            array[array.length - 1 - i] = result;
        }
        return array;
    }
}



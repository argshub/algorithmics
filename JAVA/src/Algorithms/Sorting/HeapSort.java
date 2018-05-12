package Algorithms.Sorting;

/**
 * Created by xenonus on 7/31/2010.
 */
public class HeapSort {

    public static void buildMaxHeap(int data[]) {
        for (int i = data.length / 2; i > 0; i--) maxHeapify(data, i, data.length);
    }

    private static void maxHeapify(int[] data, int i, int max) {
        int left = i * 2;
        int right = i * 2 + 1;
        int maximum = i;
        if(left < max && data[left] > data[i]) maximum = left;
        if(right < max && data[right] > data[maximum]) maximum = right;
        if(maximum != i) {
            swap(data, i, maximum);
            maxHeapify(data, maximum, max);
        }
    }

    private static void swap(int[] data, int i, int maximum) {
        int temp = data[i];
        data[i] = data[maximum];
        data[maximum] = temp;
    }

    public static int[] heapSort(int data[]) {
        int newArray[] = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) newArray[i+1] = data[i];
        data = newArray;
        int heapSize = data.length;
        buildMaxHeap(data);
        for (int i = data.length - 1; i > 1; i--) {
            swap(data, 1, i);
            maxHeapify(data, 1, --heapSize);
        }
        return data;
    }

    public static void main(String arg[]) {
        int data[] = {10, 8, 7, 5, 2, 1, 6, 3, 5, 1};
        data = heapSort(data);

        for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}

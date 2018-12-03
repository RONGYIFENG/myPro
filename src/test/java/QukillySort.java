import java.io.UnsupportedEncodingException;

public class QukillySort {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int [] array = {8,3,6,9,2,4,6,5};
        int start = 0;
        int end = array.length - 1;
        sort(array, start, end);
        for (int i = 0; i < array.length; i++) {
            System.err.print(array[i]+" ");
        }
    }
    private static int partition(int[] array,int start,int end)
    {
        int key = array[start];
        while (start < end) {
            while (array[end] >= key && end > start) {
                end--;
            }
            array[start] = array[end];
            while (array[start] <= key && end > start) {
                start++;
            }
            array[end] = array[start];
        }
        array[end] = key;
        return end;

    }

    public static void sort(int [] array, int start, int end) {

        if (start >= end) {
            return;
        }
        int index = partition(array, start, end);
        sort(array, start, index - 1);
        sort(array, index + 1, end);
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {7.5, 7.0, 8.1, 8.2, -1.1, 22, 23.2, -3.0, 16.3, 4.4, -3.0, 1.1, 3.3, 2.2, -4.4,-55};
        double summaChisel = 0;
        int kolichestvoChisel = 0;
        boolean fall = false;
        for (double num : numbers) {
            if (num < 0) {
                fall = true;
            } else if (num > 0 && fall) {
                summaChisel = summaChisel + num;
                kolichestvoChisel++;
            }
        }
        double result = summaChisel / kolichestvoChisel;
        System.out.println(result);


        int[] myArray = {2, 5, 3, 1, 4};
        selectionSort(myArray);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int minimumElement = array[i];
            int indexOfMinimumElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimumElement) {
                    minimumElement = array[j];
                    indexOfMinimumElement = j;
                }
            }
            int temporary = array[i];
            array[i] = minimumElement;
            array[indexOfMinimumElement] = temporary;
        }
        System.out.println("====================");
        System.out.println(Arrays.toString(array));

    }
}

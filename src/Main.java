import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {7.5, 7.0, 8.1, 8.2, -5.9, 5.5, 23.2, 23.1, 16.3, 4.4, 34.7, 21.1, 3.3, 2.2, 4.4};
        double summaChisel = 0;
        int kolichestvoChisel = 0;
        for (double num : numbers) {
            if (num > 0) {
                summaChisel = summaChisel + num;
                kolichestvoChisel++;
            } else {
                summaChisel = 0;
                kolichestvoChisel = 0;
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

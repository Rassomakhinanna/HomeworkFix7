public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] myArray = generateRandomArray();
        int sum = 0;
        for (int i=0; i< myArray.length; i++) {
           sum += myArray[i];
       }
        System.out.println("Сумма трат в месяц составила" + sum);
        // Задание 2
        int min = myArray[0];
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            } else if (max < myArray [i]) {
                max = myArray [i];
            }
        }
        System.out.println("Минимальные затраты" + min + "Максимальные затраты" + max);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
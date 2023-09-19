public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3};
        reverseArray(array);
    }

    public static void reverseArray(int[] myArray) {
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

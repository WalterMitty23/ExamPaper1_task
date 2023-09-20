public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        reverseArray(array);
        // данный метод послужит нам чтобы перевернуть массив

        printArray(array);
        // этот чтобы его вывести на экран
    }

    // Метод для разворота массива:
    public static void reverseArray(int[] myArray) {

        for (int i = 0; i < myArray.length / 2; i++) {
            // Итерируемся только до половины массива, так как меняем элементы попарно(чтобы '2' оставить на своем месте)

            int arrayStorage = myArray[i];
            // создаем новую переменную для хранения элемента массива в ней

            myArray[i] = myArray[(myArray.length - 1) - i];
            // затем меняем местами текущий элемент с элементом, который находится на индексе i с конца(myArray.length - 1)

            myArray[myArray.length - 1 - i] = arrayStorage;
            // присваиваю текущему элементу значение из переменной для хранения элемента массива

        }
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

import java.util.Arrays;

void main() {
    System.out.println("1: Arrays.toString()");
    int[] arr1 = {5, 2, 8, 1, 9};
    String str = Arrays.toString(arr1);
    System.out.println("Массив arr1: " + str);

    // Для двумерного массива
    int[][] arr2D = {{1, 2}, {3, 4, 5}};
    System.out.println("Двумерный массив arr2D: " + Arrays.deepToString(arr2D));

    System.out.println("\n2: Arrays.binarySearch()");
    int[] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15};
    System.out.println("Отсортированный массив: " + Arrays.toString(sortedArr));

    // Поиск существующего элемента
    int index1 = Arrays.binarySearch(sortedArr, 7);
    System.out.println("Индекс числа 7: " + index1 + " (значение: " + sortedArr[index1] + ")");

    // Поиск несуществующего элемента
    int index2 = Arrays.binarySearch(sortedArr, 8);
    System.out.println("Индекс числа 8: " + index2 + " (отрицательное, т.к. элемент не найден)");

    System.out.println("\n3: Arrays.equals()");
    int[] arr3a = {1, 2, 3, 4, 5};
    int[] arr3b = {1, 2, 3, 4, 5};
    int[] arr3c = {1, 2, 3, 5, 4};
    int[] arr3d = {1, 2, 3, 4};

    System.out.println("arr3a: " + Arrays.toString(arr3a));
    System.out.println("arr3b: " + Arrays.toString(arr3b));
    System.out.println("arr3c: " + Arrays.toString(arr3c));
    System.out.println("arr3d: " + Arrays.toString(arr3d));

    System.out.println("arr3a.equals(arr3b): " + Arrays.equals(arr3a, arr3b));
    System.out.println("arr3a.equals(arr3c): " + Arrays.equals(arr3a, arr3c));
    System.out.println("arr3a.equals(arr3d): " + Arrays.equals(arr3a, arr3d));

    // Для двумерных массивов используем deepEquals
    int[][] arr3e = {{1, 2}, {3, 4}};
    int[][] arr3f = {{1, 2}, {3, 4}};
    System.out.println("Двумерные массивы равны: " + Arrays.deepEquals(arr3e, arr3f));

    System.out.println("\n4: Arrays.compare()");
    int[] arr4a = {1, 2, 3};
    int[] arr4b = {1, 2, 3};
    int[] arr4c = {1, 2, 4};
    int[] arr4d = {1, 2};
    int[] arr4e = {1, 2, 3, 4};

    System.out.println("arr4a: " + Arrays.toString(arr4a));
    System.out.println("arr4b: " + Arrays.toString(arr4b));
    System.out.println("arr4c: " + Arrays.toString(arr4c));
    System.out.println("arr4d: " + Arrays.toString(arr4d));
    System.out.println("arr4e: " + Arrays.toString(arr4e));

    System.out.println("Arrays.compare(arr4a, arr4b): " + Arrays.compare(arr4a, arr4b));
    System.out.println("    (0 означает, что массивы равны)");

    System.out.println("Arrays.compare(arr4a, arr4c): " + Arrays.compare(arr4a, arr4c));
    System.out.println("    (отрицательное означает, что arr4a < arr4c)");

    System.out.println("Arrays.compare(arr4c, arr4a): " + Arrays.compare(arr4c, arr4a));
    System.out.println("    (положительное означает, что arr4c > arr4a)");

    System.out.println("Arrays.compare(arr4a, arr4d): " + Arrays.compare(arr4a, arr4d));
    System.out.println("    (положительное, так как arr4a длиннее при равенстве первых элементов)");

    System.out.println("Arrays.compare(arr4a, arr4e): " + Arrays.compare(arr4a, arr4e));
    System.out.println("    (отрицательное, так как arr4a короче при равенстве первых элементов)");

    System.out.println("\n5: Arrays.sort()");
    // Сортировка всего массива
    int[] arr5a = {5, 2, 8, 1, 9, 3, 7, 4, 6};
    System.out.println("Исходный массив: " + Arrays.toString(arr5a));
    Arrays.sort(arr5a);
    System.out.println("После сортировки: " + Arrays.toString(arr5a));

    // Сортировка части массива (от fromIndex включительно до toIndex исключительно)
    int[] arr5b = {5, 2, 8, 1, 9, 3, 7, 4, 6};
    System.out.println("\nИсходный массив: " + Arrays.toString(arr5b));
    Arrays.sort(arr5b, 2, 7); // сортировка элементов с индексами 2,3,4,5,6
    System.out.println("После частичной сортировки (индексы 2-6): " + Arrays.toString(arr5b));

    // Сортировка строкового массива
    String[] names = {"Иван", "Анна", "Петр", "Мария", "Алексей"};
    System.out.println("\nСтроковый массив до сортировки: " + Arrays.toString(names));
    Arrays.sort(names);
    System.out.println("Строковый массив после сортировки: " + Arrays.toString(names));
}

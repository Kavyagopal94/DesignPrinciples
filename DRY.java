import java.util.Scanner;
public class DRY {

    private static void addElements(int[][] array, Scanner scanner) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    private static void printArray(int[][] array) {
        System.out.println("The 2D array is:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int column = sc.nextInt();

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];

        addElements(arr1,sc);
        addElements(arr2,sc);

        printArray(arr1);
        printArray(arr2);
    }
}

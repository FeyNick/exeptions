package geekbrains.homework;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        String[][] arr = new String[4][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                arr[i][k] = scanner.next();
            }
        }
        System.out.println("Сумма: " + ArrChecker(arr));
    }

    private static int ArrChecker(String[][] arr) throws Exception {
        if (arr.length != 4)
            throw new ArrayIndexOutOfBoundsException("MyArraySizeException");
        int sum = 0;
        int i = 0;
        int k = 0;
        try {
            for (i = 0; i < 4; i++) {
                for (k = 0; k < 4; k++) {
                    sum += Integer.parseInt(arr[i][k]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Exception appeared at " + i + " : " + k);
            throw new Exception("MyArrayDataException");
        }
        return sum;
    }
}

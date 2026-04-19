package Group_AO.Resources;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline

            String[] inputs = scanner.nextLine().split(" ");

            // Rule: more than N elements
            if (inputs.length > n) {
                throw new ArrayIndexOutOfBoundsException(
                        "Input elements exceeds array size"
                );
            }

            int[] arr = new int[n];

            for (int i = 0; i < inputs.length; i++) {
                int num = Integer.parseInt(inputs[i]);

                // Rule: non-positive number
                if (num <= 0) {
                    throw new IllegalArgumentException(
                            "Only positive integers are allowed"
                    );
                }

                arr[i] = num;
            }

            // Print array
            System.out.print("Array ");
            for (int i = 0; i < inputs.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());

        } finally {
            System.out.println("\nProgram executed successfully!");
            scanner.close();
        }
    }
}

import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Matrix 1
        int[][] matrix1 = new int[2][2];
        System.out.println("Enter elements of 2x2 Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 2
        int[][] matrix2 = new int[2][2];
        System.out.println("Enter elements of 2x2 Matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Menu for operations
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose (Matrix 1)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            // Matrix Addition
            case 1:
                int[][] sum = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("\nResult of Addition:");
                displayMatrix(sum);
                break;

            // Matrix Multiplication
            case 2:
                int[][] product = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("\nResult of Multiplication:");
                displayMatrix(product);
                break;

            // Transpose of Matrix 1
            case 3:
                int[][] transpose = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transpose[i][j] = matrix1[j][i];
                    }
                }
                System.out.println("\nTranspose of Matrix 1:");
                displayMatrix(transpose);
                break;

            // Invalid choice
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close(); // Closing scanner to avoid resource leak
    }

    // Method to display a 2x2 matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


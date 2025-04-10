import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {  // Corrected this line
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] addition = new int[rows][cols];
        int[][] subtraction = new int[rows][cols];
        int[][] multiplication = new int[rows][cols];

        // Matrix Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Matrix Subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplication[i][j] = 0;  // Initialize the cell to 0
                for (int k = 0; k < cols; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Addition of matrices:");
        printMatrix(addition);

        System.out.println("Subtraction of matrices:");
        printMatrix(subtraction);

        System.out.println("Multiplication of matrices:");
        printMatrix(multiplication);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

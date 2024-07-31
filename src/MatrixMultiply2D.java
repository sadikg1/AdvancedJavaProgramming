import java.util.Scanner;
public class MatrixMultiply2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = input.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = input.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = input.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = input.nextInt();

        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Perform matrix multiplication
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Result Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}

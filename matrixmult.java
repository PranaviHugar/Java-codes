public class MatrixMultiplicationExample {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int colsMatrix2 = matrix2[0].length;
        
        int[][] resultMatrix = new int[rowsMatrix1][colsMatrix2];
        
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                int sum = 0;
                for (int k = 0; k < colsMatrix1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        
        // Display the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

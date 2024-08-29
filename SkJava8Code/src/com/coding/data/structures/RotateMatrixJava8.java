package com.coding.data.structures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateMatrixJava8 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Matrix after 90 degree clockwise rotation:");
        printMatrix(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix using Java 8 streams
        IntStream.range(0, n)
                .forEach(i -> IntStream.range(i + 1, n)
                        .forEach(j -> {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[j][i];
                            matrix[j][i] = temp;
                        }));

        // Reverse each row using Java 8 streams
        Arrays.stream(matrix)
                .forEach(row -> IntStream.range(0, n / 2)
                        .forEach(j -> {
                            int temp = row[j];
                            row[j] = row[n - 1 - j];
                            row[n - 1 - j] = temp;
                        }));
    }

    public static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix)
                .forEach(row -> {
                    Arrays.stream(row)
                            .forEach(cell -> System.out.print(cell + " "));
                    System.out.println();
                });
        System.out.println();
    }
}

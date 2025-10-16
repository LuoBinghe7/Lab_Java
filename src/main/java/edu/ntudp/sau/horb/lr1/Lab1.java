package edu.ntudp.sau.horb.lr1;

import java.util.Scanner;

public class Lab1 {
    private static final int MATRIX_MAX_WIDTH = 20;
    private static final int MATRIX_MAX_HEIGHT = 20;
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 31;

    /*Setting the matrix size and matrix input type*/
    public static void main(String[] args) {
        int width = 1;
        int height = 1;
        int inputType = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the width of the matrix (no more than " + MATRIX_MAX_WIDTH + ")");
            width = scanner.nextInt();
            System.out.println("Enter the height of the matrix (no more than " + MATRIX_MAX_HEIGHT + ")");
            height = scanner.nextInt();
            if (width > MATRIX_MAX_WIDTH || height > MATRIX_MAX_HEIGHT) {
                System.out.println("You have entered an incorrect number. Enter the height and width of the matrix");
            } else {
                System.out.println("Select the type of matrix input. Enter 1 if you want to set the matrix randomly.\n" +
                        "Enter 0 if you want to set the matrix yourself");
                inputType = scanner.nextInt();
                break;
            }
        }
        int[][] matrix = createMatrix(width, height, inputType, scanner);
        int maximumElement = findMaximumElement(matrix, width, height);
        int minimumElement = findMinimumElement(matrix, width, height);
        double arithmeticMean = calculationArithmeticMean(matrix, width, height);
        double geometricMean = calculationGeometricMean(matrix, width, height);
        System.out.println("Maximum element = " + maximumElement);
        System.out.println("Minimum element =" + minimumElement);
        System.out.println("Arithmetic mean  =" + arithmeticMean);
        System.out.println("Geometric mean =" + geometricMean);
    }

    public static int[][] createMatrix(int width, int height, int inputType, Scanner scanner) {
        int[][] matrix = new int[width][height];
        if (inputType == 1) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    matrix[i][j] = (int) (MIN_RANDOM_VALUE + (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) * Math.random());
                    System.out.print(" " + matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else if (inputType == 0) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    System.out.println("Enter the matrix element:");
                    int element = scanner.nextInt();
                    matrix[i][j] = element;
                }
                System.out.println();
            }
        }
        return matrix;
    }

    public static int findMinimumElement(int[][] matrix, int width, int height) {
        int newMin = matrix[0][0];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[i][j] < newMin) {
                    newMin = matrix[i][j];
                }
            }
            System.out.println();
        }
        return newMin;
    }

    public static int findMaximumElement(int[][] matrix, int width, int height) {
        int newMax = matrix[0][0];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[i][j] > newMax) {
                    newMax = matrix[i][j];
                }
            }
            System.out.println();
        }
        return newMax;
    }

    public static double calculationArithmeticMean(int[][] matrix, int width, int height) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sum = matrix[i][j] + sum;

                count = count + 1;
            }
            System.out.println();
        }
        double calculatedArithmeticMean = (double) sum / count;
        return calculatedArithmeticMean;
    }

    public static double calculationGeometricMean(int[][] matrix, int width, int height) {
        int count = 0;
        int prod = 1;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                prod = matrix[i][j] * prod;
                count = count + 1;
            }
            System.out.println();
        }
        double calculatedGeometricMean = Math.pow(prod, 1d / count);
        return calculatedGeometricMean;
    }
}

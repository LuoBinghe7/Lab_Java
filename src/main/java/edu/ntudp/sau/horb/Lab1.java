package edu.ntudp.sau.horb;

import java.util.Scanner;

public class Lab1 {
    /*Задавання розмірності матриці та типу вводу матриці*/
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введіть ширину матриці (не більше 20):");
            Scanner scanW = new Scanner(System.in);
            int width = scanW.nextInt();
            System.out.println("Введіть висоту матриці (не більше 20):");
            Scanner scanH = new Scanner(System.in);
            int height = scanH.nextInt();
            if (width > 20 || height > 20) {
                System.out.println("Ви ввели не вірне число. Введіть висоту та ширину матриці (не більше 20)");
            } else {
                System.out.println("Оберіть тип вводу матриці. Введіть 1, якщо хочете задати матрицю рандомно.\nВведіть 0, якщо хочете задати матрицю самостійно.");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                int ResultMatrixCalculate = InputMatrix(width,height,input);;
                break;
            }
        }
    }
    /*Введення матриці*/
    public static int InputMatrix(int width,int height, int input)
    {
        int[][] Matrix = new int[width][height];
        if (input == 1) {
            int i = 0;
            int j = 0;
            for (i = 0; i < width; i++) {
                for (j = 0; j < height; j++) {
                    Matrix[i][j] = (int) (1 + 30 * Math.random());
                    System.out.print(" " + Matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else if (input == 0) {
            int i = 0;
            int j = 0;
            for (i = 0; i < width; i++) {
                for (j = 0; j < height; j++) {
                    System.out.println("Введіть елемент матриці:");
                    Scanner MatrixElement = new Scanner(System.in);
                    int element = MatrixElement.nextInt();
                    Matrix[i][j] = element;
                }
                System.out.println();
            }
        }
        int Max=CalculateMax(Matrix,width,height);
        int Min=CalculateMin(Matrix,width,height);
        double Avg=CalculateAvg(Matrix,width,height);
        double GeometrMean=CalculateGeometrMean(Matrix,width,height);
        System.out.println("Max = "+Max);
        System.out.println("Min ="+Min);
        System.out.println("Average ="+ Avg);
        System.out.println("Geometricmean ="+GeometrMean);
        return 0;
    }
    /*Обчислення мінімального елементу матриці*/
    public static int CalculateMin(int[][] Matrix,int width,int height)
    {
        int k=0;
        int t=0;
        int newMin=1;
        for (k=0;k<width;k++)
        {
            for (t = 0; t < height; t++)
            {
                if (Matrix[k][t]<newMin)
                {
                    newMin=Matrix[k][t];
                }
            }
            System.out.println();
        }
        return newMin;
    }
    /*Обчислення максимального елементу матриці*/
    public static int CalculateMax(int[][] Matrix,int width,int height)
    {
        int k=0;
        int t=0;
        int newMax=0;
        for (k=0;k<width;k++)
        {
            for (t = 0; t < height; t++)
            {
                if (Matrix[k][t]>newMax)
                {
                    newMax=Matrix[k][t];
                }
            }
            System.out.println();
        }
        return newMax;
    }
    /*Обчислення середнього арифметичного матриці*/
    public static double CalculateAvg(int[][] Matrix,int width,int height)
    {
        int k=0;
        int t=0;
        int count=0;
        int sum=0;
        for (k=0;k<width;k++)
        {
            for (t = 0; t < height; t++)
            {
                sum=Matrix[k][t]+sum;

                count=count+1;
            }
            System.out.println();
        }
        double average=(double) sum/count;
        return average;
    }
    /*Обчислення середнього геометричного матриці*/
    public static double CalculateGeometrMean(int[][] Matrix,int width,int height)
    {
        int k=0;
        int t=0;
        int count=0;
        int prod=1;
        for (k=0;k<width;k++)
        {
            for (t = 0; t < height; t++)
            {
                prod=Matrix[k][t]*prod;
                count=count+1;
            }
            System.out.println();
        }
        double geometricmean=(double)  Math.pow(prod,(double) 1/count);
        return geometricmean;
    }
}

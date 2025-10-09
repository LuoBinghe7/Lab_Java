package edu.ntudp.sau.horb;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
}
/*Розробити програму, що дозволить вам створити, як з клавіатури  так і рандомно матрицю цілих чисел типу
int заданої ширини та висоти(ввести з клавіатури), але не більше 20 на 20.
Створити можливість пошуку в цій матриці мінімального і максимального елементу  та розрахунок середнього арифметичного.
 Програма може бути написана в одному класі, обов'язково розбиття на методи.
 Обов'язкове використання клавіатури, під час вибору ручного чи рандомного створення матриці.
  Створення системи зчитування з клавіатури зробити будь-яким способом, наприклад завдяки класу Scanner.
   Scanner являє собою найпростішу систему сканування клавіатури.
    Диапазон рандомних чисел для створення елементів матриці повинен зверігатись в спеціальних константах.
 Як завдання підвищеної складності додати  розрахунок середнього геометричного елементів матриці.
*/
/*public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Введить ширину матриці (не більше 20):");
            Scanner scanW = new Scanner(System.in);
            int width = scanW.nextInt();
            System.out.println("Введить висоту матриці (не більше 20):");
            Scanner scanH = new Scanner(System.in);
            int height = scanH.nextInt();
            if (width>20 || height>20)
            {
                System.out.println("Ви ввели не вірне число. Введить висоту та ширину матриці (не більше 20)");
            }
            else{
        System.out.println("Оберіть тип вводу матриці. Введіть 1, якщо хочете задати матрицю рандомно.\nВведіть 0, якщо хочете задати матрицю самостійно.");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] Matrix = new int [width][height];
        if (input == 1)
        {
            int i=0;
            int j=0;
            for (i=0;i<width;i++)
            {
                for (j = 0; j < height; j++)
                {
                    Matrix[i][j] = (int) (1 + 30 * Math.random());
                    System.out.print( " " + Matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if (input == 0)
        {
            int i=0;
            int j=0;
            for (i=0;i<width;i++)
            {
                for (j = 0; j < height; j++)
                {
                    System.out.println("Введить елемент матриці:");
                    Scanner MatrixElement = new Scanner(System.in);
                    int element = MatrixElement.nextInt();
                    Matrix[i][j] = element;
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Ви ввели не вірне число. Спробуйте ще. Введить висоту та ширину матриці (не більше 20)");
            continue;
        }
        int k=0;
        int t=0;
        int newMax=0;
        int newMin=0;
        int count=0;
        int sum=0;
        int prod=1;
        for (k=0;k<width;k++)
        {
            for (t = 0; t < height; t++)
            {
                sum=Matrix[k][t]+sum;
                prod=Matrix[k][t]*prod;
                if (Matrix[k][t]>newMax)
                {
                    newMax=Matrix[k][t];
                }
                if (Matrix[k][t]<newMin || newMin==0)
                {
                    newMin=Matrix[k][t];
                }
                count=count+1;
            }
            System.out.println();
        }
        System.out.println("Max = "+newMax);
        System.out.println("Min ="+newMin);
        System.out.println("Count ="+count);
        double average=(double) sum/count;
        System.out.println("Average ="+ average);
        double geometricmean=(double)  Math.pow(prod,(double) 1/count);
        System.out.println("Geometricmean ="+geometricmean);
        break;
    }}
    }
}*/

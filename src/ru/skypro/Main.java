package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1---------------------------------------------------------------
        //1.
        int[] weights = new int[3];
        weights[0] = 1;
        int apple = weights[0];
        weights[1] = 2;
        int banana = weights[1];
        weights[2] = 3;
        int pineapple = weights[2];

        // 2.
        double[] weight = {1.57, 7.654, 9.986};


        //3.
        int[] width = {1, 2, 3, 4, 5};


        //Задание 2---------------------------------------------------------------
        // 1.
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        //2.
        for (int p = 0; p < weight.length; p++) {
            System.out.print(weight[p]);

            if (p < weight.length - 1)
                System.out.print(", ");
        }
        System.out.println("");


        //3.
        for (int d = 0; d < width.length; d++) {
            System.out.print(width[d]);


            if (d < width.length - 1)
                System.out.print(", ");
        }

        System.out.println("");
        //Задание 3-------------------------------------------------------------


        //1. for (int i = 0; i < weights.length; i++) {
        //            System.out.print(weights[i]);
        //            if (i < weights.length - 1) {
        //                System.out.print(", ");


        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i >= weights.length-2 )
                System.out.print(", ");
            else  System.out.print(" ");

        }


            System.out.println("");
        //2.
            for (int p = weight.length - 1; p >= 0; p--) {
                System.out.print(weight[p]);
                if (p >= weight.length-2 )
                    System.out.print(", ");
                else
                    System.out.print(" ");
            }


                System.out.println("");
        //3.
                for (int d = width.length - 1; d >= 0; d--) {
                    System.out.print(width[d]);
                    if (d >= weight.length -2)
                        System.out.print(", ");
                    else
                        System.out.print(" ");
                }


        System.out.println("");


        //Задание 4-----------------------------------------------------------
        int[] weightsS = new int[3];
        weightsS[0] = 1;
        int a = weightsS[0];
        weightsS[1] = 2;
        int b = weightsS[1];
        weightsS[2] = 3;
        int p = weightsS[2];
        for (int i = 1; i <= weights.length; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            } else {
                if (i % 2 != 0) {
                    System.out.println(i + 1);
                }

            }
        }
    }
}


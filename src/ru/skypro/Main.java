package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        //1.
        int[] weights = new int[3];
        weights[0] = 1;
        int apple = weights[0];
        weights[1] = 2;
        int banana = weights[1];
        weights[2] = 3;
        int pineapple = weights[2];

        // 2.
        double [] weight = {1.57,7.654, 9.986};


        //3.
        int [] width = { 1,2,3,4,5};


        //Задание 2
        System.out.println(weights[0] + ", " + weights[1] + ", " + weights[2]);
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println(width[0] + ", " + width[1] + ", " + width[2] + ", " + width[3] + ", " + width[4]);

        //Задание 3

        System.out.println(weights[2] + ", " + weights[1] + ", " + weights[0]);
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println(width[4] + ", " + width[3] + ", " + width[2] + ", " + width[1] + ", " + width[0]);

            //Задание 4 перенес массив из первого задания для наглядности и тренировки многостроных комментов))
         /* int[] weightsS = new int[3];
        weightsS[0] = 1;
        int a = weightsS[0];
        weightsS[1] = 2;
        int b = weightsS[1];
        weightsS[2] = 3;
        int p = weightsS[2]; */
        for (int i = 1; i <=3 ; i++) {
            if (i!=i%1) {
                i = i + 1;
            }
            System.out.print(i + " ");
            }

        }


    }

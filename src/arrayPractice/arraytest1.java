package arrayPractice;

import java.util.Arrays;

public class arraytest1 {
    public static void main(String[] args) {


//        int arr [] = new int[4];
//        arr[0]=123;
//        arr[1]= 234;
//        arr[2]=345;
//        arr[3]= 456;
//
//        for (int arrprint : arr) {
//            System.out.print(arrprint + " ");
//        }
//        System.out.println();
//        System.out.println("---------------------------- ");
//
//        int [] copy = Arrays.copyOf(arr, arr.length);
//        for (int num : copy){
//            System.out.print(num+" ");
//        }
//
//        System.out.println();
//
//
//        int [] [] matrix = new int [3] [3];
//
//        matrix[0][0]= 1;
//        matrix[0][1]= 1;
//        matrix[0][2]= 1;
//
//        matrix [1][0]= 2;
//        matrix [1][1]= 2;
//        matrix [1][2]= 2;
//
//        matrix [2][0]= 3;
//        matrix [2][1]= 3;
//        matrix [2][2]= 3;

//        System.out.println(matrix[0][2]);

//        for (int i= 0 ; i< matrix.length; i++){
//            for (int j = 0;  j<matrix.length; j++){
//                System.out.print(matrix[i][j]+ " ");
//            }
//            System.out.println();
//        }

        int [] num = {1,2,3,3,4};
        for (int i =0; i< num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();

        int [] [] num2 ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0 ; i < num2.length; i++){
            for (int j= 0 ; j < num2.length ; j++){
                System.out.print(num2[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");
        int [] arr1 = {1,2,3,4,5};
        for (int i = 0 ; i< arr1.length ; i++){
            System.out.println(arr1[i]);
            System.out.println();
        }


    }
}

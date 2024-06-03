package BT07_TimSoNT;

import java.util.Scanner;

public class soNT {
    public static void main(String[] args) {
        int N = 0;
        int X = 2;
        while (N < 20){
            boolean flag = true;
            for(int i = 2; i <= Math.sqrt(X); i++) {
                if(X % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.println("Số nguyên tố thứ " + N + " là " + X);
                N++;
            }
            X++;
        }

    }
}

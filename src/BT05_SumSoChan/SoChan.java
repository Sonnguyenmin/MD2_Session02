package BT05_SumSoChan;

import java.util.Scanner;

public class SoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        System.out.println("Mời bạn nhập số đầu: ");
        start = sc.nextInt();
        System.out.println("Mời bạn nhập số cuối: ");
        end = sc.nextInt();
        int sum = 0;
        if(start > end) {
            System.out.println("Không hợp lệ mời nhạp lại");
            return;
        }

        for (int i = start; i <= end; i++) {
            if(i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println("Tổng các số chẵn vừa nhập là" + sum);


    }
}

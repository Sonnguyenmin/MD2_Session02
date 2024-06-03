package TH5_Prime;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        int n = scanner.nextInt();
        if(n < 2) {
            System.out.println(n + "Không phải là số tự nhiên");
        }
        else {
            int i = 2;
            boolean flag = true;
            while (i < n) {
                if(n % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if(flag) {
                System.out.println(n + "Là số nguyên tố");
            }
            else {
                System.out.println(n + "Không phải là số nguyên tố");
            }
        }
    }
}

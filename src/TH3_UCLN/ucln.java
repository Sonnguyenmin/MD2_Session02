package TH3_UCLN;

import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("nhập vào số b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if( a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        int temp;
        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("Có ước chung lớn nhất là :" + a);
    }
}

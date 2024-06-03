package BT01_ChuSo;

import java.util.Scanner;

public class chuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Mời nhập số a:");
        a = scanner.nextInt();
        switch (a) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.println("Không có số trong dãy từ 0 - 9");
                break;
        }
    }
}

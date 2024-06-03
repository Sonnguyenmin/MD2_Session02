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
                System.out.println("Số 0");
                break;
            case 1:
                System.out.println("Số 1");
                break;
            case 2:
                System.out.println("Số 2");
                break;
            case 3:
                System.out.println("Số 3");
                break;
            case 4:
                System.out.println("Số 4");
                break;
            case 5:
                System.out.println("Số 5");
                break;
            case 6:
                System.out.println("Số 6");
                break;
            case 7:
                System.out.println("Số 7");
                break;
            case 8:
                System.out.println("Số 8");
                break;
            case 9:
                System.out.println("Số 9");
                break;
            default:
                System.out.println("Không có số trong dãy từ 0 - 9");
                break;
        }
    }
}

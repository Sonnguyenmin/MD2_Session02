package BT09_ChuViDienTich;

import java.util.Scanner;

public class hcnHtgHt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo biến choice để ghi nhớ lựa chọn của người dùng.
        int choice;
       //Sử dụng vòng lặp while để hiển thị menu như yêu cầu và cho phép người dùng nhập lựa chọn của họ.
        do {
            System.out.println("1. Chu vi và dien tich hcn");
            System.out.println("2. Chu vi và dien tich htg");
            System.out.println("3. Chu vi và dien tich ht");
            System.out.println("4. Thoat");
            System.out.println("Moi ban chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int chieuDai, chieuRong;
                    System.out.println("Mời nhập chiều dài:");
                    chieuDai = scanner.nextInt();
                    System.out.println("Mời nhập chiều rộng:");
                    chieuRong = scanner.nextInt();
                    int ChuViHCN = ((chieuDai + chieuRong) * 2);
                    int DienTichHCN = (chieuDai * chieuRong);
                    System.out.println("Chu vi hcn là: " + ChuViHCN);
                    System.out.println("Dien tich hcn là: " + DienTichHCN);
                    break;
                case 2:
                    int canhA, canhB, canhC;
                    System.out.println("Mời nhập canh a:");
                    canhA = scanner.nextInt();
                    System.out.println("Mời nhập canh b:");
                    canhB = scanner.nextInt();
                    System.out.println("Mời nhập canh c:");
                    canhC = scanner.nextInt();
                    int ChuViHTG = (canhA + canhB + canhC)/2;
                    double DienTichHTG = Math.sqrt(ChuViHTG * (ChuViHTG - canhA) * (ChuViHTG - canhB) * (ChuViHTG - canhC));
                    System.out.println("Chu vi htg là " + ChuViHTG);
                    System.out.printf("Dien tich htg là %.1f" , DienTichHTG);
                    break;
                case 3:
                    double R;
                    System.out.println("Mời nhập bán kính:");
                    R = scanner.nextDouble();
                    double chuViHT = (2 * Math.PI * R);
                    int ChuViHT = (int)chuViHT;
                    double DienTichHT = (Math.PI * R * R);
                    int dienTichHT = (int)DienTichHT;
                    System.out.println("Chu vi ht " + ChuViHT );
                    System.out.println("Dien tich ht " + dienTichHT );
                    break;
                case 4:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Moi ban nhap lai");
                    break;
            }
        } while (choice!= 4);
        scanner.close();
    }
}

package BT10_Accuracy;

import java.util.Scanner;

public class accuracy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b, c;
        //Sử dụng vòng lặp while lặp vô hạn và cho người dùng nhập vào giá trị của 3 cạnh tam giác .
        boolean flag = true;
         while ( flag == true) {
             System.out.println("Mời bạn nhập cạnh a: ");
             a = scanner.nextInt();
             System.out.println("Mời bạn nhập cạnh b: ");
             b = scanner.nextInt();
             System.out.println("Mời bạn nhập cạnh c: ");
             c = scanner.nextInt();
             if(a > 0 && b > 0 && c > 0 ) {
                 flag = false;
             }
             //tổng của 2 cạnh phải lớn hơn cạnh còn lại
             if(a + b > c || a + c > b || b + c > a) {
                 int ChuVi = a + b + c;
                 double DienTich = Math.sqrt((ChuVi - a) * (ChuVi - b) * (ChuVi - c));
                 System.out.println("chu vi tam giac la" + ChuVi);
                 System.out.println("Dien tich hinh tam giac la" +  DienTich);
                 flag = false;
             }
             else {
                 System.out.println("Mời bạn nhập lại");
             }
         }
    }
}

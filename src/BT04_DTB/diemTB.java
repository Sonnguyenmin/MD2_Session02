package BT04_DTB;

import java.util.Scanner;

public class diemTB {
    public static void main(String[] args) {
        float Toan, Ly, Hoa, Van, Anh;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm toan: ");
        Toan = scanner.nextFloat();
        System.out.print("Nhập điểm Ly: ");
        Ly = scanner.nextFloat();
        System.out.print("Nhập điểm Hoa: ");
        Hoa = scanner.nextFloat();
        System.out.print("Nhập điểm Van: ");
        Van = scanner.nextFloat();
        System.out.print("Nhập điểm Anh: ");
        Anh = scanner.nextFloat();
        float DTB = ((Toan + Ly + Hoa + Van + Anh) / 5);
        System.out.println("Điểm trung bình là" + DTB);
        if( DTB >= 9) {
            System.out.println("điểm TB Xếp loại xuất sắc ");
        } else if (DTB >= 8 && DTB < 9) {
            System.out.println("điểm TB Xếp loại Giỏi");
        } else if ( DTB >= 6.5 && DTB < 8) {
            System.out.println("điểm TB Xếp loại Khá ");
        } else if ( DTB >= 5 && DTB < 6.5 ) {
            System.out.println("điểm TB Xếp loại Trung bình");
        } else if (DTB >= 0 && DTB < 5) {
            System.out.println("điểm TB Xếp loại Kém");
        }
        else {
            System.out.println("Bạn nhập sai vui lòng nhập lại");
        }
    }
}

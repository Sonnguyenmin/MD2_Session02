package BT6_TimSo;

public class nguyenDuong {
    public static void main(String[] args) {
        int n = 1;
        boolean flag = true;
        while (flag) {
            if( n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                System.out.println("Số cần tìm là" + n);
                flag = false;
            }
            else  {
                n++;
                flag = true;
            }
        }
    }
}

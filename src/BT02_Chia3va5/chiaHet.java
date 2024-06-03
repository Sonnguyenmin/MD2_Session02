package BT02_Chia3va5;

import java.util.Scanner;

public class chiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Mời bạn nhập n");
        n = scanner.nextInt();
        if( n % 3 == 0 && n % 5 == 0) {
            System.out.println("Chia hết cho cả 3 và 5");
        }else if(n % 3 == 0) {
            System.out.println("Chia hết cho 3");
        } else if (n % 5 == 0) {
            System.out.println("Chia hết cho 5");
        }
        else {
            System.out.println("Không chia hết cho số nào cả");
            return;
        }


    }
}

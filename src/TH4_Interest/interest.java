package TH4_Interest;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        System.out.println("Mời bạn nhập số tiền gửi: ");
        money = scanner.nextDouble();
        System.out.println("Mời bạn nhập số tháng: ");
        month = scanner.nextInt();
        System.out.println("Mời bạn nhập tỉ lệ lãi suất: ");
        interest = scanner.nextDouble();
        double totalInterest = scanner.nextDouble();
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest/100)/12 * month;
        }
        System.out.println("tổng tiền lãi là " + totalInterest);
        totalInterest = scanner.nextDouble();
    }
}

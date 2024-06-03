package TH1_CalculateBody;

import java.util.Scanner;

public class weightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập trọng lượng tính bằng cân: ");
        weight = scanner.nextDouble();
        System.out.println("Nhâp chiều cao: ");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.println("Chỉ số bmi là: ");
        if(bmi < 18.5){
            System.out.println("Thiếu cân" + bmi);
        } else if (18.5 <= bmi && bmi <= 25.0) {
            System.out.println("Bình thường" + bmi);
        } else if (25.0 >= bmi && bmi <= 30.0) {
            System.out.println("Thừa cân" + bmi);
        } else if (30.0 < bmi) {
            System.out.println("Béo phì" + bmi);
        }
        else {
            System.out.println("Quá béo phì giảm câm ngay lập tức không là đóng thùng xốp");
        }
    }
}

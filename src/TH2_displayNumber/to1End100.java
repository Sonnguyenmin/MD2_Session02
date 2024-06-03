package TH2_displayNumber;

public class to1End100 {
    public static void main(String[] args) {
        int arr[] = new int[101];
        for(int i = 1; i <= 100; i++){
            arr[i] = i;
            System.out.println("Số tự nhiên thứ " + i + "là " + arr[i]);
        }
    }
}

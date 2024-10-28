package ra.jump;

public class Jump_Demo {
    public static void main(String[] args) {
        //1. break: thoát khỏi switch_case hoặc vòng lặp
        //2. continue: Dừng vòng lặp hiện tại và nhảy sang vòng lặp tiếp theo
        //3. return: dùng cho phương thức, kết thúc phương thức và trả về nơi gọi nó
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Giá trị i hiện tại là: " + i);
        }
        int sumNumbers = sumTwoNumbers(5, 7);
        System.out.println("Tổng 2 số là: " + sumNumbers);
    }

    public static int sumTwoNumbers(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;
        return total;
    }
}

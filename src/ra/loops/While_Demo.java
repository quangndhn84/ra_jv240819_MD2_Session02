package ra.loops;

import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //Nhập vào các số từ bàn phím cho đến khi nhập 0, in ra tổng các số vừa nhập --> không xác định được số lần lặp --> while hoặc do...while
        //B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: Khởi tạo biến tổng với giá trị bằng 0
        int sumNumbers = 0;
        //B3: Thông báo nhập
        System.out.println("Nhập vào các số nguyên, nhập 0 để kết thúc:");
        //B4: Sử dụng vòng lặp while để nhập các số cho đến khi nhập 0
        int number = 1;
        while (number != 0) {
            //B5: Cộng dồn giá trị nhập vào biến tổng
            number = Integer.parseInt(scanner.nextLine());
            sumNumbers += number;
        }
        //B6: In ra tổng các số vừa nhập
        System.out.println("Tổng các số vừa nhập là: " + sumNumbers);
        //Vòng lặp vô hạn
        int number1 = 1;
        while (number1 != 0) {
            System.out.println("Vòng lặp đang thực hiện");
        }
        //Nested Loop
    }
}

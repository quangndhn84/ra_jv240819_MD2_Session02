package ra.decision_marking;

import java.util.Scanner;

public class Switch_Case_Demo {
    public static void main(String[] args) {
        //Nhập vào 1 số từ 0-9, phiên âm số đó
        //B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: Thông báo nhập
        System.out.println("Nhâp vào 1 số nguyên từ 0 đến 9:");
        //B3: Nhập giá trị từ bàn phím và lưu vào biến
        int number = Integer.parseInt(scanner.nextLine());
        //B4: Dùng swith_case phiên âm số đó
        switch (number) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            default:
                System.out.println("Chín");
        }
        //2. Nhập từ bàn phím 2 số nguyên và 1 phép tính toán học (+, -, *, /, %), in ra kết quả của phép tính
        //Ví dụ: 8, 2 và '+' --> kết quả: 10
        //8,2 và '*' --> kết quả: 16
    }
}

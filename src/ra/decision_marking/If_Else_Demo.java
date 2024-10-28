package ra.decision_marking;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        /*
         * Condition: true || false
         * Expression Condition:  gồm nhiều điều kiện kết hợp với nhau qua toán tử logic (&& | || | !)
         * --> result: true | false
         * Syntax:
         * if(exp1){
         *   Block_1;
         * }else if(exp2){
         *   Block_2;
         * }....
         * else if(exp_n){
         *   Block_n;
         * }else{
         *   Block_n+1;
         * }
         *
         * */

        //1. Nhập vào một số nguyên từ bàn phím(n), nếu số đó là số chẵn thì
        // in thông báo ra màn hình console "Số n là số chẵn"
        //B1: Khởi tạo đối tuợng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: Khai báo biến và nhập dữ liệu từ bàn phím
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        //B3: Kiểm tra số vừa nhập là số chẵn hay l, chẵn in ra thông báo
        if (number % 2 == 0) {
            System.out.printf("Số %d là số chẵn\n", number);
        } else {
            System.out.printf("Số %d là số lẻ\n", number);
        }
        //2. Kiểm tra số vừa nhập là số chẵn hay lẻ và in ra thông báo
        //3. In ra các số dư trong phép chia 3: 3 trường hợp dư 0, 1, 2 --> 3 mệnh đề: if, else if, else
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //4. In ra các số dư trong phép chia 6: 6 trường hợp --> 6 mệnh đề: 1 if, 1 else, 4 else-if

    }
}

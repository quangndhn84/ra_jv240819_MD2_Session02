package ra.loops;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        /*
         * Xây dựng chương trình bán đồ ăn sáng. Hiển thị menu và thực hiện các chức năng theo menu sau:
         * *********************MENU*****************************
         * 1. Phở bò Kobe
         * 2. Phở gà Việt Nam
         * 3. Xôi trứng thịt
         * 4. Bánh mỳ pate
         * 5. Mỳ tôm không người lái
         * 6. Thoát
         * Sự lựa chọn của bạn:
         * */
        //B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: In menu đến khi nào chọn 6 thì kết thúc chương trình
        do {
            System.out.println("**************MENU***************");
            System.out.println("1. Phở bò Kobe");
            System.out.println("2. Phở gà Việt Nam");
            System.out.println("3. Xôi trứng thịt");
            System.out.println("4. Bánh mỳ pate");
            System.out.println("5. Mỳ tôm không người lái");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            //B3: Khai báo biến lưu giá trị người dùng nhập
            int choice = Integer.parseInt(scanner.nextLine());
            //B4: Sử dụng switch_case để duyệt lựa chọn của khách hàng và thực hiện chức năng tương ứng
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn Phở bò Kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn Phở gà Việt Nam");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn xôi trứng thịt");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn bánh mỳ pate");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6");
            }
        } while (true);

    }
}

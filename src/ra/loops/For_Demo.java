package ra.loops;

public class For_Demo {
    public static void main(String[] args) {
        //1.Tính tổng các số từ 1 đến 10: xác định được số lần lặp --> Sử dụng for
        //B1: Khởi tạo biến tổng với giá trị bằng 0
        int sumNumbers = 0;
        //B2: Sử dụng vòng for lặp 10 lần từ 1-> 10
        for (int i = 1; i <= 10; i++) {
            //B3: Cộng dồn giá trị vào biến tổng
            //sumNumbers = sumNumbers + i;
            sumNumbers += i;
        }
        //B4: In ra tổng
        System.out.println("Tổng các số từ 1 đến 10 là: " + sumNumbers);
        //2. In ra giá trị trung bình trong khoảng 0 đến 10 sử dụng vòng for
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {

        }
        System.out.println("Điểm trung bình của 0 và 10 là: " + i);
    }
}

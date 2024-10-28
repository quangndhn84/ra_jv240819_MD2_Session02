package ra.loops;

public class Foreach_Demo {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        //Sử dụng forech duyệt các phần tử và tính tổng các phần tử
        int sumNumbers = 0;
        for (int number : numbers) {
            sumNumbers += number;
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sumNumbers);
    }
}

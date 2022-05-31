package util;

import java.util.Scanner;

// class các hàm dùng cho việc nhập xuất dữ liệu
public class MyToys {
    private static Scanner scanner = new Scanner(System.in);

    // hàm nhập số nguyên đích thực
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
        int n, tmp;
        // nếu đầu vào lower > upper thì đổi chỗ
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(scanner.nextLine());
                if (n < lowerBound || n > upperBound)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Your ID: ");
        //int id = scanner.nextInt();
        //int id = getAnInteger;
    }
}

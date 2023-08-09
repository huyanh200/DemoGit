package Day6.VongLap;

import java.util.Scanner;

public class vonglapdowhile {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị thông tin");
            System.out.println("2. Thay đổi thông tin");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Thông tin hiện tại: ...");
                    break;
                case 2:
                    System.out.println("Thay đổi thông tin...");
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 3);

        scanner.close();
    }
}


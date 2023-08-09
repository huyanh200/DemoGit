package Day7.OOP;

public class MainDongGoi {
    public static void main(String[] args) {
        DongGoi account = new DongGoi("123456", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());  // Output: Account Number: 123456
        System.out.println("Balance: " + account.getBalance());                // Output: Balance: 1000.0

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());  // Output: Balance after deposit: 1500.0

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());  // Output: Balance after withdrawal: 1300.0

        account.withdraw(1500);  // Output: Invalid withdrawal amount or insufficient balance.
    }
}

//Lớp DongGoi có hai thuộc tính private: accountNumber và balance.
//Sử dụng phương thức getter để truy cập giá trị của các thuộc tính private.
//Sử dụng phương thức setter để thực hiện các thao tác tương tác với thuộc tính balance, như deposit và withdraw.
//Tính chất Đóng gói trong ví dụ này giúp bảo vệ dữ liệu của đối tượng BankAccount bằng cách ngăn truy cập trực tiếp từ bên ngoài và đảm bảo rằng các thao tác tương tác với dữ liệu được kiểm soát và xử lý một cách an toàn.

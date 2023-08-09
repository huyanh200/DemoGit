package Day6.ToanTu;

public class ToanTuLogic {
    public static void main(String[] args) {
        boolean condition1 = true, condition2 = false;
        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;
        boolean notResult = !condition1;

        System.out.println("AND result: " + andResult);//Kết hợp hai giá trị boolean và trả về true nếu cả hai đều true, ngược lại trả về false.
        System.out.println("OR result: " + orResult);//Kết hợp hai giá trị boolean và trả về true nếu ít nhất một trong hai là true, ngược lại trả về false.
        System.out.println("NOT result: " + notResult);//Đảo ngược giá trị boolean, trả về true nếu giá trị ban đầu là false, và ngược lại.
    }
}

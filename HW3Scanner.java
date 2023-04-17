import java.util.Scanner;

public class HW3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\"Введите случайное целое число: ");
        int a = sc.nextInt();
        System.out.print(Integer.toBinaryString(a));



        sc.close();

    }
}

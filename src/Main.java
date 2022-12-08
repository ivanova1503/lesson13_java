import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, разделяя слова пробелами:");
        String str = scanner.nextLine();

        String[] result = str.split(" ");

        int count = 0;
        for (int i =0; i< result.length; i++) {
            if (result[i].matches("^[a-zA-Z0-9]+$")) {
                count++;
            }
        }
        System.out.println("Количество латинских слов: " + count);
    }
}
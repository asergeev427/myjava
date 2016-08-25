import java.util.Scanner;

public class findletter extends test {
    public static void main(String args[]) {
        System.out.println("Введите строку:");
        String line = new Scanner(System.in).nextLine();
        System.out.println("Введите букву:");
        char letter = new Scanner(System.in).next().charAt(0);
        count(line, letter);
    }
}

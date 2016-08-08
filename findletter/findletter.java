import java.util.Scanner;
/**
 * Created by Sergeevs Family on 08.08.2016.
 */
public class findletter extends test {
    public static void main(String args[]) {
        System.out.println("Введите строку:");
        String line = new Scanner(System.in).nextLine();
        System.out.println("Введите букву:");
        String letter = new Scanner(System.in).nextLine();
        findlet(line, letter);
    }
}

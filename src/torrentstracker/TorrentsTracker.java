package torrentstracker;

        import java.util.Scanner;

        import static torrentstracker.Users.addUser;

public class TorrentsTracker {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        addUser(name); //проверка метода addUser
    }
}

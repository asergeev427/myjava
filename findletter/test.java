/**
 * Created by Sergeevs Family on 08.08.2016.
 */
public class test {
    public static void findlet(String line, String letter) {
        int a = line.length();
        int b = line.replaceAll(letter, "").length();
        System.out.println("В предложении: " + line + " буква " + letter + " встречается - " + (a - b) + " раз");
    }
}

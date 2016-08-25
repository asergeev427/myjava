public class test {
    public static int count(String line, char letter) {
        int kol = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == letter) kol++;
        }
        System.out.println("В предложении: " + line + " буква " + letter + " встречается - " + kol + " раз");
        return kol;
    }
}


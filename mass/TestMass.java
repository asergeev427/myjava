/**
 * Created by Sergeevs Family on 10.08.2016.
 */
public class TestMass {
    public static void mass1() {
        int[] players = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < players.length; i++) {
            System.out.print(i);
        }
    }

    public static void mass2() {
        int[] players = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 26; i >= 0; i--) {
            System.out.print(i);
        }
    }

    public static void mass3() {
        int players[];
        players = new int[]{3, 5, 9, 10, 11, 14};
        for (int i = 0; i < players.length; i++) {
            if (players[i] % 2 == 0) {
                System.out.println("Четный элемент = " + players[i]);
            }
        }
    }

    public static void mass4() {
        int players[];
        players = new int[]{3, 5, 9, 10, 11, 14};
        for (int i = 0; i < players.length; i++) {
            if (players[i] % 2 - 1 == 0) {
                System.out.println("Нечетный элемент = " + players[i]);
            }
        }
    }

    public static void mass5() {
        int players[];
        players = new int[]{3, 5, 9, 10, 11, 14, 25, 45, 41, 14};
        for (int i = 0; i < players.length; i = i + 3) {
            System.out.println("Каждый третий с 1-го = " + players[i]);
        }
    }

    public static void mass6() {
        int players[];
        players = new int[]{3, 5, 9, 10, 11, 14, 25, 45, 41, 14};
        for (int i = 1; i < players.length; i = i + 3) {
            System.out.println("Каждый третий со второго = " + players[i]);
        }
    }

    public static void mass7() {
        int[][] players2 = new int[4][];
        players2[0] = new int[1];
        players2[1] = new int[2];
        players2[2] = new int[3];
        players2[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                players2[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                System.out.println(players2[i][j] + " ");
                System.out.println();
            }
    }
}






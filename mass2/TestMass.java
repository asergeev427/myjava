public class TestMass {
    public static void mass1() {
        int[] players = new int[6];
        for (int i = 0; i < 6; i++) {
            players[i] = i;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(players[i]);
        }
    }

    public static void mass2() {
        int[] players = new int[6];
        for (int i = 0; i < 6; i++) {
            players[i] = i;
        }
        for (int i = 5; i >= 0; i--) {
            System.out.print(players[i]);
        }
    }

    public static void mass3() {
        int players[] = new int[]{3, 5, 9, 10, 11, 14};
        for (int i = 0; i < players.length; i++) {
            if (players[i] % 2 == 0) {
                System.out.println("Четный элемент = " + players[i]);
            }
        }
    }

    public static void mass4() {
        int players[] = new int[]{3, 5, 9, 10, 11, 14};
        for (int i = 0; i < players.length; i++) {
            if (players[i] % 2 - 1 == 0) {
                System.out.println("Нечетный элемент = " + players[i]);
            }
        }
    }

    public static void mass5() {
        int players[] = new int[]{3, 5, 9, 10, 11, 14, 25, 45, 41, 14};
        for (int i = 0; i < players.length; i = i + 3) {
            System.out.println("Каждый третий с 1-го = " + players[i]);
        }
    }

    public static void mass6() {
        int players[] = new int[]{3, 5, 9, 10, 11, 14, 25, 45, 41, 14};
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

    public static void mass8() {
        final int MAX_ELEMENT = 20;
        int a[][] = new int[MAX_ELEMENT][];
        for (int n = 0; n < MAX_ELEMENT; n++) {
            a[n] = new int[MAX_ELEMENT - n];
        }
        for (int n = 0; n < a.length; n++) {
            for (int k = 0; k < a[n].length; k++) {
                a[n][k] = Math.abs(n + (k - MAX_ELEMENT));
            }
        }
        for (int[] row : a) {
            for (int item : row) {
                System.out.printf("%3d", item);
            }
            System.out.println();
        }
    }
}






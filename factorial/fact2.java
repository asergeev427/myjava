/**
 * Created by Sergeevs Family on 07.08.2016.
 */
public class fact2 {
    public static void fact(long fact2) {
        long res = 1;

        //for (fact2 = 1; fact2 <= 50; fact2++)//
        if (fact2 <= 0 || fact2 > 20) {
            System.out.println("Некорректное значение!");
            System.exit(0);
        }
        for (long i = 1; i <= fact2; i++) {

            res *= i;
        }
        System.out.println(res);

    }
}

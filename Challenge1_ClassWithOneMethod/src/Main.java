import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Math m = new Math();
        Random r = new Random();

        int a = r.nextInt();
        int b = r.nextInt();

        int res = m.sum(a, b);

        if (res != (a + b)) {
            throw new RuntimeException("m.sum(" +a +", " +b +") != " +(a + b));
        }
        else System.out.println(res);
    }
}
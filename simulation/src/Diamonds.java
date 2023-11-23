
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Diamonds {

    public static void main (String[] args) throws FileNotFoundException{
        Diamonds d = new Diamonds();
        System.out.println(d.showcase());
    }

    public int showcase () throws FileNotFoundException{

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int amount = reader.nextInt();
        int k = reader.nextInt();
        int[] d = new int[amount];

        for (int i = 0; i < amount; i++) d[i] = reader.nextInt();

        int m = 0;

        for (int i = 0; i+k < 10000; i++) {
            int t = 0;
            for (int j = i; j <= i+k; j++) {
                t += count(d, j);
            }

            m = Math.max(t, m);
        }

        return m;


    }

    private int count (int[] a, int n) {
        int c = 0;
        for (int i : a) {
            if (i == n) c++;
        }

        return c;
    }

}

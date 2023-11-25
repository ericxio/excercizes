
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AverageFlower {

    public static void main (String[] args) throws FileNotFoundException{
        AverageFlower f = new AverageFlower();
        System.out.println(f.count());
    }

    public int count () throws FileNotFoundException{

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int amount = reader.nextInt();
        int[] flowers = new int[amount];
        int c = 0;
        while (reader.hasNextInt()) {
            flowers[c] = reader.nextInt();
            c++;
        }

        int t = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j+i <= amount; j++) {
                int[] a = Arrays.copyOfRange(flowers, j, j+i);
                int average = avg(a);
                //if (Arrays.asList(a).contains(average)) t++;
                if (contains(a,average)) t++;
//                System.out.println(Arrays.toString(a));
//                System.out.println(average);
                //System.out.println(Arrays.asList(a).contains(average));

            }
        }
        return t;
    }

    private int avg(int[] a) {
        int t=0;
        for (int i : a) t+=i;

        if (t % a.length != 0) return -1;
        return t/a.length;
    }

    private boolean contains (int[] a, int n) {
        for (int i : a) {
            if (i==n)return true;
        }
        return false;
    }

}

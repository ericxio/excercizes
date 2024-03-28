
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lifeguards {

    public static void main(String[] args) throws FileNotFoundException {
        Lifeguards l = new Lifeguards();
        System.out.println(l.countMax());
    }

    public int countMax() throws FileNotFoundException {

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int amount = reader.nextInt();
        int [] start = new int[amount];
        int [] end = new int[amount];

        for (int i = 0; i < amount; i++) {
            start[i] = reader.nextInt();
            end[i] = reader.nextInt();

        }
        int m = 0;

        int[] times = new int[1001];

        for (int i = 0; i < amount; i++) {
            int s = start[i];
            int e = end[i];
            for (int j = s; j < e; j++) {
                times[j]++;
            }




        }
        //System.out.println(Arrays.toString(times));
        for (int i = 0; i < amount; i++) {
            int s = start[i];
            int e = end[i];
            int[] a = times.clone();

            for (int j = s; j < e; j++) {
                a[j]--;
            }

            //System.out.println(Arrays.toString(a));
            int t = 0;
            for (int k : a) {
                if (k>0) t++;
            }
            m = Math.max(t,m);
        }



        return m;


    }
}


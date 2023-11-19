import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TheBucketList_v2 {


    public static void main(String args[]) throws FileNotFoundException
    {
        TheBucketList_v2 s = new TheBucketList_v2();
        System.out.println(s.start());
    }

    public int start() throws FileNotFoundException{


        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int [] change = new int[1001];


        //List<Integer> data = new ArrayList<Integer>();
        int cows = reader.nextInt();

        for (int i = 1; i < 1001; i++) {
            if (!reader.hasNextInt())break;
            int s = reader.nextInt();
            int t = reader.nextInt();
            int b = reader.nextInt();

            change[s] += b;
            change[t] -= b;
        }

        int total = 0;
        int max = 0;

        for (int i = 1; i < 1001; i++) {
            total += change[i];
            max = Math.max(total, max);
        }
    return max;

    }
}

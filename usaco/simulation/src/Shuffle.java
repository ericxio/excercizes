import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Shuffle {

    public static void main (String[] args) throws FileNotFoundException{
        Shuffle s = new Shuffle();
        for (int i : s.bovineShuffle()) {
            System.out.println(i);
        }

    }

    public int[] bovineShuffle() throws FileNotFoundException{
        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int cows = reader.nextInt();

        int [] ids   = new int[cows];
        int [] swaps = new int[cows];

        int [] end   = new int[cows];

        for (int i = 0; i < cows; i++) {
            swaps[i] = reader.nextInt();
        }

        for (int i = 0; i < cows; i++) {
            ids[i] = reader.nextInt();
        }

        for (int i = 0; i < cows; i++) {
            end[swaps[i]-1] = ids[i];
        }




        return end;
    }
}

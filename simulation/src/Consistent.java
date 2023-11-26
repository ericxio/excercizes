import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Consistent {

    public static void main(String args[]) throws FileNotFoundException{
        Consistent c = new Consistent();
        System.out.println(c.countPairs());
    }

    public int countPairs() throws FileNotFoundException{

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int num = reader.nextInt();
        int cows =reader.nextInt();

        int[][] data = new int[num][cows];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < cows; j++) {
                data[i][j]=reader.nextInt();
            }
        }

        for (int[] a : data) {
            System.out.println(Arrays.toString(a));
        }

        int count=0;
        for (int i = 1; i <= cows; i++) {
            for (int j = i+1; j <= cows; j++) {
                boolean t = true;

                for (int[] a : data) {
                    if (find(a, i) > find (a,j)) {
                        t = false;
                        break;
                    }
                }
                if (t) count++;

                 t = true;

                for (int[] a : data) {
                    if (find(a, j) > find (a,i)) {
                        t = false;
                        break;
                    }
                }
                if (t) count++;




            }
        }


        return count;
    }

    private int find (int[]a, int n) {
        for (int i=0; i < a.length; i++) {
            if (a[i] == n) return i;
        }

        return -1;
    }
}

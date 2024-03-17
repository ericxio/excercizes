//change the name to uppercase cuz im too lazy to do it myself :D

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Convention {



    public static void main(String args[]) throws FileNotFoundException {
        Convention c = new Convention();
        System.out.println(c.count());
    }

    public int  count() throws FileNotFoundException {


        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);
        List l = new ArrayList<String>();

        int n = reader.nextInt();
        int m = reader.nextInt();
        int c = reader.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = reader.nextInt();

        }
        Arrays.sort(times);




        for (int i = 0; i == i; i++) {
            int buses = m;

            int curr = 0;
            int s = times[0];
            int t = 0;
            while (curr < n) {
                //System.out.println("iter="+curr);
                t += times[curr];
                if ((t-s) > i) {
                    buses --;
                    s = times[curr];
                    t = 0;
                    continue;

                }
                curr += 1;
                if (buses < 0) continue;
            }
            if (buses>=0) return i;

        }


//        for (int i = c; i< n; i++) {
//            int t = 0;
//            for (int j = i; j > i-c; j++) {
//                t += times[j];
//            }
//            max = Math.max(t,max);
//
//        }







        return -1;

    }

}

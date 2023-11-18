import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class thebucketlist {
    private List<Integer> used;
    private List<Integer> s_i;
    private List<Integer> t_i;
    private List<Integer> b_i;


    public thebucketlist() {
        used = new ArrayList<Integer>();
        s_i = new ArrayList<Integer>();
        t_i = new ArrayList<Integer>();
        b_i = new ArrayList<Integer>();


    }

    public int start() throws FileNotFoundException{


        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        List<Integer> data = new ArrayList<Integer>();
        int cows = reader.nextInt();
        while (reader.hasNextInt()) {
            int curr = reader.nextInt();


            data.add(curr);

        }
        int count = 0;

        for (int n : data) {
            if (count %3 == 1) s_i.add(n);
            if (count %3 == 2) t_i.add(n);
            if (count %3 == 0) b_i.add(n);
            count++;

        }

        for (int i = 0; i < cows; i++) {
            int s = s_i.get(i);
            int t = t_i.get(i);
            int b = b_i.get(i);


            for (int j = 1; j <= 2147483647; j++) {
                if (b == 0) break;
                if(!used.contains(j)) {
                    used.add(j);
                    b--;
                }


            }

        }
    return 0;

    }
}

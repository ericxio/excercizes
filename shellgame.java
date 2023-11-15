import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class shellgame {

    public static void main(String args[]) throws FileNotFoundException;
    {
        shellgame s = new shellgame();
        System.out.println(s.game());
    }


    public  int game() throws FileNotFoundException{
        int swaps = 0;

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        List<String> data = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String curr = reader.nextLine();
            if (data.size() == 0) swaps = Integer.parseInt(curr);
            else {
                data.add(curr);
            }
        }


        int m = 0;

        for (int i = 1; i < 4; i++) {
            int count = 0;
            int curr = i;
            for (String s : data) {
                String[] nums = s.split(" ");
                curr = swap(curr,Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
                if (curr == Integer.parseInt(nums[2])) count++;

            }

            if (count >= m) m = count;

        }


        return m;
    }

    private int  swap (int curr, int first, int second) {
        if (first == curr) curr = second;
        if (second == curr) curr = first;

        return curr;

    }
}

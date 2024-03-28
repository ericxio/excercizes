import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Block {



        public static void main(String args[]) throws FileNotFoundException {
            Block b = new Block();
            b.start();
        }

        public void  start() throws FileNotFoundException {


            File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
            Scanner reader = new Scanner(f);

            String alpha = "abcdefghijklmnopqrstuvwxyz";
            int[] counts= new int[26];
            for (int i = 0; i < 26; i++) {
                reader = new Scanner(f);
                reader.nextLine();
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    String[] s = line.split(" ");
                    counts[i] += Math.max(count(s[0], alpha.charAt(i)), count(s[1], alpha.charAt(i)));
                }

        }
            for (int x : counts) System.out.println(x);


    }

    public int count(String s, char c) {
            int current = 0;
            for (char i : s.toCharArray()) {
                if (i==c) current++;
            }
            return current;
    }

}

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Milk {
    public static void main (String[] args) throws FileNotFoundException{
        Milk m = new Milk();
        m.mixMilk();
    }

    public void mixMilk() throws FileNotFoundException{
        int [] milk = new int [3];
        int [] cap = new int [3];

        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        for (int i = 0; i < 3; i++) {
            cap[i] = reader.nextInt();
            milk[i] = reader.nextInt();

        }

        for (int i = 0; i < 100; i++) {
            int index1 = i%3;
            int index2 = (i+1)%3;

            if (milk[index1] + milk[index2] <= cap[index2]) {
                milk[index2] += milk[index1];
                milk[index1] = 0;
            }

            else {
                milk[index1] -= cap[index2]-milk[index2];
                milk[index2] = cap[index2];
            }

        }

        System.out.println(milk[0]);
        System.out.println(milk[1]);
        System.out.println(milk[2]);





    }
}

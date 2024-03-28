import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tictactoe {


    public static void main(String args[]) throws FileNotFoundException {
        Tictactoe t = new Tictactoe();
        t.countWins();
    }

    public void  countWins() throws FileNotFoundException {


        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);



        //List<Integer> data = new ArrayList<Integer>();
        char[][] a = new char[3][3];

        for (int i = 0;i<3;i++) {
            String s =reader.nextLine();
            a[i][0]=s.charAt(0);
            a[i][1]=s.charAt(1);
            a[i][2]=s.charAt(2);

        }

        int count = 0;
        if (a[0][0]==a[0][1]&&a[0][1]==a[0][2]) count++;
        if (a[1][0]==a[1][1]&&a[1][1]==a[1][2]) count++;
        if (a[2][0]==a[2][1]&&a[2][1]==a[2][2]) count++;

        if (a[0][0]==a[1][0]&&a[1][0]==a[2][0]) count++;
        if (a[0][1]==a[1][1]&&a[1][1]==a[2][1]) count++;
        if (a[0][2]==a[1][2]&&a[1][2]==a[2][2]) count++;

        if (a[0][0]==a[1][1]&&a[1][1]==a[2][2]) count++;
        if (a[0][2]==a[1][1]&&a[1][1]==a[2][0]) count++;

        System.out.println(count);

        int count2 = 0;

        if (a[0][0]==a[0][1]||a[0][1]==a[0][2]||a[0][0]==a[0][2]) count2++;
        if (a[1][0]==a[1][1]||a[1][1]==a[1][2]||a[1][0]==a[1][2]) count2++;
        if (a[2][0]==a[2][1]||a[2][1]==a[2][2]||a[2][0]==a[2][2]) count2++;

        if (a[0][0]==a[1][0]||a[1][0]==a[2][0]||a[0][0]==a[2][0]) count2++;
        if (a[0][1]==a[1][1]||a[1][0]==a[2][1]||a[0][0]==a[2][1]) count2++;
        if (a[0][2]==a[1][2]||a[1][0]==a[2][2]||a[0][0]==a[2][2]) count2++;


        if (a[0][0]==a[1][1]||a[1][1]==a[2][2]||a[0][0]==a[2][2]) count2++;
        if (a[0][2]==a[1][1]||a[1][1]==a[2][0]||a[0][2]==a[2][0]) count2++;

        System.out.println(count2-count);














    }
}

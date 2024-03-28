import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Field {
    public static void main(String[] args) throws FileNotFoundException {
        Field f = new Field();
        System.out.println(f.count());
    }

    public int  count() throws FileNotFoundException{
        File f = new File("C:\\Users\\Eric\\Documents\\coding\\usaco\\simulation\\src\\data.txt");
        Scanner reader = new Scanner(f);

        List<int[]> cells = new ArrayList<int[]>();
        int[] coord = {0,0};
        int amount = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < amount; i++) {
            String curr=reader.nextLine();

            char dir = curr.charAt(0);
            int dist = Integer.parseInt(curr.substring(2));
            for (int j = 0; j < dist; j++) {
                if (dir == 'N') coord[1] += 1;
                if (dir == 'E') coord[0] += 1;
                if (dir == 'S') coord[1] -= 1;
                if (dir == 'W') coord[0] -= 1;
                //System.out.println("("+coord[0]+","+coord[1]+")");
                cells.add(new int[] {coord[0],coord[1]});

            }



        }
        List<String> cells2 = new ArrayList<String>();

            for (int[] a : cells) {
                String s = a[0]+" "+a[1];
                //System.out.println(cells.size());
                if (cells2.contains(s)) return cells2.size()-cells2.indexOf(s);
                cells2.add(s);
            }




        return -1;


        }


        ;
    }



import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Meeting {

    public static void main (String[] args) throws FileNotFoundException{
        Meeting m = new Meeting();
        System.out.println(m.optimize());
    }

    public double optimize () throws FileNotFoundException{

        File f = new File("codeforces\\src\\data.txt");
        Scanner reader = new Scanner(f);

        int friends = reader.nextInt();
        int[] loc = new int[friends];
        int[] speed = new int[friends];

        for (int i = 0; i<friends; i++) {
            loc[i]=reader.nextInt();
        }
        for (int i = 0; i<friends; i++) {
            speed[i]=reader.nextInt();
        }

        double min =  0;
        double max =  1e9;

        while (true) {
            //System.out.println(min+", "+max);
            double mid = (min+max)/2;

            double dist1 = distance(loc,speed,mid+1e-8);
            double dist2 = distance(loc,speed,mid-1e-8);

            System.out.println(dist1+","+dist2);

            double dist3 = distance(loc,speed,mid);

            if (dist1>dist3&&dist2>dist3) {
                return dist3;
            }

            if (dist1>dist3&&dist2<dist3) {
                max = mid;
            }

            if (dist1<dist3&&dist2>dist3) {
                min = mid;
            }




        }


    }

    private double distance(int[] a, int[] b,double x) {
        double m = 0;
        for (int i = 0; i < a.length; i++) {
            m = Math.max(m,Math.abs(a[i]-x/b[i]));
        }

        return m;
    }


}

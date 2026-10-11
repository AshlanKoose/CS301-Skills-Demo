import java.util.*;
public class SAT {
    public static void main(String[] args) {
        double mean = 1200.0;
        double devi = 100.0;
        Random rand = new Random();
        double store[] = new double[20000];

        for (int i = 0; i < 20000; i++) {
            double z = rand.nextGaussian();
            double sat = mean + (z*devi); //z score formula shuffled around to find the score
            store[i] = sat;
        }
        Arrays.sort(store);
        IO.println("The lowest score to still get admitted is " + store[14999]); 
        //since sort does so in ascending order, I needed to go from the back
    }
}
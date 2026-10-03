public class Stats {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float[] store = new float[n];
        float add = 0;
        double deviation = 0.0;
        StdOut.println("Enter numbers:");

        for (int i = 0; i < n; i++){
            float temp = StdIn.readFloat();
            store[i] = temp;
        }

        for (int i = 0; i < n; i++){
            add = add + store[i];
        }
        float mean = add / n;
        IO.println("The mean is: " + mean);

        for (int i = 0; i < n; i++){
            deviation = deviation + ((Math.pow((store[i] - mean), 2)));
        }
        deviation = deviation / (add - 1);
        deviation = (Math.sqrt(deviation));
        IO.println("The standard deviation is: " + deviation);
    }
}

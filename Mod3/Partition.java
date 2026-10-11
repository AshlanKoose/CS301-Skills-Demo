public class Partition {
        public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        partition(n);
    }

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String space) {
        if (n == 0) {
            IO.println(space);
            return;
        }
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, space + " " + i);
        }
    }

}
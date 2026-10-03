public class MyBeer {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] student = new int[n];
        int[] beer = new int[n];
        int nums = 1;
        int fraction = 0;
        for (int i = 0; i < n; i++) {
            student[i] = nums;
            beer[i] = nums;
            nums++;
        }
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < n; j++) {
                int r = j + (int) (Math.random() * (n-j));
                int temp = beer[j];
                beer[j] = beer[r];
                beer[r] = temp;
            }
            for (int j = 0; j < n; j++) {
                if (student[j] == beer[j]) {
                    fraction++;
                    break;
                }
            }
        }
        IO.println(fraction + "/1000 times");
    }
}
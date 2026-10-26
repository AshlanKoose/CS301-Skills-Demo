import java.util.*; 
public class FindKthLargest {
    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        int[] nums = new int[n];
        StdOut.println("Array size set to" + n + ". Enter numbers:");
            for (int i = 0; i < n; i++){
                int temp = StdIn.readInt();
                nums[i] = temp;
            }
            Arrays.sort(nums);
    }
    public void largest(int[] numbers, int k){
        int l = numbers.length;
        int kth = l - k;
        IO.println(numbers[kth]);
    }
}
import java.util.*;
public class BinarySearch {
    public void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        StdOut.println("Array length set to " + n + ". Enter numbers:");
        for (int i = 0; i < n; i++){
            int temp = StdIn.readInt();
            a[i] = temp;
        }
        Arrays.sort(a);
        IO.println(search(a, 8));
    }
    public String search(int[] numbers, int s){
        int m = numbers.length / 2;
        if ((numbers.length == 1) && numbers[m] != s){
            return s + " is not found in the array.";
        }
        if (numbers[m] == s){
            return s + " is in the array.";
        } else if (numbers[m] < s){
            int[] right = new int[m];
            int temp = numbers[m];
            temp = temp + 1;
            for (int i = 0; i < m; i++){
                right[i] = temp;
                temp++;
            }
            return search(right, s);
        }  else if (numbers[m] > s){
            int[] left = new int[m];
            int temp = numbers[m];
            temp = temp - 1;
            for (int i = 0; i < m; i++){
                left[i] = temp;
                temp--;
            }
            IO.println(Arrays.toString(left));
            return search(left, s);
        } else{
        return "";
        }
    }
}

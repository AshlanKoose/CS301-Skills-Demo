public class RecursiveBinarySearch{
    public void main(){
        int[] nums = {3, 8, 12, 17, 21, 35, 48};
        int m = nums.length / 2;
        IO.println(search(nums, m, 8));
        IO.println(search(nums, m, 48));
    }
    int pass = 0;
    int passtwo = 0;
    public boolean search(int[] numbers, int m, int s){
        if (pass > 0 && passtwo > 0){
            return false;
        }
        if (m < 0 || m >= numbers.length){
            return false;
        }
        if (numbers[m] == s){
            return true;
        }
        if (numbers[m] < s){
            pass++;
            return search(numbers, m + 1, s);
        }
        if (numbers[m] > s){
            passtwo++;
            return search(numbers, m - 1, s);
        }
        return false;
    }
}